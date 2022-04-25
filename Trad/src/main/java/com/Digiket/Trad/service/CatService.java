package com.Digiket.Trad.service;

import java.util.ArrayList;
import java.util.List;

import com.Digiket.Trad.dto.CatDto;
import com.Digiket.Trad.models.Category;
import com.Digiket.Trad.repository.CatRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CatService {
    @Autowired
    private CatRepository catRepository;
    public List<CatDto> getAllCat(){

        List<Category> categories = catRepository.findAll();

        List<CatDto> lcatDto = categorieToCatDtoMapper(categories);
        return lcatDto;
    }

private List<CatDto> categorieToCatDtoMapper(List<Category> categories){
    List<CatDto> listCategorieDto = new ArrayList<>();

    for (Category category : categories)  {

        CatDto categoryDto = new CatDto();

        categoryDto.setId(category.getId());

        categoryDto.setCat(category.getCat());

        listCategorieDto.add(categoryDto);

    }
    return listCategorieDto;
}
}

