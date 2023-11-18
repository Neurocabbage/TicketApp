import java.util.List;

public class User {
    private Long id;
    private String name;
    private List<Ticket> tickets;
    private String login;
    private Long passwordHashCode;
    private Long accountID;

    public User(Long id, String name, List<Ticket> tickets, String login,
                Long passwordHashCode, Long accountID) {
        this.id = id;
        this.name = name;
        this.tickets = tickets;
        this.login = login;
        this.passwordHashCode = passwordHashCode;
        this.accountID = accountID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Long getPasswordHashCode() {
        return passwordHashCode;
    }

    public void setPasswordHashCode(Long passwordHashCode) {
        this.passwordHashCode = passwordHashCode;
    }

    public Long getAccountID() {
        return accountID;
    }

    public void setAccountID(Long accountID) {
        this.accountID = accountID;
    }
}
