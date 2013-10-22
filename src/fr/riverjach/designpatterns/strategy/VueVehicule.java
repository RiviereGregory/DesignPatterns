package fr.riverjach.designpatterns.strategy;

public class VueVehicule {
	protected String description;

	public VueVehicule(String description) {
		super();
		this.description = description;
	}

	public void dessine() {
		System.out.print(description);
	}
}
