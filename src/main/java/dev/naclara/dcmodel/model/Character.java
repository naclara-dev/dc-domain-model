package dev.naclara.dcmodel.model;

import dev.naclara.dcmodel.Team;
import dev.naclara.dcmodel.enums.Alignment;
import dev.naclara.dcmodel.enums.Gender;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public abstract class Character {
    private int id;
    private String name;
    private String realName;
    private String description;
    private Gender gender;
    private Alignment alignment;
    private Team team;
    private float height;
    private float weight;
    private String birthPlace;
    private String creator;

    public Character(String name, Alignment alignment) {
        this.name = name;
        this.alignment = alignment;
    }
}
