package complexarchitectures;

public class Teacher {

    public Teacher() {}

    public void answer() {
        System.out.println("The teacher is answering a question.");
    }

    public void teach(Student student) {
        student.learn();
    }

    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        Student student = new Student();

        student.question(teacher);
        teacher.teach(student);
    }
}
