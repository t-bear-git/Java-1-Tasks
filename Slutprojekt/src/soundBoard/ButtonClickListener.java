package soundBoard;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class ButtonClickListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        // Storing ActionCommand in variable.
        String command = e.getActionCommand();
        // Switch Case to run corresponding code from button click.
        switch (command) {
            case "button1":
                try {
                    // Creating Clip object to playback audio.
                    Clip clip = AudioSystem.getClip();
                    clip.open(AudioSystem.getAudioInputStream(new File("UFO.wav")));
                    clip.start();

                } catch (Exception exc) {
                    System.out.println("File is not working. \nOnly .wav audio file is supported.");
                }
                break;
            case "button2":
                try {
                    Clip clip = AudioSystem.getClip();
                    clip.open(AudioSystem.getAudioInputStream(new File("morse.wav")));
                    clip.start();
                } catch (Exception exc) {
                    System.out.println("File is not working. \nOnly .wav audio file is supported.");
                }
                break;
            case "button3":
                try {
                    Clip clip = AudioSystem.getClip();
                    clip.open(AudioSystem.getAudioInputStream(new File("MP5.wav")));
                    clip.start();
                } catch (Exception exc) {
                    System.out.println("File is not working. \nOnly .wav audio file is supported.");
                }
                break;
            case "button4":
                try {
                    Clip clip = AudioSystem.getClip();
                    clip.open(AudioSystem.getAudioInputStream(new File("RELOAD.wav")));
                    clip.start();
                } catch (Exception exc) {
                    System.out.println("File is not working. \nOnly .wav audio file is supported.");
                }
                break;
        }


    }
}
