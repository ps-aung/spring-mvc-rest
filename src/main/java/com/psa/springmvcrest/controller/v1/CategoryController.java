package com.psa.springmvcrest.controller.v1;

import com.psa.springmvcrest.api.v1.model.CategoryDTO;
import com.psa.springmvcrest.api.v1.model.CategoryListDTO;
import com.psa.springmvcrest.services.CategoryService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * Created by PSA at 7/3/2021
 */
@RestController
@RequestMapping(CategoryController.BASE_URL)
public class CategoryController {

    public static final String BASE_URL = "/api/v1/categories";

    private final CategoryService categoriesService;

    public CategoryController(CategoryService categoriesService) {
        this.categoriesService = categoriesService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public CategoryListDTO getallCategories(){
        return new CategoryListDTO(categoriesService.getAllCategories());
    }

    @GetMapping("{name}")
    @ResponseStatus(HttpStatus.OK)
    public CategoryDTO getCategoryByName(@PathVariable String name){
        return categoriesService.getCategoryByName(name);
    }
}
