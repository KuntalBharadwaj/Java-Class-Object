public class Student {
    String Name;
    int rollnumber;
    int marks;

    String grade;

    Student(String n, int id, int mark) {
        this.Name = n;
        this.rollnumber = id;
        this.marks = mark;
    }

    void calculateGrad(){
        if(marks > 90) grade = "A";
        else if(marks > 80) grade = "B";
        else if(marks > 65) grade = "C";
        else if(marks > 45) grade = "D";
        else grade = "F";
    }

    void displayDetails() {
        System.out.println("The name of the Student is : " + this.Name);
        System.out.println("The Roll Number of the Student is : " + this.rollnumber);
        System.out.println("The grade of the Student is : " + this.grade);
    }

    public static void main(String[] args) {
        Student s1 = new Student("student1",111,95);
        Student s2 = new Student("student1",111,40);

        s1.calculateGrad();
        s2.calculateGrad();

        s1.displayDetails();
        s2.displayDetails();
    }
}


// The name of the Student is : student1
// The Roll Number of the Student is : 111
// The grade of the Student is : A
// The name of the Student is : student1
// The Roll Number of the Student is : 111
// The grade of the Student is : F
