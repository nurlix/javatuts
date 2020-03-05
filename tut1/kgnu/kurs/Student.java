package kgnu.kurs;

import java.util.ArrayList;
import java.util.List;

public class Student
{
    public String FIO;
    public int Kurs;
    public List<Predmet> predmets = new ArrayList();

    public Student() { }

    public Student(String fio, int kurs) {
        FIO = fio;
        Kurs = kurs;
    }
}
