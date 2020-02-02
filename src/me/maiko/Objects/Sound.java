package me.maiko.Objects;

import java.io.IOException;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Sound {

	
	public Sound(String Soundfilepath) {

		  AudioInputStream audioInputStream;
		try {
			audioInputStream = AudioSystem.getAudioInputStream(getClass().getResourceAsStream(Soundfilepath));
		    AudioFormat af = audioInputStream.getFormat();
		    int size = (int) (af.getFrameSize() * audioInputStream.getFrameLength());
		    byte[] audio = new byte[size];
		    DataLine.Info info = new DataLine.Info(Clip.class, af, size);
	          audioInputStream.read(audio, 0, size);
	         Clip clip = (Clip) AudioSystem.getLine(info);
	           
			clip.open(af, audio, 0, size);
			
	            clip.start();
		} catch (UnsupportedAudioFileException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (LineUnavailableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
