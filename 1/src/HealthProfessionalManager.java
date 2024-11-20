import java.util.ArrayList;

/**
 * This class manages a collection of health professionals.
 */
public class HealthProfessionalManager {
    private ArrayList<HealthProfessional> healthProfessionals;

    /**
     * Default constructor that initializes the list of health professionals.
     */
    public HealthProfessionalManager() {
        this.healthProfessionals = new ArrayList<>();
    }

    /**
     * Adds a health professional to the list.
     *
     * @param healthProfessional the health professional to add.
     * If the provided health professional is null, no action will be performed.
     */
    public void add(HealthProfessional healthProfessional) {
        if (healthProfessional != null) {
            this.healthProfessionals.add(healthProfessional);
        }
    }

    /**
     * Removes a health professional from the list.
     *
     * @param healthProfessional the health professional to remove.
     * If the provided health professional is null or not found in the list, no action will be performed.
     */
    public void remove(HealthProfessional healthProfessional) {
        if (healthProfessional != null) {
            this.healthProfessionals.remove(healthProfessional);
        }
    }

    /**
     * Prints the details of all health professionals in the list.
     */
    public void printDetails() {
        for (HealthProfessional hp : healthProfessionals) {
            hp.printDetails();
            System.out.println();
        }
    }
}
