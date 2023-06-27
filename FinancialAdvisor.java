@Entity
public class FinancialAdvisor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    // Relationship: One-to-Many with Client
    @OneToMany(mappedBy = "financialAdvisor")
    private List<Client> clients;

    public FinancialAdvisor() {
    }

    public FinancialAdvisor(String name, List<Client> clients) {
        this.name = name;
        this.clients = clients;
    }

    // Getters and setters

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }
}    
