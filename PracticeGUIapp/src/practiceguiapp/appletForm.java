/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practiceguiapp;

/**
 *
 * @author Meyer
 */
import javax.swing.JApplet;

public class appletForm extends JApplet {
    @Override
    public void init() {  
        HelloWorldPanel content = new HelloWorldPanel();
        setContentPane(content);
   }
}
