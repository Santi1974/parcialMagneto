package org.example.parcialmagneto.entities;

import jakarta.persistence.Entity;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
public class Dna extends Base implements Serializable{
    private String dna;
    private boolean isMutant;
}
