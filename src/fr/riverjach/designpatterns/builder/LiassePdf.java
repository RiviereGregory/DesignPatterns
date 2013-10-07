package fr.riverjach.designpatterns.builder;

public class LiassePdf extends Liasse {

	@Override
	public void ajouteDocument(String document) {
		if (document.startsWith("<PDF>")) {
			getContenu().add(document);
		}

	}

	@Override
	public void imprime() {
		System.out.println("Liase PDF");
		for (String s : getContenu()) {
			System.out.println(s);
		}

	}

}
