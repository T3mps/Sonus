package com.temps.midi;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Synthesizer;

public class Song {

	public static void play(Note[] notes, int volume, int bpm, int channel, boolean repeat) throws MidiUnavailableException, InterruptedException {
		Synthesizer synth = MidiSystem.getSynthesizer();
		synth.open();

		do {
			for (int i = 0; i < notes.length; i++) {
				if (notes[i] instanceof Chord) {
					((Chord) notes[i]).play(synth, channel, volume);
					continue;
				}
				if (notes[i] instanceof Note) {
					((Note) notes[i]).play(synth, channel, volume);
					continue;
				}
			}

		} while (repeat);

		synth.close();
	}

}
