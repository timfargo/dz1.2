public class Main {

    //  Задача 5.
    //  Отодем от спорта и преставим,что мы работаем в большой компании,
    //  штат который состоит из нескольких сотен сотрудников.
    //  В компании есть правила, что чем дольше сотрудник работает в компании,
    //  тем ценнее он для бизнеса.
    //  Поэтому сотрудники, которые работают в компании дольше 3 лет,
    //  получают повышение зарплаты раз в год.
    //  Каждый год павышение составляет 10% от текущей зарплаты.
    //  К вам пришел руководитель с задачей автомативизировать повышение зарплаты,
    //  а также провести расчет для следущих сотридников:
    //  Мвша получает 67 760 рублей в месяц
    //  Денис получает 83 690 рублей в месяц
    //  Кристина получает 76 230 рублей в месяц
    //  Каждому нужно увеличить зарплату на 10% от текущей месячной.
    //  Дополнительно руководитель попрасил подсчитать
    //  разницу между годовым доходом до и после повышения.
    //  Выведите в консоль информацию по каждому сотруднику.
    //  Например, "Маша теперь получает **** рублей. Годовой доход вырос на **** рублей".

    public static void main(String[] args) { task5(); }

    public static void task5() {
        int percent = 10;
        double multiplier = percent / (100 * 1.0);

        int mashaSalary = 67_760;
        int denisSalary = 83_690;
        int kristinaSalary = 76_230;

        int mashaNewSalary = (int) (mashaSalary + (mashaSalary * multiplier));
        int denisNewSalary = (int) (denisSalary + (denisSalary * multiplier));
        int kristinaNewSalary = (int) (kristinaSalary +(kristinaSalary * multiplier));

        int mashaDifference = (mashaNewSalary - mashaSalary) * 12;
        int denisDifference = (denisNewSalary - denisSalary) * 12;
        int kristinaDifference = (kristinaNewSalary - kristinaSalary) * 12;

        System.out.prinln("Маша теперь получает" + mashaNewSalary + "рублей. ГОдовой доход вырос на " + mashaDifference + "рублей");
        System.out.prinln("Денис теперь получает" + denisSalaryNewSalary + "рублей. ГОдовой доход вырос на " + denisDifferenceDifference + "рублей");
        System.out.prinln("Кристина теперь получает" + kristinaNewSalaryNewSalary + "рублей. ГОдовой доход вырос на " + kristinaDifferenceDifference + "рублей");
    }

}

