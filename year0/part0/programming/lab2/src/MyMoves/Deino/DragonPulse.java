package MyMoves.Deino;

import lab2.MyUtils;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class DragonPulse extends SpecialMove {

	public DragonPulse(double power, double acc) {
		super(Type.DRAGON, power, acc);
	}
	
	@Override
	protected void applyOppDamage(Pokemon def, double damage) {
		super.applyOppDamage(def, damage);
	}

	@Override
	protected String describe() {
		String[] pieces = this.getClass().toString().split("\\.");	
		return "does " + pieces[pieces.length-1];
	}
	
}
