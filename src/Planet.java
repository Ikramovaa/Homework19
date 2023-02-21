public enum Planet {
    EARTH("Жер планетасында адам жашайт"),
    MARS("Жер Марс жер планетасына окшош"),
    SATURN("Айланасы кольцо менен кучалган планета"),
    MERCURY("Кун системасына эн жакын планета"),
    VENUS("Эн ысык планета болуп саналат,тепературасы 400 цельсиус"),
    JUPITER("Кун системасына эн жакын чон планета"),
    URANUS("Озгочолугу жанына жантайып айланат"),
    NEPTUNE("Катуу шамал болуп турган планета");

    public String aboutPlanet;

    Planet(String aboutPlanet) {
        this.aboutPlanet = aboutPlanet;
    }

    public String getAboutPlanet() {
        return aboutPlanet;
    }
}
