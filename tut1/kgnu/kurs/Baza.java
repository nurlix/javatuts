package kgnu.kurs;

import java.util.ArrayList;
import java.util.List;

public class Baza
{
    private static List<Student> Students = new ArrayList<Student>()
    {
        {
            add(new Student("Нильс Бор", 1));
            add(new Student("Орландо Лоуренс", 1));
            add(new Student("Огюст Пиккар", 1));
            add(new Student("Эрвин Шрёдингер", 1));
            add(new Student("Вернер Гейзенберг", 1));
            add(new Student("Макс Борн", 1));
            add(new Student("Макс Планк", 1));
            add(new Student("Мария Склодовская-Кюри", 1));
            add(new Student("Бенуа Мандельброт", 1));
            add(new Student("Никола Тесла", 1));
        }
    };

    public static List<Student> getStudents(int from, int to)
    {
        List<Student> list = new ArrayList<>();
        
        int max = Students.size()-1;
        to = (to <= max) ? to : max;

        for(int i = from - 1; i <= to; i++)
        {
            list.add(Students.get(i));
        }
        return list;
    }
}