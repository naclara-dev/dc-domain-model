package dev.naclara.dcmodel.model;

import dev.naclara.dcmodel.enums.Alignment;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Villain extends Character {
    public Villain(String name) {
        super(name, Alignment.VILLAIN);
    }
}
