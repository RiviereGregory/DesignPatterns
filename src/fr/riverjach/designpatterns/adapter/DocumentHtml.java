package fr.riverjach.designpatterns.adapter;

public class DocumentHtml implements Document {

	protected String contenu;

	public DocumentHtml() {
	}

	public DocumentHtml(String contenu) {
		super();
		this.contenu = contenu;
	}

	@Override
	public void setContenu(String contenu) {
		this.contenu = contenu;

	}

	@Override
	public void dessine() {
		System.out.println("Dessine document HTML : " + getContenu());
	}

	@Override
	public void imprime() {
		System.out.println("Imprime document HTML : " + getContenu());
	}

	@Override
	public String toString() {
		return "DocumentHtml [contenu=" + contenu + "]";
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
		DocumentHtml other = (DocumentHtml) obj;
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

}
