package model;

import java.util.ArrayList;

public class MainModel {
    ArrayList<Fruit> fruitList;
    public MainModel() {
        this.fruitList = new ArrayList<>();
        initFruit();
    }
    private void initFruit(){
        this.fruitList.add(new Fruit("alma", 1));
        this.fruitList.add(new Fruit("szilva", 1));
        this.fruitList.add(new Fruit("körte", 1));
        this.fruitList.add(new Fruit("barack", 1));
        this.fruitList.add(new Fruit("eper", 1));
        this.fruitList.add(new Fruit("cseresznye", 1));
        this.fruitList.add(new Fruit("banán", 2));
        this.fruitList.add(new Fruit("narancs", 2));
        this.fruitList.add(new Fruit("citrom", 2));
        this.fruitList.add(new Fruit("grapefruit", 2));
    }
    public ArrayList<Fruit> getFruits(){
        return this.fruitList;
    }
}
