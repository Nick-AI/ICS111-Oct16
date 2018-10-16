
/**
 * A class representation of a student with
 * The student gets a letter grade from the professor, depending on what score they got on an exam out of 5
 * Their letter grade is based only on one exam score
 * This is not realistic at all.
 * 
 * You do not need to modify this class.
 * 
 * @author Camelia Lai
 *
 */
public class Student {
	
	public String name; // Student's name
	public int examScore; // Score the student got on the exam, out of 5
	public String grade; // Student's letter grade

	/**
	 * Student constructor that takes in a name and a score
	 * The grade cannot be set on initialization, because only a professor can decide the student's grade.
	 * 
	 * @param name: A String, the student's name
	 * @param score: An int, the student's exam score
	 */
	public Student(String name, int score) { 
		this.name = name;
		this.examScore = score;
		this.grade = ""; // the grade is blank. Only the professor can give them a grade.
	}
	
	/***
	 * Returns the student's name
	 * @return String name
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * Returns the student's grade
	 * @return int grade
	 */
	public String getGrade() {
		return this.grade;
	}

	/**
	 * Sets the student's letter grade to a new letter grade
	 * @param newGrade: A String, the new letter grade to give the student.
	 */
	public void setGrade(String newGrade) {
		this.grade = newGrade;
	}

	/**
	 * Returns the student's exam score 
	 * @return int examScore
	 */
	public int getExamScore() {
		return this.examScore;
	}

	/**
	 * Sets the student's exam score to a new score
	 * @param newScore: An int, the new score to give the student
	 */
	public void setExamScore (int newScore) {
		this.examScore = newScore;
	}

}
