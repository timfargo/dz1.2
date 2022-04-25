package pro.sky.java.homework.course1;

public class Main {

//    Задача 3.
//    За весом спортсмена следит не только сам спортсмен, но и его тренер.
//    Он достигается и поддерживается упорными тренеровками и сболасированным питанием.
//    Вот один из рецептов завтрака перед тренировкой,
//    который получил наш спортсмен для подержания формы:
//    -Бананы - 5 штук (1 банан - 80 грам);
//    -Молоко - 200 мл (100 мл = 105 грамм);
//    -Мороженое пломбир - 2 брикета по 100 грамм;
//    -Яйца сырые - 4 яйца (1 яйцо - 70 грамм).
//    Смешать всё в блендаре и готова.
//    Подсчитайте все (количество грамм) такого спорта-завтрака,
//    а затем переведите его в килограммы.
//    Результат напечатойте в консоль.

    public static void main(String[] args) { task3(); }


    public static void task3() {
        int banana = 5;
        int bananaWeight = 80;

        int milk = 200 / 100;
        int milkWeight = 105;

        int iceCream = 2;
        int iceCreamWeinght = 100;

        int egg = 4;
        int eggWeinght = 70;

        int total = (banana * bananaWeight) + (milk * milkWeight) + (iceCream * iceCreamWeinght) + (egg * eggWeinght);

        int gramsInKg = 1000;

        double totalKgs = total / (gramsInKg * 1.0);
        System.out.println(totalKgs);




