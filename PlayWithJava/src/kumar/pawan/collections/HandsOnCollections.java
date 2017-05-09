package kumar.pawan.collections;

import java.util.*;

public class HandsOnCollections {

	public static void main(String[] args) {
		
		Set<String> noDups = new HashSet<>();
		for(String str: args){
			noDups.add(str);
		}
		System.out.println(noDups.size() + " Distinct Words in Random order: " + noDups);
		Set<String> noDupsOrdered = new TreeSet<>(Arrays.asList(args));
		
		
		noDupsOrdered.add("hello");
		
		/*for(String str: args){
			noDupsOrdered.add(str);
		}
		for(Iterator<String> itr = noDupsOrdered.iterator(); itr.hasNext();){
			System.out.print(itr.next() + " ");
		}*/
		
		System.out.println("\n" + noDupsOrdered.size() + " Distinct Words in Insertion Order: " + noDupsOrdered);
		
	}

}
