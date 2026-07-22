package dev.naclara.dcmodel.model;

import dev.naclara.dcmodel.enums.Alignment;
import dev.naclara.dcmodel.enums.Gender;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

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
    private Planet birthPlanet;
    private Character archEnemy;
    private Character loveInterest;
    private List<Equipment> equipments;

    public Character(String name, Alignment alignment) {
        this.name = name;
        this.alignment = alignment;
    }
}
