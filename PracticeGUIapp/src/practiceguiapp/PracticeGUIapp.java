/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceguiapp;

import javax.swing.JFrame;
/**
 *
 * @author Meyer
 */
public class PracticeGUIapp {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        JFrame window = new JFrame("GUI Test");
        HelloWorldPanel content = new HelloWorldPanel();
        window.setContentPane(content);
        window.setSize(250,100);
        window.setLocation(100,100);
        window.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        window.setVisible(true);
    }
    
}
