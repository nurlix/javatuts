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
        Jurnal jurnalMat = new Jurnal("MAT-1-20", createTabel(8, 20));
        printJurnal(jurnalMat);
    }

    static List<Tabel> createTabel(int from, int to)
    {
        List<Tabel> tabels = new ArrayList<>();
        for(Student student : Baza.getStudents(from, to))
        {
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
            System.out.println(vc);
        }
    }

    static void printTitle()
    {
        String[] title = { String.format("%-25s", "ФИО"), "ПН\t", "ВТ\t", "СР\t", "ЧТ\t", "ПТ\t", "Итого\n" };

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
}