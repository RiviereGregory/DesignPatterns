package fr.riverjach.designpatterns.command;

public class Vehicule {
	protected String nom;
	protected long dateEntreeStock;
	protected double prixVente;

	public Vehicule(String nom, long dateEntreeStock, double prixVente) {
		super();
		this.nom = nom;
		this.dateEntreeStock = dateEntreeStock;
		this.prixVente = prixVente;
	}

	public long getDureeStockage(long aujourdhui) {
		return aujourdhui - getDateEntreeStock();
	}

	public void modifiePrix(double coefficient) {
		setPrixVente(0.01 * Math.round(coefficient * this.getPrixVente() * 100));
	}

	public void affiche() {
		System.out.println(getNom() + " prix : " + getPrixVente() + " date entée stock "
				+ getDateEntreeStock());
	}

	@Override
	public String toString() {
		return "Vehicule [nom=" + nom + ", dateEntreeStock=" + dateEntreeStock + ", prixVente="
				+ prixVente + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (dateEntreeStock ^ (dateEntreeStock >>> 32));
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		long temp;
		temp = Double.doubleToLongBits(prixVente);
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
		Vehicule other = (Vehicule) obj;
		if (dateEntreeStock != other.dateEntreeStock)
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (Double.doubleToLongBits(prixVente) != Double.doubleToLongBits(other.prixVente))
			return false;
		return true;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public long getDateEntreeStock() {
		return dateEntreeStock;
	}

	public void setDateEntreeStock(long dateEntreeStock) {
		this.dateEntreeStock = dateEntreeStock;
	}

	public double getPrixVente() {
		return prixVente;
	}

	public void setPrixVente(double prixVente) {
		this.prixVente = prixVente;
	}

}
