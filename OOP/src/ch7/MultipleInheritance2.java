package ch7;


class Student {
    String name;
    int id;

    Student() {
    }

    Student(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

interface SportsInterface{
}

class Sports extends Student implements SportsInterface{
    private char s_grade;

    Sports() {
        super();
    }

    Sports(String name, int id, char s_grade) {
        super(name, id);
        this.s_grade = s_grade;
    }

    void setSGrade(char s_grade){
        this.s_grade = s_grade;
    }
    char getSGrade(){
        return s_grade;
    }
}

interface ExamInterface{
}

class Exam extends Student implements ExamInterface{
    private char e_grade;

    Exam() {
        super();
    }

    Exam(String name, int id, char e_grade) {
        super(name, id);
        this.e_grade = e_grade;
    }
    void setEGrade(char e_grade){
        this.e_grade = e_grade;
    }
    char getEGrade(){
        return e_grade;
    }
}

class Result extends Student implements SportsInterface, ExamInterface{
    
}

public class MultipleInheritance2 {
    public static void main(String[] args) {
        System.out.println("Hello");
    }
}
