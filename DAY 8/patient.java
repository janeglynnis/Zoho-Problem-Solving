class Patient {
    private int patientId;
    private String name;
    private String medicalHistory; // private
    private double billAmount;

    public Patient(int patientId, String name, String medicalHistory, double billAmount) {
        this.patientId = patientId;
        this.name = name;
        this.medicalHistory = medicalHistory;
        this.billAmount = billAmount;
    }

    // Getter for medicalHistory
    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void displayPatient() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Bill Amount: " + billAmount);
    }
}
