/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shape;

/**
 *
 * @author Wesley
 */
public class Pentagon extends Shape{
    private int sides = 5;
    public Pentagon(){
        super("Pentagon");
        super.setSides(sides);
    }
    
    public String getSides(){
        return String.valueOf(sides);
    }
}
