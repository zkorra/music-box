import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.*;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Pad
{
    private JPanel mainPanel;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button6;
    private JButton button7;
    private JButton button8;

    public Pad() {
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                File Sound = new File("profile/default", "1.wav");
                playSound(Sound);
            }
        });

        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                File Sound = new File("profile/default", "2.wav");
                playSound(Sound);
            }
        });

        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                File Sound = new File("profile/default", "3.wav");
                playSound(Sound);
            }
        });

        button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                File Sound = new File("profile/default", "4.wav");
                playSound(Sound);
            }
        });
    }

    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Pad");
        frame.setContentPane(new Pad().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    static void playSound(File Sound)
    {
        try
        {
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(Sound));
            clip.start();

            Thread.sleep(clip.getMicrosecondLength()/1000000);
        }
        catch(Exception e)
        {

        }
    }


}
