package fr.riverjach.designpatterns.proxy;

public class AnimationProxy implements Animation {

	protected Film film = null;
	protected String photo = "affichage de la photo";

	@Override
	public void dessine() {
		if (film != null) {
			film.dessine();
		} else {
			dessine(photo);
		}

	}

	@Override
	public void clic() {
		if (film == null) {
			film = new Film();
			film.charge();
		}
		film.joue();
	}

	public void dessine(String photo) {
		System.out.println(photo);
	}

}
