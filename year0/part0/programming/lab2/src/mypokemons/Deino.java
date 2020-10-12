package mypokemons;

import mymoves.deino.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Deino extends Pokemon {

	public Deino(String name, int level) {
		super(name, level);
		
		super.setType(Type.DARK, Type.DRAGON);
		
		super.setStats(52, 65, 50, 45, 50, 38);
		
		DragonPulse dragonPulse = new DragonPulse(85, 100);
		Bite bite = new Bite(60,100);
		
		super.setMove(dragonPulse, bite);
	}
	
}
