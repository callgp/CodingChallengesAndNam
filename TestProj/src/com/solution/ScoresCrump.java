package com.solution;

public class ScoresCrump {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = { 2, 4, 5, 7 };
		System.out.println("value is===>" + scoresClump(ar));
	}

	public static boolean scoresClump(int[] scores) {

		for (int i = 0; i < scores.length - 2; i = i + 1) {
			if ((scores[i + 2] - scores[i]) == 2) {
				//if ((scores[i + 2] - scores[i]) == 2) {
					System.out.println("i is is--->" + i);
					return true;
				//}

			}

		}
		return false;

	}

}
