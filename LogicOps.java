public class LogicOps {
    //Comparison or relational opertators
    static void comparisonOperators() {
        int age = 25;
        // if(age > 21) {
        //     System.out.println("Graduate Student");
        // } else {
        //     System.out.println("Under Grad Student");
        // }     
    }

    static void logicalOperators(){
        System.out.println("\nInside Logical operator");
        int age = 37;
        int salary = 95000;
        boolean hasBadCredit;

        if(age > 35 && salary > 90000) {
            System.out.println("Loan approved");
        } else {
            System.out.println("Loan not approved");
        }
    }

    //switch statment
    
    static String getSeason(int month) {

        String season = null;
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
            switch(month){
                case 1,2,3 -> season = "spring";

                case 4,5,6 -> season = "summer";

                case 7,8,9 -> season = "fall";

                case 10,11,12 -> season = "winter";

            }
        System.out.println("The current season is: " + season);
        return season;

    }

    
    public static void main(String[] args){
        comparisonOperators();
        logicalOperators();
        getSeason(2);
        

    }
}
