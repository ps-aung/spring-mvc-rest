package com.psa.springmvcrest.services;

import com.psa.springmvcrest.api.v1.mapper.CategoryMapper;
import com.psa.springmvcrest.api.v1.model.CategoryDTO;
import com.psa.springmvcrest.domain.Category;
import com.psa.springmvcrest.repositories.CategoryRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

/**
 * Created by PSA at 7/3/2021
 */
public class CategoryServiceTest {

    public static final Long ID = 1L;
    public static final String NAME = "Jimmy";
    CategoryService categoriesService;

    @Mock
    CategoryRepository categoryRepository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);

        categoriesService = new CategoryServiceImpl(CategoryMapper.INSTANCE,categoryRepository);
    }

    @Test
    void testGetAllCategories() throws Exception {
        //given
        List<Category> categories = Arrays.asList(new Category(),new Category(),new Category());

        when(categoryRepository.findAll()).thenReturn(categories);

        //when
        List<CategoryDTO> categoryDTOS = categoriesService.getAllCategories();

        //then
        assertEquals(3,categoryDTOS.size());
    }

    @Test
    void testGetCategoryByName() throws Exception {
        //given
        Category category = new Category();
        category.setId(ID);
        category.setName(NAME);

        when(categoryRepository.findByName(anyString())).thenReturn(category);

        //when
        CategoryDTO categoryDTO = categoriesService.getCategoryByName(NAME);

        //then
        assertEquals(ID,categoryDTO.getId());
        assertEquals(NAME,categoryDTO.getName());
    }
}