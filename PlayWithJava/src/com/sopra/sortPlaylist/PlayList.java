package com.sopra.sortPlaylist;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlayList {
	
	List<Song> songs = new ArrayList<Song>();

	public static void main(String[] args) throws IOException {
		new PlayList().go();
	}

	void go() throws IOException {
		readPlayList();
		sortUsingComparableInterface();
		sortUsingComparatorInterface();
	}

	void sortUsingComparableInterface() {
		Collections.sort(songs);
		display();
	}
	
	void sortUsingComparatorInterface() {
		Collections.sort(songs, new SongComparator2());
		display();
		Collections.sort(songs, new SongComparator1());
		display();
	}

	void display() {
		System.out.println(songs);
	}

	void readPlayList() throws IOException {
		File file = new File("\\Coding Fun\\My Sorted Playlist\\My Playlist.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		try {
			String line;
			while ((line = br.readLine()) != null) {
				readRecord(line);
			} 
		} finally {
			br.close();
			display();
		}
	}

	void readRecord(String line) {
		String[] tokens = line.split(", ");
		String title = tokens[0];
		String artist = tokens[1];
		songs.add(new Song(title, artist));
	}

}
