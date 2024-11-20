import java.util.ArrayList;

/**
 * This class demonstrates the creation of health professional objects, appointments,
 * and manages a collection of appointments.
 */
public class AssignmentOne {
    /**
     * The main method that demonstrates the usage of health professionals,
     * creates appointments, and manages a collection of appointments.
     *
     * @param args command args.
     */
    public static void main(String[] args) {
        // Part 3 – Using classes and objects
        System.out.println("Part 3 - Using classes and objects");

        HealthProfessionalManager hpManager = new HealthProfessionalManager();
        GeneralPractitioner doctor1 = new GeneralPractitioner(1, "gp1", 10);
        hpManager.add(doctor1);
        GeneralPractitioner doctor2 = new GeneralPractitioner(2, "gp2", 15);
        hpManager.add(doctor2);
        GeneralPractitioner doctor3 = new GeneralPractitioner(3, "gp3", 20);
        hpManager.add(doctor3);

        Specialist spec1 = new Specialist(4, "spec1", "Cardiology");
        hpManager.add(spec1);
        Specialist spec2 = new Specialist(5, "spec2", "Neurology");
        hpManager.add(spec2);

        hpManager.printDetails();
        System.out.println("------------------------------");

        // Part 5 – Collection of appointments
        System.out.println("Part 5 - Collection of appointments");

        ArrayList<Appointment> appointments = new ArrayList<>();
        createAppointment("John", "1234567890", "08:00", doctor1, appointments);
        createAppointment("Jane", "0987654321", "09:00", doctor2, appointments);
        createAppointment("Alice", "1122334455", "14:00", spec1, appointments);
        createAppointment("Jane", "6677889900", "16:00", spec2, appointments);

        printExistingAppointments(appointments);
        cancelBooking("1122334455", appointments);
        printExistingAppointments(appointments);
        System.out.println("------------------------------");
    }

    /**
     * Creates a new appointment for a patient with a health professional.
     *
     * @param patientName The name of the patient making the appointment.
     * @param patientPhone The phone number of the patient.
     * @param timeSlot The preferred time slot for the appointment.
     * @param doctor The health professional for the appointment.
     * @param appointments The list of appointments to add the new appointment to.
     */
    public static void createAppointment(String patientName, String patientPhone, String timeSlot, HealthProfessional doctor, ArrayList<Appointment> appointments) {
        if (patientName == null || patientPhone == null || timeSlot == null || doctor == null) {
            System.out.println("Error: Missing information. Appointment cannot be created.");
            return;
        }

        Appointment appointment = new Appointment(patientName, patientPhone, timeSlot, doctor);
        appointments.add(appointment);
        System.out.println("Appointment created for " + patientName + " with " + doctor.name + " at " + timeSlot);
    }

    /**
     * Prints the details of all existing appointments.
     *
     * @param appointments The list of appointments to be printed.
     */
    public static void printExistingAppointments(ArrayList<Appointment> appointments) {
        if (appointments.isEmpty()) {
            System.out.println("No existing appointments.");
            return;
        }

        System.out.println("Existing Appointments:");
        for (Appointment appointment : appointments) {
            appointment.printDetails();
            System.out.println();
        }
    }

    /**
     * Cancels an appointment based on the patient's phone number.
     *
     * @param patientPhone The phone number of the patient whose appointment needs to be cancelled.
     * @param appointments The list of appointments from which the appointment will be removed.
     */
    public static void cancelBooking(String patientPhone, ArrayList<Appointment> appointments) {
        for (Appointment appointment : appointments) {
            if (appointment.getPatientPhone().equals(patientPhone)) {
                appointments.remove(appointment);
                System.out.println("Appointment for patient with phone " + patientPhone + " has been cancelled.");
                return;
            }
        }
        System.out.println("Error: No appointment found for the given phone number.");
    }
}
