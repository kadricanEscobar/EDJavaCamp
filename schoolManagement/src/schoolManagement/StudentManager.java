package schoolManagement;

public class StudentManager {
	

	public void addToLesson(Student student , Lesson lesson) {
		System.out.println(student.studentName+" adl� ��rencinin "+lesson.lessonName+" dersine kayd� tamamland�");
	}
		
		
	public void checkScholarship(Student student,Scholarship scholarship) {
			if(student.studentPoint>=scholarship.requestPoint) {
				System.out.println("Bursu almaya hak kazand�n�z");
			}
			else {
				System.out.println("Bursu almaya hak kazanamad�n�z");
			}
		
	}
}
