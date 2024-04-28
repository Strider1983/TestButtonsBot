package ru.skypro.testbuttonsbot.service;

public enum Infotext {
    INFOTEXT1("Animals, the vast and diverse kingdom of multicellular, heterotrophic organisms, encompass an extraordinary array of species that inhabit every corner of our planet."),
    INFOTEXT2("The automobile, commonly known as a car, has revolutionized transportation and profoundly impacted modern society."),
    INFOTEXT3("Cats, members of the Felidae family, are highly adaptable and intelligent creatures, renowned for their cleanliness, grace, and exceptional hunting abilities."),
    INFOTEXT4("Dogs, the beloved companions of humans, have played an integral role in our lives for centuries."),
    INFOTEXT5("Trees, the majestic guardians of our planet, stand tall and proud, their branches reaching towards the sky and their roots anchoring them firmly in the earth. They are symbols of life, resilience, and the interconnectedness of all living things."),
    INFOTEXT6("Frogs, belonging to the order Anura, are captivating amphibians that exhibit a remarkable diversity of species, with over 6,000 known worldwide."),
    INFOTEXT7("The horse, a majestic and powerful creature, has captivated humans for centuries."),
    INFOTEXT8("A river is a natural waterway that flows from high elevations to lower elevations, typically emptying into a larger body of water such as a lake, ocean, or another river."),
    INFOTEXT9("Stones, the ubiquitous and versatile material found throughout Earth's crust, have played a pivotal role in human history and civilization."),
    INFOTEXT10("The vast expanse of the sea, with its unfathomable depths and boundless horizon, has captivated human imagination for centuries."),
    INFOTEXT11("Mountains, majestic natural formations that rise above the surrounding landscape, are awe-inspiring spectacles of nature's grandeur."),
    INFOTEXT12("Grass, a ubiquitous and diverse group of plants, forms the foundation of countless ecosystems worldwide."),
    ;

    private final String text;

    Infotext(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}

