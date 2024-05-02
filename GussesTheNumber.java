package com.main;
import java.util.Random;
import java.util.Scanner;

public class GussesTheNumber {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Random random = new Random();

	        int lowerBound = 1;
	        int upperBound = 100;
	        int randomNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
	        int maxAttempts = 5;
	        int attempts = 0;

	        System.out.println("Welcome to Guess the Number Game!");
	        System.out.println("I have selected a number between " + lowerBound + " and " + upperBound);

	        while (attempts < maxAttempts) {
	            System.out.print("Enter your guess: ");
	            int guess = scanner.nextInt();
	            scanner.nextLine(); // consume newline

	            if (guess == randomNumber) {
	                System.out.println("Congratulations! You guessed the number in " + (attempts + 1) + " attempts.");
	                break;
	            } else if (guess < randomNumber) {
	                System.out.println("The number is higher than your guess.");
	            } else {
	                System.out.println("The number is lower than your guess.");
	            }

	            attempts++;

	            if (attempts == maxAttempts) {
	                System.out.println("Sorry, you've used all your attempts. The number was " + randomNumber);
	            }
	        }
	    }
	}

