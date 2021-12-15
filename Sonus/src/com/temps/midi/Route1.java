package com.temps.midi;

import javax.sound.midi.MidiUnavailableException;

public class Route1 extends Song {

	public static void play() throws MidiUnavailableException, InterruptedException {
		int channel = 10;
		int volume = 80;
		int bpm = 2000;

		Note[] notes = new Note[66];
		notes[0] = new Note(Notes.D, bpm, 5, Shift.NATURAL, NoteLength.SIXTEENTH);
		notes[1] = new Note(Notes.E, bpm, 5, Shift.NATURAL, NoteLength.SIXTEENTH);

		notes[2] = new Note(Notes.F, bpm, 5, Shift.SHARP, NoteLength.EIGHTH);
		notes[3] = new Chord(new Note(Notes.F, bpm, 5, Shift.SHARP, NoteLength.EIGHTH), new Note(Notes.D, bpm, 5, Shift.NATURAL, NoteLength.EIGHTH));

		notes[4] = new Chord(new Note(Notes.F, bpm, 5, Shift.SHARP, NoteLength.EIGHTH), new Note(Notes.D, bpm, 5, Shift.NATURAL, NoteLength.EIGHTH));
		notes[5] = new Note(Notes.D, bpm, 5, Shift.NATURAL, NoteLength.SIXTEENTH);
		notes[6] = new Note(Notes.E, bpm, 5, Shift.NATURAL, NoteLength.SIXTEENTH);

		notes[7] = new Note(Notes.F, bpm, 5, Shift.SHARP, NoteLength.EIGHTH);
		notes[8] = new Chord(new Note(Notes.F, bpm, 5, Shift.SHARP, NoteLength.EIGHTH), new Note(Notes.D, bpm, 5, Shift.NATURAL, NoteLength.EIGHTH));

		notes[9] = new Chord(new Note(Notes.F, bpm, 5, Shift.SHARP, NoteLength.EIGHTH), new Note(Notes.D, bpm, 5, Shift.NATURAL, NoteLength.EIGHTH));
		notes[10] = new Note(Notes.D, bpm, 5, Shift.NATURAL, NoteLength.SIXTEENTH);
		notes[11] = new Note(Notes.E, bpm, 5, Shift.NATURAL, NoteLength.SIXTEENTH);

		notes[12] = new Note(Notes.F, bpm, 5, Shift.SHARP, NoteLength.EIGHTH);
		notes[13] = new Chord(new Note(Notes.F, bpm, 5, Shift.SHARP, NoteLength.EIGHTH), new Note(Notes.D, bpm, 5, Shift.NATURAL, NoteLength.EIGHTH));

		notes[14] = new Chord(new Note(Notes.G, bpm, 5, Shift.NATURAL, NoteLength.SIXTEENTH), new Note(Notes.D, bpm, 5, Shift.NATURAL, NoteLength.SIXTEENTH));
		notes[15] = new Note(Notes.C, bpm, 5, Shift.SHARP, NoteLength.SIXTEENTH);
		notes[16] = new Note(Notes.B, bpm, 5, Shift.NATURAL, NoteLength.SIXTEENTH);
		notes[17] = new Chord(new Note(Notes.F, bpm, 5, Shift.SHARP, NoteLength.SIXTEENTH), new Note(Notes.C, bpm, 5, Shift.SHARP, NoteLength.SIXTEENTH));

		notes[18] = new Chord(new Note(Notes.E, bpm, 5, Shift.NATURAL, NoteLength.EIGHTH), new Note(Notes.A, bpm, 4, Shift.NATURAL, NoteLength.EIGHTH));
		notes[19] = new Note(Notes.A, bpm, 4, Shift.NATURAL, NoteLength.EIGHTH);

		notes[20] = new Note(Notes.A, bpm, 4, Shift.NATURAL, NoteLength.EIGHTH);
		notes[21] = new Note(Notes.C, bpm, 5, Shift.SHARP, NoteLength.SIXTEENTH);
		notes[22] = new Note(Notes.D, bpm, 5, Shift.NATURAL, NoteLength.SIXTEENTH);

		notes[23] = new Note(Notes.E, bpm, 5, Shift.NATURAL, NoteLength.EIGHTH);
		notes[24] = new Chord(new Note(Notes.E, bpm, 5, Shift.NATURAL, NoteLength.EIGHTH), new Note(Notes.C, bpm, 5, Shift.SHARP, NoteLength.EIGHTH));

		notes[25] = new Chord(new Note(Notes.E, bpm, 5, Shift.NATURAL, NoteLength.EIGHTH), new Note(Notes.C, bpm, 5, Shift.SHARP, NoteLength.EIGHTH));
		notes[26] = new Note(Notes.C, bpm, 5, Shift.SHARP, NoteLength.SIXTEENTH);
		notes[27] = new Note(Notes.D, bpm, 5, Shift.NATURAL, NoteLength.SIXTEENTH);

		notes[28] = new Note(Notes.E, bpm, 5, Shift.NATURAL, NoteLength.EIGHTH);
		notes[29] = new Chord(new Note(Notes.E, bpm, 5, Shift.NATURAL, NoteLength.EIGHTH), new Note(Notes.C, bpm, 5, Shift.SHARP, NoteLength.EIGHTH));

		notes[30] = new Chord(new Note(Notes.E, bpm, 5, Shift.SHARP, NoteLength.EIGHTH), new Note(Notes.C, bpm, 5, Shift.SHARP, NoteLength.EIGHTH));
		notes[31] = new Note(Notes.C, bpm, 5, Shift.SHARP, NoteLength.SIXTEENTH);
		notes[32] = new Note(Notes.D, bpm, 5, Shift.NATURAL, NoteLength.SIXTEENTH);

		notes[33] = new Chord(new Note(Notes.E, bpm, 5, Shift.NATURAL, NoteLength.EIGHTH), new Note(Notes.A, bpm, 4, Shift.NATURAL, NoteLength.EIGHTH));
		notes[34] = new Chord(new Note(Notes.E, bpm, 5, Shift.NATURAL, NoteLength.EIGHTH), new Note(Notes.C, bpm, 5, Shift.SHARP, NoteLength.EIGHTH));

		notes[35] = new Chord(new Note(Notes.F, bpm, 5, Shift.SHARP, NoteLength.SIXTEENTH), new Note(Notes.B, bpm, 5, Shift.NATURAL, NoteLength.SIXTEENTH));
		notes[36] = new Note(Notes.E, bpm, 5, Shift.NATURAL, NoteLength.SIXTEENTH);
		notes[37] = new Chord(new Note(Notes.E, bpm, 5, Shift.NATURAL, NoteLength.SIXTEENTH), new Note(Notes.C, bpm, 5, Shift.SHARP, NoteLength.SIXTEENTH));
		notes[38] = new Note(Notes.F, bpm, 5, Shift.SHARP, NoteLength.SIXTEENTH);

		notes[39] = new Note(Notes.D, bpm, 5, Shift.NATURAL, NoteLength.EIGHTH);
		notes[40] = new Note(Notes.A, bpm, 4, Shift.NATURAL, NoteLength.EIGHTH);

		notes[41] = new Chord(new Note(Notes.F, bpm, 5, Shift.SHARP, NoteLength.EIGHTH), new Note(Notes.A, bpm, 4, Shift.NATURAL, NoteLength.EIGHTH));
		notes[42] = new Note(Notes.D, bpm, 5, Shift.NATURAL, NoteLength.SIXTEENTH);
		notes[43] = new Note(Notes.E, bpm, 5, Shift.NATURAL, NoteLength.SIXTEENTH);

		notes[44] = new Note(Notes.F, bpm, 5, Shift.SHARP, NoteLength.EIGHTH);
		notes[45] = new Chord(new Note(Notes.F, bpm, 5, Shift.SHARP, NoteLength.EIGHTH), new Note(Notes.D, bpm, 5, Shift.NATURAL, NoteLength.EIGHTH));

		
		
		Song.play(notes, volume, bpm, channel, false);
		Song.play(notes, volume, bpm, channel, false);
	}

}
