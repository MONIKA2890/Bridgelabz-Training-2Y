class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    public void setCGPA(double cgpa) {
        this.CGPA = cgpa;
    }

    public double getCGPA() {
        return CGPA;
    }
}


class PostgraduateStudent extends Student {
    public void displayStudentInfo() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);  
        System.out.println("CGPA: " + getCGPA());
    }
}

