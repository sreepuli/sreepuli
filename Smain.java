public class Smain{
    public static void main(String[] args) {
        // Create some Student objects
        Student[] students = {
            new Student("Alice", 85.5),
            new Student("Bob", 90.0),
            new Student("Charlie", 78.0)
        };

        // Call the static method
        Student.printStudentGrade(students);
    }
}

