/**
 * This class represents a general health professional.
 */
public class HealthProfessional {
    protected int id;
    protected String name;
    protected String type;

    /**
     * Default constructor that initializes a new HealthProfessional object.
     */
    public HealthProfessional() {
    }

    /**
     * Constructor to initialize a HealthProfessional object with specific details.
     *
     * @param id the ID of the health professional.
     * @param name the name of the health professional.
     * @param type the type of the health professional.
     */
    public HealthProfessional(int id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    /**
     * Prints the details of the health professional.
     */
    public void printDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
    }
}
