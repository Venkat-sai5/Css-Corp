package assignment;
//11
public class display_five_value {

	public static void main(String[] args) {
		int[]arr= {0,0,0,0,0,0,0,0,0,0};
		int[]bonus;
		bonus=new int[15];
		for (int i=0; i<15; i++) {
			bonus[i]+=1;
		}
		int bestScore[]= {10,20,30,40,50};
		for (int i=0;i<5; i++) {
			System.out.printf("%d\t",bestScore[i]);
		}

	}

}
