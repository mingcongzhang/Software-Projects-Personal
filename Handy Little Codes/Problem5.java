

import java.util.Scanner;
/*

Introduction

A team of developers from New York visits London and decides to try their hands at Rugby. None of them quite remember the exact rules so they just use the rules of American Football where you can score 2, 3 or 7 points at a time.

When they talk to you afterwards, they tell you that the final score of the game was 38 - 0. After facepalming, you are curious to find all possible ways to score 38 points.

Write a program that, given a score X, prints all possible combinations of the messed up conversions (7 points), tries (3 points), and kicks (2 points) that would make up this score.


Input Specifications

Your program will take a target score between 0 and 222.

Output Specifications

Based on the input, print out one row for each combination of messed up conversions, tries, and kicks that would get to that score, each column delimited by a space. The output should be in ascending order of touchdowns, field goals, and then safeties. If the score is not achievable, just output 0 0 0
*/
public class Problem5 {
	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
		int score = Integer.parseInt(stdin.nextLine());
		stdin.close();

		for (int i = 0; i <= score / 7; i++) {
			int afterI = score - 7*i;
			for(int j=0;j<=afterI/3;j++){
				int afterJ = afterI - 3*j;
				if(afterJ%2 == 0){
					int k = afterJ/2;
					System.out.println(i+" "+j+" "+k);
				}
			}
		}
	}
}
