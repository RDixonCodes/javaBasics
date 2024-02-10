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

    //switch statment
    
    static String getSeason(int month) {

        // String season = null;
    // standard switch statement
    //     switch (month){
    //         case 1: season = "spring";
    //         break;
    //         case 2: season = "spring";
    //         break;
    //         case 3: season = "spring";
    //         break;
    //         case 4: season = "summer";
    //         break;
    //         case 5: season = "summer";
    //         break;
    //         case 6: season = "summer";
    //         break;
    //         case 7: season = "fall";
    //         break;
    //         case 8: season = "fall";
    //         break;
    //         case 9: season = "fall";
    //         break;
    //         case 10: season = "winter";
    //         break;
    //         case 11: season = "winter";
    //         break;
    //         case 12: season = "winter";
    //         break;
    //         default : season = "unkown";
    //     }

    // arrow function style 
            // switch(month){
            //     case 1,2,3 -> season = "spring";

            //     case 4,5,6 -> season = "summer";

            //     case 7,8,9 -> season = "fall";

            //     case 10,11,12 -> season = "winter";

            // }

        // simplified version
        // String season = switch(month){
        //     case 1,2,3 -> {
        //     yield "spring"
        // };

        //     case 4,5,6 -> "summer";

        //     case 7,8,9 -> "fall";

        //     case 10,11,12 -> "winter";

        //     default -> "unkown";
        // };

        // most compact version
		return switch(month){
			case 1,2,3 -> "spring";

            case 4,5,6 -> "summer";

            case 7,8,9 -> "fall";

            case 10,11,12 -> "winter";

			default -> "unknown";

			//or

            // default -> throw new IllegalArgumentException();
		};

    

    }
    
    //ternary operator
    static int min(int x, int y){
        int result = (x < y) ? x : y;
        return result;
    }
    //or
    // static int min(int x, int y){
    //     return (x < y) ? x : y;
    // }
		

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
    System.out.println("The current season is: " + getSeason(0));
    System.out.println("\nTernary Operator ");
    int min = min(9,3);
    System.out.println("Min :" + min);
    }
}