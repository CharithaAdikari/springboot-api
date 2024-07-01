package com.example.nexa.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class InteriorImage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long imageid;
    private Long clientid;
    private String roomImageUrl;
    private String texture;
    private Float complexityScore;
    private Timestamp timeStamp;
    private String augmentedImageUrl;

    // Getters and Setters

    public Long getImageid() {
        return imageid;
    }

    public void setImageid(Long imageid) {
        this.imageid = imageid;
    }

    public Long getClientid() {
        return clientid;
    }

    public void setClientid(Long clientid) {
        this.clientid = clientid;
    }

    public String getRoomImageUrl() {
        return roomImageUrl;
    }

    public void setRoomImageUrl(String roomImageUrl) {
        this.roomImageUrl = roomImageUrl;
    }

    public String getTexture() {
        return texture;
    }

    public void setTexture(String texture) {
        this.texture = texture;
    }

    public Float getComplexityScore() {
        return complexityScore;
    }

    public void setComplexityScore(Float complexityScore) {
        this.complexityScore = complexityScore;
    }

    public Timestamp getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Timestamp timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getAugmentedImageUrl() {
        return augmentedImageUrl;
    }

    public void setAugmentedImageUrl(String augmentedImageUrl) {
        this.augmentedImageUrl = augmentedImageUrl;
    }
}
