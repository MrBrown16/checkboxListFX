package model;

public class Fruit {
    String name;
    int category;

    public Fruit(String name, int category) {
        this.name = name;
        this.category = category;
    }
    public String getName() {
        return name;
    }    
    public int getCategory() {
        return category;
    }
}
