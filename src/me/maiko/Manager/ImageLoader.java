package me.maiko.Manager;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageLoader {
	public static Image Char_right_1, Char_right_2, Char_right_3, grass,Wolke;
	public static Font Font;
	@SuppressWarnings("static-access")
	public ImageLoader() {
		try {

			Font = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("/Fonts/Retro.ttf"));
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("/Fonts/Retro.ttf")));

			Char_right_1 = ImageIO.read(getClass().getResourceAsStream("/character/right/right_1.png"));
			Char_right_2 = ImageIO.read(getClass().getResourceAsStream("/character/right/right_2.png"));
			Char_right_3 = ImageIO.read(getClass().getResourceAsStream("/character/right/right_3.png"));
			grass = ImageIO.read(getClass().getResourceAsStream("/General/grass.png"));
			Wolke = ImageIO.read(getClass().getResourceAsStream("/General/Wolke.png"));

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FontFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
