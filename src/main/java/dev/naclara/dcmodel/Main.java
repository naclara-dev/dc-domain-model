package dev.naclara.dcmodel;

import dev.naclara.dcmodel.enums.Gender;
import dev.naclara.dcmodel.model.City;
import dev.naclara.dcmodel.model.Hero;
import dev.naclara.dcmodel.model.Planet;
import dev.naclara.dcmodel.model.Villain;

public class Main {
    public static void main() {
        // ------------------------
        //     BATMAN UNIVERSE
        // ------------------------
        // Creates Earth
        Planet earth = new Planet("Earth");
        // Creates Gotham
        City gotham = new City("Gotham");

        // Sets Earth as the planet of Gotham
        gotham.setPlanet(earth);

        // Creates Batman
        Hero batman = new Hero("Batman");
        // Sets Batman attributes
        batman.setRealName("Bruce Wayne");
        batman.setDescription("Dark Knight who fights crime in Gotham City.");
        batman.setGender(Gender.MALE);
        batman.setBirthPlanet(earth);
        batman.setMainCity(gotham);
        batman.setHeight(1.88f);
        batman.setWeight(95f);

        // Creates Joker
        Villain joker = new Villain("Joker");
        // Sets Joker attributes
        joker.setDescription("Anarchist criminal mastermind, famous for sowing chaos.");
        joker.setGender(Gender.MALE);
        joker.setBirthPlanet(earth);
        joker.setMainCity(gotham);
        joker.setHeight(1.95f);
        joker.setWeight(88f);

        // Sets the Joker as Batman's arch-enemy and vice versa
        batman.setArchEnemy(joker);

        // Creates Catwoman
        Villain catwoman = new Villain("Catwoman");
        // Sets Catwoman attributes
        catwoman.setDescription("An elite thief who moves between crime and heroism.");
        catwoman.setGender(Gender.FEMALE);
        catwoman.setBirthPlanet(earth);
        catwoman.setMainCity(gotham);
        catwoman.setHeight(1.70f);
        catwoman.setWeight(58f);
    }
}
