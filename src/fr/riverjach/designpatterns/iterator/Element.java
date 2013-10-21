package fr.riverjach.designpatterns.iterator;

public abstract class Element {
	protected String description;

	public Element(String description) {
		super();
		this.description = description;
	}

	public boolean motCleValide(String motCle) {
		return getDescription().indexOf(motCle) != -1;
	}

	@Override
	public String toString() {
		return "Element [description=" + description + "]";
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
		Element other = (Element) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		return true;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
