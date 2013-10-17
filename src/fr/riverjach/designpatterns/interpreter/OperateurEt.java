package fr.riverjach.designpatterns.interpreter;

public class OperateurEt extends OperateurBinaire {

	public OperateurEt(Expression operandeGauche, Expression operandeDroite) {
		super(operandeGauche, operandeDroite);
	}

	@Override
	public boolean evalue(String description) {
		return operandeGauche.evalue(description) && operandeDroite.evalue(description);
	}

	// Partie analyse syntaxique
	public static Expression parse() throws Exception {
		Expression resultatGauche, resultatDroit;
		resultatGauche = Expression.parse();
		while ((jeton != null) && (jeton.equalsIgnoreCase("et"))) {
			prochainJeton();
			resultatDroit = Expression.parse();
			resultatGauche = new OperateurEt(resultatGauche, resultatDroit);
		}
		return resultatGauche;
	}

}
