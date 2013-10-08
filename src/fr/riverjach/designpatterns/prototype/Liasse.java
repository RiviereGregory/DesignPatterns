package fr.riverjach.designpatterns.prototype;

import java.util.List;

public abstract class Liasse {

	protected List<Document> documents;

	public Liasse() {
	}

	public Liasse(List<Document> documents) {
		super();
		this.documents = documents;
	}

	@Override
	public String toString() {
		return "Liasse [documents=" + documents + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((documents == null) ? 0 : documents.hashCode());
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
		Liasse other = (Liasse) obj;
		if (documents == null) {
			if (other.documents != null)
				return false;
		} else if (!documents.equals(other.documents))
			return false;
		return true;
	}

	public List<Document> getDocuments() {
		return documents;
	}

	public void setDocuments(List<Document> documents) {
		this.documents = documents;
	}

}
