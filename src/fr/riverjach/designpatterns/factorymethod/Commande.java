package fr.riverjach.designpatterns.factorymethod;

public abstract class Commande {
	protected double montant;

	public Commande(double montant) {
		super();
		this.montant = montant;
	}

	public abstract boolean valide();

	public abstract void paye();

	@Override
	public String toString() {
		return "Commande [montant=" + montant + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(montant);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Commande other = (Commande) obj;
		if (Double.doubleToLongBits(montant) != Double.doubleToLongBits(other.montant))
			return false;
		return true;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

}
