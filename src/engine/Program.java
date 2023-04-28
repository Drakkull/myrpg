package engine;

import characters.Heroes;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Heroes h1 = new Heroes();
        System.out.print("Enter your character name:  ");
        String h = sc.nextLine();
        System.out.println("Are you sure that's your name:  " + h + " (y/n )");
        String confirmation = sc.nextLine();
        if(confirmation.equalsIgnoreCase("y")) {
            System.out.println("Welcome to hell, " + h);
        } else {
            System.out.println("Enter your character name: ");
            String z=sc.nextLine();
        }








        sc.close();
    }
}
