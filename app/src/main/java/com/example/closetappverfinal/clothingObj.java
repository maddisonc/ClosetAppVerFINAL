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
        // https://uibakery.io/regex-library/url
        // most common types of links (starting with https and not starting with https)
        if (picLink.matches("/^https?:\\/\\/(?:www\\.)?[-a-zA-Z0-9@:%._\\+~#=]{1,256}\\." +
                "[a-zA-Z0-9()]{1,6}\\b(?:[-a-zA-Z0-9()@:%_\\+.~#?&\\/=]*)$/") ||
                picLink.matches("/^[-a-zA-Z0-9@:%._\\+~#=]{1,256}\\." + "[a-zA-Z0-9()]" +
                        "{1,6}\\b(?:[-a-zA-Z0-9()@:%_\\+.~#?&//=]*)$/"))
        {
            this.picLink = picLink;
        }
        else
        {
            picLink = "invalid url";
        }
    }

    public void setName(String name)
    {
        if (name.matches("[ A-Za-z]"))
        {
            this.name = name;
        }
        else
        {
            name = "invalid name";
        }
    }

    public void setColor(String color)
    {
        if (color.matches("[ A-Za-z]"))
        {
            this.color = color;
        }
        else
        {
            color = "invalid color";
        }
    }

    public void setFormality(String formality)
    {
        if (formality.matches("[ A-Za-z]"))
        {
            this.formality = formality;
        }
        else
        {
            formality = "invalid level of formality";
        }
    }

    public void setWeather(String weather)
    {
        if (weather.matches("[ A-Za-z]"))
        {
            this.weather = weather;
        }
        else
        {
            weather = "invalid weather type";
        }
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