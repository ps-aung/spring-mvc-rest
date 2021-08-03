package com.psa.springmvcrest.api.v1.mapper;

import com.psa.springmvcrest.api.v1.model.CategoryDTO;
import com.psa.springmvcrest.domain.Category;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
/**
 * Created by PSA at 7/3/2021
 */
public class CategoryMapperTest {

    public static final String NAME = "PSA";
    public static final long ID = 1L;

    CategoryMapper categoryMapper = CategoryMapper.INSTANCE;

    @Test
    public void testCategoryToCategoryDTO() throws Exception {

        //given
        Category category = new Category();
        category.setName(NAME);
        category.setId(ID);

        //when
        CategoryDTO categoryDTO = categoryMapper.categoryToCategoryDTO(category);

        //then
        assertEquals(Long.valueOf(ID), categoryDTO.getId());
        assertEquals(NAME, categoryDTO.getName());
    }

}