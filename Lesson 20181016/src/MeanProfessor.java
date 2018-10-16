
/**
 * A class representation of a very mean professor.
 * This professor only gives students F's regardless of what their exam score is.
 * 
 * You do not need to modify this class.
 * 
 * @author Camelia Lai
 *
 */
public class MeanProfessor {
	
	public String name; // Professor's name

	/**
	 * A constructor for a MeanProfessor object that takes in the name of the professor.
	 * @param name: A String, the name to give the professor
	 */
	public MeanProfessor(String name) {
		this.name = name;
	}

	/**
	 * Give any student an F, regardless of their score.
	 * Sets the student's grade to F
	 * @param stu: A Student object
	 */
	public void gradeStudent(Student stu) {
		stu.setGrade("F");
	}
	
	/**
	 * Returns the name of the professor
	 * @return String name
	 */
	public String getName() {
		return this.name;
	}

}
