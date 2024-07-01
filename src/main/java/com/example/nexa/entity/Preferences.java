package com.example.nexa.entity;

import javax.persistence.*;

@Entity
public class Preferences {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long preferenceID;

    @ManyToOne
    @JoinColumn(name = "clientID", nullable = false)
    private Client client;

    private String ageGroup;
    private String architecturalStyle;
    private String budget;
    private String climate;
    private String colorToneTheme;
    private String favoriteColors;
    private String lifestyle;
    private boolean naturalLightChecked;
    private String numberOfMembers;
    private boolean photosensitivity;
    private boolean richColorChecked;
    private String preferredAmbiance;

    // Getters and Setters

    public Long getPreferenceID() {
        return preferenceID;
    }

    public void setPreferenceID(Long preferenceID) {
        this.preferenceID = preferenceID;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(String ageGroup) {
        this.ageGroup = ageGroup;
    }

    public String getArchitecturalStyle() {
        return architecturalStyle;
    }

    public void setArchitecturalStyle(String architecturalStyle) {
        this.architecturalStyle = architecturalStyle;
    }

    public String getBudget() {
        return budget;
    }

    public void setBudget(String budget) {
        this.budget = budget;
    }

    public String getClimate() {
        return climate;
    }

    public void setClimate(String climate) {
        this.climate = climate;
    }

    public String getColorToneTheme() {
        return colorToneTheme;
    }

    public void setColorToneTheme(String colorToneTheme) {
        this.colorToneTheme = colorToneTheme;
    }

    public String getFavoriteColors() {
        return favoriteColors;
    }

    public void setFavoriteColors(String favoriteColors) {
        this.favoriteColors = favoriteColors;
    }

    public String getLifestyle() {
        return lifestyle;
    }

    public void setLifestyle(String lifestyle) {
        this.lifestyle = lifestyle;
    }

    public boolean isNaturalLightChecked() {
        return naturalLightChecked;
    }

    public void setNaturalLightChecked(boolean naturalLightChecked) {
        this.naturalLightChecked = naturalLightChecked;
    }

    public String getNumberOfMembers() {
        return numberOfMembers;
    }

    public void setNumberOfMembers(String numberOfMembers) {
        this.numberOfMembers = numberOfMembers;
    }

    public boolean isPhotosensitivity() {
        return photosensitivity;
    }

    public void setPhotosensitivity(boolean photosensitivity) {
        this.photosensitivity = photosensitivity;
    }

    public boolean isRichColorChecked() {
        return richColorChecked;
    }

    public void setRichColorChecked(boolean richColorChecked) {
        this.richColorChecked = richColorChecked;
    }

    public String getpreferredAmbiance() {
        return preferredAmbiance;
    }

    public void setpreferredAmbiance(String preferredAmbiance) {
        this.preferredAmbiance = preferredAmbiance;
    }
}
