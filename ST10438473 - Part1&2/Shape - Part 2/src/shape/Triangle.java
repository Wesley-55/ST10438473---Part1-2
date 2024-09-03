/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shape;

/**
 *
 * @author Wesley
 */
public class Triangle extends Shape{
    private int sides  = 3;
    public Triangle(){
        super("Triangle");
        super.setSides(sides);
    }
    
    public String getSides(){
        return String.valueOf(sides);
    }
}
