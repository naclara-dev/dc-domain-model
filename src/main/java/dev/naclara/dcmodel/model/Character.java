package dev.naclara.dcmodel.model;

import dev.naclara.dcmodel.enums.Gender;

import java.time.LocalDate;

public abstract class Character {
    private String name;
    private String realName;
    private String description;
    private Gender gender;
    private float height;
    private float weight;
    private String birthPlace;
    private String creator;
}
