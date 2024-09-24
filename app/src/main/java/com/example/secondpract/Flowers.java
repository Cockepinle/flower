package com.example.secondpract;

public class Flowers {
    private String name;
    private String color;
    private int count;
    private String counts;

    public Flowers(String name,String color, int count, String counts) {
        this.name=name;
        this.color=color;
        this.count=count;
        this.counts=counts;
    }

    public String getName() {return this.name;}
    public void setName(String name) {this.name=name;}
    public String getColor() {return this.color;}
    public void setColor(String color) {this.color=color;}
    public int getCount() {return this.count;}
    public void setCount(int count) {this.count=count;}
    public String getCounts() {return this.counts;}
    public void setCounts(String counts) {this.counts=counts;}

}
