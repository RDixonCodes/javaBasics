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

    
    public static void main(String[] args){
        comparisonOperators();
        logicalOperators();
        

    }
}
