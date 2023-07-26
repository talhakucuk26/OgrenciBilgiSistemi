package org.example;

public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int sozlu;
    double sozluOran;


    Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        int note = 0;
        int sozlu = 0;
        double sozluOran = 0;
    }

    void addTeacher(Teacher teacher) {
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;

        } else {
            System.out.println("Öğretmen ve ders bölümleri uyuşmmuyor !");
        }


    }

    void printTeacher() {
        this.teacher.print();
    }

    void SozluNotu(int sozlu, double sozluOran){
        this.sozlu = sozlu;
        this.sozluOran = sozluOran;
    }
}
