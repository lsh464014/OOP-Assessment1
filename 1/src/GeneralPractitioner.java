/**
 * This class represents a General Practitioner, which is a type of health professional.
 */
public class GeneralPractitioner extends HealthProfessional {
    private int consultationTime;

    /**
     * Default constructor to initialize a new General Practitioner object.
     */
    public GeneralPractitioner() {
    }

    /**
     * Constructor to initialize a General Practitioner with specific details.
     *
     * @param id the ID of the General Practitioner.
     * @param name the name of the General Practitioner.
     * @param consultationTime the consultation time for the General Practitioner in minutes.
     */
    public GeneralPractitioner(int id, String name, int consultationTime) {
        super(id, name, "General Practitioner");
        this.consultationTime = consultationTime;
    }

    /**
     * Prints the details of the General Practitioner.
     */
    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Consultation Time: " + consultationTime + " minutes");
    }
}
