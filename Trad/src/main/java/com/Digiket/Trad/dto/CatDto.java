package com.Digiket.Trad.dto;

public class CatDto {
    private Long id;
    private String cat;
    public CatDto() {
    }
    public CatDto(Long id, String cat) {
        this.id = id;
        this.cat = cat;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getCat() {
        return cat;
    }
    public void setCat(String cat) {
        this.cat = cat;
    }
    
}
