
public class Tickets{
    private String ticketId;
    private String name;
    private String description;

    public Tickets(String ticketId, String name, String description) {
        this.ticketId = ticketId;
        this.name = name;
        this.description = description;
    }

    public String getTicketId() {
        return TicketId;
    }

    public void setTicketId(String ticketId) {
        this.TicketId = TicketId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
