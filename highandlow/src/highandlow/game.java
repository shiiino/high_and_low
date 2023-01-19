package highandlow;

import java.util.Random;
import java.util.Scanner;

public class game {

	public static void main(String[] args) {
		
		int win = 0;
		int lose = 0;
		
		System.out.println("----------------------- High & Low ---------------------------");
		
		for(int i = 0; i < 5; i++) {
			//自分の数字
	        int cardnum1 = new Random().nextInt(10)+1;
	        System.out.println("あなたの数字は" + cardnum1 + "です");
	        
	        String answer = "";
	        
	        while(!answer.equals("H") || !answer.equals("L")) {
	        	System.out.println("相手の数字が高い場合はHを、低い場合はLを入力してください");
	        	answer = new Scanner(System.in).next();
	        	
	        	if(answer.equals("H") || answer.equals("L")) {
	        		break;
	        	}
	        } 
	        
	        //相手の数字
	        int cardnum2 = new Random().nextInt(10)+1;
	        
	        while(cardnum1 == cardnum2) {
	        	cardnum2 = new Random().nextInt(10)+1;
	        	
	        	if(cardnum1 != cardnum2) {
	        		break;
	        	}
	        }
	        
	        System.out.println("相手の数字は" + cardnum2 + "です");
	        
	        //判定
	        String result = null;
	        if(cardnum1 < cardnum2) {
	        	result = "H";
	        } else {
	        	result = "L";
	        }
	        
	        if(answer.equals(result)){
	            System.out.println("あたり！");
	            System.out.println("---------------------------------------------------------------");
	            win++;
	        } else {
	            System.out.println("はずれ...");
	            System.out.println("---------------------------------------------------------------");
	            lose++;
	        }
	        
		}
		System.out.println("---------------------------------------------------------------");
		System.out.println("結果は" + win + "勝" + lose + "敗です");
		System.out.println("--------------------------ゲーム終了------------------------------");
	}
}