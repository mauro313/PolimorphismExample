/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guipolimorphism;



import java.awt.*;
import javax.swing.*;

public abstract class MyFigure extends JPanel{
    private int posx0;
    private int posx1;
    private int posy0;
    private int posy1;
    private Color color;
    
    /**
     * void constructor: Initializes all positions in 0 and color Black
     */
    public MyFigure() {
        this.posx0 = 0;
        this.posx1 = 0;
        this.posy0 = 0;
        this.posy1 = 0;
        this.color = Color.BLACK;
    }
    
    /**
     * constructor.
     * @param posx0
     * @param posx1
     * @param posy0
     * @param posy1
     * @param color 
     */
    public MyFigure(int posx0, int posx1, int posy0, int posy1, Color color) {
        this.posx0 = posx0;
        this.posx1 = posx1;
        this.posy0 = posy0;
        this.posy1 = posy1;
        this.color = color;
    }
    
    /**
     * getter for the color
     * @return 
     */
    public Color getColor() {
        return this.color;
    }
    
    /**
     * getter for the posx0.
     * @return 
     */
    public int getPosx0() {
        return this.posx0;
    }
    
    /**
     * getter for the posx1.
     * @return 
     */
    public int getPosx1() {
        return this.posx1;
    }
    
    /**
     * getter for the posy0.
     * @return 
     */
    public int getPosy0() {
        return this.posy0;
    }
    
    /**
     * getter for tge posy1.
     * @return 
     */
    public int getPosy1() {
        return this.posy1;
    }
    
    /**
     * setter for the color.
     * @param color 
     */
    public void setColor(Color color) {
        this.color = color;
    }
    
    /**
     * setter for the posx0.
     * @param posx0 
     */
    public void setPosx0(int posx0) {
        this.posx0 = posx0;
    }
    
    /**
     * setter fo the posx1.
     * @param posx1 
     */
    public void setPosx1(int posx1) {
        this.posx1 = posx1;
    }  
    
    /**
     * setter for the posy0.
     * @param posy0 
     */
    public void setPosy0(int posy0) {
        this.posy0 = posy0;
    }
    
    /**
     * setter for the posy1.
     * @param posy1 
     */
    public void setPosy1(int posy1) {
        this.posy1 = posy1;
    }
   
    public abstract void draw(Graphics g);
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        draw(g);
    }
    
}//  end of the abstract class.
