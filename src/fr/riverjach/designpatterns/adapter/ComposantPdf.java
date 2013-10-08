package fr.riverjach.designpatterns.adapter;

public class ComposantPdf {
	protected String contenu;

	public ComposantPdf() {
	}

	public void pdfFixeContenu(String contenu) {
		this.contenu = contenu;
	}

	public void pdfPrepareAffichage() {
		System.out.println("Affichage PDF : Début");
	}

	public void pdfRafraichit() {
		System.out.println("Affichage contenu PDF : " + getContenu());
	}

	public void pdfTermineAffichage() {
		System.out.println("Affichage PDF : Fin");
	}

	public void pdfEnvoieImprimante() {
		System.out.println("Impression PDF : " + getContenu());
	}

	@Override
	public String toString() {
		return "ComposantPdf [contenu=" + contenu + "]";
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
		ComposantPdf other = (ComposantPdf) obj;
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
