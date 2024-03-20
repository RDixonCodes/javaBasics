//import java.util.ArrayList;
//import java.util.Date;


class Demo {
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
		
    //label breaking
    static void labeledBreak(){
        System.out.println("\nInside labeledBreak");
        int num = 0;

        outermost: for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                if(i == 5 && j == 5){
                    continue outermost;
                }
                num++;
            }
        }

        System.out.println("num: " + num);
    }

    static double dumpEstimator(int loadWeight){
        System.out.println("\nDump Estimator...");

        final int MAX_WEIGHT = 300;
        final double DUMP_FEE = 18.00;
        double overageCost = .85;

        if(loadWeight > MAX_WEIGHT){
            int overage = loadWeight - MAX_WEIGHT;
            double overageValue = overageCost * overage + DUMP_FEE;

            System.out.println("Weighed amount: " + loadWeight + "lbs.");
            System.out.println("You're over the weight limit of " + MAX_WEIGHT + "lbs. Total dump fee: $" + overageValue);

            return overageValue;

        } else {

            System.out.println("\nYour current fees: $" + DUMP_FEE);
            return DUMP_FEE;
            
        }
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
    //   java.util.Date date = new java.util.Date();
    //   ArrayList list;
    dumpEstimator(300);
    bitwiseOperators();
    System.out.println("The current season is: " + getSeason(0));
    System.out.println("\nTernary Operator ");
    int min = min(9,3);
    System.out.println("Min :" + min);
    System.out.println("\nfor loop");
    int[] iArr = {0,1,2,3,4,5,6,7,8,9};
    // for(int i = 0; i < iArr.length; i++){
    //     System.out.println(iArr[i]);
    // }

    // index swapping
    // for(int i = 0, j = iArr.length - 1; i < j; i++, j--){
    //     int temp = iArr[i];
    //     iArr[i] = iArr[j];
    //     iArr[j] = temp;
    //     System.out.println(iArr[i] + " " + iArr[j]);

    // }

    // for(int i = 0; i < iArr.length; i++){

    //     System.out.println(iArr[i] + " ");
    // }

    // counting divisors
    System.out.println("\n Counting Divisors");
    int x = 24;
    int count = 0;
    for(int i = 1; i <= x; i++){
        if(x % i == 0){
            System.out.println(i + " ");
            count++;
        }
    }
    System.out.println("\ndivisor count: " + count);

    //2d array

    System.out.println("\nDisplaying Student Grades ... ");

	int[][] studentGrades = {{76, 52, 69, 83, 45, 90}, {22, 71, 67, 69, 40}, {53, 87, 91, 25}};

	for (int i = 0; i < studentGrades.length; i++) {
		int max = 0;
        System.out.print("\nDisplaying grades of students from class " + i + ": ");

		for (int j = 0; j < studentGrades[i].length; j++) {
		if (studentGrades[i][j] > max) {
			max = studentGrades[i][j];
			}
			System.out.print(studentGrades[i][j] + " ");
		}
		System.out.println("\nmax: " + max);
    }	  

    //for-each: convenient iteration

    iArr = new int[] {0,1,2,3,4,5,6,7,8,9};

    for(int i = 0; i < iArr.length; i++){
        System.out.println(iArr[i] + " ");
    }

    //cleaner version of for each.
    for(int i : iArr){
        System.out.println(i + " ");
    }

    //parallel iteration
    int[] dice1 = {1,2,3,4};
    int[] dice2 = {1,2,3,4};

    for(int i = 0, j = 0; i < dice1.length && j < dice2.length; i++, j++){
        System.out.println(dice1[i] + " " + dice2[j]);
    }

    labeledBreak();

    }
    
    
}