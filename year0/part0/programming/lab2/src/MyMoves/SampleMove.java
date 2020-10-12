package MyMoves;

import lab2.MyUtils;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class SampleMove extends SpecialMove {

	
	public SampleMove(double power, double acc) {
		super(Type.ELECTRIC, power, acc);
	}
	
	@Override
	protected void applyOppDamage(Pokemon def, double damage) {
		super.applyOppDamage(def, damage);
		
		if(MyUtils.Chance(1)) {
			Effect e = new Effect();
			
			System.out.println(def.toString() + " ");
		}
	}

	@Override
	protected String describe() {
		String[] pieces = this.getClass().toString().split("\\.");	
		return "does " + pieces[pieces.length-1];
	}
	
}
