package org.example.parcialmagneto.dto;

import lombok.Getter;
import lombok.Setter;
import org.example.parcialmagneto.validators.ValidDna;

@Getter
@Setter
public class DnaRequest {
    @ValidDna
    private String[] dna;
}