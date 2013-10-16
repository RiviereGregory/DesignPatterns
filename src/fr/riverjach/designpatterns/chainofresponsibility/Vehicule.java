package fr.riverjach.designpatterns.chainofresponsibility;

public class Vehicule extends ObjetBase {
	protected String description;

	public Vehicule(String description) {
		super();
		this.description = description;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
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
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Vehicule [description=" + description + "]";
	}

	@Override
	protected String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
