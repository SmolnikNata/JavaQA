package hw03_03_24;

import java.util.ArrayList;
import java.util.List;

public class Task_Limpopo {
    public static void main(String[] args) {

        int initialPopulation = 10000000; // начальное количество зверей
        double birthRate = 0.014 ; // показатель рождаемости за год
        double deathRate = 0.008 ; // показатель смертности за год
        int years = 10 ; // количество лет

        List<Integer> populationStart = new ArrayList<>();
        populationStart.add(initialPopulation); // добавляем начальное количество зверей

        for (int year = 1; year <= years; year++) {
            // Расчет количества родившихся зверей
            int births = (int) (populationStart.get(year - 1) * birthRate);
            // Расчет количества умерших зверей
            int deaths = (int) (populationStart.get(year - 1) * deathRate);
            // Расчет общего количества зверей в текущем году
            int currentPopulation = populationStart.get(year - 1) + births - deaths;
            // Добавление текущего количества зверей в историю
            populationStart.add(currentPopulation);
        }

        System.out.println("Количество зверей через " + years + " лет: " + populationStart.get(years));
    }

}
//2*. В стране Лимпопо количество всех зверей равно 10 миллионов.
//    Рождаемость составляет 14 зверей на 1000, смертность - 8 зверей.
//    Рассчитайте, сколько зверей будет через 10 лет, принимая во внимание,
//    что показатели рождаемости и смертности постоянны.
//    Попробуйте использовать Iterator или foreach для решения задачи.