package br.edu.insper.desagil.backend.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Playlist {
	private Integer id;
	private List<Track> tracks;
	private Map<String, Integer> ratings;

	public Playlist(Integer id) {
		super();
		this.id = id;
		this.tracks = new ArrayList<>();
		this.ratings = new HashMap<>();
	}

	public Integer getId() {
		return id;
	}

	public List<Track> getFaixas() {
		return tracks;
	}

	public Map<String, Integer> getRatings() {
		return ratings;
	}
	
	public void addTrack(Track track) {
		this.tracks.add(track);
	}
	
	public void putRating(String usuario, int aval) {
		this.ratings.put(usuario, aval);
			
	}
	public double everageRatings() {
		int soma =0;
		int div = this.ratings.size();
		double media;
		
		for (int aval: this.ratings.values()){
			soma+=aval;
		}
		media = (double)soma/div;
		
		int i = (int) media;
		double d = media - i;
		
		if (d<0.26) {
			return (double) i;
		}
		else if(d>=0.74) {
			return (double) i+1;
		}
		else {
			return (double) i+0.5;
		}
		
	}

}
