import java.util.*;
import java.io.*;

public class Jukebox5 {
	ArrayList<Song> songList = new ArrayList<Song>();
	public static void main(String [] args) {
		new Jukebox5().go();
	}

	class ArtistCompare implements Comparator<Song>{
		public int compare(Song one, Song two) {
			return one.getArtist().compareTo(two.getArtist());
		}
	} 

	public void go(){
		getSongs();
		System.out.println(songList);
		Collections.sort(songList);
		System.out.println(songList);

		ArtistCompare artistCompare = new ArtistCompare();
		Collections.sort(songList, artistCompare);
		System.out.println(songList);
	} 
	void getSongs(){
		try {
			File file = new File("SongList.txt");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = null;
			while((line = reader.readLine()) != null){
				addSong(line);
			}
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	void addSong(String lineToParse) {
		String [] token = lineToParse.split("/");
		Song nextSong = new Song(token[0],token[1],token[2],token[3]);
		songList.add(nextSong);
	}
}