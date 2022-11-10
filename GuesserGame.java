package com.sai.projects;

import java.util.Scanner;

class Guesser {
	int guesserNum, low = 1, high = 10;

	int guessNum() {
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Hey Guesser - Kindly guess some number between 1 and 10");
			guesserNum = sc.nextInt();
			if (!(low <= guesserNum && guesserNum <= high)) {
				System.out.println("Number not in range 1 and 10");
			} else {
				break;
			}
		}
		return guesserNum;
	}
}

class Player {
	int playerNum, low = 1, high = 10;
	Scanner sc = new Scanner(System.in);

	int guessNum() {
		while (true) {
			System.out.println("Hey Player - guess the number guessed by the guesser");
			playerNum = sc.nextInt();
			if (!(low <= playerNum && playerNum <= high)) {
				System.out.println("Number not in range 1 and 10");
			} else {
				break;
			}
		}
		return playerNum;
	}
}

class Umpire {
	int guesserNum, player1Num, player2Num, player3Num;
	Scanner sc = new Scanner(System.in);

	void collectNumFromGuesser() {
		Guesser g = new Guesser();
		guesserNum = g.guessNum();
	}

	void collectNumFromPlayers() {
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();
		player1Num = p1.guessNum();
		player2Num = p2.guessNum();
		player3Num = p3.guessNum();
	}

	void compare() {
		if (player1Num == guesserNum) {
			if (player2Num == guesserNum && player3Num == guesserNum) {
				System.out.println("All 3 players guessed the number!!");
			} else if (player2Num == guesserNum) {
				System.out.println("Player1 and Player2 won the game!!");
			} else if (player3Num == guesserNum) {
				System.out.println("Player1 and Player3 won the game!!");
			}
		} else if (player2Num == guesserNum) {
			if (player3Num == guesserNum) {
				System.out.println("Player2 and Player3 won the game!!");
			} else {
				System.out.println("Player2 won the game!!");
			}
		} else if (player3Num == guesserNum) {
			System.out.println("Player3 won the game!!");
		} else {
			System.out.println("Game lost Try Again!!");
		}
	}
}

public class GuesserGame {

	public static void main(String[] args) {
		Umpire u = new Umpire();
		u.collectNumFromGuesser();
		u.collectNumFromPlayers();
		u.compare();
	}
}
