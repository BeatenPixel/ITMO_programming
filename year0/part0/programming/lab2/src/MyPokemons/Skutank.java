package MyPokemons;

import MyMoves.Stunky.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Skutank extends Pokemon {

	public Skutank(String name, int level) {
		super(name, level);
		
		super.setType(Type.POISON, Type.DARK);
		
		super.setStats(103, 93, 67, 71, 61, 84);
		
		DarkPulse darkPulse = new DarkPulse(80,100);
		NightSlash nightSlash = new NightSlash(70,100);
		AcidSpray acidSpray = new AcidSpray(40,100);
		PoisonJab poisonJab = new PoisonJab(80,100);
		
		super.setMove(darkPulse, nightSlash, acidSpray, poisonJab);
	}
	
}
