package Music_b;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import javax.swing.*;

public class Pad extends JFrame implements ActionListener, KeyListener
{
    private JPanel mainPanel;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton userButton;
    private JButton defaultButton1;
    private JButton defaultButton2;
    private JPanel JPanel1;
    private int temp = 0;

    public Pad() {
        mainPanel.setBackground(Color.black);
        JPanel1.setBackground(Color.black);
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        defaultButton1.addActionListener(this);
        defaultButton2.addActionListener(this);

        button1.addKeyListener(this);
        button2.addKeyListener(this);
        button3.addKeyListener(this);
        button4.addKeyListener(this);
        defaultButton1.addKeyListener(this);
        defaultButton2.addKeyListener(this);
        button1.setBorder ( BorderFactory.createLineBorder ( Color.darkGray, 4 ) );
        button1.setBackground(Color.gray);
        button2.setBorder ( BorderFactory.createLineBorder ( Color.darkGray, 4 ) );
        button2.setBackground(Color.gray);
        button3.setBorder ( BorderFactory.createLineBorder ( Color.darkGray, 4 ) );
        button3.setBackground(Color.gray);
        button4.setBorder ( BorderFactory.createLineBorder ( Color.darkGray, 4 ) );
        button4.setBackground(Color.gray);
        defaultButton1.setBackground(Color.white);
        defaultButton1.setBorder( BorderFactory.createLineBorder ( Color.darkGray, 4 ));
        defaultButton2.setBackground(Color.white);
        defaultButton2.setBorder( BorderFactory.createLineBorder ( Color.darkGray, 4 ));
        userButton.setBackground(Color.white);
        userButton.setBorder( BorderFactory.createLineBorder ( Color.darkGray, 4 ));

    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == button1)
        {
            if(temp == 0) { File Sound = new File("profiles/default1", "1.wav"); Music_b.Sound.playSound(Sound);}
                else if(temp == 1) { File Sound = new File("profiles/default2", "1.wav"); Music_b.Sound.playSound(Sound);}
        }

        else if(e.getSource() == button2)
        {
            if(temp == 0) { File Sound = new File("profiles/default1", "2.wav"); Music_b.Sound.playSound(Sound);}
                else if(temp == 1) { File Sound = new File("profiles/default2", "2.wav"); Music_b.Sound.playSound(Sound);}
        }

        else if(e.getSource() == button3)
        {
            if(temp == 0) { File Sound = new File("profiles/default1", "3.wav"); Music_b.Sound.playSound(Sound);}
                else if(temp == 1) { File Sound = new File("profiles/default2", "3.wav"); Music_b.Sound.playSound(Sound);}
        }

        else if(e.getSource() == button4)
        {
            if(temp == 0) { File Sound = new File("profiles/default1", "4.wav"); Music_b.Sound.playSound(Sound);}
                else if(temp == 1) { File Sound = new File("profiles/default2", "4.wav"); Music_b.Sound.playSound(Sound);}
        }

        else if(e.getSource() == defaultButton1) { temp = 0; }

        else if(e.getSource() == defaultButton2) { temp = 1; }

    }

    public void keyPressed(KeyEvent e)
    {
        if(e.getKeyCode() == KeyEvent.VK_Q)
        {

            if(temp == 0) { File Sound = new File("profiles/default1", "1.wav"); Music_b.Sound.playSound(Sound);}
            else if(temp == 1) { File Sound = new File("profiles/default2", "1.wav"); Music_b.Sound.playSound(Sound);}
        }

        else if(e.getKeyCode() == KeyEvent.VK_W)
        {
            if(temp == 0) { File Sound = new File("profiles/default1", "2.wav"); Music_b.Sound.playSound(Sound);}
            else if(temp == 1) { File Sound = new File("profiles/default2", "2.wav"); Music_b.Sound.playSound(Sound);}
        }

        else if(e.getKeyCode() == KeyEvent.VK_A)
        {
            if(temp == 0) { File Sound = new File("profiles/default1", "3.wav"); Music_b.Sound.playSound(Sound);}
            else if(temp == 1) { File Sound = new File("profiles/default2", "3.wav"); Music_b.Sound.playSound(Sound);}
        }

        else if(e.getKeyCode() == KeyEvent.VK_S)
        {
            if(temp == 0) { File Sound = new File("profiles/default1", "4.wav"); Music_b.Sound.playSound(Sound);}
            else if(temp == 1) { File Sound = new File("profiles/default2", "4.wav"); Music_b.Sound.playSound(Sound);}
        }

        else if(e.getKeyCode() == KeyEvent.VK_1) { temp = 0; }

        else if(e.getKeyCode() == KeyEvent.VK_2) { temp = 1; }
    }

    public void keyReleased(KeyEvent e)
    {

    }

    public void keyTyped(KeyEvent e)
    {

    }

    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Pad");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new Pad().mainPanel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setSize(400,420);
        frame.setTitle("Music_Box");
        frame.setResizable(false);
    }

}
