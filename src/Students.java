import javax.naming.Name;

final class Student {
    private Name add;

    public void Students(Name add, int grade, String name) {
        this.add = add;
        this.name = name;
        this.grade = grade;
    }
    private String name;

    Student(Name add, String name, int grade) {
        this.add = add;
        this.name = name;
        this.grade = grade;
    }

    public final String getName() {
        return name;
    }
    private int grade;

    public final int getGrade() {
        return grade;

    }
    public String toString() {
        return "Student [name=" + name + ", grade=" + grade + "]";
    }
}
class Studenti {
    private String nume;
    private int note;

    public Studenti(String nume, int note) {
        this.nume = nume;
        this.note = calculateNotes(note);
    }

    private int calculateNotes(int note) {
        return 0;
    }

    private char calculateNote(int note) {
        if (note >= 10) return 'F';
             else return 'A';
    }

    public String getNume() { return nume; }
    public char getNote() { return (char) note; }
}