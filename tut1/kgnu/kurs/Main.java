package kgnu.kurs;

import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args) {

        // Факультет физики
        Jurnal jurnalFiz = new Jurnal("ФИЗ-1-20", createTabel(1, 7));
        printJurnal(jurnalFiz);

        // Факультет математики
        //Jurnal jurnalMat = new Jurnal("MAT-1-20", createTabel(8, 20));
        //printJurnal(jurnalMat);

        //------------------------
        /*
        Student s1 = new Student();
        s1.FIO = "Попов";
        s1.Kurs = 2;
        Baza.addStudent(s1);

        Student s2 = new Student("Marconi", 2);
        Baza.addStudent(s2);

        Jurnal jurnalIzb = new Jurnal("ИЗБ-1-20", createTabel(8, 20));
        printJurnal(jurnalIzb);
        */
    }

    static List<Tabel> createTabel(int from, int to)
    {
        List<Tabel> tabels = new ArrayList<>();

        for(Student student : Baza.getStudents(from, to))
        {
            List<Predmet> predmets = new ArrayList<>()
            {
                {
                    add(new Predmet("Математика", reiting()));
                    add(new Predmet("Физика", reiting()));
                    add(new Predmet("Тарых", reiting()));
                }
            };

            student.predmets = predmets;

            Tabel tabel = new Tabel(student, visited());
            tabels.add(tabel);
        }
        return tabels;
    }

    static void printJurnal(Jurnal jurnal)
    {
        System.out.println("\n\n[ " + jurnal.Grupa + " ]");
        printTitle();
        for(Tabel t : jurnal.tabel)
        {
            int vc = 0;
            System.out.print(String.format("%-25s", t.Student.FIO));
            for(int i : t.Posesheniye)
            {
                vc = vc + i;
                System.out.print(i + "\t");
            }
            System.out.print(vc + "\t");

            for(Predmet p : t.Student.predmets)
            {
                int itog = 0;
                for(int i : p.reiting)
                {
                    itog += i;
                }
                System.out.print((itog / 3) + "\t");
            }
            System.out.print("\n");

        }
    }

    static void printTitle()
    {
        String[] title = { String.format("%-25s", "ФИО"), "ПН\t", "ВТ\t", "СР\t", "ЧТ\t", "ПТ\t", "Итого\t", "Мат\t", "Физ\t", "Тарых\n" };

        for(String str : title)
        {
            System.out.print(str);
        }
    }

    static int[] visited()
    {
        int[] vc = new int[5];
        for(int i = 0; i <= 4; i++)
        {
            vc[i] = (int)Math.round(Math.random());
        }
        return vc;
    }

    static int[] reiting()
    {
        int[] vc = new int[3];
        for(int i = 0; i <= 2; i++)
        {
            vc[i] = (int)(Math.random() * 100);
        }
        return vc;
    }
}
