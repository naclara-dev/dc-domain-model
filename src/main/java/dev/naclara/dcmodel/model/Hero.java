package dev.naclara.dcmodel.model;

import dev.naclara.dcmodel.enums.Alignment;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Hero extends Character {
    public Hero(String name) {
        super(name, Alignment.HERO);
    }
}
