/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guipolimorphism;

import java.awt.*;


public class MyOval extends MyFigure{
    private boolean fillOval;
    
    /**
     * void constructor
     */
    public MyOval() {
        super();
        this.fillOval = false;
    }
    
    /**
     * constructor for oval
     * @param posx0
     * @param posx1
     * @param posy0
     * @param posy1
     * @param color
     * @param fillOval 
     */
    public MyOval(int posx0, int posx1, int posy0, int posy1, Color color,boolean fillOval) {
        super(posx0, posx1, posy0, posy1, color);
        this.fillOval = fillOval;
    }
    
    @Override
    public void draw(Graphics g){
      g.setColor(this.getColor());
      if(this.fillOval){
          g.fillOval(this.getPosx0(), this.getPosy0(), Math.abs(this.getPosx1()-this.getPosx0()),Math.abs(this.getPosy1()-this.getPosy0()));
      }
      else{
          g.drawOval(this.getPosx0(), this.getPosy0(), Math.abs(this.getPosx1()-this.getPosx0()),Math.abs(this.getPosy1()-this.getPosy0())); 
      }
    }
}
