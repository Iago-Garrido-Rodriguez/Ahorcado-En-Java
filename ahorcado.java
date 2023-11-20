package extras;

import java.util.Arrays;
import java.util.Scanner;

public class Extra2 {

	public static void main(String[] args) {
		int counter = 0;
		Scanner reader = new Scanner(System.in);
		System.out.println("Introduzca una palabra para jugar al ahorcado");
        String word = reader.next();
        String board[] = new String[word.length()];
        for(int k = 0;k< board.length;k++) {
        	board[k] = "_ ";
        }
        boolean lowBarFound = false;
        boolean wordResolved = false;
        int mistakes = 0;
        while(mistakes < 5 || wordResolved == false) {
        System.out.println("Introduzca una letra");
        String letter = reader.next();
        int letterPosition = 0;
       
        if(word.contains(letter)) {
        	
        	System.out.println("Acierto");
        	for(int k = 0;k<word.length();k++) {
        	letterPosition = word.indexOf(letter,k);
        	if (letterPosition == -1)
        		break;
        	board[letterPosition] = letter;
        	}
        }else {
        
      
        mistakes +=1;
        	System.out.println("Fallo, número de fallos = " + mistakes);
        }
        for(int k = 0;k< board.length;k++) {
        	 System.out.print(board[k]);
        }
        System.out.println();
        boolean equals = false;
        		
        String wordCopy[] = new String[board.length];
        
        	
        for(int k = 0;k<word.length();k++) {
        wordCopy[k] = Character.toString(word.charAt(k));
        
        }
       
        	if(board[counter].charAt(0) == wordCopy[counter].charAt(0)) {
        	equals = true;
        	counter +=1 ;
        	}
        	
        else
        { 
        	equals = false;
        	if(mistakes >= 5 ) {
        		System.out.println("Has perdido");
        		System.exit(0);
        	}
        	
        }
        
        
        if(counter == word.length() && equals  == true) {
        	wordResolved = true;
        	System.out.println("Has ganado");
        	System.exit(0);
        	
        }



System.out.println();

 
        }
        }

	}
	
