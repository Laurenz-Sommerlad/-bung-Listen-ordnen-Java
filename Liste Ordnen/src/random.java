import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class random {

	
	public static void main(String[] args) {
		List<Double> Liste = new ArrayList<Double>();
		Map<Double, Character> bibliothek = new HashMap<Double, Character>(); 
		for (int i = 0; i < 100; i++) {
		    double Zufallszahl = Math.random() * 1000;
//		    System.out.println(Zufallszahl)
		    Liste.add(Zufallszahl);
		    bibliothek.put(Zufallszahl, 'C');
		
		    
		}
//		System.out.println(count);
//		for(Double wort:Liste) {
//			System.out.println(wort);
//		}
		System.out.println(Liste);
		Collections.sort(Liste, new Comparator<Double>() {
		    @Override
		    public int compare(Double o1, Double o2) {
		        return o1.compareTo(o2);
		    }
		});
		System.out.println(Liste);

		System.out.println(bibliothek);
	}
}
