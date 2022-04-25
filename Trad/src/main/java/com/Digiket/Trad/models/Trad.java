
package com.Digiket.Trad.models;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import lombok.Data;

@Data
@Entity
@Table(name = "trad")
public class Trad{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
@Column(name = "fr")
private String fr;
@Column(name = "ewe")
private String ewe;
 @ManyToOne
 @JoinColumn(name="cat_id", nullable=false)
 @OnDelete(action = OnDeleteAction.CASCADE)
 @JsonIgnore
private Category cat;
public Trad() {
}
public Trad(Long id, String fr, String ewe, Category cat) {
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
public Category getCat() {
    return cat;
}
public void setCat(Category cat) {
    this.cat = cat;
}


 }