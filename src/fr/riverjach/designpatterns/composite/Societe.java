package fr.riverjach.designpatterns.composite;

public abstract class Societe {
	protected static double coutUnitVehicule = 5.0;
	protected int nbVehicule;

	public void ajouteVehicule() {
		nbVehicule = nbVehicule + 1;
	}

	public abstract double calculeCoutEntretien();

	public abstract boolean ajouteFiliale(Societe filiale);

	@Override
	public String toString() {
		return "Societe [nbVehicule=" + nbVehicule + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + nbVehicule;
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
		Societe other = (Societe) obj;
		if (nbVehicule != other.nbVehicule)
			return false;
		return true;
	}

	public static double getCoutUnitVehicule() {
		return coutUnitVehicule;
	}

	public static void setCoutUnitVehicule(double coutUnitVehicule) {
		Societe.coutUnitVehicule = coutUnitVehicule;
	}

	public int getNbVehicule() {
		return nbVehicule;
	}

	public void setNbVehicule(int nbVehicule) {
		this.nbVehicule = nbVehicule;
	}

}
