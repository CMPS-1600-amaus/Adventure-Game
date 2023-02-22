package adventure_game;

/*
 * Project-01: Adventure Game
 * Name:
 */

import java.util.Scanner;
import java.util.Random;


public class Game {
    static Scanner in = new Scanner(System.in);
    public static Random rand = new Random();
    public Player player;
    
    public static void main(String[] args){

        Player player = new Player("The Hero", 15, 3, "The hero of the game.");
        System.out.println(player.toString());

        NPC opponent = new NPC("Geoff", 24, 3, "Our doom!");
        System.out.println(opponent.toString());

        Game game = new Game(player);
        game.enterCombat(player, opponent);

        in.close();
    }

    public Game(Player player) {
        this.player = player;
    }

    public void enterCombat(Player player, NPC opponent){
        System.out.printf("%s and %s are in a brawl to the bitter end.\n", player.getName(), opponent.getName());
        while(true){
            player.takeTurn(opponent);
            if(!opponent.isAlive()){
                System.out.printf("%S is SLAIN!!\n",opponent.getName());
                break;
            }

            opponent.takeTurn(player);
            if(!player.isAlive()){
                System.out.printf("%S is SLAIN!!\n",player.getName());
                break;
            }
        }
    }
}
