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
    private float height;
    private float weight;
    private Planet birthPlanet;
    private City mainCity;
    private List<Equipment> equipments;

    @Setter(AccessLevel.NONE)
    private Team team;

    @Setter(AccessLevel.NONE)
    private Character archEnemy;

    @Setter(AccessLevel.NONE)
    private Character loveInterest;

    public Character(String name, Alignment alignment) {
        this.name = name;
        this.alignment = alignment;
    }

    public void write() {
        System.out.println("----------------------");
        System.out.println(name + " (Character)");
        System.out.println("----------------------");

        System.out.println("Real Name: " + realName);
        System.out.println("Description: " + description);
        System.out.println("Gender: " + gender);
        System.out.println("Height: " + height + "m");
        System.out.println("Weight: " + weight + "kg");

        if (birthPlanet != null) {
            System.out.println("Birth Planet: " + birthPlanet.getName());
        }
        if (mainCity != null) {
            System.out.println("Current City: " + mainCity.getName());
        }
        if (archEnemy != null) {
            System.out.println("Archenemy: " + archEnemy.getName());
        }
        if (loveInterest != null) {
            System.out.println("Love Interest: " + loveInterest.getName());
        }
        if (team != null) {
            System.out.println("Team: " + team.getName());
        }

        System.out.println("----------------------");
    }

    public void setArchEnemy(Character newArchEnemy) {
        // Prevents a character from being their own archenemy
        if (newArchEnemy == this) {
            return;
        }

        // Gets the character's current archenemy
        Character currentArchEnemy = getArchEnemy();

        // Checks if an archenemy has already been defined
        if (currentArchEnemy != null) {
            // Removes the character from the current archenemy before setting the new archenemy
           currentArchEnemy.unsetArchEnemy();
        }

        // Sets the new character's archenemy
        archEnemy = newArchEnemy;

        // Checks if the new archenemy already references the character
        if (newArchEnemy.getArchEnemy() != this) {
            // Sets the character as the new archenemy's archenemy
            newArchEnemy.setArchEnemy(this);
        }
    }

    public void unsetArchEnemy() {
        archEnemy = null;
    }

    public void setLoveInterest(Character newLoveInterest) {
        // Prevents a character from being their own love interest
        if (newLoveInterest == this) {
            return;
        }

        // Gets the character's current love interest
        Character currentLoveInterest = getLoveInterest();

        // Checks if a love interest has already been defined
        if (currentLoveInterest != null) {
            // Removes the character from the current love interest before setting the new love interest
            currentLoveInterest.unsetLoveInterest();
        }

        // Sets the new character's love interest
        loveInterest = newLoveInterest;

        // Checks if the new love interest already references the character
        if (newLoveInterest.getLoveInterest() != this) {
            // Sets the character as the new love interest's love interest
            newLoveInterest.setLoveInterest(this);
        }
    }

    public void unsetLoveInterest() {
        loveInterest = null;
    }

    public void setTeam(Team newTeam) {
        // Gets the character's current Team
        Team currentTeam = getTeam();

        // Checks if the character already has a team
        if (currentTeam != null) {
            // Remove the character from the old team
            currentTeam.removeMember(this);
        }

        // Sets the new character's team
        team = newTeam;

        // Checks if the new team already contains the character
        if (!team.hasMember(this)) {
            // Add the character to the new team
            team.addMember(this);
        }
    }
}
