package com.sopra.sortPlaylist;

public class Song implements Comparable<Song>{

	String title;
	String artist;
	
	Song(String title, String artist){
		this.title = title;
		this.artist = artist;
	}

	public int compareTo(Song song){
		return title.compareTo(song.title);
	}
	
	public String toString(){
		return title + "/" + artist;
	}
	
}
