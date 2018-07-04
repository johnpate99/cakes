package com.cakeregistry.cake.repositories;

import com.cakeregistry.cake.model.Cake;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CakeRepository extends JpaRepository<Cake, Long> {
}
