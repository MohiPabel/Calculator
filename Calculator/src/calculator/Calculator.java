/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author muppa
 */
public class Calculator extends JFrame implements ActionListener{

    /**
     * @param args the command line arguments
     */
    
    JTextField tf1, tf2, tf3;
    JButton b1, b2, b3, b4, b5;
    JLabel l1, l2, l3, l4;
    Font font1, font2, font3;
    ImageIcon icon;
    Container c;
    
    Calculator(){
        
        
        //Initializing JFrame
        super("Calculator"); //invoke the JFrame constructor
        setBounds(500, 100, 500, 500);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    
        //Container
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.DARK_GRAY);
        
        //Fonts
        font1 = new Font("Agency FB", Font.BOLD, 26);
        font2 = new Font("Arial", Font.BOLD, 26);
        font3 = new Font("Calibri", Font.PLAIN, 18);
        
        

        //All three labels
        l1 = new JLabel();
        l1.setText("Enter the first number: ");
        l1.setBounds(50, 35, 200, 20);
        l1.setForeground(Color.WHITE);
        l1.setFont(font3);
        c.add(l1);
                
        l2 = new JLabel();
        l2.setText("Enter the second number: ");
        l2.setBounds(50, 135, 200, 20);
        l2.setForeground(Color.WHITE);
        l2.setFont(font3);
        c.add(l2);
                
        l3 = new JLabel();
        l3.setText("Select & Perform an Operation.");
        l3.setBounds(120, 200, 300, 50);
        l3.setForeground(Color.WHITE);
        l3.setFont(font3);
        c.add(l3);
                
        l4 = new JLabel();
        l4.setText("Result");
        l4.setBounds(120, 335, 100, 20);
        l4.setForeground(Color.WHITE);
        l4.setFont(font3);
        c.add(l4);
        
        

        //All JTextFields
        tf1 = new JTextField();
        tf1.setBounds(240, 20, 200, 50);
        tf1.setFont(font1);
        c.add(tf1);

        tf2 = new JTextField();
        tf2.setBounds(240, 120, 200, 50);
        tf2.setFont(font1);
        c.add(tf2);

        tf3 = new JTextField();
        tf3.setBounds(50, 360, 200, 50);
        tf3.setText("");
        tf3.setFont(font1);
        tf3.setEditable(false);
        tf3.setBackground(Color.lightGray);
        c.add(tf3);
        


        //All JButtons
        b1 = new JButton("+");
        b1.setBounds(100, 250, 50, 50);
        b1.setFont(font2);
        b1.setBackground(Color.CYAN);
        b1.setForeground(Color.white);
        c.add(b1);
        b1.addActionListener(this);
        
        b2 = new JButton("-");
        b2.setBounds(170, 250, 50, 50);
        b2.setFont(font2);
        b2.setBackground(Color.CYAN);
        b2.setForeground(Color.white);
        c.add(b2);
        b2.addActionListener(this);
        
        b3 = new JButton("x");
        b3.setBounds(240, 250, 50, 50);
        b3.setFont(font2);
        b3.setBackground(Color.CYAN);
        b3.setForeground(Color.white);
        c.add(b3);
        b3.addActionListener(this);
        
        b4 = new JButton("÷");
        b4.setBounds(310, 250, 50, 50);
        b4.setFont(font2);
        b4.setBackground(Color.CYAN);
        b4.setForeground(Color.white);
        c.add(b4);
        b4.addActionListener(this);
        
        b5 = new JButton("Clear All");
        b5.setBounds(300, 360, 150, 50);
        b5.setBackground(Color.RED);
        b5.setForeground(Color.WHITE);
        b5.setFont(font3);
        c.add(b5);
        b5.addActionListener(this);
    
        
        //For icon
        icon = new ImageIcon(getClass().getResource("iconfinder_Calculator_16_171352.png"));
        this.setIconImage(icon.getImage());
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
   
    
       String n1 = tf1.getText();
       String n2 = tf2.getText();
       float a = Float.parseFloat(n1);
       float b = Float.parseFloat(n2);
       float ans = 0;
       
       if(e.getSource() == b1){
           ans = a+b;
       }
       else if(e.getSource() == b2){
           ans = a-b;
       }
       else if(e.getSource() == b3){
           ans = a*b;
       }
       else if(e.getSource() == b4){
           ans = a/b;
       }
       else if(e.getSource() == b5){
           tf1.setText(null);
           tf2.setText(null);
           tf3.setText(null);
       }
       
       String result = String.valueOf(ans);
       tf3.setText(result);
       
    
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
            new Calculator();
    
    }
    
}
