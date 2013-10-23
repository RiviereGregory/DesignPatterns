package fr.riverjach.designpatterns.templatemethod;

public abstract class Commande {
	protected double montantHt;
	protected double montantTva;
	protected double montantTtc;

	protected abstract void calculeTva();

	public void setMontantHt(double montantHt) {
		this.montantHt = montantHt;
	}

	public void affiche() {
		System.out.println("Commande");
		System.out.println("Montant HT " + getMontantHt());
		System.out.println("Montant TTC " + getMontantTtc());
	}

	public double getMontantTva() {
		return montantTva;
	}

	public void setMontantTva(double montantTva) {
		this.montantTva = montantTva;
	}

	public double getMontantTtc() {
		return montantTtc;
	}

	public void calculeMontantTtc() {
		this.calculeTva();
		montantTtc = getMontantHt() + getMontantTva();
	}

	public void setMontantTtc(double montantTtc) {
		this.montantTtc = montantTtc;
	}

	public double getMontantHt() {
		return montantHt;
	}

}
