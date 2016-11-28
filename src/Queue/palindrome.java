package Queue;

import java.util.Scanner;
/*
 * this methond don't use any queue or linkedlist*/
public class palindrome {

	public static void main(String[] args) {
		 
		Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        char[] s = input.toCharArray();
        boolean flag =true ;
        int length = s.length;
        for(int index =0 ;index < length/2;index++){
        	if(s[index] != s[length-index-1]){
        		flag = false ;
        		break ;
        	}
        }
        System.out.println(input+" is " + (flag ?"a palindrome":"not a palindrome!"));
	}

}
