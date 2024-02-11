package com.epsi.core.repositories;

import com.epsi.core.entities.Rate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RateRepository extends JpaRepository<Rate, Integer> {
}
