package lab2;

import mypokemons.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class Program {

	// https://pokemondb.net/pokedex/marshadow
	// https://pokemondb.net/pokedex/stunky
	// https://pokemondb.net/pokedex/skuntank
	// https://pokemondb.net/pokedex/deino
	// https://pokemondb.net/pokedex/zweilous
	// https://pokemondb.net/pokedex/hydreigon
	
	public static void main(String[] args) {
		start();
	}
	
	private static void start() {
		Battle b = new Battle();
		
		Stunky p1 = new Stunky("Чужой", 1);
		Marshadow p2 = new Marshadow("Хищник", 1);
		Skutank p3 = new Skutank("Яблоко", 1);
		Deino p4 = new Deino("Дед инсайд", 1);
		Zweilous p5 = new Zweilous("Арбуз", 1);
		Hydreigon p6 = new Hydreigon("Пёс", 1);
		
		b.addAlly(p1);
		b.addAlly(p3);
		b.addAlly(p5);
		
		b.addFoe(p2);
		b.addFoe(p4);
		b.addFoe(p6);
		
		b.go();
		
	}
	
}
