/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guipolimorphism;

import java.awt.*;


public class MyRectangle extends MyFigure{
    private boolean fillRect;
    
    /**
     * void constructor
     */
    public MyRectangle() {
      super();
      this.fillRect = false;
    }
    
    /**
     * constructor for rectangle
     * @param posx0
     * @param posx1
     * @param posy0
     * @param posy1
     * @param color
     * @param fillRect 
     */
    public MyRectangle(int posx0, int posx1, int posy0, int posy1, Color color,boolean fillRect) {
        super(posx0, posx1, posy0, posy1, color);
        this.fillRect = fillRect;
    }
    
    @Override
    public void draw(Graphics g){
      g.setColor(this.getColor());
      if(this.fillRect){
        g.fillRect(this.getPosx0(), this.getPosy0(),Math.abs(this.getPosx1()-this.getPosx0()),Math.abs(this.getPosy1()-this.getPosy0()));
      }
      else{
        g.drawRect(this.getPosx0(), this.getPosy0(),Math.abs(this.getPosx1()-this.getPosx0()),Math.abs(this.getPosy1()-this.getPosy0()));
      }
    }
}
