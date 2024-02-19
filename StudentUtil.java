public class StudentUtil {
    public static double[] calculateGPA(int[] studentIdList, char[][] studentsGrades){
        double[] gpaList = new double[studentIdList.length];//idList length used to determane how many students are in course.
        int index = 0;

        for(char[] studentGrades : studentsGrades){
            double sumOfGrades = 0.0;
    
            for(char grade : studentGrades){
                if(grade == 'A'){
                    sumOfGrades += 4.0;
                } else if (grade == 'B'){
                    sumOfGrades += 3.0;
                }  else if(grade == 'C'){
                    sumOfGrades += 2.0;
                }
            }
            gpaList[index++] = sumOfGrades/studentGrades.length;
        }
        return gpaList;
    }

    public static int[] getStudentsByGpa(double lower, double higher, int[] studentIdList, char[][] studentsGrades ){

        if(lower < 0 || higher < 0 || lower > higher){
            return null;
        }
        double[] gpaList = calculateGPA(studentIdList, studentsGrades);

        int count = 0;
        for(double gpa : gpaList){
            if(gpa >=lower && gpa <= higher) {
                count++;
            }
        }

        int[] result = new int[count];
        int index = 0;

        for(int i = 0; i < gpaList.length; i++){
            if(gpaList[i] >= lower && gpaList[i] <= higher){
                result[index++] = studentIdList[i];
            }
        }
        return result;
    }
    public static void main(String[] args){
        int[] studentIdList = {1001, 1002, 1003};
        char[][] studentGrades = {{'A', 'A', 'A', 'B'}, {'B', 'B', 'B', 'A'}, {'A', 'A', 'B'}};

        double[] gpaList = calculateGPA(studentIdList, studentGrades);

        for(double gpa : gpaList){
            System.out.println("gpa: " + gpa);
        }

        int[] id = getStudentsByGpa(3.5, 4.0, studentIdList, studentGrades);
        for(int val : id){
            System.out.println("id: " + val);
        }
    }
}
