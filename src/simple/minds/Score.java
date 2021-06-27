package simple.minds;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener{
    
    Score(String username, int score){
          setBounds(320,100,750,400); 
          getContentPane().setBackground(Color.WHITE);
          setLayout(null);
          
          ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("simple/minds/icons/score.jpg"));
          JLabel l1 = new JLabel(i1);
          l1.setBounds(50,80,300,250);
          add(l1);
          
          JLabel l2 = new JLabel("Thankyou " + username + " for Playing Simple Minds.");
          l2.setBounds(45,30,700,30);
          l2.setFont(new Font("RALEWAY", Font.BOLD, 24));
          add(l2);
          
          JLabel l3 = new JLabel("Your Score is " + score);
          l3.setBounds(420,140,300,30);
          l3.setFont(new Font("JOKERMAN", Font.PLAIN, 26));
          l3.setForeground(new Color(199,21,133));
          add(l3);
        
          JButton b1 = new JButton("Play Again");
          b1.setBackground(Color.BLUE);
          b1.setForeground(Color.WHITE);
          b1.addActionListener(this);
          b1.setBounds(470, 200,120,30);
          add(b1);
    }
    
    public void actionPerformed(ActionEvent ae){
        this.setVisible(false);
        new SimpleMinds().setVisible(true);
    }
    
    public static void main(String[] args){
        new Score("", 0).setVisible(true);
    }
}
