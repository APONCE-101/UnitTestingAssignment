public class Equations {

    public static void main(String[] args) {
        System.out.println(areaOfCircle(3));
    }

    public static double hypotenuseOfTriangle(double num1, double num2) {
        return Math.sqrt(Math.pow(num1, 2) + Math.pow(num2, 2));
    }

    public static double areaOfTriangle(double h, double b) {
        return (h * b) / 2;
    }

    public static double circumferenceOfCircle(double r) {
        return 2 * Math.PI * r;
    }

    public static double areaOfCircle(double r) {
        return Math.PI * Math.pow(r,2);
    }

    public static double surfaceAreaOfSphere(double r) {
        return 4 * Math.PI * Math.pow(r, 2);
    }

    public static double volumeOfSphere(double r) {
        return (4/3) * Math.PI * Math.pow(r, 3);
    }
}


