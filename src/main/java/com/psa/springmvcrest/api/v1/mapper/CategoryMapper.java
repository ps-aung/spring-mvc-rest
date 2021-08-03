package com.psa.springmvcrest.api.v1.mapper;

import com.psa.springmvcrest.api.v1.model.CategoryDTO;
import com.psa.springmvcrest.domain.Category;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
/**
 * Created by PSA at 7/3/2021
 */
@Mapper
public interface CategoryMapper {

    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);

    CategoryDTO categoryToCategoryDTO(Category category);
}
