class OnlineCourse {
    String courseName;
    int duration; 
    double fee;
    static String instituteName = "ABC Institute"; 

    
    OnlineCourse(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    void displayCourseDetails() {
        System.out.println("Course: " + courseName + ", Duration: " + duration +
                           " months, Fee: " + fee + ", Institute: " + instituteName);
    }

    static void updateInstituteName(String newName) {
        instituteName = newName;
    }

    public static void main(String[] args) {
        OnlineCourse c1 = new OnlineCourse("Java Programming", 6, 15000);
        OnlineCourse c2 = new OnlineCourse("Python Basics", 3, 10000);

        c1.displayCourseDetails();
        c2.displayCourseDetails();

        OnlineCourse.updateInstituteName("XYZ Academy");

        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}

