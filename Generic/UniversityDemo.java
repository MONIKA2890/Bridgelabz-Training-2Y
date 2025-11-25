import java.util.*;


abstract class CourseType {
    String name;
    CourseType(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return name;
    }
}


class ExamCourse extends CourseType {
    ExamCourse(String name) { super(name); }
}

class AssignmentCourse extends CourseType {
    AssignmentCourse(String name) { super(name); }
}

class ResearchCourse extends CourseType {
    ResearchCourse(String name) { super(name); }
}


class Course<T extends CourseType> {
    T courseType;
    Course(T courseType) {
        this.courseType = courseType;
    }
    void display() {
        System.out.println(courseType);
    }
}


class UniversityUtils {
    public static void displayCourses(List<? extends CourseType> courses) {
        for (CourseType c : courses) {
            System.out.println(c);
        }
    }
}


public class UniversityDemo {
    public static void main(String[] args) {
        List<ExamCourse> examCourses = Arrays.asList(new ExamCourse("Math Exam"), new ExamCourse("Physics Exam"));
        List<AssignmentCourse> assignmentCourses = Arrays.asList(new AssignmentCourse("English Essay"), new AssignmentCourse("History Assignment"));

        System.out.println("Exam Courses:");
        UniversityUtils.displayCourses(examCourses);

        System.out.println("\nAssignment Courses:");
        UniversityUtils.displayCourses(assignmentCourses);
    }
}
