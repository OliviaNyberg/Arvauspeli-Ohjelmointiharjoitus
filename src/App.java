import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
       Scanner in = new Scanner(System.in);
       String oikeaNimi = "Olivia";
       String arvaus = "";

        System.out.println("Arvaa nimi peli!");
        while (!arvaus.equalsIgnoreCase(oikeaNimi)){
            System.out.println("Anna arvaus: ");
            arvaus = in.nextLine();
        
        if (arvaus.equalsIgnoreCase(oikeaNimi)) {
            System.out.println("Oikein! Onnittelut!");
        }
        else {
            System.out.println("Väärin! Arvaa uudelleen!");
        }
        }
        }
    }
    
