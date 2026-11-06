class Patient {
    String patientName;
    double height; // height in meters
    double weight; // weight in kilograms

    Patient(String patientName, double height, double weight) {
        this.patientName = patientName;
        this.height = height;
        this.weight = weight;
    }

    double computeBMI() {
        return weight / (height * height);
    }
}

class test3 {
    public static void main(String[] args) {
        Patient patient = new Patient("Rahul Sharma", 1.75, 68.5);
        System.out.println("Patient Name: " + patient.patientName);
        System.out.println("Height: " + patient.height + " m");
        System.out.println("Weight: " + patient.weight + " kg");
        System.out.printf("Computed BMI: %.2f\n", patient.computeBMI());
    }
}

