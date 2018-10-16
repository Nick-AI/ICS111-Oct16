/**
 * A class in which a professor gives letter grades to multiple students depending on their exam scores.
 * The students will be graded by a MeanProfessor, and then a FairProfessor.
 * 
 * @author Camelia Lai
 *
 */
public class TestStudents {

	public static void main(String[] args) {
		
		// Makes some Student objects with different names and exam scores.
		Student smartStudent = new Student("Smarty", 5);
		Student okStudent = new Student("John C. GetDegrees", 3);
		Student studentWhoDidNotStudy = new Student("Ainokea", 1);
		Student studentWhoDidNotShowUp = new Student("Abby Absent", 0);
		
		// Make an array of the four students
		Student[] students = {smartStudent, okStudent, studentWhoDidNotStudy, studentWhoDidNotShowUp};

		// Makes a MeanProfessor object named Mr. Mean
		MeanProfessor meanTeacher = new MeanProfessor("Mr. Mean");

		// Loops through the array of Students 
		// For each student:
		// The professor gives the student a grade.
		// Then, print out the grade that the student got from the professor, formatted like this:
		// <Teacher Name> gave <Student Name> a <Letter grade>
		for (int i = 0; i < students.length; i++) {
			meanTeacher.gradeStudent(students[i]);
			System.out.println(meanTeacher.getName() + " gave " + students[i].getName() + " a " + students[i].getGrade());
		}
		
		// TODO: Let the FairProfessor grade the students fairly this time!! Use the same four students.
	
	}

}
