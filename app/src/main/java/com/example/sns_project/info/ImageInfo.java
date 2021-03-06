package com.example.sns_project.info;

public class ImageInfo{
    private String image;
    private String title;
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ImageInfo(String id, String image, String title) {
        this.id = id;
        this.image = image;
        this.title = title;
    }
}