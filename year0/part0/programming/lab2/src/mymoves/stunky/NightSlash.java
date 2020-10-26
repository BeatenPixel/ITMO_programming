package mymoves.stunky;

import lab2.MyUtils;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Messages;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
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
		if(att.getStat(Stat.SPEED) / 8.0D > Math.random()) {
			System.out.println("Critical hit!");
			return 2.0D;
		} else {
			return 1.0D;
		}
	}
	
	@Override
	protected String describe() {
		String[] pieces = this.getClass().toString().split("\\.");	
		return "does " + pieces[pieces.length-1];
	}
	
}
