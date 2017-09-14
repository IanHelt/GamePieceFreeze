package io.ian;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        GamePiece chimp = new GamePiece();

        System.out.println("The game board covers from (200, 200) to (-200, -200)");
        System.out.println("Commands:");
        System.out.println("move - Will move the piece a random amount between -100 and 100 on the X and Y axes");
        System.out.println("freeze - Will freeze the game piece, making it immovable");
        System.out.println("unfreeze - Will unfreeze the game piece, making it movable");
        System.out.println("done - Will terminate the process");

        while (true){
            String givenCommand = scanner.nextLine();

            if (givenCommand.equals("")) {
                System.out.println("Please enter a command");

            } else if (givenCommand.equals("done")) {
                System.out.println("cya fam");
                break;

            } else if (givenCommand.equals("move")) {
                chimp.move();

            } else if (givenCommand.equals("freeze")) {
                chimp.freeze();

            } else if (givenCommand.equals("unfreeze")) {
                chimp.unfreeze();

            } else {
                System.out.println("Please enter a valid command");

            }
        }

    }

}
