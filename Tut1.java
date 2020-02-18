class Tut1 {

    // Глобальные переменные
    static String[] Titles = { "\nСтудент\t", "Пн", "Вт", "Ср", "Чт", "Пт", "Итого" };
    static String[] Names = { "Асан", "Усон", "Алыбек", "Калыбек" };

    public static void main(String[] args) {

        // Локальный переменный
        String[] Footers = { "\nСтудент\t", "Пн", "Вт", "Ср", "Чт", "Пт", "Итого\n" };

        // Вызов функции
        printTitle();

        // Цикл итератор
        for (String name : Names)
        {
            // Локальный переменный
            int vc = 0;
            System.out.print("\n" + name + "\t\t"); 

            // Цикл счетчик
            for(int i = 1; i <= 5; i++)
            {
                int x = visited();
                vc = vc + x;
                System.out.print(x + "\t");
            }
            System.out.print(vc);
        }
        printFooter(Footers);
    }

    static void printTitle()
    {
        for (String title : Titles) {
            System.out.print(title + "\t");
        }
    }

    static void printFooter(String[] footers)
    {
        for (String footer : footers) {
            System.out.print(footer + "\t");
        }
    }

    static int visited()
    {
        return (int)Math.round(Math.random());
    }
}