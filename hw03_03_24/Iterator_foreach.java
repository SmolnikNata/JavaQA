package hw03_03_24;

import java.util.*;

public class Iterator_foreach {
    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < 10000000; i++) {
            integerList.add(i);
        }
        // a) Перебрать. Используем for-each loop

        long start = System.currentTimeMillis();
        int temp = 0;
        for (int num : integerList) {
            temp = num;
        }
        long end = System.currentTimeMillis();
        long durationA = (end - start);
        System.out.println("Время выполнения for-each loop: " + durationA + " наносекунд");


        // b) Переюрать.Используем классический for с условием i < list.size()
        start = System.currentTimeMillis();
        temp = 0;
        for (int i = 0; i < integerList.size(); i++) {
            temp = integerList.get(i);
        }
        end = System.currentTimeMillis();
        long durationB = (end - start);
        System.out.println("Время выполнения классического for с условием i < list.size(): "
                + durationB + " наносекунд");


        // b1+) Используем классический for с предварительным вычислением размера
        int size = integerList.size();
        start = System.currentTimeMillis();
        temp = 0;
        for (int i = 0; i < size; i++) {
            temp = integerList.get(i);
        }
        end = System.currentTimeMillis();
        long durationC = (end - start);
        System.out.println("Время выполнения классического for с предварительным вычислением размера: "
                + durationC + " наносекунд");

        // c) Используем классический for для обхода списка с конца
        start = System.currentTimeMillis();
        temp = 0;
        for (int i = integerList.size() - 1; i >= 0; i--) {
            temp = integerList.get(i);
        }
        end = System.currentTimeMillis();
        long durationD = (end - start);

        System.out.println("Время выполнения классического for для обхода списка с конца: "
                + durationD + " наносекунд");

        //  d) используя Iterator
        start = System.currentTimeMillis();
        Iterator<Integer> iterator = integerList.iterator();

        while (iterator.hasNext()) {
             temp = iterator.next();
        }
        end= System.currentTimeMillis();
        System.out.println("Время выполнения с использованием Iterator: " + (end - start) + " мс");

        //e) используя ListIterator и перемещаясь от начала списка до конца
        start = System.currentTimeMillis();
        ListIterator<Integer> listIteratorForward = integerList.listIterator();
        while (listIteratorForward.hasNext()) {
           temp = listIteratorForward.next();
        }
        end = System.currentTimeMillis();
        System.out.println("Время выполнения с использованием ListIterator (от начала к концу): " + (end - start) + " мс");

        // f) используя ListIterator с перемещением от конца списка к началу
        start = System.currentTimeMillis();
        ListIterator<Integer> listIteratorBackward = integerList.listIterator(integerList.size());
        while (listIteratorBackward.hasPrevious()) {
             temp = listIteratorBackward.previous();
        }
        end = System.currentTimeMillis();
        System.out.println("Время выполнения с использованием ListIterator (от конца к началу): " + (end - start) + " мс");
    }
}

//1. -  создать лист, наполнить его 10 млн.элементов
//внутри тела просто будем присваивать i-тый элемент в переменную temp
//перебрать весь список и замерять время выполнения:
//  а) с помощью for-each loop
//  b) классический for, с выполнением условия i<list.size()
//  b1) классический for, но размер расчитайте заранее int size = list.size() и
//     в условии проверки for уже используйте выражение i < size
//  c) классический for, но проходим список с конца до начала (i--)

//  d) используя Iterator
//  e) используя ListIterator и перемещаясь от начала списка до конца
//  f) используя ListIterator с перемещением от конца списка к началу
//Замер производительности делать для каждого из подпунктов отдельно,
//используя например сходный шаблон кода:  инструкцию java:
//       long startTime = System.currentTimeMillis();
//       //…… Ваша реализация перебора списка, например
//       for (int i : list) {
//           int temp = i;
//       }
//       long endTime = System.currentTimeMillis();
//       System.out.println("for-each loop: " + (endTime - startTime));
//время выполнения каждого перебора вывести в консоль.
//Определите, какой вариант перебора списка работает быстрее всего.
//
//
//2*. В стране Лимпопо количество всех зверей равно 10 миллионов.
//    Рождаемость составляет 14 зверей на 1000, смертность - 8 зверей.
//    Рассчитайте, сколько зверей будет через 10 лет, принимая во внимание,
//    что показатели рождаемости и смертности постоянны.
//    Попробуйте использовать Iterator или foreach для решения задачи.