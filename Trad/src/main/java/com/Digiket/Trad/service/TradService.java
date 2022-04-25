package com.Digiket.Trad.service;

import java.util.ArrayList;
import java.util.List;

import com.Digiket.Trad.dto.TradDto;
import com.Digiket.Trad.models.Trad;
import com.Digiket.Trad.repository.TradRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class TradService {
    @Autowired
    private TradRepository tradRepository;
    public List<TradDto> getAllExp(Long cat){
        List<Trad> trads = tradRepository.getExpByCat(cat);

        List<TradDto> lTradDto = tradToTradDtoMapper(trads);
        return lTradDto;
    
}

private List<TradDto> tradToTradDtoMapper(List<Trad> trads){
    List<TradDto> listTradDto = new ArrayList<>();

    for (Trad exps : trads)  {

        TradDto tradDto = new TradDto();

        tradDto.setId(exps.getId());

        tradDto.setFr(exps.getFr());
        tradDto.setEwe(exps.getEwe());
        tradDto.setCat(exps.getCat().getId());

        listTradDto.add(tradDto);

    }
    return listTradDto;
}
}
