package com.psa.springmvcrest.repositories;

import com.psa.springmvcrest.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Created by PSA at 7/3/2021
 */
public interface CategoryRepository extends JpaRepository<Category, Long> {
    Category findByName(String name);
}
