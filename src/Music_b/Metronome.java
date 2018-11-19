package Music_b;

import java.io.File;

public class Metronome
{

    double bpm;
    int measure, counter;

    public Metronome(double bpm, int measure)
    {
        this.bpm = bpm;
        this.measure = measure;
    }

    public void start(){
        while(true){
            try {
                Thread.sleep((long)(1000*(60/bpm)));
            }catch(InterruptedException e) {
                e.printStackTrace();
            }
            counter++;
            if (counter%measure==0){
                File S = new File("profiles/default1", "9.wav");
                Sound a = new Sound();
                a.play(S);
            }
            else{
                File S = new File("profiles/default1", "10.wav");
                Sound a = new Sound();
                a.play(S);
            }
        }
    }

}