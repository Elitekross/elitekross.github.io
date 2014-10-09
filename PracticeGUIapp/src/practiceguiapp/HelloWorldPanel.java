package practiceguiapp;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author Meyer
 */
public class HelloWorldPanel extends JPanel {

    /**
     * Creates new form HelloWorldPanel
     */
        private String currentMessage = "Hello World!";
        private MessageDisplay displayPanel;
        
        private class MessageDisplay extends JPanel {
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawString(currentMessage, 20, 30);
            }
        }
        
        private class ButtonHandler implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                if (currentMessage.equals("Hello World!")){ 
                    currentMessage = "Goodbye World!";
                } else {
                    currentMessage = "Hello World!";
                }
                displayPanel.repaint();
            }
        }
        
        public HelloWorldPanel() {
            displayPanel = new MessageDisplay();
            JButton changeMessageButton = new JButton("Change Message");
            ButtonHandler listener = new ButtonHandler();
            changeMessageButton.addActionListener(listener);
            
            setLayout(new BorderLayout());
            add(displayPanel, BorderLayout.CENTER);
            add(changeMessageButton, BorderLayout.SOUTH);
        }
    }

