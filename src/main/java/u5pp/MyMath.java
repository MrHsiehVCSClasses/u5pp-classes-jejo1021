package u5pp;
/*
 * MyMath class:
 * 
 * methods:
 * int abs: return absolute value of an integer
 * double abs: return absolute value of a double
 * double pow: returns a double raise to an exponent
 * int perfectSqrt: returns the square root of a number only if it has a perfect square, otherwise returns -1
 */
public class MyMath {
	
	/**
	 * 
	 * @param x: number that will be processed (int)
	 * @return absolute value of x (int)
	 */
	public static int abs(int x) {
		if(x >= 0) {
			return x;
		}else {
			return x * -1;
		}
	}
	/**
	 * 
	 * @param x: number that will be processed (double)
	 * @return absolute value of x (double)
	 */
	public static double abs(double x) {
		if(x >= 0) {
			return x;
		}else {
			return x * -1.0;
		}
	}
	/**
	 * 
	 * @param base: number that will be raise multiplied by itself exponent number of times (double)
	 * @param exponent: amount of times base will be multiplied by itself (int)
	 * @return base raise to the power of the exponent (double)
	 */
	public static double pow(double base, int exponent) {
		double returnValue = 1.0;
		if(exponent == 0) {
			return 1.0;
		}else if(exponent == 1){
			return base;
		}else {
			if(exponent < 0) {
				exponent = exponent * -1;
				for(int i = 1; i <= exponent; i++) {
					returnValue = returnValue * base;
				}
				return returnValue;
			
			}else {
				for(int i = 1; i <= exponent; i++) {
					returnValue = returnValue * base;
				}
				return returnValue;
			}
				
		}
			
	}
	//variables for perfectSqrt
	static int num;
	static double temp;
	static double sqrt = num/2;
	/**
	 * 
	 * @param x: number to be manipulated (int)
	 * @return perfect square root of x, or negative 1
	 */
	public static int perfectSqrt(int x) {
		
		num = x;
		if(num < 0) {
			return -1;
		}
		if(num == 0 || num == 1) {
			return x;
		}
		
		sqrt = num/2;
		while((temp - sqrt) != 0) {
			temp = sqrt;
			sqrt = (temp + (num/temp))/2;
		}
		double checkDouble = sqrt;
		int tempcheckInt = (int)sqrt;
		double checkInt = (double)tempcheckInt;
		if(checkInt < checkDouble) {
			return -1;
		}else {
			return tempcheckInt;
		}
	}
}

