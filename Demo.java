class Demo{
	static void bitwiseOperators() {
	    System.out.println("\nInside bitwiseOperators ...");
	    int x = 1;
		int y = 3;
		
		System.out.println("x & y: " + (x & y));
		System.out.println("x | y: " + (x | y));
		System.out.println("x ^ y: " + (x ^ y));
		System.out.println("~x: " + (~x));
		System.out.println("true & false: " + (true & false));
		 
		char c1 = 'a'; // U+0061 --> 0110 0001
		char c2 = 'b'; // U+0062 --> 0110 0010
		System.out.println("c1 | c2: " + (c1 | c2)); // 0110 0011 --> 99 in decimal		
		
		// Since bitwise work only on Integer types, following will not compile
		//double d1 = 3.14;
		//double d2 = 5.15;
		//System.out.println("d1 | d2: " + (d1 | d2));
  }
		
	public static void main(String[] args) {	
	  // Language Basics 1
	  //print();				
	  //primitives();
	  //typeCasting();
	  //arrays();	
      //threeDimensionalArrays();	
      /*varargsOverload(true, 1, 2, 3);
      varargsOverload(true, 1, 2, 3, 4, 5, 6, 7, 8);	  
      varargsOverload(true);*/
	  
	  //preAndPost();
	  //compoundArithmeticAssignment();
	  //isOddOrEven(51);
	  //charTypePromotion();
	  //comparisonOperators();
      //logicalOperators();
	  bitwiseOperators();
    }
}