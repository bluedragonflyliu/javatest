import javax.sound.midi.*;
public class MiniMusicPlay1{
	public static void main(String []args){
		try{
			Sequencer sequencer = MidiSystem.getSequencer();
			sequencer.open();

			Sequence seq = new Sequence(Sequencer.PPQ, 4);
			Track track = seq.createTrack();

			for (int i =5;i<61;i++){
				track.add(makeEvent(144,1,i,100,i));
				track.add(makeEvent(128,1,i,100,i+2));
			}

			sequencer.setSequence(seq);
			sequencer.setTempoInBPM(220);
			sequencer.start();
		} catch(Exception ex){
			ex.printStackTrace();
		}
	}
	public static MidiEvent makeEvent(int comd, int chan, int one, int two, int tick) {
		MidiEvent event  = null;
		try{
			shortMessage a = new shortMessage();
			a.setMessage(comd, chan, one, two);
			event = new MidiEvent(a, tick);
		} catch(Exception e){

		}
		return event;
	}
}