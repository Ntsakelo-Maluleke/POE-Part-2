/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chatsickle;

import static chatsickle.Chatsickle.register;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;


/**
 *
 * @author RC_Student_lab
 */
public class Chatsickle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        register();
    }
public static class GradientBackgroundPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
       
        Graphics2D g2d = (Graphics2D) g;
        
     
        Color color1 = new Color(174, 79, 171);
        Color color2 = new Color(114, 67,122); 
        
        int width = getWidth();
        int height = getHeight();
        
        GradientPaint gp = new GradientPaint(0, 0, color1, 0, height, color2);
        g2d.setPaint(gp);
        g2d.fillRect(0, 0, width, height);
    }
}
    /**
     *
     */
    public static void register(){
        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run(){
            new register().setVisible(true);
            }
        });
    }
}
