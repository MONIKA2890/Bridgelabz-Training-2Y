import java.io.*;

class InvalidStudentException extends Exception {
    InvalidStudentException(String msg){ super(msg); }
}

class ExamSystem {
    public void validateStudent(String studentId) throws InvalidStudentException {
        if(!studentId.equals("S123")) throw new InvalidStudentException("Invalid student!");
    }

    public void submitExam(String studentId) throws InvalidStudentException, IOException {
        validateStudent(studentId);
        // Simulate file writing
        if(studentId.equals("S123")) throw new IOException("File submission failed!");
    }
}

public class OnlineExamTest {
    public static void main(String[] args) {
        ExamSystem exam = new ExamSystem();
        try {
            exam.submitExam("S124");
        } catch(InvalidStudentException | IOException e){
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Exam submission process completed.");
        }
    }
}
