package fr.riverjach.designpatterns.interpreter;

public abstract class OperateurBinaire extends Expression{
	protected Expression operandeGauche , operandeDroite;

	public OperateurBinaire(Expression operandeGauche, Expression operandeDroite) {
		super();
		this.operandeGauche = operandeGauche;
		this.operandeDroite = operandeDroite;
	}
	
	
}
