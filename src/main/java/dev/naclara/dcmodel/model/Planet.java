package dev.naclara.dcmodel.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class Planet {
    private int id;
    private String name;

    public Planet(String name) {
        this.name = name;
    }
}
