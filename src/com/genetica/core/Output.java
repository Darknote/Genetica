package com.genetica.core;

import org.jsfml.graphics.Color;
import org.jsfml.graphics.RenderWindow;
import org.jsfml.window.VideoMode;
import org.jsfml.window.event.Event;

public class Output 
{
	private static int X = 800;
	private static int Y = 600;
	public void createWindow()
	{
		RenderWindow window = new RenderWindow();
		window.create(new VideoMode(X, Y), "Hello JSFML!");

		window.setFramerateLimit(60);
		while(window.isOpen()) {
		    //Fill the window with red
		    window.clear(Color.WHITE);

		    window.display();

		    //Handle events
		    for(Event event : window.pollEvents()) {
		        if(event.type == Event.Type.CLOSED) {
		            //The user pressed the close button
		            window.close();
		        }
		    }
		}
	}
	
}
