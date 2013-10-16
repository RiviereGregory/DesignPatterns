package fr.riverjach.designpatterns.chainofresponsibility;

public abstract class ObjetBase {
	protected ObjetBase suivant;

	private String descriptionParDefaut() {
		return "description par defaut";
	}

	protected abstract String getDescription();

	public String donneDescription() {
		String resultat;
		resultat = this.getDescription();
		if (resultat != null) {
			return resultat;
		}
		if (suivant != null) {
			return suivant.donneDescription();
		} else {
			return this.descriptionParDefaut();
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((suivant == null) ? 0 : suivant.hashCode());
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
		ObjetBase other = (ObjetBase) obj;
		if (suivant == null) {
			if (other.suivant != null)
				return false;
		} else if (!suivant.equals(other.suivant))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ObjetBase [suivant=" + suivant + "]";
	}

	public void setSuivant(ObjetBase suivant) {
		this.suivant = suivant;
	}

	public ObjetBase getSuivant() {
		return suivant;
	}

}
