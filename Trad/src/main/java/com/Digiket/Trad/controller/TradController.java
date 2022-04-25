package com.Digiket.Trad.controller;
import java.util.List;

import com.Digiket.Trad.dto.*;


import com.Digiket.Trad.service.TradService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/trads")
public class TradController {
    


    @Autowired
    private TradService tradService;

    @RequestMapping(value = "/{cat}", method = RequestMethod.GET)
    public List<TradDto> getAllTrad(@PathVariable Long cat){
        
        return tradService.getAllExp(cat);
      }
  
    
}
