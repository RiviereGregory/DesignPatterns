package fr.riverjach.designpatterns.singleton;

public class Vendeur {

	protected String nom;
	protected String adresse;
	protected String email;

	// private pour pouvoir n'être utilisé que dans la classe et pouvoir être unique
	private static Vendeur instance = null;

	// private pour pouvoir n'être instancier que dans la classe et pouvoir être unique
	private Vendeur() {
	}

	public static Vendeur instance() {
		if (instance == null) {
			instance = new Vendeur();
		}
		return instance;
	}

	public void affiche() {
		System.out.println("Nom : " + getNom());
		System.out.println("Adresse : " + getAdresse());
		System.out.println("Email : " + getEmail());
	}

	@Override
	public String toString() {
		return "Vendeur [nom=" + nom + ", adresse=" + adresse + ", email=" + email + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adresse == null) ? 0 : adresse.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vendeur other = (Vendeur) obj;
		if (adresse == null) {
			if (other.adresse != null)
				return false;
		} else if (!adresse.equals(other.adresse))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		return true;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
