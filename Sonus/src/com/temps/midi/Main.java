package com.temps.midi;

import javax.sound.midi.MidiUnavailableException;
import javax.swing.JFrame;

public class Main {

	private void play() throws MidiUnavailableException, InterruptedException {
		Route1.play();
	}

	public static void main(String[] args) throws InterruptedException, MidiUnavailableException {
		Main main = new Main();
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Midi");
		frame.setSize(800, 600);
		frame.setVisible(true);

		main.play();
	}

}
