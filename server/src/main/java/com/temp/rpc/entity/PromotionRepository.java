package com.temp.rpc.entity;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PromotionRepository extends JpaRepository<Promotion, Integer> {
    List<Promotion> findAllByLanguage_Id(Integer id);
}
