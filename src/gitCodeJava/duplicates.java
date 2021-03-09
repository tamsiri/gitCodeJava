package gitCodeJava;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class duplicates {

	
		
		public static void main(String[] args) {
			
			CountDuplicate("java is programing and java is java");
			
		}
		
	  public static void  CountDuplicate(String inputString) {
		  //split
		  String[]words= inputString.split(" ");
		  //create one hash map
		  Map<String,Integer>wordCount= new HashMap<String,Integer>();
		  //chacking each word in the array
		  for(String word:words) {
			  if(wordCount.containsKey(word)){
				  
			  //if word is present
			  wordCount.put(word.toLowerCase(),wordCount.get(word)+1);   
		  }
			  else {
				  wordCount.put(word, 1);
			  }
		  }
	//extracting words from the key from map___wordCount
	Set<String>wordsInString = wordCount.keySet();

	for(String word:wordsInString) {
		if(wordCount.get(word)>1) {
		System.out.println(word+ "  : "  +wordCount.get(word));	
			
		}
	}


	 
		  
		  
		  
	  }
	
	
		
		

	}


