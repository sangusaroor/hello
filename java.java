public class java {
    private String name;
    private int birthYear;

    public java(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public void displayStudentInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + calculateAge() + " years");
    }

    private int calculateAge() {
        int currentYear = 2024; // Assuming current year is 2024
        return currentYear - birthYear;
    }

    public static void main(String[] args) {
        java student = new java("John Doe", 2000);
        student.displayStudentInfo();
    }
}
