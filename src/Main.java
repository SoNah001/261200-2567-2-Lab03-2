public static void main(String[] args) {
    int currentYear = 2024;
    Patient patient = new Patient(1001, "John Doe", 1978, 175.5,78.0,"AB","0811142655");
    patient.displayDetails(currentYear);
    patient.getBMI();
    Patient invalidPatient = new Patient(1002, "Joe Dohn", 1990, -160.0, -65.0,"O","0955555555");
    invalidPatient.displayDetails(currentYear);
    invalidPatient.getBMI();
}