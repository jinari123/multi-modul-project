package com.temp.rpc.service;

import com.temp.rpc.entity.*;
import com.temp.rpc.form.IdxFormOuterClass;
import io.grpc.Status;
import io.grpc.StatusException;
import io.grpc.stub.StreamObserver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

@Service
public class PromotionServiceImpl extends PromotionRouteGrpc.PromotionRouteImplBase {

    @Autowired
    private PromotionRepository promotionRepository;

    @Override
    public void getPromotion(IdxFormOuterClass.IdxForm request, StreamObserver<PromotionEntity.Promotion> responseObserver) {
        int id = request.getId();
       try{
           Promotion promotion = promotionRepository.findById(id).orElseThrow(() -> new RuntimeException("saqdasdas"));
           PromotionEntity.Promotion convertMessage = convertMessage(promotion);

           responseObserver.onNext(convertMessage);
           responseObserver.onCompleted();

       }catch (Exception e){
           Status status
                   =Status.fromCode(Status.Code.NOT_FOUND)
                   .withDescription("wqeqweqw");
           responseObserver.onError(new StatusException(status));
       }
    }

    @Override
    public void getPromotions(IdxFormOuterClass.IdxForm request, StreamObserver<PromotionEntity.Promotion> responseObserver) {
        int langId = request.getId();
        List<Promotion> byLanguageId = promotionRepository.findAllByLanguage_Id(langId);
        List<PromotionEntity.Promotion> resPromotion = new ArrayList<>();

        for (Promotion promotion : byLanguageId) {
            responseObserver.onNext(convertMessage(promotion));
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        responseObserver.onCompleted();
    }

    private PromotionEntity.Promotion convertMessage(Promotion promotion) {
        ZoneId zoneId = ZoneId.systemDefault();

        Language language = promotion.getLanguage();
        Game game = language.getGame();

        GameEntity.Game buildGame = GameEntity.Game.newBuilder()
                .setId(game.getId())
                .setName(game.getName())
                .setSecretKey(game.getSecretKey())
                .setSecretKey(game.getSecretKey())
                .setTitleId(game.getTitleId())
                .build();

        LanguageEntity.Language buildLang = LanguageEntity.Language.newBuilder()
                .setId(language.getId())
                .setGame(buildGame)
                .setName(language.getName())
                .setType(language.getType())
                .setDescription(language.getDescription())
                .build();

        return PromotionEntity.Promotion.newBuilder()
                .setId(promotion.getId())
                .setGroup(promotion.getGroup())
                .setTitle(promotion.getTitle())
                .setContents(promotion.getContents())
                .setPriority(promotion.getPriority())
                .setEnable(promotion.getEnable())
                .setRegDate(promotion.getRegDate().atZone(zoneId).toEpochSecond())
                .setFormDate(promotion.getFromDate().atZone(zoneId).toEpochSecond())
                .setToDate(promotion.getToDate().atZone(zoneId).toEpochSecond())
                .setDescription(promotion.getDescription())
                .setLanguage(buildLang)
                .build();
    }
}
