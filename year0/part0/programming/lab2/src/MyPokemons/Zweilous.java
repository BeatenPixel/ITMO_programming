package MyPokemons;

import MyMoves.Deino.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Zweilous extends Pokemon {

	public Zweilous(String name, int level) {
		super(name, level);
		
		super.setType(Type.DARK, Type.DRAGON);
		
		super.setStats(72, 85, 70, 65, 70, 58);
		
		DragonPulse dragonPulse = new DragonPulse(85, 100);
		Bite bite = new Bite(60,100);
		DoubleHit doubleHit = new DoubleHit(35,90);
		
		super.setMove(dragonPulse, bite, doubleHit);
	}
	
	
}
