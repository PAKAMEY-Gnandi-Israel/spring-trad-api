package com.Digiket.Trad.repository;
import java.util.Collection;
import java.util.List;

import com.Digiket.Trad.models.Trad;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;




public interface TradRepository extends JpaRepository<Trad,Long>{

    @Query(
        value = "SELECT * FROM trad t WHERE t.cat_id = ?1", 
        nativeQuery= true)
      List<Trad> getExpByCat(Long cat);

}


