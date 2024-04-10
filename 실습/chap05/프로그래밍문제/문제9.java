package 프로그래밍문제;

import java.util.Scanner;

public class 문제9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("행 : ");
	    int line = in.nextInt();
	    System.out.print("열 : ");
	    int row = in.nextInt();
	    System.out.print("지로가 있을 확률 : ");
	    double occurMinePercentage = in.nextDouble();
	    String HideMine = "*";
	    String NotHideMine = "-";
	    double hideoccurMinePercentage = 0;
	    int arroundMineCount = 0;
	    String Mine1[][] = new String[line][row];
	    System.out.println(Mine1.length);
	    for(int i = 0; i<Mine1.length; i++) {
	    	for(int j = 0; j<Mine1[i].length; j++) {
	    	hideoccurMinePercentage = Math.random();
	    	Mine1[i][j] = "";
	    	if(hideoccurMinePercentage < occurMinePercentage) {
	    		Mine1[i][j] += HideMine;
	    	}
	    	else {
	    		Mine1[i][j] += NotHideMine;
	    	}
	    	System.out.printf(Mine1[i][j]);
	    	if(j==Mine1[i].length-1) {
	    		System.out.println();
	    	}
	    	}
	    		 
	    }
	    System.out.println("\n");
	    for(int i = 0; i< Mine1.length; i++) {
	    	for(int j = 0; j<Mine1[i].length; j++) {
	    		if(Mine1[i][j].equals("-")) {
	    			arroundMineCount = 0;
	    			Mine1[i][j] = "";
	    			if(i == 0) {
	    				if(j == 0) {
	    					if(Mine1[i][j+1].equals("*"))
	    						arroundMineCount++;
	    					if(Mine1[i+1][j].equals("*"))
	    						arroundMineCount++;
	    					if(Mine1[i+1][j+1].equals("*"))
	    						arroundMineCount++;
	    				}
	    				else if(j == Mine1[i].length - 1) {
	    					if(Mine1[i][j-1].equals("*"))
	    						arroundMineCount++;
	    					if(Mine1[i+1][j-1].equals("*"))
	    						arroundMineCount++;
	    					if(Mine1[i+1][j].equals("*"))
	    						arroundMineCount++;
	    			}
	    				else{
	    					if(Mine1[i][j-1].equals("*"))
	    						arroundMineCount++;
	    					if(Mine1[i][j+1].equals("*"))
	    						arroundMineCount++;
	    					if(Mine1[i+1][j-1].equals("*"))
	    						arroundMineCount++;
	    					if(Mine1[i+1][j].equals("*"))
	    						arroundMineCount++;
	    					if(Mine1[i+1][j+1].equals("*"))
	    						arroundMineCount++;
	    				}
	    		}
	    			else if(i == Mine1.length - 1) {
	    				if(j == 0) {
	    					if(Mine1[i-1][j].equals("*"))
	    						arroundMineCount++;
	    					if(Mine1[i-1][j+1].equals("*"))
	    						arroundMineCount++;
	    					if(Mine1[i][j+1].equals("*"))
	    						arroundMineCount++;
	    				}
	    				else if(j == Mine1[i].length - 1) {
	    					if(Mine1[i-1][j-1].equals("*"))
	    						arroundMineCount++;
	    					if(Mine1[i-1][j].equals("*"))
	    						arroundMineCount++;
	    					if(Mine1[i][j-1].equals("*"))
	    						arroundMineCount++;
	    				}
	    				else {
	    					if(Mine1[i-1][j-1].equals("*"))
	    						arroundMineCount++;
	    					if(Mine1[i-1][j].equals("*"))
	    						arroundMineCount++;
	    					if(Mine1[i-1][j+1].equals("*"))
	    						arroundMineCount++;
	    					if(Mine1[i][j-1].equals("*"))
	    						arroundMineCount++;
	    					if(Mine1[i][j+1].equals("*"))
	    						arroundMineCount++;
	    				}
	    			}
	    			else {
	    				if(j == 0) {
	    					if(Mine1[i-1][j].equals("*"))
	    						arroundMineCount++;
	    					if(Mine1[i-1][j+1].equals("*"))
	    						arroundMineCount++;
	    					if(Mine1[i][j+1].equals("*"))
	    						arroundMineCount++;
	    				}
	    				else if(j == Mine1[i].length - 1) {
	    					if(Mine1[i-1][j-1].equals("*"))
	    						arroundMineCount++;
	    					if(Mine1[i-1][j].equals("*"))
	    						arroundMineCount++;
	    					if(Mine1[i][j-1].equals("*"))
	    						arroundMineCount++;
	    					if(Mine1[i+1][j-1].equals("*"))
	    						arroundMineCount++;
	    					if(Mine1[i+1][j].equals("*"))
	    						arroundMineCount++;
	    				}
	    				else {
	    					if(Mine1[i-1][j-1].equals("*"))
	    						arroundMineCount++;
	    					if(Mine1[i-1][j].equals("*"))
	    						arroundMineCount++;
	    					if(Mine1[i-1][j+1].equals("*"))
	    						arroundMineCount++;
	    					if(Mine1[i][j-1].equals("*"))
	    						arroundMineCount++;
	    					if(Mine1[i][j+1].equals("*"))
	    						arroundMineCount++;
	    					if(Mine1[i+1][j-1].equals("*"))
	    						arroundMineCount++;
	    					if(Mine1[i+1][j].equals("*"))
	    						arroundMineCount++;
	    					if(Mine1[i+1][j+1].equals("*"))
	    						arroundMineCount++;
	    				}
	    			}
	    			Mine1[i][j] = String.valueOf(arroundMineCount);
	    	}
	    		System.out.printf(Mine1[i][j]);
	    		if(j == Mine1[i].length - 1) {
	    			System.out.println();
	    		}
	    }
	    

	}

	}
}
