package eval_personnage_arme;

public class Arme {
// Attributes
	private String name;
	private Type typeArme;
	private int power;
// Constructor	
	public Arme(String name, Type typeArme, int power) {
		super();
		this.name = name;
		this.typeArme = typeArme;
		this.power = power;
	}
// Getter Setter
	public String getName() {
		return name;
	}
	public Type getTypeArme() {
		return typeArme;
	}
	public int getPower() {
		return power;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setTypeArme(Type typeArme) {
		this.typeArme = typeArme;
	}
	public void setPower(int power) {
		this.power = power;
	}
// toString
	@Override
	public String toString() {
		
		return name + " [Type d'arme: " + typeArme + ", Force: " + power + "]";
	}
}
