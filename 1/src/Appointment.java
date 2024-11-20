/**
 * This class represents an appointment made by a patient with a health professional.
 */
public class Appointment {
    private String patientName;
    private String patientPhone;
    private String timeSlot;
    private HealthProfessional healthProfessional;

    /**
     * Default constructor that initializes an empty Appointment object.
     */
    public Appointment() {
    }

    /**
     * Constructor to initialize an Appointment object with specific details.
     *
     * @param patientName the name of the patient.
     * @param patientPhone the phone number of the patient.
     * @param timeSlot the preferred time slot for the appointment.
     * @param healthProfessional the health professional for the appointment.
     */
    public Appointment(String patientName, String patientPhone, String timeSlot, HealthProfessional healthProfessional) {
        this.patientName = patientName;
        this.patientPhone = patientPhone;
        this.timeSlot = timeSlot;
        this.healthProfessional = healthProfessional;
    }

    /**
     * Gets the phone number of the patient.
     *
     * @return the patient's phone number.
     */
    public String getPatientPhone() {
        return patientPhone;
    }

    /**
     * Prints the details of the appointment.
     */
    public void printDetails() {
        System.out.println("Patient Name: " + patientName);
        System.out.println("Patient Phone: " + patientPhone);
        System.out.println("Time Slot: " + timeSlot);
        System.out.print("Doctor Details: ");
        healthProfessional.printDetails();
    }
}
