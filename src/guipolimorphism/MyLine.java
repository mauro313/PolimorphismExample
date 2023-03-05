/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guipolimorphism;

import java.awt.*;


public class MyLine extends MyFigure{
  
  /**
   * void constructor
   */  
  public MyLine(){
    super();
  }
    
  /**
   * Constructor of class MyLine
   * @param posx0 coordinate x of the initial point
   * @param posy0 coordinate y of the initial point 
   * @param posx1 coordinate x of the end point 
   * @param posy1 coordinate y of the end point
   * @param color color of the line
   */
  public MyLine(int posx0, int posx1, int posy0, int posy1, Color color) {
    super(posx0,posx1,posy0,posy1,color);
  }
  
  /**
   * draw the line in the specific color 
   * @param g 
   */
  @Override
  public void draw(Graphics g){
    g.setColor(this.getColor());
    g.drawLine(this.getPosx0(), this.getPosy0(), this.getPosx1(), this.getPosy1());
  }
}//end of class MyLine
