package fr.riverjach.designpatterns.command;

import java.util.ArrayList;
import java.util.List;

public class CommandeSolder {
	protected List<Vehicule> vehiculesSoldes = new ArrayList<>();
	protected long aujourdhui;
	protected long dureeStock;
	protected double tauxRemise;

	public CommandeSolder(long aujourdhui, long dureeStock, double tauxRemise) {
		this.aujourdhui = aujourdhui;
		this.dureeStock = dureeStock;
		this.tauxRemise = tauxRemise;
	}

	public void solde(List<Vehicule> vehicules) {
		vehiculesSoldes.clear();
		for (Vehicule vehicule : vehicules) {
			if (vehicule.getDureeStockage(aujourdhui) >= getDureeStock()) {
				vehiculesSoldes.add(vehicule);
			}
		}
		for (Vehicule vehicule : vehiculesSoldes) {
			vehicule.modifiePrix(1.0 - getTauxRemise());
		}
	}

	public void annule() {
		for (Vehicule vehicule : vehiculesSoldes) {
			vehicule.modifiePrix(1.0 / (1.0 - getTauxRemise()));
		}
	}

	public void retablit() {
		for (Vehicule vehicule : vehiculesSoldes) {
			vehicule.modifiePrix(1.0 - getTauxRemise());
		}
	}

	@Override
	public String toString() {
		return "CommandeSolder [vehiculesSoldes=" + vehiculesSoldes + ", aujourdhui=" + aujourdhui
				+ ", dureeStock=" + dureeStock + ", tauxRemise=" + tauxRemise + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (aujourdhui ^ (aujourdhui >>> 32));
		result = prime * result + (int) (dureeStock ^ (dureeStock >>> 32));
		long temp;
		temp = Double.doubleToLongBits(tauxRemise);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((vehiculesSoldes == null) ? 0 : vehiculesSoldes.hashCode());
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
		CommandeSolder other = (CommandeSolder) obj;
		if (aujourdhui != other.aujourdhui)
			return false;
		if (dureeStock != other.dureeStock)
			return false;
		if (Double.doubleToLongBits(tauxRemise) != Double.doubleToLongBits(other.tauxRemise))
			return false;
		if (vehiculesSoldes == null) {
			if (other.vehiculesSoldes != null)
				return false;
		} else if (!vehiculesSoldes.equals(other.vehiculesSoldes))
			return false;
		return true;
	}

	public List<Vehicule> getVehiculesSoldes() {
		return vehiculesSoldes;
	}

	public void setVehiculesSoldes(List<Vehicule> vehiculesSoldes) {
		this.vehiculesSoldes = vehiculesSoldes;
	}

	public long getAujourdhui() {
		return aujourdhui;
	}

	public void setAujourdhui(long aujourdhui) {
		this.aujourdhui = aujourdhui;
	}

	public long getDureeStock() {
		return dureeStock;
	}

	public void setDureeStock(long dureeStock) {
		this.dureeStock = dureeStock;
	}

	public double getTauxRemise() {
		return tauxRemise;
	}

	public void setTauxRemise(double tauxRemise) {
		this.tauxRemise = tauxRemise;
	}

}
