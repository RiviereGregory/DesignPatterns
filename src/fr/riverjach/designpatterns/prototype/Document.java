package fr.riverjach.designpatterns.prototype;

public abstract class Document implements Cloneable {

	protected String contenu = new String();

	public Document() {
	}

	public Document(String contenu) {
		super();
		this.contenu = contenu;
	}

	public Document duplique() {
		Document resultat;

		try {
			resultat = (Document) this.clone();

		} catch (CloneNotSupportedException e) {
			return null;
		}

		return resultat;

	}

	public void remplit(String informations) {
		setContenu(informations);
	}

	public abstract void imprime();

	public abstract void affiche();

	@Override
	public String toString() {
		return "Document [contenu=" + contenu + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((contenu == null) ? 0 : contenu.hashCode());
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
		Document other = (Document) obj;
		if (contenu == null) {
			if (other.contenu != null)
				return false;
		} else if (!contenu.equals(other.contenu))
			return false;
		return true;
	}

	public String getContenu() {
		return contenu;
	}

	public void setContenu(String contenu) {
		this.contenu = contenu;
	}

}
