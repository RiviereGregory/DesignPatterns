package fr.riverjach.designpatterns.visitor;

public interface Visiteur {
	void visite(SocieteSansFiliale societe);

	void visite(SocieteMere societe);
}
