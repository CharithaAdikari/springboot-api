package com.example.nexa.entity;

import javax.persistence.*;

@Entity
@Table(name = "color_pallet")
public class ColorPallet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long colorpalletid;

    private Long imageid;
    private String colorcode;
    private Float rating;
    private String feedback;
    private String feedback_url;

    // Getters and Setters
    public Long getColorpalletid() {
        return colorpalletid;
    }

    public void setColorpalletid(Long colorpalletid) {
        this.colorpalletid = colorpalletid;
    }

    public Long getImageid() {
        return imageid;
    }

    public void setImageid(Long imageid) {
        this.imageid = imageid;
    }

    public String getColorcode() {
        return colorcode;
    }

    public void setColorcode(String colorcode) {
        this.colorcode = colorcode;
    }

    public Float getRating() {
        return rating;
    }

    public void setRating(Float rating) {
        this.rating = rating;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public String getFeedback_url() {
        return feedback_url;
    }

    public void setFeedback_url(String feedback_url) {
        this.feedback_url = feedback_url;
    }
}
