package fr.riverjach.designpatterns.adapter;

public class Main {

	public static void main(String[] args) {
		Document document1, document2;
		document1 = new DocumentHtml();
		document1.setContenu("Hello");
		document1.dessine();
		System.out.println();

		document2 = new DocumentPdf();
		document2.setContenu("Bonjour");
		document2.dessine();

	}

}
