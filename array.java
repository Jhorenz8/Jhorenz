public class ArrayActivity {
    public static void main(String[] args) {
        double[] grades = {1.25, 1.50, 2.0, 1.0, 2.50, 1.50, 3.0, 2.25, 1.75, 2.75};

        System.out.println("Lowest: " + grades[6]);
        System.out.println("Highest: " + grades[3]);
        System.out.println("Last: " + grades[grades.length - 1] + "\n");

        for (int i = 0; i < grades.length; i++) {
            System.out.println("Grade[" + i + "] = " + grades[i]);
        }
        for (double g : grades) {
            System.out.print("\nGrade: " + g);
        }
        double sum = 0;
        for (double g : grades) {
            sum += g;
        }
        double average = sum / grades.length;
        System.out.println("\nAverage grade: " + average);
    }
}
