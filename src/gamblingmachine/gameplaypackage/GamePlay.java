/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamblingmachine.gameplaypackage;
import java.util.Scanner;
import gamblingmachine.cardpackage.Card;
import gamblingmachine.playerpackage.Player;
import gamblingmachine.slotpackage.Slot;
/**
 *
 * @author qbrickzx
 */
public class GamePlay {
    public GamePlay() {

    }

    public static void menu() {
        Player James = new Player("James", 1, 0);
        GamePlay game1 = new GamePlay();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Welcome to Gambling machine 1.0");
        System.out.println("Please select game to start");
        System.out.println("1. Card game");
        System.out.println("2. Slot machine");
        System.out.println("3. Exit program");

        int selection = sc1.nextInt();
        switch (selection) {
            case 1:
                System.out.println(playCard());
                break;
            case 2:
                GamePlay.slot();
                break;
            case 3:
                System.out.println("Program ended");
                System.exit(0);
            default:
                System.out.println("--Invalid input-- : Try again");
                GamePlay.menu();
        }
    }
    public static String playCard() {
        Card card1 = new Card(true);
        Card card2 = new Card(false);
        System.out.println(card1.compare(card2));
        System.out.println("\n");
        GamePlay.menu();
        return "";
    }
    public static void slot(){
        Slot.playSlot();
    }
}
  