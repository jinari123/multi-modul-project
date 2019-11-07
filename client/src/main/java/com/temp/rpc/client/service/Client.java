package com.temp.rpc.client.service;

import com.temp.rpc.entity.PromotionEntity;
import com.temp.rpc.form.IdxFormOuterClass;
import com.temp.rpc.service.PromotionRouteGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

import java.util.concurrent.TimeUnit;

public class Client {
    private final ManagedChannel channel;
    private final PromotionRouteGrpc.PromotionRouteBlockingStub blockingStub;
    private final PromotionRouteGrpc.PromotionRouteStub asyncStub;

    public Client(ManagedChannelBuilder builder) {
        channel = builder.usePlaintext().build();
        blockingStub = PromotionRouteGrpc.newBlockingStub(channel);
        asyncStub = PromotionRouteGrpc.newStub(channel);
    }

    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

    public void getFeature(Integer i) {
        IdxFormOuterClass.IdxForm form = IdxFormOuterClass.IdxForm.newBuilder().setId(i).build();

        try {
            PromotionEntity.Promotion res = blockingStub.getPromotion(form);
        }catch(StatusRuntimeException ee){
            System.err.println(ee.getMessage());
        }
    }
}
