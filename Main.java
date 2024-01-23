import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class Main extends Frame implements ActionListener {
    Button btn;
    Frame f = new Frame("Lado btn");
    public Main(){

        Button btn = new Button("About Me");
        Frame f = new Frame("Lado btn");

        f.setLayout(new FlowLayout());
        f.setSize(10000, 20000);
        btn.setBounds(30,60,90,120);
        f.setTitle("Lado");
        f.add(btn);
        f.setVisible(true);
        btn.setSize(19999,17777);
        btn.addActionListener(this);

    }
    public void actionPerformed(ActionEvent ae) {
        System.out.println(" My self Heltrin lado J\n I am pursuing 3rd year Computer Science and Engineering at University College of Engineering Nagercoil\n Java beginner\n Class Representative\n Public Speaking \n Organizer of several Events in my College \n Overall Championship at UCEN\n THANK YOU\n");
    }

    public static void main(String[] args) {
        new Main();
    }

}
