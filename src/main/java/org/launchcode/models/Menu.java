package org.launchcode.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

/**
 * Created by user on 2/4/19.
 */

@Entity
public class Menu {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @NotNull
    @Size(min=3, max=15)
    private String name;
    @Id
    @GeneratedValue
    private Integer id;
    @ManyToMany
    private List<Cheese> cheeses;

    public List<Cheese> getCheeses() {
        return cheeses;
    }



    public Menu() {}

    public Menu(String name){
        this.setName(name);
    }

    public void addItem(Cheese cheese) {
        cheeses.add(cheese);
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


}
