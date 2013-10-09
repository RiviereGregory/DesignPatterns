package fr.riverjach.designpatterns.bridge;

public abstract class FormulaireImmatriculation {
	protected String contenu;
	protected FormulaireImpl implantation;

	public FormulaireImmatriculation(FormulaireImpl implantation) {
		this.implantation = implantation;
	}

	public void affiche() {
		implantation.dessineTexte("numéro de la plaque existant : ");
	}

	public void genereDocument() {
		implantation.dessineTexte("Demande d'immatriculation");
		implantation.dessineTexte("numero de plaque : " + getContenu());
	}

	public boolean gereSaisie() {
		setContenu(implantation.gereZoneSaisie());
		return this.controleSaisie(getContenu());
	}

	public abstract boolean controleSaisie(String plaque);

	@Override
	public String toString() {
		return "FormulaireImmatriculation [contenu=" + contenu + ", implantation=" + implantation
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((contenu == null) ? 0 : contenu.hashCode());
		result = prime * result + ((implantation == null) ? 0 : implantation.hashCode());
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
		FormulaireImmatriculation other = (FormulaireImmatriculation) obj;
		if (contenu == null) {
			if (other.contenu != null)
				return false;
		} else if (!contenu.equals(other.contenu))
			return false;
		if (implantation == null) {
			if (other.implantation != null)
				return false;
		} else if (!implantation.equals(other.implantation))
			return false;
		return true;
	}

	public String getContenu() {
		return contenu;
	}

	public void setContenu(String contenu) {
		this.contenu = contenu;
	}

	public FormulaireImpl getImplantation() {
		return implantation;
	}

	public void setImplantation(FormulaireImpl implantation) {
		this.implantation = implantation;
	}

}
