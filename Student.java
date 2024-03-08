
class Student{

	static int studentCount;
	
	int id = 1000;
	String name = "Harper";
	//example of information hiding.
	private String gender = "male";

	public String getGender(){
		return gender;
	}
	public void setGender(String gender){
		if(gender.equals("male") || gender.equals("female") || gender.equals("transgender")){
			this.gender = gender;
		} else {
			throw new IllegalArgumentException("Illegal gender declaration");
		}
	}


	int nextId = id + 2;
	int age = 19;
	long phone = 223_456_7890l;
	char degree;
	boolean international;
	double gpa = 3.6;
	boolean intStudent;
	double tuitionFees = 12000.0, intFees = 5000.0;
	
	Student(int newId, String name, String newGender, int newAge, long newPhone, double newGPA, char newDegree){
	this(newId, name, newGender, newAge, newPhone, newGPA, newDegree, false);
}

	Student(int newId, String name, String newGender, int newAge, long newPhone, double newGPA, char newDegree, boolean isInternational){

	id = newId;
	this.name = name.toUpperCase();
	age = newAge;
	phone = newPhone;
	gpa = newGPA;
	degree = newDegree;
	international = isInternational; 
	
	studentCount = studentCount + 1;
	newId = id + 1;

	
	if (international){
		tuitionFees = tuitionFees + intFees;
	}
	if(gpa > 3.5){
	tuitionFees = tuitionFees - 1000.0;
}
		System.out.println("\nid: " + id);
		System.out.println("name: " + name);
		System.out.println("gender: " + gender);
		System.out.println("gpa: " + gpa);
		System.out.println("phone: " + phone);
		System.out.println("tuition fees: " + tuitionFees);
		System.out.println("student count: " + studentCount);

	}

	Student(){}
	
	boolean updateProfile(String name){
		this.name = name;
		return true;
	}
	
	static void arrays(){
	System.out.println("\nInside arrays ...");
	//int[] scores = new int[4];

	//scores[0] = 90;
	//scores[1] = 70;
	//scores[2] = 80;
	//scores[3] = 100;

	int[] scores = new int[] {90, 70, 80, 100};
	//or
	//int[] scores = {90, 70, 80, 100};
	
	//Student[] students = new Student[] {new Student(), new Student(), new Student()};
	//or
	//Student[] students = {new Student(), new Student(), new Student()};
	//students[0].name = "Asher";
	
	
	}
	
	public static void main(String[] args){
		Student student1 = new Student(1000, "Harper", "male", 19, 223_456_7890l, 3.5, 'B');
		System.out.println("First student name : " + student1.name);

		Student student2 = new Student(1001, "Asher", "male", 18, 223_856_9893l, 3.8, 'D', true);
		System.out.println("Second student name : " + student2.name);
	}

}