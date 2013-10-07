package fr.riverjach.designpatterns.builder;

import java.util.ArrayList;
import java.util.List;

public abstract class Liasse {

	protected List<String> contenu = new ArrayList<>();

	public Liasse() {
	}

	public Liasse(List<String> contenu) {
		super();
		this.contenu = contenu;
	}

	public abstract void ajouteDocument(String document);

	public abstract void imprime();

	@Override
	public String toString() {
		return "Liasse [contenu=" + contenu + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((contenu == null) ? 0 : contenu.hashCode());
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
		Liasse other = (Liasse) obj;
		if (contenu == null) {
			if (other.contenu != null)
				return false;
		} else if (!contenu.equals(other.contenu))
			return false;
		return true;
	}

	public List<String> getContenu() {
		return contenu;
	}

	public void setContenu(List<String> contenu) {
		this.contenu = contenu;
	}

}
