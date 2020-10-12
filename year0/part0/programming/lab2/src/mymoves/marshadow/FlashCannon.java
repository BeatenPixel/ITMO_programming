package mymoves.marshadow;

import lab2.MyUtils;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class FlashCannon extends SpecialMove {

	public FlashCannon(double power, double acc) {
		super(Type.STEEL, power, acc);
	}
	
	@Override
	protected void applyOppDamage(Pokemon def, double damage) {
		super.applyOppDamage(def, damage);
		
		if(MyUtils.chance(0.1)) {
			Effect e = new Effect().turns(-1).stat(Stat.SPECIAL_DEFENSE, -1);
			def.addEffect(e);
			System.out.println(def.toString() + " looses 1 special defense");
		}
	}
	
	@Override
	protected String describe() {
		String[] pieces = this.getClass().toString().split("\\.");	
		return "does " + pieces[pieces.length-1];
	}
	
}
