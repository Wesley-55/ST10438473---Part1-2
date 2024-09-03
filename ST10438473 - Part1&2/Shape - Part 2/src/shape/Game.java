/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shape;

import java.util.Scanner;

/**
 *
 * @author Wesley
 */
public class Game {
    
    
    private final Pentagon shape4  = new Pentagon();
    private final Hexagon shape3 = new Hexagon();
    private String[] shapes = {"Triangle","Square","Pentagon","Hexagon"};
    private final int attempts;

    public Game( int attempts) {
        this.attempts = attempts;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        boolean firstshape = false;
        boolean secondshape = false;
        boolean thirdshape = false;
        boolean fourthshape = false;
        for (String chosenshape : shapes) {
            if(chosenshape.equals("Square")){
                Square shape = new Square();
                int remainingAttempts = attempts;
            boolean guessedCorrectly = false;
            
            while (remainingAttempts > 0 && !guessedCorrectly) {
                System.out.println("Guess the number of sides for the shape: " + shape.getName());
                System.out.print("Your guess: ");
                boolean enteredword = false;
                String guess = scanner.nextLine();
                
                for(char c : guess.toCharArray()){
                    if(Character.isDigit(c)){
                        enteredword = false;
                    }
                    else{
                        enteredword = true;
                        break;
                    }
                }
                
                if(enteredword == true){
                    System.out.println("Enter a number only example '1'");
                    
                }
                else{

                if (shape.isCorrectSides(Integer.parseInt(guess))) {
                    System.out.println("Correct!\n");
                    guessedCorrectly = true;
                }
                else {
                    remainingAttempts--;
                    System.out.println("Incorrect. Attempts left: " + remainingAttempts);
                }
                if (!guessedCorrectly) {
                int iguess = 0;
                System.out.println("Out of attempts! The correct number of sides for " + shape.getName() + " is " + shape.getSides() + "\n");
                }
            
                }
            
            }
            }
            else if(chosenshape.equals("Triangle")){
                Triangle shape = new Triangle();
                    int remainingAttempts = attempts;
            boolean guessedCorrectly = false;
            
            while (remainingAttempts > 0 && !guessedCorrectly) {
                System.out.println("Guess the number of sides for the shape: " + shape.getName());
                System.out.print("Your guess: ");
                boolean enteredword = false;
                String guess = scanner.nextLine();
                
                for(char c : guess.toCharArray()){
                    if(Character.isDigit(c)){
                        enteredword = false;
                    }
                    else{
                        enteredword = true;
                        break;
                    }
                }
                
                if(enteredword == true){
                    System.out.println("Enter a number only example '1'");
                    
                }
                else{

                if (shape.isCorrectSides(Integer.parseInt(guess))) {
                    System.out.println("Correct!\n");
                    guessedCorrectly = true;
                }
                else {
                    remainingAttempts--;
                    System.out.println("Incorrect. Attempts left: " + remainingAttempts);
                }
                if (!guessedCorrectly) {
                int iguess = 0;
                System.out.println("Out of attempts! The correct number of sides for " + shape.getName() + " is " + shape.getSides() + "\n");
                }
            
                }
            
            }
            }
            else if(chosenshape.equals("Pentagon")){
                Pentagon shape = new Pentagon();
                    int remainingAttempts = attempts;
            boolean guessedCorrectly = false;
            
            while (remainingAttempts > 0 && !guessedCorrectly) {
                System.out.println("Guess the number of sides for the shape: " + shape.getName());
                System.out.print("Your guess: ");
                boolean enteredword = false;
                String guess = scanner.nextLine();
                
                for(char c : guess.toCharArray()){
                    if(Character.isDigit(c)){
                        enteredword = false;
                    }
                    else{
                        enteredword = true;
                        break;
                    }
                }
                
                if(enteredword == true){
                    System.out.println("Enter a number only example '1'");
                    
                }
                else{

                if (shape.isCorrectSides(Integer.parseInt(guess))) {
                    System.out.println("Correct!\n");
                    guessedCorrectly = true;
                }
                else {
                    remainingAttempts--;
                    System.out.println("Incorrect. Attempts left: " + remainingAttempts);
                }
                if (!guessedCorrectly) {
                int iguess = 0;
                System.out.println("Out of attempts! The correct number of sides for " + shape.getName() + " is " + shape.getSides() + "\n");
                }
            
                }
            
            }
            }
            else{
                Hexagon shape = new Hexagon();
                    int remainingAttempts = attempts;
            boolean guessedCorrectly = false;
            
            while (remainingAttempts > 0 && !guessedCorrectly) {
                System.out.println("Guess the number of sides for the shape: " + shape.getName());
                System.out.print("Your guess: ");
                boolean enteredword = false;
                String guess = scanner.nextLine();
                
                for(char c : guess.toCharArray()){
                    if(Character.isDigit(c)){
                        enteredword = false;
                    }
                    else{
                        enteredword = true;
                        break;
                    }
                }
                
                if(enteredword == true){
                    System.out.println("Enter a number only example '1'");
                    
                }
                else{

                if (shape.isCorrectSides(Integer.parseInt(guess))) {
                    System.out.println("Correct!\n");
                    guessedCorrectly = true;
                }
                else {
                    remainingAttempts--;
                    System.out.println("Incorrect. Attempts left: " + remainingAttempts);
                }
                if (!guessedCorrectly) {
                int iguess = 0;
                System.out.println("Out of attempts! The correct number of sides for " + shape.getName() + " is " + shape.getSides() + "\n");
                }
            
                }
            
            }
            }
            
            
        }

        System.out.println("Game Over!");
        scanner.close();
    }

    
}
