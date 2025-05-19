package com.example.practice;

public class MinDistanceBtwnWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "the quick the brown quick brown the frog";
        String word1 = "the";
        String word2 = "quick";

        int minDistance = minDistance(sentence, word1, word2);
        System.out.println(minDistance);
	}
	
	public static int minDistance(String sentence, String word1, String word2) {
		String[] words = sentence.split(" ");
		int minDistance = Integer.MAX_VALUE;
		int n1=-1;
		int n2=-1;
		
		for(int i=0; i<words.length; i++) {
			if(word1.equals(words[i])) {
				n1=i;
			}
			else if (word2.equals(words[i])) {
				n2=i;
			}
			
			if(n1!=-1 && n2!=-1) {
				int diff = n1>n2?(n1-n2)-1:(n2-n1)-1;
				if(diff<minDistance) {
					minDistance=diff;
				}
			}
		}
		return minDistance;
	}

}
