/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiweek10;
import java.awt.Color;
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author Elite Dragonfly
 */
public class GUIWeek10 extends JFrame implements ActionListener{
    JLabel Label;
    JTextField Text;
     GUIWeek10(){
         //labels
        Label = new JLabel("Hello");
        super.add(Label);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //button1
        JButton button = new JButton("Red");
        button.addActionListener(this);
        button.setActionCommand("Red");
        super.add(button);
        //button2
        JButton Button = new JButton("Blue");
        Button.addActionListener(this);
        Button.setActionCommand("Blue");
        super.add(Button);
        //text box creation
        Text = new JTextField(25);
        Text.addActionListener(this);
        Text.setActionCommand("NAME");
        super.add(Text);
        //flowlayout
        super.setLayout(new FlowLayout());    
    }
     
     @Override
     public void actionPerformed(ActionEvent EVT){
         if (EVT.getActionCommand().equals("Blue")) {
             getContentPane().setBackground(Color.blue);
         }
         //getContentPane().setBackground(Color.blue);
         else if (EVT.getActionCommand().equals("Red")){
             getContentPane().setBackground(Color.red);
         }
         else{
             Label.setText("Hello " + Text.getText());
         }
         
     }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        GUIWeek10 frame = new GUIWeek10();
        //JFrame frame = new JFrame("My First Window");
        frame.setSize(500, 500);
        frame.setVisible(true);
    }
    
}