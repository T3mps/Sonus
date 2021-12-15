package com.temps.midi;

import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Synthesizer;

public class Note {

	public Notes note;
	public int octave;
	public Shift shift;
	public NoteLength noteLength;

	protected int bpm;

	public Note() {
	}

	public Note(Notes note, int bpm, int octave, Shift shift, NoteLength noteLength) {
		this.note = note;
		this.bpm = bpm;
		this.octave = octave;
		this.shift = shift;
		this.noteLength = noteLength;
	}

	public int getNote() {
		int n = -1;

		switch (note) {
		case C:
			n = 12;
			break;
		case D:
			n = 14;
			break;
		case E:
			n = 16;
			break;
		case F:
			n = 17;
			break;
		case G:
			n = 19;
			break;
		case A:
			n = 21;
			break;
		case B:
			n = 23;
			break;
		}

		for (int i = 0; i < (octave * 12); i++) {
			n++;
		}

		if (shift == Shift.SHARP) n++;
		if (shift == Shift.FLAT) n--;

		return n;
	}

	public Note play(Synthesizer synth, int channel, int volume) throws MidiUnavailableException, InterruptedException {
		int whole = bpm / 1;
		int half = whole / 2;
		int quarter = half / 2;
		int eighth = quarter / 2;
		int sixteenth = eighth / 2;

		System.out.println(note + (shift == Shift.SHARP ? "#" : shift == Shift.FLAT ? "b" : "") + octave);

		synth = MidiSystem.getSynthesizer();
		synth.open();
		MidiChannel[] channels = synth.getChannels();

		channels[channel].noteOn(getNote(), volume);
		if (this.noteLength == NoteLength.WHOLE) Thread.sleep(whole);
		if (this.noteLength == NoteLength.HALF) Thread.sleep(half);
		if (this.noteLength == NoteLength.QUARTER) Thread.sleep(quarter);
		if (this.noteLength == NoteLength.EIGHTH) Thread.sleep(eighth);
		if (this.noteLength == NoteLength.SIXTEENTH) Thread.sleep(sixteenth);
		channels[channel].noteOff(getNote());

		return this;
	}

}
