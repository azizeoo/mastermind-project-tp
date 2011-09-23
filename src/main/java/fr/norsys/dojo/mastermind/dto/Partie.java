package fr.norsys.dojo.mastermind.dto;

public class Partie {
	private int idJoueur;
	private int victoire;
	private int defaite;
	private int score;
	
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public Partie() {


	}
	public int getIdJoueur() {
		return idJoueur;
	}
	public void setIdJoueur(int idJoueur) {
		this.idJoueur = idJoueur;
	}
	public int getVictoire() {
		return victoire;
	}
	public void setVictoire(int vectoire) {
		this.victoire = vectoire;
	}
	public int getDefaite() {
		return defaite;
	}
	public void setDefaite(int defaite) {
		this.defaite = defaite;
	}

}
