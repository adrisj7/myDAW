package core;

import java.awt.Graphics2D;
import java.awt.image.BufferStrategy;

import handlers.ObjectHandler;

public class Core implements Runnable {
	// WINDOW
	public static final int WIDTH = 640;
	public static final int HEIGHT = WIDTH * 3 / 4;
	private final String TITLE = "Well den";
	Window window;

	//// BACKEND
	Thread thread;
	boolean running = false;

	// RENDERING
	BufferStrategy bs;// Aquired from Window
	Graphics2D g2d;

	// BACKEND OBJECTS
	ObjectHandler handler;

	public Core() {
		thread = new Thread(this);
		handler = new ObjectHandler();
		window = new Window(WIDTH, HEIGHT, TITLE);
		start();
	}

	public void run() {
		long prevTime = System.currentTimeMillis();
		int fps = 30;
		int millisPerFrame = 1000 / 30;
		while (running) {
			if (System.currentTimeMillis() - prevTime > millisPerFrame) {
				System.out.println("POTATO THIS SUX");
				prevTime = System.currentTimeMillis();
				bs = window.getBufferStrategy();
				g2d = (Graphics2D) bs.getDrawGraphics();
				handler.draw(g2d);
				g2d.dispose();
				bs.show();
			}
		}
	}

	public void start() {
		if (!running) {
			running = true;
			thread.start();
		}
	}

	public void stop() {
		try {
			thread.join();
		} catch (InterruptedException e) {
			System.err.println("INTERRUPTING THREAD (in case this ever happens)");
			thread.interrupt();// NOT SURE IF THIS IS THE RIGHT THING TO DO
			e.printStackTrace();
		}
	}

	public static void main(String args[]) {
		new Core();
	}

}
