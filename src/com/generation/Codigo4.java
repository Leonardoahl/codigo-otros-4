package com.generation;

import java.util.Scanner;
//added import
//changed some variable names
public class Codigo4 {

	public static void main(String[] args) { //added main method

	    Scanner scan = new Scanner(System.in); // added System.in into the scanner args
	    
	    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
	    String playerOne = scan.nextLine();
	    if(!hasWord(playerOne)) {
	    	playerOne = getCorrectInput(scan);
	    }
	    
	    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
	    // deleted second scanner, there was no need for the second one
	    String playerTwo = scan.nextLine();
	    if(!hasWord(playerTwo)) {
	    	playerTwo = getCorrectInput(scan);
	    }
	    
	    System.out.println(getWinner(playerOne, playerTwo));
	    
	    scan.close();//close both scanners at the end
	}
	
	static String getCorrectInput(Scanner scan) { // function to loop the input for the user till it's correct
		boolean out = false;
		String input;
		do {
			System.out.println("valor invalido (introduzca piedra, papel o tijeras)");
			input = scan.nextLine();
			if(hasWord(input)) {
				out = true;
			}
		} while (!out);
		
		return input;
	}
	
	static boolean hasWord (String word) { // function to validate if the input it's valid
		String rock = "piedra";
		String scissors  = "tijeras";
		String paper = "papel";
		boolean hasWord = false;
		if(word.equals(rock)) {
			hasWord = true;
		}
		if(word.equals(scissors)) {
			hasWord = true;
		}
		if(word.equals(paper)) {
			hasWord = true;
		}
		
		return hasWord;
	}
	
	static String getWinner(String playerOne, String playerTwo) {
		String winner = "";
		 // added the method equals in all comparisons 
	    //changed tijera to tijeras in validation to match the the text the user sees
	    if (playerOne.equals(playerTwo)) { //deleted one extra ")"
	      winner = "empate";
	    } else {
	      
	      switch(playerOne) {
	        case "piedra":
	          if (playerTwo.equals("tijeras")) {
	            winner = "Gana el jugador 1";
	          }
	          break; //added breaks in every case

	        case "papel":
	          if (playerTwo.equals("piedra")) {
	        	winner = "Gana el jugador 1";
	          }//added the closing bracket
	          break;
	        case "tijeras":
	          if (playerTwo.equals("papel")) {
        	    winner = "Gana el jugador 1";
	          }
	          break;
	        default:
	      }
	    }
		;
		return winner;
	}
  
  
}