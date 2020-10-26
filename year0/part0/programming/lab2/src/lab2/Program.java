package lab2;

import java.util.Enumeration;
import java.util.ListResourceBundle;

import mypokemons.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Messages_en;
import ru.ifmo.se.pokemon.Pokemon;
import sun.misc.resources.Messages;

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
		
		Stunky p1 = new Stunky("Apple", 1);
		Marshadow p2 = new Marshadow("Coconut", 1);
		Skutank p3 = new Skutank("Tomato", 1);
		Deino p4 = new Deino("Beetroot", 1);
		Zweilous p5 = new Zweilous("Pineapple", 1);
		Hydreigon p6 = new Hydreigon("Carrot", 1);
				
		b.addAlly(p1);
		b.addAlly(p3);
		b.addAlly(p5);
		
		b.addFoe(p2);
		b.addFoe(p4);
		b.addFoe(p6);
		
		b.go();
		
	}
	
}
