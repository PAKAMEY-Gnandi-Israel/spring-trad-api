
package com.Digiket.Trad.models;


import javax.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@Table(name = "categorie")
@NoArgsConstructor
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cat_id;

    @Column(name = "cat")
    private String cat;


    public Category() {
    }

    public Long getId() {
        return cat_id;
    }

    public void setId(Long cat_id) {
        this.cat_id = cat_id;
    }

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }

  


}
