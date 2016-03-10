package core;

import java.awt.Dimension;
import java.awt.image.BufferStrategy;

import javax.swing.JFrame;

public class Window {
	private JFrame frame;

	public Window(int width, int height, String title) {
		frame = new JFrame(title);
		Dimension dimension = new Dimension(width, height);
		frame.setPreferredSize(dimension);
		frame.setMinimumSize(dimension);
		frame.setMaximumSize(dimension);
		frame.setSize(width, height);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setFocusable(true);
		frame.setLocationRelativeTo(null);

		frame.setVisible(true);
		frame.pack();

		frame.createBufferStrategy(2);

	}

	public BufferStrategy getBufferStrategy() {
		return frame.getBufferStrategy();
	}
}
