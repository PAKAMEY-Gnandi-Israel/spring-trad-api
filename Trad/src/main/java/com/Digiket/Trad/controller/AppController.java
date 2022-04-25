package com.Digiket.Trad.controller;
import java.util.List;

import com.Digiket.Trad.dto.*;

import com.Digiket.Trad.service.CatService;
import com.Digiket.Trad.service.TradService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/traduction")
public class AppController {
    

    @Autowired
    private CatService catService;

    @Autowired
    private TradService tradService;

    @GetMapping(value = "/cat")
    public List<CatDto> getAllCat(){

      return catService.getAllCat();
    }

    @RequestMapping(value = "/trads/{cat_id}", method = RequestMethod.GET)
    public List<TradDto> getAllTrad(@PathVariable Long cat){
        System.out.println("cat est"+cat);
       long c = cat.longValue();
        return tradService.getAllExp(c);
      }
  
    
}
