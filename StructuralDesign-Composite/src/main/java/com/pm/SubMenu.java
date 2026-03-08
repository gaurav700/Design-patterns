package com.pm;

import java.util.ArrayList;
import java.util.List;

public class SubMenu implements Menu {
    private final String subMenuName;
    private final List<Menu> menus;

    public SubMenu(String name) {
        this.subMenuName = name;
        this.menus = new ArrayList<>();
    }

    @Override
    public void display(String indent) {
        System.out.println(indent + subMenuName + ":");
        for (Menu child : menus) {
            child.display(indent + "  ");
        }
    }

    @Override
    public int getItemCount() {
        int total = 0;
        for(Menu menu : menus) {
            total+=menu.getItemCount();
        }
        return total;
    }

    public void addItem(Menu item){
        menus.add(item);
    }
}
