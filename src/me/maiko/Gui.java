package me.maiko;

import javax.swing.JFrame;

import me.maiko.MainMenu.Draw;

public class Gui extends JFrame {
	public static int Character = 1, grass = 1;
	private static final long serialVersionUID = 1L;

	public Gui() {
		setTitle("Reaker");
		setIconImage(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 600);
		setResizable(false);

	
		Draw draw = new Draw();
		draw.setSize(800, 600);
		draw.setVisible(true);
		add(draw);

		setVisible(true);
	}

}
