package MyMoves.Marshadow;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class ThunderPunch extends PhysicalMove {

	public ThunderPunch(double power, double acc) {
		super(Type.ELECTRIC, power, acc);
	}
	
	@Override
	protected String describe() {
		String[] pieces = this.getClass().toString().split("\\.");	
		return "does " + pieces[pieces.length-1];
	}
	
}
