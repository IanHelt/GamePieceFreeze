package io.ian;

import java.util.Random;

public class GamePiece {

    private int positionX;
    private int positionY;
    private boolean frozen;
    private String color;
    private String name;

    private Random rng = new Random();

    public GamePiece() {

        name = this.toString();
        positionX = 0;
        positionY = 0;
        frozen = false;

    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public boolean isFrozen() {
        return frozen;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void freeze(){
        this.frozen = true;
        System.out.println("The piece is now frozen");
    }

    public void unfreeze(){
        this.frozen = false;
        System.out.println("The piece is now unfrozen");
    }

    public void move(){

        if (!frozen) {

            int newX = rng.nextInt(200) - 100;
            int newY = rng.nextInt(200) - 100;

            int currentX = this.getPositionX();
            int currentY = this.getPositionY();

            this.positionX = currentX + newX;
            this.positionY = currentY + newY;

            if (this.positionX >= 200){
                this.positionX = 200;
            } else if (this.positionX <= -200){
                this.positionX = -200;
            }

            if (this.positionY >= 200){
                this.positionY = 200;
            } else if (this.positionY <= -200){
                this.positionY = -200;
            }

            System.out.println("Piece moved from (" + currentX + ", " + currentY + ") to (" + this.positionX + ", " + this.positionY + ")");

        }else{

            System.out.println("The piece is currently frozen");

        }

    }

}
