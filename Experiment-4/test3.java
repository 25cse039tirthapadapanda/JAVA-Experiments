class Teacher extends Person {
    String subject;

    Teacher(String name, String dateOfBirth, String subject) {
        super(name, dateOfBirth);
        this.subject = subject;
    }

    void display() {
        System.out.println("Teacher -> Name: " + getName() + ", DOB: " + getDateOfBirth() + ", Subject: " + subject);
    }
}

class Student extends Person {
    String college;
    int year;

    Student(String name, String dateOfBirth, String college, int year) {
        super(name, dateOfBirth);
        this.college = college;
        this.year = year;
    }

    void display() {
        System.out.println("Student -> Name: " + getName() + ", DOB: " + getDateOfBirth() + ", College: " + college + ", Year: " + year);
    }
}

class test3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Dr. Sharma", "15-08-1980", "Computer Science");
        Student student = new Student("Rahul", "20-05-2004", "GIET University", 2);

        teacher.display();
        student.display();
    }
}

