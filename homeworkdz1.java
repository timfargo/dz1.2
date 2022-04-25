public class homeworkdz1 {

   // Задача 4.
   //Правила соревнаваний обнавились,
   // и теперь нашему спортсмену нужно сбросить 7 кг,
   // чтобы оставаться в своей весовой категории.
   // Тренер скоректировал рацион так,
   // чтобы спортсмен мог терять в весе от 250 до 500 грамм в день.
   // Посчитайте, сколько дней уйдет на похудение,
   // если спортсмен будет терять каждый день от 250 грамм и сколько,
   // если каждый день бедет худеть на 500 грамм. Пасчитайте,
   // сколько может потребоваться дней в среднем, чтобы добиться результата похудения.
   // Результаты подсчетов выведите в консель.

   public static void main(Strinf[] args) { task4();

   public static void task4() {
       int weight = 7;
       int gramsInKg = 1000;
       int weightInGrams = weight * gramsInKg;

       int minGramsPerDay = 250;
       int maxGramsPerDay = 500;

       int minDays = weightInGrams / maxGramsPerDay;
       int maxDays = weightInGrams / minGramsPerDay;

       int avgDays = (minDays + maxDays) / 2;

       System.out.println("Min:" + minDays);
       System.out.println("Max:" + maxDays);
       System.out.println("Avg:" + avgDays);
       }