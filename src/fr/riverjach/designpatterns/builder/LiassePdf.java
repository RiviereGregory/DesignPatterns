package fr.riverjach.designpatterns.builder;

public class LiassePdf extends Liasse {

	@Override
	public void ajouteDocument(String document) {
		if (document.startsWith("<PDF>")) {
			contenu.add(document);
		}

	}

	@Override
	public void imprime() {
		System.out.println("Liase PDF");
		for (String s : contenu) {
			System.out.println(s);
		}

	}

}
