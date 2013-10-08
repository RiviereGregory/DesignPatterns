package fr.riverjach.designpatterns.adapter;

public class DocumentPdf implements Document {

	// Va nous servire a adapter le composantPdf à l'interface document
	protected ComposantPdf outilPdf = new ComposantPdf();

	public DocumentPdf() {
	}

	@Override
	public void setContenu(String contenu) {
		outilPdf.pdfFixeContenu(contenu);
	}

	@Override
	public void dessine() {
		outilPdf.pdfPrepareAffichage();
		outilPdf.pdfRafraichit();
		outilPdf.pdfTermineAffichage();
	}

	@Override
	public void imprime() {
		outilPdf.pdfEnvoieImprimante();
	}

}
