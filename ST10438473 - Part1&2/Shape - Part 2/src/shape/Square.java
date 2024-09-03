/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shape;

/**
 *
 * @author Wesley
 */
public class Square extends Shape{
    private int sides = 4;
    public Square(){
        super("Square");
        super.setSides(sides);
    }
    
    public String getSides(){
        return String.valueOf(sides);
    }
    
}
