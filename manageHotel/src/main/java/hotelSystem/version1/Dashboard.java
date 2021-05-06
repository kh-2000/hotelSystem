package hotelSystem.version1;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Dashboard extends JFrame {

    public static void main(String[] args) {
        new Dashboard().setVisible(true);
    }

    public Dashboard() {
        super("HOTEL MANAGEMENT SYSTEM");

        setForeground(Color.CYAN);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotelSystem\\version1\\icons\\third.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1950, 1000, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel NewLabel = new JLabel(i3);
        NewLabel.setBounds(0, 0, 1950, 1000);
        add(NewLabel);

        JLabel HotelManagementSystem = new JLabel("THE TAJ GROUP WELCOMES YOU");
        HotelManagementSystem.setForeground(Color.WHITE);
        HotelManagementSystem.setFont(new Font("Tahoma", Font.PLAIN, 46));
        HotelManagementSystem.setBounds(600, 60, 1000, 85);
        NewLabel.add(HotelManagementSystem);

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu HotelSystem = new JMenu("HOTEL MANAGEMENT");
        HotelSystem.setForeground(Color.BLUE);
        menuBar.add(HotelSystem);

        JMenuItem EmpDetails = new JMenuItem("RECEPTION");
        HotelSystem.add(EmpDetails);

        JMenu HotelSystemHello = new JMenu("ADMIN");
        HotelSystemHello.setForeground(Color.RED);
        menuBar.add(HotelSystemHello);

        JMenuItem EmpDetailshello1 = new JMenuItem("ADD EMPLOYEE");
        HotelSystemHello.add(EmpDetailshello1);

        EmpDetailshello1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    new AddEmployee().setVisible(true);
                } catch (Exception e) {
                }
            }
        });

        JMenuItem EmpDetailshello2 = new JMenuItem("ADD ROOMS");
        HotelSystemHello.add(EmpDetailshello2);

        EmpDetailshello2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    new AddRoom().setVisible(true);
                } catch (Exception e) {
                }
            }
        });

        EmpDetails.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                new Reception();
            }
        });

        JMenuItem EmpDetailshello3 = new JMenuItem("ADD DRIVERS");
        HotelSystemHello.add(EmpDetailshello3);

        EmpDetailshello3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    new AddDrivers().setVisible(true);
                } catch (Exception e) {
                }
            }
        });

        setSize(1950, 1090);
        setVisible(true);
        getContentPane().setBackground(Color.WHITE);
    }
}