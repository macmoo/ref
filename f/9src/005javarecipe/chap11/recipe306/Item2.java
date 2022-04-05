package jp.co.shoeisha.javarecipe.chapter11.recipe306;

import java.util.List;

public class Item2 {
    private String category;
    private String name;
    private int price;

    private List<String> producers;

    public Item2(String category, String name, int price, List<String> producers) {
        this.category = category;
        this.name = name;
        this.price = price;
        this.producers = producers;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public List<String> getProducers() {
        return producers;
    }

    public void setProducers(List<String> producers) {
        this.producers = producers;
    }
}
