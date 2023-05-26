package com.example.closetappverfinal;

public class clothingObj
{
    // vars
    public String picLink;
    public String name;
    public String color;
    public String formality;
    public String weather;

    // constructor
    public clothingObj (String picLink, String name, String color, String formality, String weather)
    {
        this.picLink = picLink;
        this.name = name;
        this.color = color;
        this.formality = formality;
        this.weather = weather;
    }

    // 4) Getters
    public String getPicLink()
    {
        return picLink;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getFormality() {
        return formality;
    }

    public String getWeather() {
        return weather;
    }

    // setters
    public void setPicLink(String picLink) {
        this.picLink = picLink;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFormality(String formality) {
        this.formality = formality;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    // toString
    @Override
    public String toString() {
        return "clothingObj{" +
                "picLink='" + picLink + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", formality='" + formality + '\'' +
                ", weather='" + weather + '\'' +
                '}';
    } // end toString

} // end clothingObj class