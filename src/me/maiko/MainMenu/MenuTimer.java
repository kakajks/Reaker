package me.maiko.MainMenu;

import java.util.Timer;
import java.util.TimerTask;

import me.maiko.Gui;

public class MenuTimer {
	Timer t;
	public MenuTimer() {
		t = new Timer();
		t.scheduleAtFixedRate(new TimerTask() {
			
			@Override
			public void run() {
				if(Gui.Character < 3) {
					Gui.Character++;
				}else {
					Gui.Character =1;
				}
				
				
			}
		}, 0, 1000/5);
		t.scheduleAtFixedRate(new TimerTask() {
			
			@Override
			public void run() {
				if(Gui.grass< -64) {
					Gui.grass = 0;
				}else {
					Gui.grass--;
				}
			}
		}, 0, 25);
	}

}
