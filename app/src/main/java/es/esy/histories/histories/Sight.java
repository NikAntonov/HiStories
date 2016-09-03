package es.esy.histories.histories;

import java.net.URI;
import java.net.URL;

public class Sight {

    public String name;
    public double xAxis;
    public double yAxis;
    public String description;
    public String website;
    public String imageurl;



    public Sight(String name, double xAxis, double yAxis, String description, String website, String imageurl) {
        this.name = name;
        this.xAxis = xAxis;
        this.yAxis = yAxis;
        this.description = description;
        this.website = website;
        this.imageurl = imageurl;
    }

    public Sight() {
        this.name = "Test";
        this.xAxis = -34;
        this.yAxis = 151;
        this.description = "Lorem ipsum dolor sit amet";
        this.website = "http://histories.esy.es";
        this.imageurl = "http://histories.esy.es/bg-jumbotron.jpg";
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getxAxis() {
        return xAxis;
    }

    public void setxAxis(double xAxis) {
        this.xAxis = xAxis;
    }

    public double getyAxis() {
        return yAxis;
    }

    public void setyAxis(double yAxis) {
        this.yAxis = yAxis;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
}
