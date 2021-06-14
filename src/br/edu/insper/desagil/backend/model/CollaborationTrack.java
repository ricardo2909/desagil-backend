package br.edu.insper.desagil.backend.model;

import java.util.ArrayList;
import java.util.List;

public class CollaborationTrack extends Track {
	private List<Artist> collaborators;

	public CollaborationTrack(Artist artist, String name, int duration, List<Artist> collaborators) {
		super(artist, name, duration);
		this.collaborators = collaborators;
	}


	@Override
	public String getFullArtistName() {
		List<String> colaboradores = new ArrayList<>();
		String nomeArtista = this.getArtist().getName();
		
		for (Artist colaborador: collaborators) {
			colaboradores.add(colaborador.getName());
		}
		return nomeArtista + "(feat. "+String.join(",", colaboradores)+")";
	}
}
