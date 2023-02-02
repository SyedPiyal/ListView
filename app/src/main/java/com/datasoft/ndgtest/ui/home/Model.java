package com.datasoft.ndgtest.ui.home;

public class Model {
    private int profileImage;
    private String name;

    public Model(int profileImage, String name){

        this.profileImage = profileImage;
        this.name = name;
    }

    public int getProfielImage() {
        return profileImage;
    }

    public void setProfileImage(int profileImage) {
        this.profileImage = profileImage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
