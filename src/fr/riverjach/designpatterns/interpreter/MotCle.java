package fr.riverjach.designpatterns.interpreter;

public class MotCle extends Expression {
	protected String motCle;

	public MotCle(String motCle) {
		this.motCle = motCle;
	}

	@Override
	public boolean evalue(String description) {
		return description.indexOf(motCle) != -1;
	}

	// partie analyse syntaxique
	public static Expression parse() throws Exception {
		Expression resultat;
		resultat = new MotCle(jeton);
		prochainJeton();
		return resultat;
	}

}
