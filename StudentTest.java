class StudentTest{
	
	public static void main(String[] args){
		
		Student student1 = new Student(1000, "Harper", "male", 19, 223_456_7890l, 3.5, 'B');	


		Student student2 = new Student(1001, "Asher", "male", 18, 223_456_5436l, 3.8, 'E', 
true);
		student2.setGender("fmale");

		Student student3 = new Student(1002, "Sage", "female", 20, 223_486_0936l, 3.9, 'C', 
true);

		System.out.println("\nName of student1: " + student1.name);
		System.out.println("\nName of student2: " + student2.name);
		System.out.println("\nName of student2 gender: " + student2.getGender());
		System.out.println("\nName of student3: " + student3.name);

		student1.updateProfile("Jeremy");
		System.out.println("\nupdated name of student1: " + student1.name);

		
		Student[] students = {student1, student2, student3};

		swap(students, 0, 2);

		System.out.println("\nstudent1 name: " + students[0].name);
		System.out.println("\nstudent2 name: " + students[1].name);
		System.out.println("\nstudent3 name: " + students[2].name);
	}

	static void swap(Student[] students, int firstIndex, int secondIndex){
		Student temp = students[firstIndex];
		students[firstIndex] = students[secondIndex];
		students[secondIndex] = temp;
}
	
}