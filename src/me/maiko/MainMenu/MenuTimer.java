package me.maiko.MainMenu;

import java.util.Timer;
import java.util.TimerTask;

import me.maiko.Gui;
import me.maiko.Vars;

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
				if( Vars.Start_String ) {
					Vars.Start_String = false;
				}else {
					 Vars.Start_String = true;
				}
					
				
				
			}
		}, 0, 1000/2);
		t.scheduleAtFixedRate(new TimerTask() {
			
			@Override
			public void run() {
				if(Gui.grass== 64) {
					Gui.grass = 1;
				}else {
					Gui.grass++;
				}
			}
		}, 0, 25);
	}

}
