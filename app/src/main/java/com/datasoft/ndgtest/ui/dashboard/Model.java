package com.datasoft.ndgtest.ui.dashboard;

public class Model {
    private int image;
    private String name;
    private String item;

    public Model(int image,String name,String item){
        this.image= image;
        this.name= name;
        this.item= item;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }
}
