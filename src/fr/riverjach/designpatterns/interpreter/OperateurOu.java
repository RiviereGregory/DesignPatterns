package fr.riverjach.designpatterns.interpreter;

public class OperateurOu extends OperateurBinaire {

	public OperateurOu(Expression operandeGauche, Expression operandeDroite) {
		super(operandeGauche, operandeDroite);
	}

	@Override
	public boolean evalue(String description) {
		return operandeGauche.evalue(description) || operandeDroite.evalue(description);
	}

	// Partie analyse syntaxique
	public static Expression parse() throws Exception {
		Expression resultatGauche, resultatDroit;
		resultatGauche = OperateurEt.parse();
		while ((jeton != null) && (jeton.equalsIgnoreCase("ou"))) {
			prochainJeton();
			resultatDroit = OperateurEt.parse();
			resultatGauche = new OperateurOu(resultatGauche, resultatDroit);
		}
		return resultatGauche;
	}

}
