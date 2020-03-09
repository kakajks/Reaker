package me.maiko.MainMenu;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JLabel;

import me.maiko.Gui;
import me.maiko.Vars;
import me.maiko.Manager.ImageLoader;

public class Draw extends JLabel {

	private static final long serialVersionUID = 1L;

	protected void paintComponent(Graphics g) {

		super.paintComponent(g);

		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		//Background
		g.setColor(new Color(0, 130, 255));
		g.fillRect(0, 0, 800, 600);
		//g.drawImage(ImageLoader.Wolke, 0, 0, 800, 600, null);
		//Schrift
		g.setColor(new Color(150, 20, 40));
		g.setFont(ImageLoader.Font.deriveFont(80f));
		g.drawString("Reaker", 230, 200);
		if(Vars.Start_String) {
			g.setColor(new Color(65, 65, 65));
			g.setFont(ImageLoader.Font.deriveFont(18f));
			g.drawString("Drücke Enter zum starten", 250, 430);
		}
		
		
		//Boden
		for (int x = 0; x < 14; x++) {
			g.drawImage(ImageLoader.grass, 64 * x  -Gui.grass, 534, 64, 64, null);
		}
		//Character

		if (Gui.Character == 1) {
			g.drawImage(ImageLoader.scyth, 414, 472 +16, 60, 60, null);
			g.drawImage(ImageLoader.Char_right_1, 400, 472 + 20, 64, 64, null);

		}
		if (Gui.Character == 2) {
			g.drawImage(ImageLoader.scyth, 414, 472 +15, 60, 60, null);
			g.drawImage(ImageLoader.Char_right_2, 400, 472 + 20, 64, 64, null);

		}
		if (Gui.Character == 3) {
			g.drawImage(ImageLoader.scyth, 414, 472 +16, 60, 60, null);
			g.drawImage(ImageLoader.Char_right_3, 400, 472 + 20, 64, 64, null);

		}
		

		repaint();
	}

}
