package br.edu.insper.desagil.backend.model;

public class Track {
	private Artist artist;
	private String name;
	private int duration;
	
	public Track(Artist artist, String name, int duration) {
		super();
		this.artist = artist;
		this.name = name;
		this.duration = duration;
	}

	public Artist getArtist() {
		return artist;
	}

	public String getName() {
		return name;
	}

	public int getDuration() {
		return duration;
	}
	
	public String getDurationString() {
		int min = this.duration;
		int seg = this.duration;
		int minuts = min/60;
		int seconds = seg%60;
		String minutos = Integer.toString(minuts);
		String segundos = Integer.toString(seconds);
		if (seconds<10) {
			segundos = "0"+ seconds;
			return minutos + ":"+ segundos;
		}
		else {
			return minutos + ":"+segundos;
		}
				
		
		
	}
	public String getFullArtistName() {
		String nameArtist = artist.getName();
		return nameArtist;
		
	}
}
