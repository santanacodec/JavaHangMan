/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.hangman;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author <Edgar Santana>
 */
public class Hangman {

	// HI JIMMY
	
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	String word;
	int answer;
	ArrayList<String> letter = new ArrayList<String>();
	    
	System.out.println("LETS PLAY HANGMAN");
	System.out.println("Please enter a word to guess");
	word = input.nextLine();
	
	for(int i = 0; i < word.length(); i++) {
		char character = word.charAt(i);
		
		letter.add(Character.toString(character));
	}
	
	System.out.println(letter);

    }
    
    
//    public int wrongCount(String word, int answer) {
//	    for(int i = 0; i < word.length(); i++) {
//		    System.out.println(word.charAt(i));
//	    }
//    }
//    
    public String hangman(int wrongCounter){
        switch(wrongCounter) {
            case 0:
                return (" +---+\n" +
                        "     |\n" +
                        "     |\n" +
                        "     |\n" +
                        "    ===");
            case 1:
                return (" +---+\n" +
                        " O   |\n" +
                        "     |\n" +
                        "     |\n" +
                        "    ===");
            case 2:
                return (" +---+\n" +
                        " O   |\n" +
                        " |   |\n" +
                        "     |\n" +
                        "    ===");
            case 3:
                return (" +---+\n" +
                        " O   |\n" +
                        " |   |\n" +
                        " |   |\n" +
                        "    ===");
            case 4:
                return (" +---+\n" +
                        " O   |\n" +
                        "-|   |\n" +
                        " |   |\n" +
                        "    ===");
            case 5:
                return (" +---+\n" +
                        " O   |\n" +
                        "-|-  |\n" +
                        " |   |\n" +
                        "    ===");
            case 6:
                return (" +---+\n" +
                        " O   |\n" +
                        "-|-  |\n" +
                        " |   |\n" +
                        "/   ===");
            case 7:
                return (" +---+\n" +
                        " O   |\n" +
                        "-|-  |\n" +
                        " |   |\n" +
                        "/ \\ ===");
        }
        return "error";
    }
}


