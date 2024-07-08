package net.flix;

public enum Genre {
    ANIME("Anime"),     // each of these is calling the net.flix.Genre() constructor below
    DRAMA("Drama... "),
    HORROR("Horror!!!"),
    DOCUMENTARY("Documentary"),
    MYSTERY("Mystery"),
    SCI_FI("Sci-Fi"),
    INTERNATIONAL("International"),
    FAMILY("Family");

    // everything under here is just regular class definition stuff, i.e., fields, constructors, methods
    private final String display;

    // implicitly private, no "new" from outside
    Genre(String display) {
        System.out.println("net.flix.Genre constructor called");
        this.display = display;
    }

    public String getDisplay() {
        return display;
    }

    public String toString() {
        return getDisplay();
    }
}
