package hw_26_04_24;

public class Ticket implements Comparable<Ticket>{

    private String fullName;
    private int ticketNumber;
    private String doctorName;

    public Ticket(String fullName, int ticketNumber, String doctorName) {
        this.fullName = fullName;
        this.ticketNumber = ticketNumber;
        this.doctorName = doctorName;
    }

    @Override
    public int compareTo(Ticket other) {  //
        return Integer.compare(this.ticketNumber, other.ticketNumber);
    }

    public String getFullName() {
        return fullName;
    }
    public int getTicketNumber() {
        return ticketNumber;
    }
    public String getDoctorName() {
        return doctorName;
    }
}
