/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guipolimorphism;


import java.awt.*;
import javax.swing.*;
       
//class to test MyFigure class.

public class TestMyFigure{
    public static void main(String[] args) {
        MyFigure[] vector = new MyFigure[3];
        
        vector[0] = new MyLine(30, 30, 10, 200, Color.DARK_GRAY);
        vector[1] = new MyRectangle(125, 400, 125, 400, Color.RED, true);
        vector[2] = new MyOval(10, 200, 10,200,Color.BLUE, false);
       
        for(MyFigure figure : vector){
            JFrame app = new JFrame();
            app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
            app.add(figure);
            app.setLocationRelativeTo(null);
            app.setSize(500, 500);
            app.setVisible(true);
        }
   
    }
}//end of TestMyFigure class.
