import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
       Scanner in = new Scanner(System.in);
       String oikeaNimi = "Olivia";
       String arvaus = "";

        System.out.println("Arvaa nimi!");
        arvaus = in.nextLine();
        if (arvaus.equals(oikeaNimi)){
            System.out.println("Oikein!");
        }
        else {
            System.out.println("Väärin!");
        }
        }
        }
    
