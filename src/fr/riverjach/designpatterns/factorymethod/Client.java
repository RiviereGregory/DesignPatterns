package fr.riverjach.designpatterns.factorymethod;

import java.util.ArrayList;
import java.util.List;

public abstract class Client {
	protected List<Commande> commandes = new ArrayList<>();

	public Client() {
	}

	public Client(List<Commande> commandes) {
		super();
		this.commandes = commandes;
	}

	protected abstract Commande creeCommande(double montant);

	public void nouvelleCommande(double montant) {
		Commande commande = this.creeCommande(montant);
		if (commande.valide()) {
			commande.paye();
			commandes.add(commande);
		}
	}

	@Override
	public String toString() {
		return "Client [commandes=" + commandes + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((commandes == null) ? 0 : commandes.hashCode());
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
		Client other = (Client) obj;
		if (commandes == null) {
			if (other.commandes != null)
				return false;
		} else if (!commandes.equals(other.commandes))
			return false;
		return true;
	}

	public List<Commande> getCommandes() {
		return commandes;
	}

	public void setCommandes(List<Commande> commandes) {
		this.commandes = commandes;
	}

}
