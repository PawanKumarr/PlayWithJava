package com.sopra.sortPlaylist;

import java.util.Comparator;

public class SongComparator1 implements Comparator<Song> {

	public int compare(Song song1, Song song2){
		return song1.title.compareTo(song2.title);
	}
}
