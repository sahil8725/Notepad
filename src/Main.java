import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main implements ActionListener {
    JLabel l1,l2;
    JButton b;
    JTextArea area;
    Main(){
        JFrame frame=new JFrame("Text Counter");
        frame.setSize(650,600);
        frame.setResizable(false);

        area=new JTextArea();
        area.setBounds(20,20,590,400);
        area.setLineWrap(true);
        frame.add(area);

        l1=new JLabel("Word's: ");
        l1.setBounds(20,480,200,30);
        frame.add(l1);

        l2=new JLabel("Character's: ");
        l2.setBounds(160,480,200,30);
        frame.add(l2);

        b=new JButton("Count");
        b.setBounds(420,480,150,40);
        b.addActionListener(this);
        frame.add(b);

        area.setFont(new Font("Arial",Font.PLAIN,25));
        l1.setFont(new Font("Arial",Font.PLAIN,25));
        b.setFont(new Font("Arial",Font.PLAIN,25));
        l2.setFont(new Font("Arial",Font.PLAIN,25));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);

    }
    public static void main(String[] args) {
  new Main();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String text= area.getText();
        String word[]=text.split("\\s");
        l1.setText("Word's: " + word.length);
        l2.setText("Character's: " + text.length());

    }

    // By Sahil Kumar
}