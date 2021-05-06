package hotelSystem.version1;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.*;
import java.sql.ResultSet;

import javax.swing.*;

public class Login extends JFrame implements ActionListener{
    JLabel l1, l2;
    JButton b1, b2;
    JTextField t1;
    JPasswordField t2;
    Login(){
        l1 = new JLabel("Username");
        l1.setBounds(40, 20, 70, 30);
        add(l1);
        
        l2 = new JLabel("Password");
        l2.setBounds(40, 80, 70, 30);
        add(l2);
        
        t1 = new JTextField();
        t1.setBounds(120, 20, 100, 30);
        add(t1);

        t2 = new JPasswordField();
        t2.setBounds(120, 80, 100, 30);
        add(t2);

        b1 = new JButton("Login");
        b1.setBackground(Color.WHITE);
        b1.setForeground(Color.BLACK);
        b1.setBounds(40, 140, 70, 45);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("Cancel");
        b2.setBackground(Color.WHITE);
        b2.setForeground(Color.BLACK);
        b2.setBounds(130, 140, 90, 45);
        b2.addActionListener(this);
        add(b2);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotelSystem\\version1\\icons\\second.jpg"));
        Image i2 = i1.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT);
        i1 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i1);
        l3.setBounds(280, 20, 150, 150);
        add(l3);

        getContentPane().setBackground(Color.WHITE);

        setLayout(null);
        setBounds(500, 300, 500, 250);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            try{
                Conn c = new Conn();
                String un = t1.getText(); // username
                StringBuilder pwd= new StringBuilder();
                char[] p = t2.getPassword(); // password
                for(char ch: p){
                    pwd.append(ch);
                }
                String qry = "select * from login where username='"+un+"' and password='"+pwd.toString()+"'";
                
                ResultSet rs = c.s.executeQuery(qry);
                if(rs.next()){
                    this.setVisible(false);
                    new Dashboard().setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(null, "Invalid login");
                    this.setVisible(false);
                    // new App().setVisible(true);
                }

            }catch(Exception e){

            }
        }else if(ae.getSource() == b2){
            System.exit(0);
        }
    }
    public static void main(String[] args) {
        new Login();
    }
}
