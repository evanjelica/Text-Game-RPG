/*
 * Title: Text Based RPG
 * Filename: Game.java
 * Description: 
 *
 */


import java.util.Scanner;

public class Game{
    public static void main(String []args){

        //Create objects
        Scanner scanner = new Scanner(System.in);
        Player player = new Player();


        System.out.println("Hello.");
        System.out.println("What is your name?");
        String name = scanner.nextLine();

        System.out.println("\n...");
        System.out.println("Hello " + name + ".");
    }

}