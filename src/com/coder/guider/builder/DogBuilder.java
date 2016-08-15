package com.coder.guider.builder;

/**
 * Created by apple on 15/8/14.
 */
public class DogBuilder {

    private String name;
    private int weight;

    public String getName() {
        return name;
    }

    public DogBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public int getWeight() {
        return weight;
    }

    public DogBuilder setWeight(int weight) {
        this.weight = weight;
        return this;
    }

    public Dog create() {

        return new Dog(this);
    }
}
