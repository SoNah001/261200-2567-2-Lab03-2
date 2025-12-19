public class Patient {
    private int id;
    private String name;
    private int birthYear;
    private double height;
    private double weight;
    private String bloodGroup;
    private String phoneNumber;

    public Patient(int id,String name,int birthYear,double height,double weight ,String bloodGroup,String phoneNumber) {
        if(id > 0) {
            this.id = id;
        }

        this.name = name;

        if(birthYear > 0) {
            this.birthYear = birthYear;
        }

        if(height > 0) {
            this.height = height;
        }

        if(weight > 0) {
            this.weight = weight;
        }

        this.bloodGroup = bloodGroup;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        if(id == 0){
            System.out.println("Id is invalid -> use default setting");
            return 999;
        }
        else {
            return id;
        }
    }

    public String getName(){
        return name;
    }

    public int getBirthYear(){
        if(birthYear == 0){
            System.out.println("BirthYear is invalid -> use default setting");
            return 999;
        }
        else {
            return birthYear;
        }
    }

    public double getHeight(){
        if(height == 0){
            System.out.println("Height is invalid -> use default setting");
            return 168.5;
        }
        else {
            return height;
        }
    }

    public double getWeight() {
        if(weight == 0){
            System.out.println("Weight is invalid -> use default setting");
            return 68.5;
        }
        else {
            return weight;
        }
    }

    public int getAge(int currentYear) {
        int age = 0;
        if(currentYear > birthYear) {
            age = currentYear - getBirthYear();
        }
        else{
            System.out.println("CurrentYear is invalid");
        }
        return age;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void displayDetails(int currentYear) {
        System.out.println("Patient Name: " + getName());
        System.out.println("Patient Age: " + getAge(currentYear));
        System.out.println("Patient Height (cm): " + getHeight());
        System.out.println("Patient Weight (kg): " + getWeight());
    }

    public double getBMI() {
        double bmi = 0;
        if(height == 0 || weight == 0){
            System.out.println("BMI is invalid ");
            System.out.println("Your BMI is " + bmi);
        }
        else {
            bmi = getWeight() / ((getHeight()/100) * (getHeight()/100));
            System.out.println("Your BMI is " + bmi);
        }
        return 0;
    }
}
