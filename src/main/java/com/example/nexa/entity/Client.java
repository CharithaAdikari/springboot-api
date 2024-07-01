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
public class Client {
    @Id
    private String email;
    private String gender;
    private String birthDate;
    private String userGroup;
    private String password;
    private String feedbackComment;
    private String feedbackImageUrl;
    private String feedbackAnswer1;
    private String feedbackAnswer2;
    private String feedbackAnswer3;
    private String feedbackAnswer4;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "email", referencedColumnName = "email")
    private ClientName clientName;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "email", referencedColumnName = "email")
    private ClientPreferences clientPreferences;

    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<InteriorImage> interiorImages;

    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Generate> generates;
}
