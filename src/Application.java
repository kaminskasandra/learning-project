public class Application {
    public static void main(String[] args) {

        int age = 43;

        if (age < 15) {
            System.out.println("you have to learn");
        } else if (age >= 18 && age < 65){
            System.out.println("you can work");
        } else if (age >= 65){
            System.out.println("you can retire");

        }
}}
