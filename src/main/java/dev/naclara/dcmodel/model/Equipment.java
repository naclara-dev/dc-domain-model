package dev.naclara.dcmodel.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public abstract class Equipment {
    private int id;
    private String name;
    private String description;
}
