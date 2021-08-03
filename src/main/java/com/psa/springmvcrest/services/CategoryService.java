package com.psa.springmvcrest.services;

import com.psa.springmvcrest.api.v1.model.CategoryDTO;

import java.util.List;

/**
 * Created by PSA at 7/3/2021
 */
public interface CategoryService {
    List<CategoryDTO> getAllCategories();

    CategoryDTO getCategoryByName(String name);
}
