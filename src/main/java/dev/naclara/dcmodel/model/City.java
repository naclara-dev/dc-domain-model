package dev.naclara.dcmodel.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class City {
    private int id;
    private String name;
    private Planet planet;

    public City(String name) {
        this.name = name;
    }
}
