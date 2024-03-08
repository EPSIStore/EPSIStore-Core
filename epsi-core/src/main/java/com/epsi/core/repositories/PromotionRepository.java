package com.epsi.core.repositories;

import com.epsi.core.entities.Promotion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PromotionRepository extends JpaRepository<Promotion,Integer>{
    List<Promotion> findByProduct_IdProduct(int productId);
}