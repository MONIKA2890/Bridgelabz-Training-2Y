import java.time.*;

class LateSubmissionException extends Exception {
    LateSubmissionException(String msg){ super(msg); }
}
class InvalidFileFormatException extends Exception {
    InvalidFileFormatException(String msg){ super(msg); }
}

public class ExamSubmission {
    static LocalDateTime deadline = LocalDateTime.of(2025,11,25,12,0);

    public static void submitExam(String fileName, LocalDateTime submissionTime) throws Exception {
        if(!fileName.endsWith(".pdf")) throw new InvalidFileFormatException("Submission failed: invalid file format");
        if(submissionTime.isAfter(deadline)) throw new LateSubmissionException("Submission failed: late submission");
        System.out.println("Exam submitted successfully!");
    }

    public static void main(String[] args) {
        try {
            submitExam("exam.docx", LocalDateTime.now());
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

