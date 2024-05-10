package hw_26_04_24;

import java.util.TreeSet;

public class HospitalQueueSimulation {
//  1. Вы пришли в больницу и Вам в регистратуре выдали талончик, в котором указана Ваша ФИО,
//    номер талона, и имя врача.
//Вы подходите к кабинету, и там Вам сообщают, что обслуживание ведеться строго по номеру талона.
//Из кабинета выходит медсестра и просит все присутствующих выстроиться по номеру талона в порядке
//его возрастания.
//Создать множество, которое будет обслуживать класс Ticket.
//Подумайте какой тип Set - а вы могли бы использовать для этой задачи.
//Сымитируйте построение очереди в коридоре больницы.

    public static void main(String[] args) {
        TreeSet<Ticket> queue = new TreeSet<>();

        //  список талонов
        Ticket ticket1 = new Ticket("Попов", 101, "Дубова");
        Ticket ticket2 = new Ticket("Исаев", 102, "Маслов");
        Ticket ticket3 = new Ticket("Огенва", 103, "Листьев");
        Ticket ticket4 = new Ticket("Павлов", 103, "Горига");


        queue.add(ticket2);
        queue.add(ticket1);
        queue.add(ticket3);
        queue.add(ticket4);


        for (Ticket ticket : queue) {
            System.out.println("ФИО: " + ticket.getFullName() + ", Номер талона: " + ticket.getTicketNumber() + ", Врач: " + ticket.getDoctorName());
        }
    }
}
