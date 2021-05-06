package hotelSystem.version1;
import javax.swing.*;
import javax.swing.plaf.FontUIResource;

import java.awt.*;
import java.awt.event.*;

public class App extends JFrame implements ActionListener
{
    App(){
        setBounds(50, 50, 1200, 800);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotelSystem\\version1\\icons\\first.jpg"));
        JLabel j1 = new JLabel(i1);
        j1.setBounds(0, 0, 1200, 800);
        add(j1);
        
        JLabel j2 = new JLabel("HOTEL MANAGEMENT SOFTWARE");
        j2.setBounds(620, 550, 1000, 70);
        j2.setForeground(Color.MAGENTA);
        j2.setFont(new FontUIResource("Arial", Font.PLAIN, 30));
        j1.add(j2);

        JButton b1 = new JButton("Next");
        b1.setBackground(Color.WHITE);
        b1.setForeground(Color.BLACK);
        b1.setBounds(810, 500, 300, 30);
        b1.addActionListener(this);
        j1.add(b1);
        
        setLayout(null);    
        setVisible(true);

        while(true){
            j2.setVisible(false);
            try{
                Thread.sleep(500);
            }catch(Exception e){
                
            }
            j2.setVisible(true);
            try{
                Thread.sleep(500);
            }catch(Exception e){
                
            }
        }
        
    }
    public void actionPerformed(ActionEvent ae){
        new Login().setVisible(true);
        this.setVisible(false);
    }
    public static void main(String[] args)
    {
        new App();
    }
}
/*
mvn install:install-file -Dfile=C:\Users\krish\.m2\repository\net\proteanit\sql\rs2xml\1.0\rs2xml.jar -DgroupId=net.proteanit.sql -DartifactId=rs2xml -Dversion=1.0 -Dpackaging=jar

mvn install:install-file -Dfile=C:\Users\krish\.m2\repository\net\proteanit\sql\rs2xml\1.0\rs2xml.jar -DpomFile=D:\hotelSystem\manageHotel\pom.xml
*/