package MyPokemons;

import MyMoves.Marshadow.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Marshadow extends Pokemon {

	public Marshadow(String name, int level) {
		super(name, level);
		
		super.setType(Type.FIGHTING, Type.GHOST);
		
		super.setStats(90, 125, 80, 90, 90, 125);
		
		ThunderPunch thunderPunch = new ThunderPunch(75,100);
		Swagger swagger = new Swagger(85);
		IcePunch icePunch = new IcePunch(75,100);
		FlashCannon flashCannon = new FlashCannon(80,100);
		
		super.setMove(thunderPunch,swagger,icePunch, flashCannon);
	}
	
}
