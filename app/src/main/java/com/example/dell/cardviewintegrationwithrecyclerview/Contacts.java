package com.example.dell.cardviewintegrationwithrecyclerview;



public class Contacts {
    int image_id;
    String name,email_id,mobile;
    public Contacts(int image_id,String name,String email_id,String mobile){
        this.setImage_id(image_id);
        this.setName(name);
        this.setEmail_id(email_id);
        this.setMobile(mobile);
    }


    public int getImage_id() {
        return image_id;
    }

    public void setImage_id(int image_id) {
        this.image_id = image_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail_id() {
        return email_id;
    }

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
