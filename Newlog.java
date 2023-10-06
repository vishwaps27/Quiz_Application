
import javax.swing.*;
import java.awt.*;

public class Newlog extends JFrame{
    Newlog(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 600, 463);
        add(image);

        JLabel heading = new JLabel("Simple Minds");
        heading.setBounds(750, 60, 300, 45);
        heading.setFont(new Font("V", Font.BOLD, 40));
        heading.setForeground(new Color(30,144,254));
        add(heading);

        JLabel name = new JLabel("Enter your Name");
        name.setBounds(750, 150, 300, 45);
        name.setFont(new Font("Vainer Hand ITC", Font.BOLD, 25));
        name.setForeground(new Color(30,144,254));
        add(name);

        JTextField tfname = new JTextField();
        tfname.setBounds(735, 200, 300, 45);
        tfname.setFont(new Font("Times New Roman", Font.BOLD,20));
        add(tfname);

        JButton rules = new JButton("Rules");
        rules.setBounds(735,270,120,25);
        rules.setBackground(new Color(30,144,254));
        rules.setForeground(Color.WHITE);
        add(rules);

        JButton back = new JButton("Back");
        back.setBounds(935,270,120,25);
        back.setBackground(new Color(30,144,254));
        back.setForeground(Color.WHITE);
        add(back);

        setLocation(100,100);
        setSize(1200,500);
        setVisible(true);

    }
    public static void main(String[] args){
        new Newlog();
    }
}
