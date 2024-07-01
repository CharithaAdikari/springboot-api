package com.example.nexa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@IdClass(ColorPalletKey.class)
public class ColorPallet {
    @Id
    private int imageColorPalletId;
    @Id
    private String email;
    private String rating;

    @OneToMany(mappedBy = "colorPallet", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<ColorPalletColorCode> colorCodes;

    @OneToMany(mappedBy = "colorPallet", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Generate> generates;
}
