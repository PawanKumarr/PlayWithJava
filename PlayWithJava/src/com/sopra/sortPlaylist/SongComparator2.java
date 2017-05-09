package com.sopra.sortPlaylist;

import java.util.Comparator;

public class SongComparator2 implements Comparator<Song> {

	public int compare(Song song1, Song song2){
		return song1.artist.compareTo(song2.artist);
	}
}
