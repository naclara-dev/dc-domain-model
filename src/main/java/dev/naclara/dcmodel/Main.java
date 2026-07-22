package dev.naclara.dcmodel;

import dev.naclara.dcmodel.enums.Gender;
import dev.naclara.dcmodel.model.*;

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
        // Sets Batman's attributes
        batman.setRealName("Bruce Wayne");
        batman.setDescription("Dark Knight who fights crime in Gotham City.");
        batman.setGender(Gender.MALE);
        batman.setBirthPlanet(earth);
        batman.setMainCity(gotham);
        batman.setHeight(1.88f);
        batman.setWeight(95f);

        // Creates Justice League
        Team JLA = new Team("Justice League of America");

        // Sets Justice League as Batman's team <-> Add Batman as a member of Justice League
        batman.setTeam(JLA);

        // Creates Joker
        Villain joker = new Villain("Joker");
        // Sets Joker's attributes
        joker.setDescription("Anarchist criminal mastermind, famous for sowing chaos.");
        joker.setGender(Gender.MALE);
        joker.setBirthPlanet(earth);
        joker.setMainCity(gotham);
        joker.setHeight(1.95f);
        joker.setWeight(88f);

        // Creates Harley Quinn
        Villain harleyQuinn = new Villain("Harley Quinn");
        // Sets Harley's attributes
        harleyQuinn.setRealName("Harleen Quinzel");
        harleyQuinn.setDescription("A former psychiatrist with a chaotic personality and brilliant intelligence.");
        harleyQuinn.setGender(Gender.FEMALE);
        harleyQuinn.setBirthPlanet(earth);
        harleyQuinn.setMainCity(gotham);
        harleyQuinn.setHeight(1.70f);
        harleyQuinn.setWeight(64f);

        // Sets Harley Quinn as Joker's love interest <-> Sets the Joker as Harley Quinn's love interest
        joker.setLoveInterest(harleyQuinn);
        // Sets the Joker as Batman's arch-enemy <-> Sets Batman as the Joker's archenemy
        batman.setArchEnemy(joker);

        // Creates Catwoman
        Villain catwoman = new Villain("Catwoman");
        // Sets Catwoman's attributes
        catwoman.setRealName("Selina Kyle");
        catwoman.setDescription("An elite thief who moves between crime and heroism.");
        catwoman.setGender(Gender.FEMALE);
        catwoman.setBirthPlanet(earth);
        catwoman.setMainCity(gotham);
        catwoman.setHeight(1.70f);
        catwoman.setWeight(58f);

        // Sets Catwoman as Batman's love interest <-> Sets Batman as Catwoman's love interest
        batman.setLoveInterest(catwoman);

        batman.write();
        joker.write();
        harleyQuinn.write();
        catwoman.write();
        JLA.write();
    }
}
