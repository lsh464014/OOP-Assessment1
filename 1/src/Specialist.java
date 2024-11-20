/**
 * This class represents a Specialist, which is a type of health professional.
 */
public class Specialist extends HealthProfessional {
    private String specialty;

    /**
     * Default constructor to initialize a new Specialist object.
     */
    public Specialist() {
    }

    /**
     * Constructor to initialize a Specialist with specific details.
     *
     * @param id the ID of the Specialist.
     * @param name the name of the Specialist.
     * @param specialty the specialty of the Specialist.
     */
    public Specialist(int id, String name, String specialty) {
        super(id, name, "Specialist");
        this.specialty = specialty;
    }

    /**
     * Prints the details of the Specialist.
     */
    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Specialty: " + specialty);
    }
}
