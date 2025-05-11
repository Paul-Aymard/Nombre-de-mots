// Importation des biblothèques
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Pour pouvoir ouvrir le fichier
        File file = new File("C:\\Users\\HP\\OneDrive - PIGIER CÔTE D'IVOIRE\\Bureau\\RGL 3A\\Projetinfo2\\Nombre de mots\\TestExercice3.txt");
        int mot = 0;

        try {
            Scanner input = new Scanner(file);
            // Pour Traiter chaque ligne lue dans la boucle
            while (input.hasNextLine()) {
                // Pour lire une ligne du fichier
                String ligne = input.nextLine();

                // Vérifie que la ligne n’est pas vide
                if (!ligne.isEmpty()) {
                    String[] mots = ligne.split("\\s+");
                    mot += mots.length;
                }
                else {
                    System.out.println("Votre fichier n'a pas ligne");
                }
            }
            // Pour afficher les nombres de mots
            System.out.println("Le nombre total de mot dans le fichier TestExercice3 est: " + mot);

        } catch (FileNotFoundException exception) {
            System.out.println("Impossible de trouver ce fichier");

        }
    }
}
