package eval_personnage_arme;

import java.util.Random;

public class Player {
// Attributes
	private String name;
	private int health;
	Random random = new Random();
	private int strength;
	private int xp;
	
	private Arme arme;
// Constructor
	public Player(String name, int strength) {
		super();
		this.name = name;
		this.health = 10;
		this.strength = random.nextInt(6)+5;
		this.xp = 1;
	}
//Getter Setter
	public String getName() {
		return name;
	}
	
	public int getHealth() {
		return health;
	}

	public Random getRandom() {
		return random;
	}

	public int getStrength() {
		return strength;
	}

	public int getXp() {
		return xp;
	}

	public Arme getArme() {
		return arme;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public void setRandom(Random random) {
		this.random = random;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public void setXp(int xp) {
		this.xp = xp;
	}

	public void setArme(Arme arme) {
		this.arme = arme;
	}
	
// toString
	@Override
	public String toString() {
		if(this.arme == null) {
			return name + " [health=" + health +  ", strength=" + strength + ", xp="
			+ xp + "]";
			
		} else {
			return name + " [health=" + health +  ", strength=" + strength + ", xp="
					+ xp + "] "+ this.arme.getName()+ " [Type d'arme: " + arme.getTypeArme() + ", Force: " + arme.getPower() + "]";
		}
	}
// Method 
	public void disarm(Arme arme) {
		this.arme = null;
	}
	public void switchArme(Arme arme) {
		this.arme = arme;
	}
	
	public void attack(Player player) {
		if
		(this.health == 0 )
		{
			System.out.println("Le personnage "+ getName()+" est mort.");
			return;
		}
		if
		(player.getHealth() == 0 ) {
			System.out.println("Le personnage "+ player.getName()+" est mort.");
			return;
		}
		if 
		(this.strength * this.health * this.xp * this.arme.getPower() == player.strength * player.health * player.xp * player.arme.getPower())
		{
			System.out.println("Ceci est un combat de titan. Il n'y aura aucun vainqueur");
			return;
		}
		if 
		(this.strength * this.health * this.xp * this.arme.getPower() > player.strength * player.health * player.xp * player.arme.getPower()) 
		{
			 player.setHealth(player.getHealth()-1);
			 this.setXp(getXp()+1);
			 
			
		} else if 
		(this.strength * this.health * this.xp * this.arme.getPower() < player.strength * player.health * player.xp * player.arme.getPower())
		{
			this.setHealth(this.getHealth()-1);
			player.setXp(player.getXp()+1);
		} 
	}
}
	
	
