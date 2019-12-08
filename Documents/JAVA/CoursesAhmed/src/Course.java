
public class Course {
// Md Ahmed
	private String CourseID;
	private String CourseName;
	private int Credits;
	private String Instructor ;
	private int nextCRN ;
	private static int CRN = 25000; // this private variable is 
	                                //independent not belongs to class so it can update CRN
	
	public Course(String courseID, String courseName, int credits) {
		this.CourseID = courseID;
		this.CourseName = courseName;
		this.Credits = credits;
		setInstructor("staff");
		
		if (getCourseID() == null|| getCourseName() == null|| getCredits() == 0 || getCredits() >5){
			throw new  IllegalArgumentException("Object not created");
		}
		 CRN++;
		 nextCRN = CRN;
	
	}
	public Course(Course e){
		this.CourseID = e.CourseID;
		this.CourseName = e.CourseName;
		this.Credits = e.Credits;
		setInstructor("staff");
		if (getCourseID() == null|| getCourseName() == null|| getCredits() == 0 || getCredits() >5){
			throw new  IllegalArgumentException("Object not created");
		}
		 CRN++;
		 nextCRN = CRN;
	}
	
	
	public int getNextCRN() {
		return nextCRN;
	}
	public String getCourseID() {
		return CourseID;
	}
	public void setCourseID(String courseID) {
		CourseID = courseID;
	}
	public String getCourseName() {
		return CourseName;
	}
	public void setCourseName(String courseName) {
		CourseName = courseName;
	}
	public int getCredits() {
		return Credits;
	}
	public void setCredits(int credits) {
		if (credits<= 5){
			this.Credits = credits;
		}
	}
	public String getInstructor() {
		return Instructor;
	}
	public void setInstructor(String instructor) {
		Instructor = instructor;
	}
	public String reservedClass() {
		String reserved = this.getCourseID()+", CRN "+this.getNextCRN()+ " , "
				+ this.getCourseName()+ " , "+ this.getCredits()+" Credits , Instructor: "+ this.getInstructor();
		return reserved;	
	}
	public String toString() {
		return "Course [CRN=" + CRN + ", CourseID=" + CourseID
				+ ", CourseName=" + CourseName + ", Credits=" + Credits
				+ ", Instructor=" + Instructor + "]";
	}
	
}
