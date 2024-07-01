package com.example.nexa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@IdClass(GenerateKey.class)
public class Generate {
    @Id
    private String email;
    @Id
    private int InteriorImageId;

    @Id
    private int colorPalletId;

    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "email", referencedColumnName = "email", insertable = false, updatable = false),
            @JoinColumn(name = "interiorImageId", referencedColumnName = "interiorImageId", insertable = false, updatable = false)
    })
    private InteriorImage interiorImage;

    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "colorPalletId", referencedColumnName = "imageColorPalletId", insertable = false, updatable = false),
            @JoinColumn(name = "email", referencedColumnName = "email", insertable = false, updatable = false)
    })
    private ColorPallet colorPallet;

    @ManyToOne
    @JoinColumn(name = "email", insertable = false, updatable = false)
    private Client client;
}
