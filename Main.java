package eval_personnage_arme;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player b = new Player("Batman",753);
		System.out.println(b);
		
		System.out.println("=====VS=====");
		
		Player s = new Player("Superman",159);
		System.out.println(s);
		
		System.out.println("==========");
		
		Arme bat = new Arme("Batarang",Type.PISTOLET,10);
		System.out.println(bat);
		
		System.out.println("==========");
		
		Arme fist = new Arme("Poings",Type.MASSE,10);
		System.out.println(fist);
		
		System.out.println("==========");
		
		b.setArme(bat);
		s.setArme(fist);
		
		System.out.println(b);
		
		System.out.println("=====VS=====");
		
		System.out.println(s);
		
		System.out.println("==========");
		System.out.println("==========");
		System.out.println("==========");
		System.out.println("==========");
		
		b.attack(s);
		System.out.println(b);
		System.out.println(s);
		
		for (int i = 0; i < 100; i++) {
			b.attack(s);
			System.out.println(b);
			System.out.println(s);
// Comment factoriser cette boucle pour quelle fonctionne avec n'importe quel player. 
			if( b.getHealth() == 0 || s.getHealth() == 0) {
				b.attack(s);
				break;
			}
			if(b.getStrength() * b.getHealth() * b.getXp() * bat.getPower() == s.getStrength() * s.getHealth() * s.getXp() * fist.getPower()) {
				b.attack(s);
				break;
			}
		}


	}

		
		
}


