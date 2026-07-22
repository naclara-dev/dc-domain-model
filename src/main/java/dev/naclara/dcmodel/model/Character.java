package dev.naclara.dcmodel.model;

import dev.naclara.dcmodel.enums.Alignment;
import dev.naclara.dcmodel.enums.Gender;
import lombok.AccessLevel;
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
    private City mainCity;
    private List<Equipment> equipments;

    @Setter(AccessLevel.NONE)
    private Character archEnemy;

    @Setter(AccessLevel.NONE)
    private Character loveInterest;

    public Character(String name, Alignment alignment) {
        this.name = name;
        this.alignment = alignment;
    }

    public void setArchEnemy(Character newArchEnemy) {
        if (newArchEnemy == this) {
            return;
        }

        // Gets the character's current archenemy
        Character currentArchEnemy = this.getArchEnemy();

        // Checks if an archenemy has already been defined
        if (currentArchEnemy != null) {
            // Removes the character from the current archenemy before setting the new archenemy
           currentArchEnemy.unsetArchEnemy();
        }

        // Sets the new character's archenemy
        this.archEnemy = newArchEnemy;

        // Checks if the new archenemy already references the character
        if (newArchEnemy.getArchEnemy() != this) {
            // Sets the character as the new archenemy's archenemy
            newArchEnemy.setArchEnemy(this);
        }
    }

    public void unsetArchEnemy() {
        this.archEnemy = null;
    }
}
