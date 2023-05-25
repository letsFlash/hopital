package com.example.hopital.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

import static jakarta.persistence.GenerationType.IDENTITY;
@Entity
@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class Patient {
    @Id @GeneratedValue(strategy = IDENTITY)
    private Long id;
    @NotBlank //@NotEmpty
    @Size(min = 4, max = 20)
    private String nom;
    @Temporal(TemporalType.DATE)
    private Date dateNaissance;
    private boolean malade;
    @Min(100)
    private int score;
}
