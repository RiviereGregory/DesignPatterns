package fr.riverjach.designpatterns.builder;

public class LiasseHtml extends Liasse {

	@Override
	public void ajouteDocument(String document) {
		if (document.startsWith("<HTML>")) {
			getContenu().add(document);
		}

	}

	@Override
	public void imprime() {
		System.out.println("Liase HTML");
		for (String s : getContenu()) {
			System.out.println(s);
		}

	}

}
