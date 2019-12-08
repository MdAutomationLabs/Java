import java.util.ArrayList;

public class CoursesTesterAhmed {

	public static void main(String[] args) {
		// Md Ahmed

		Course class1 = new Course("BIO152", "Botany", 3);
		Course class2 = new Course("CIS171", "Java", 5);
		Course class3 = new Course("CIS174", "Java II", 3);
		Course class4 = new Course("SDV108", "College Experience", 1);
		Course class5 = new Course("ENG105", "English", 3);
		Course class6 = new Course(class1);
		Course class7 = new Course(class2);
		Course class8 = new Course(class3);
		Course class9 = new Course(class4);
		Course class10 = new Course(class5);
		Course class11 = new Course(class1);
		Course class12 = new Course(class2);
		Course class13 = new Course(class3);
		Course class14 = new Course(class4);
		Course class15 = new Course(class5);
		System.out.println(class1.reservedClass());
		System.out.println(class2.reservedClass());
		System.out.println(class3.reservedClass());
		System.out.println(class4.reservedClass());
		System.out.println(class5.reservedClass());
		System.out.println(class6.reservedClass());
		System.out.println(class7.reservedClass());
		System.out.println(class8.reservedClass());
		System.out.println(class9.reservedClass());
		System.out.println(class10.reservedClass());
		System.out.println(class11.reservedClass());
		System.out.println(class12.reservedClass());
		System.out.println(class13.reservedClass());
		System.out.println(class14.reservedClass());
		System.out.println(class15.reservedClass());

		ArrayList<String> course = new ArrayList<String>();
		for (String newCourse : course) {
			System.out.println(newCourse);
		}
	}
}
