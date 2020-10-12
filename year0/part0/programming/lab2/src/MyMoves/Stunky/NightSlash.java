package MyMoves.Stunky;

import lab2.MyUtils;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class NightSlash extends PhysicalMove {

	public NightSlash(double power, double acc) {
		super(Type.DARK, power, acc);
	}
	
	@Override
	protected void applyOppDamage(Pokemon def, double damage) {
		super.applyOppDamage(def, damage);
	}
	
	@Override
	protected double calcCriticalHit(Pokemon att, Pokemon def) {
		return 1d / 8d;
	}
	
	@Override
	protected String describe() {
		String[] pieces = this.getClass().toString().split("\\.");	
		return "does " + pieces[pieces.length-1];
	}
	
}
