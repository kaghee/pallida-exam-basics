import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FavouriteAnimals {
    public static void main(String[] args) {
        // The program's aim is to collect your favourite animals and store them in a text file.
        // There is a given text file called '''favourites.txt''', it will contain the animals
        // If ran from the command line without arguments
        // It should print out the usage:
        // ```java FavouriteAnimals [animal] [animal]```
        // You can add as many command line arguments as many favourite you have.
        // One animal should be stored only at once
        // Each animal should be written in separate lines
        // The program should only save animals, no need to print them

        FavouriteAnimals app = new FavouriteAnimals();

        if (args.length == 0) {
            app.manual();
        } else {
            for (int i = 0; i < args.length; i++) {
                app.addAnimal(args[i]);
            }
        }
    }

    public FavouriteAnimals() {

    }

    public void manual() {
        System.out.println("How to use:\njava FavouriteAnimals [animal] [animal]");
    }

    public void addAnimal(String animal) {
        Path filepath = Paths.get("favourites.txt");
        try {
            List<String> animals = Files.readAllLines(filepath);
            animals.add(animal);
            Files.write(filepath, animals);

        } catch (IOException e) {
            System.out.println("Unable to read file");
        }

    }

}