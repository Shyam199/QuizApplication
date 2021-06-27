package simple.minds;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Rules extends JFrame implements ActionListener{
    JButton b1, b2;
    String username;
    Rules(String username){
        this.username = username;
       setBounds(400, 150,700,500);
       getContentPane().setBackground(Color.WHITE);
       setLayout(null);
       
       JLabel l1 =new JLabel("Welcome " + username + " to Simple Minds");
       l1.setForeground(Color.blue);
       l1.setFont(new Font("Viner Hand ITC", Font.BOLD,28));
       l1.setBounds(50, 10 ,700,30);
       add(l1);
       
        JLabel l2 =new JLabel("");
        l2.setFont(new Font("Tahoma", Font.PLAIN,14));
         l2.setBounds(20, 0 ,600, 420);
         l2.setText(
            "<html>"+ 
                "1. All questions are related to java." + "<br><br>" +
                "2. You will get only 15 seconds to answer." + "<br><br>" +
                "3. Read the questions carefully and select your answer." + "<br><br>" +
                "4. you will get 50-50 lifline help in which two wrong answers will be erased." + "<br><br>" +
                "5. Don't cheat in this exam." + "<br><br>" +
                "6. If you want to play this game again,you will get the option of Play Again at the last." + "<br><br>" +
                "7. You have to start the game while clicking on START." + "<br><br>" +
                "8. Hope you will enjoy this game and GOOD LUCK." + "<br><br>" +
            "<html>"
        );
         add(l2);
         
         b1 = new JButton("BACK");
         b1.setBounds(170,370 ,100, 30);
         b1.setBackground(Color.black);
         b1.setForeground(Color.WHITE);
         b1.addActionListener(this);
         add(b1);
         
         b2 = new JButton("START");
         b2.setBounds(410,370 ,100, 30);
         b2.setBackground(Color.black);
         b2.setForeground(Color.WHITE);
         b2.addActionListener(this);
         add(b2);
         
       
       setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            this.setVisible(false);
            new SimpleMinds().setVisible(true);
        }else if(ae.getSource() == b2){
            this.setVisible(false);
            new Quiz(username).setVisible(true);
        }
    }
    
    public static void main(String[] args){
        new Rules(""); 
    }
}
