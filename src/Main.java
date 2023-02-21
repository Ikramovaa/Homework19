import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        Planet []planets=Planet.values();
        if (Objects.equals(name, "Earth")) {
            System.out.println(Planet.EARTH.getAboutPlanet());
        }
        else if (Objects.equals(name, "Mars")) {
            System.out.println(Planet.MARS.getAboutPlanet());
        } else if (Objects.equals(name, "Saturn")) {
            System.out.println(Planet.SATURN.getAboutPlanet());
        } else if (Objects.equals(name, "Mercury")) {
            System.out.println(Planet.MERCURY.getAboutPlanet());
        } else if (Objects.equals(name, "Venus")) {
            System.out.println(Planet.VENUS.getAboutPlanet());
        } else if (Objects.equals(name,"Jupiter")) {
            System.out.println(Planet.JUPITER.aboutPlanet);
        } else if (Objects.equals(name,"Uranus")) {
            System.out.println(Planet.URANUS.getAboutPlanet());
        } else if (Objects.equals(name,"Neptune")) {
            System.out.println(Planet.VENUS.getAboutPlanet());
        }
    }





    }
