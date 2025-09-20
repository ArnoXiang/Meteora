package com.globalsoftwaresupport.constants;

public class GameVariables {

	private GameVariables() {
		
	}
	
	// Java forces the OS not to cache this variables
	// it is read from the memory always
	public volatile static boolean IN_GAME = true;
	// the meteors can hit the ship 10x before game over
	public volatile static int SHIELDS = 3;
	public volatile static int SCORE = 0;
	
	// ship damage indicator
	public volatile static boolean SHOW_DAMAGE = false;
	public volatile static long DAMAGE_START_TIME = 0;
	public static final long DAMAGE_DURATION = 1000; // 1 second
	
	// game pause state
	public volatile static boolean PAUSED = false;
}
