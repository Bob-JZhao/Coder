package Coder;

public class TenBaseToBinary {
	/**
	 *  Given a base- integer, , convert it to binary (base-). 
	 *  Then find and print the base- integer denoting the maximum number of consecutive 's in 's binary representation.
	 * @param args
	 */
	public static void main(String[] args) {
		
		/* int to binary */
		int inputInter = 47;
		String Binary_s = Integer.toBinaryString(inputInter);
		
	 
		String res_binary =""; // used for store binary string
		while(inputInter > 0){
			res_binary = inputInter%2 + res_binary;
			inputInter = inputInter/2;
		}
		System.out.println(res_binary);
		int count = 0;
		int flag = 0;
		for (int index = 0;index < res_binary.length();index ++){
			if( (res_binary.charAt(index)+"").equals("1")){
				count = count + 1 ;
				if(count > flag){
					flag = count ;
				}
			}
			else {
				count = 0;
			}
		}
		System.out.println(flag);
	}

}
