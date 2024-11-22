package com.busanit501.helloword2.food.dto;

public class FoodDTO {
    private String menu;


    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }


    @Override
    public String toString() {
        return "TodoDTO{" +
                "menu='" + menu + '\'' +
                '}';
    }
}
