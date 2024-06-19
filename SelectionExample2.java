public class SelectionExample2{
    public static void main(String[] args) {
        int HCI = 71;
        int API = 64;
        int NDM = 51;
        int JAVA = 42;
        int Structuredcabling = 33;

        int average = (HCI + API + NDM + JAVA + Structuredcabling) / 5;

        if (average >= 0 && average <= 39) {
            System.out.println("fail");
        } else if (average >= 40 && average <= 49) {
            System.out.println("D");
        } else if (average >= 50 && average <= 59) {
            System.out.println("C");
        } else if (average >= 60 && average <= 69) {
            System.out.println("B");
        } else if (average >= 70 && average <= 100) {
            System.out.println("A");
        }
    }
}
