package ca.sheridancollege.project;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the player's name: ");
        Scanner scanner = new Scanner(System.in);
        String playerName = scanner.nextLine();

        Game game = new Game(playerName);
        game.start();
    }
}
