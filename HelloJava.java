public class HelloJava {
    public static void main(String[] args) {
        System.out.println("Hello, Java!");

        // var keyword
        var hello = 12;
        var hello_double = 12.34;
        var hello_sum = hello + hello_double;
        int int_value = (int) hello_sum;
        System.out.printf("hello_sum: %f, int_value: %d%n", hello_sum, int_value);
    }
}
