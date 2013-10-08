package fr.riverjach.designpatterns.prototype;

public class CertificatCession extends Document {

	@Override
	public void imprime() {
		System.out.println("Imprime le certificat de cession : " + getContenu());
	}

	@Override
	public void affiche() {
		System.out.println("Affiche le certificat de cession : " + getContenu());
	}

}
