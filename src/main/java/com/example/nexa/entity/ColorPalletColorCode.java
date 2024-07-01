package com.example.nexa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@IdClass(ColorPalletColorCodeKey.class)
public class ColorPalletColorCode {
    @Id
    @Column(insertable = false, updatable = false)
    private String email;

    @Id
    private int colorPalletColorId;
    private String colorCode;

    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "email", referencedColumnName = "email", insertable = false, updatable = false),
            @JoinColumn(name = "imageColorPalletId", referencedColumnName = "imageColorPalletId", insertable = false, updatable = false)
    })
    private ColorPallet colorPallet;



}
