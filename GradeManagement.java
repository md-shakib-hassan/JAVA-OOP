
class Student {
    String name;
    int rollNumber;
    int[] marks;

    Student(String n, int rN, int[] mk) {
        name = n;
        rollNumber = rN;
        marks = mk;
    }

   double calculateAverage() {
    int sum = 0;
    for (int i = 0; i < marks.length; i++) {
        sum += marks[i];
    }
    return sum / (double) marks.length;
}


    char calculateGrade() {
        double avg = calculateAverage();
        if (avg >= 80) return 'A';
        else if (avg >= 70) return 'B';
        else if (avg >= 60) return 'C';
        else if (avg >= 50) return 'D';
        else return 'F';
    }
}

public class GradeManagement {
    public static void main(String[] args) {
        int[] marks = {85, 90, 78, 92, 88};
        Student s = new Student("Shakib", 101, marks);
        System.out.println("Name: " + s.name + ", Roll: " + s.rollNumber +
                ", Avg: " + s.calculateAverage() + ", Grade: " + s.calculateGrade());
    }
}

