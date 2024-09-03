/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shape;

/**
 *
 * @author Wesley
 */
public class Shape {
    
    private String name;
    private int sides = 0;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
    
    public void setSides(int numberofsides){
        sides = numberofsides;
    }
    

    public boolean isCorrectSides(int guess) {
        return this.sides == guess;
    }

}
