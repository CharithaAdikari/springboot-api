package com.example.nexa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@IdClass(InteriorImageKey.class)
public class InteriorImage {
    @Id
    private String email;
    @Id
    private int InteriorImageId;
    private String augmentedImageUrl;
    private String texture;
    private float complexityScore;
    private String TimeStamp;
    private String InteriorImageUrl;

    @ManyToOne
    @JoinColumn(name = "email", insertable = false, updatable = false)
    private Client client;

    @OneToMany(mappedBy = "interiorImage", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Generate> generates;

}
