package org.launchcode.models.forms;

import org.launchcode.models.Cheese;
import org.launchcode.models.Menu;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Created by user on 2/4/19.
 */


public class AddMenuItemForm {



    private Menu menu;
    private Iterable<Cheese> cheeses;
    @NotNull
    private int menuId;
    @NotNull
    private int cheeseId;



    // Constructors
    public AddMenuItemForm(){}
    public AddMenuItemForm(Menu menu, Iterable<Cheese> cheeses){
        this.setMenu(menu);
        this.setCheeses(cheeses);

    }



    // Getters & Setters

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public Iterable<Cheese> getCheeses() {
        return cheeses;
    }

    public void setCheeses(Iterable<Cheese> cheeses) {
        this.cheeses = cheeses;
    }

    public int getMenuId() {
        return menuId;
    }

    public void setMenuId(int menuId) {
        this.menuId = menuId;
    }

    public int getCheeseId() {
        return cheeseId;
    }

    public void setCheeseId(int cheeseId) {
        this.cheeseId = cheeseId;
    }
}
