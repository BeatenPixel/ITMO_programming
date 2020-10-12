package MyPokemons;

import MyMoves.Deino.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Hydreigon extends Pokemon {

	public Hydreigon(String name, int level) {
		super(name, level);
		
		super.setType(Type.DARK, Type.DRAGON);
		
		super.setStats(92, 105, 90, 125, 90, 98);
		
		DragonPulse dragonPulse = new DragonPulse(85, 100);
		Bite bite = new Bite(60,100);
		DoubleHit doubleHit = new DoubleHit(35,90);
		Slam slam = new Slam(80,75);
		
		super.setMove(dragonPulse, bite, doubleHit, slam);
	}
	
}
