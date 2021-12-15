package com.temps.midi;

import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Synthesizer;

public class Chord extends Note {

	public Note[] notes;

	public Chord(Note... notes) {
		this.notes = notes;
		this.bpm = notes[0].bpm;
		this.note = notes[0].note;
		this.shift = notes[0].shift;
		this.octave = notes[0].octave;
	}

	public Note play(Synthesizer synth, int channel, int volume) throws MidiUnavailableException, InterruptedException {
		int whole = bpm / 1;
		int half = whole / 2;
		int quarter = half / 2;
		int eighth = quarter / 2;
		int sixteenth = eighth / 2;

		System.out.println("Root " + note + (shift == Shift.SHARP ? "#" : shift == Shift.FLAT ? "b" : "") + octave);

		synth = MidiSystem.getSynthesizer();
		synth.open();
		MidiChannel[] channels = synth.getChannels();

		channels[channel].noteOn(notes[0].getNote(), volume);
		channels[channel].noteOn(notes[1].getNote(), volume);
		if (notes.length > 2) channels[channel].noteOn(notes[2].getNote(), volume);
		if (notes.length > 3) channels[channel].noteOn(notes[3].getNote(), volume);

		if (notes[0].noteLength == NoteLength.WHOLE) Thread.sleep(whole);
		if (notes[0].noteLength == NoteLength.HALF) Thread.sleep(half);
		if (notes[0].noteLength == NoteLength.QUARTER) Thread.sleep(quarter);
		if (notes[0].noteLength == NoteLength.EIGHTH) Thread.sleep(eighth);
		if (notes[0].noteLength == NoteLength.SIXTEENTH) Thread.sleep(sixteenth);

		return notes[0];
	}

}
