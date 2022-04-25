package com.Digiket.Trad.dto;

import com.Digiket.Trad.models.Category;

public class TradDto {
    private Long id;
    private String fr ;
    private String ewe;
    private Long cat;
    
  
    public TradDto() {
    }
    public TradDto(Long id, String fr, String ewe, Long cat) {
        this.id = id;
        this.fr = fr;
        this.ewe = ewe;
        this.cat = cat;
    
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getFr() {
        return fr;
    }
    public void setFr(String fr) {
        this.fr = fr;
    }
    public String getEwe() {
        return ewe;
    }
    public void setEwe(String ewe) {
        this.ewe = ewe;
    }
    public Long getCat() {
        return cat;
    }
    public void setCat(Long cat) {
        this.cat = cat;
    }
    
}
