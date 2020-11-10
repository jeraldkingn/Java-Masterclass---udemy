
public class NumberPalindrome {

	public static void main(String[] args) {
		System.out.println(isPalindrome(-11));
	}

	public static boolean isPalindrome(int number) {
		number = Math.abs(number);
		int temp=number;
		int reversed=0,remainder;
		
		while(number>0){    
			 remainder=number%10;
			 reversed=(reversed*10)+remainder;    
			 number=number/10;    
			}    
			if(temp==reversed)    
			 return true;
			else    
			 return false;  
		}

}
