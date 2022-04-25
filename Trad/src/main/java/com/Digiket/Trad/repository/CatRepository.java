package com.Digiket.Trad.repository;

import com.Digiket.Trad.models.Category;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CatRepository extends JpaRepository<Category,Long>{
   
}