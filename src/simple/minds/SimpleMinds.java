
package simple.minds;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SimpleMinds extends JFrame implements ActionListener{
    
    JButton b1,b2;
    JTextField t1;
    
    SimpleMinds(){
        setBounds(280, 150,800,400); //dleft, //dup //length, //height ////////
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("simple/minds/icons/login.jpg"));
        JLabel l1 = new JLabel(i1);
        l1.setBounds(0, 0, 400, 400);
        add(l1);
        
        JLabel l2 = new JLabel("SIMPLE MINDS");
        l2.setFont(new Font("Viner Hand ITC",Font.BOLD, 32));
        l2.setForeground(new Color(30, 144, 254));
        l2.setBounds(410, 40, 300, 45);
        add(l2);
        
        JLabel l3 = new JLabel("Enter Your Name");
        l3.setFont(new Font("Mngolian Baiti",Font.BOLD, 17));
        l3.setForeground(new Color(30, 144, 254));
        l3.setBounds(490, 120, 300, 18);
        add(l3);
        
        t1 = new JTextField();
        t1.setBounds(420, 158, 300, 22);
        t1.setFont(new Font("Times New Roman", Font.BOLD, 18));
        add(t1);
        
        b1 = new JButton("RULES");
        b1.setBounds(438, 210, 100, 25);
        b1.setBackground(Color.black);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);
        
        b2 = new JButton("EXIT");
        b2.setBounds(600, 210, 100, 25);
        b2.setBackground(Color.black);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);
        
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1) {
            String name =t1.getText();
            this.setVisible(false);
            new Rules(name);
        }else{
            System.exit(0);
        }  
    }
    public static void main(String[] args) {
        new SimpleMinds();
        
    }
    
}
