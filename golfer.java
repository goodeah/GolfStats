//Aaron Goode
//Calculates the score of a golfer
//Exam2

import java.util.Arrays;
public class golfer {

	public static void main(String[] args) {
//PART 1
		int [] parList= {4,3,5,4};
		int [] golferShots={3,4,3,4};
		int [] atPar=calcAtPar(golferShots,parList);
		String [] golferRatings = assignScores(calcAtPar(golferShots,parList));		

				
		calcFinal(parList,golferShots,atPar,golferRatings);
			}

//PART 2
	public static int [] calcAtPar(int [] golferArray, int [] possible){
		int [] parArray = new int [golferArray.length];
		for(int i=0; i<golferArray.length;i++){
			parArray[i]= (int) golferArray[i]-possible[i];
		}
		return parArray;
	}
	
	public static String[] assignScores(int [] calcScore){
		String [] parArray = new String [calcScore.length];
		for(int i=0; i<calcScore.length;i++){
			if(calcScore[i]==-2){
				parArray[i]="Eagle";
			}
			else if (calcScore[i]==-1){
				parArray[i]="Birdie";
			}
			else if (calcScore[i]==0){
				parArray[i]="Par";
			}
			else{
				parArray[i]="Bogey";
			}
		}
		return parArray;
	}
	
	public static int calcTotal(int[] iArray){
		int total=0;
		for(int i=0; i<iArray.length;i++){
			total+=iArray[i];
		}
		return total;
	}	
	
//PART 3
	public static void calcFinal(int[] possible, int[]golfer, int [] par, String [] score){
		System.out.println("Par Ratings: "+Arrays.toString(possible));
		System.out.println("Golfer Strokes: "+Arrays.toString(golfer));
		System.out.println("Golfer Over/Under: "+Arrays.toString(par));
		System.out.println("Golfer Rating: "+Arrays.toString(score));
		System.out.println("Final Score: "+calcTotal(par));

	}

}
