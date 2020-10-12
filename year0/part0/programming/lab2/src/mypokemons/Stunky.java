package mypokemons;

import mymoves.stunky.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Stunky extends Pokemon {

	public Stunky(String name, int level) {
		super(name, level);
		
		super.setType(Type.POISON, Type.DARK);
		
		super.setStats(63, 63, 47, 41, 41, 74);
		
		DarkPulse darkPulse = new DarkPulse(80,100);
		NightSlash nightSlash = new NightSlash(70,100);
		AcidSpray acidSpray = new AcidSpray(40,100);
		
		super.setMove(darkPulse, nightSlash, acidSpray);
	}
	
}
