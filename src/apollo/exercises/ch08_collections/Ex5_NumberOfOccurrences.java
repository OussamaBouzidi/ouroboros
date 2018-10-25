package apollo.exercises.ch08_collections;

import java.util.HashMap;
import java.util.Map;

public class Ex5_NumberOfOccurrences {

	// This is the main method that is executed as
	// soon as the program starts.
	public static void main(String[] args) {

		// Create a method called printOccurrences(int[] scores)
		//
		int[] scores = {85,93,96,96,92,100,91,85,87,92};
		// printOccurrences(scores)
		//
		// HINT: Use a HashMap to keep track of the counts (K: Integer, V: Integer)
		//
		// Output:
		//  85 - 2
		//  87 - 1
		//  92 - 2
		//  93 - 1
		//  96 - 2
		// 100 - 1
		//

		printOccurences(scores);
		
	}

	public static void printOccurences(int[] scores){

		Map<Integer, Integer> hashmap = new HashMap<>();



		for(int i = 0; i < scores.length; i++){


			for(int j = i+1; j < scores.length; j++){

				if(scores[i] == scores[j] && i!=j) {

					hashmap.put(scores[i], 2);
				}else{
					hashmap.put(scores[i], 1);
				}

			}

		}
		System.out.println(hashmap);







	}

}


/*
for(int element: scores){

		if(hashmap.containsKey(element)){

			hashmap.put(element, hashmap.get(element) + 1);
		}else{
			hashmap.put(element, 1);
		}

		System.out.println(element);
	}
 */