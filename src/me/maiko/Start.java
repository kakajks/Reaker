package me.maiko;

import me.maiko.MainMenu.MenuTimer;
import me.maiko.Manager.ImageLoader;

public class Start {
	
	public static void main(String[] args) {
		
		new ImageLoader();
		new MenuTimer();
		new Gui();
		
		
	}

}
