import static java.lang.Double.parseDouble;
import static java.lang.System.out; // to allow use out.println

public class HelloJava {
    public static void main(String[] args) {
        System.out.println("Hello, Java!");

        // var keyword
        var hello = 12;
        var hello_double = 12.34;
        var hello_sum = hello + hello_double;
        int int_value = (int) hello_sum;
        System.out.printf("hello_sum: %f, int_value: %d%n", hello_sum, int_value);

        // Compare strings in Java
        String a = "test";
        String b = "test";
        String c = new String("test");
        System.out.println(a == b);  // true (both point to the same string literal in the string pool)
        System.out.println(b == "test");  // true (b points to the same string literal in the string pool)
        System.out.println(a == c);  // false (a points to a string literal in the pool, c points
        // to a new String object)
        //In the last line (System.out.print(a == c)), a points to a string literal in the string pool,
        // while c points to a new String object created using the new keyword.
        // Even though the content of the strings is the same,
        // the == operator checks whether the references are the same, and in this case, they are not.
        //
        //If you want to compare the content of the strings, you should use the equals method:
        System.out.println(a.equals(c));  // true (both have the same content)

        // Parsing the value
        String word = "12.44";
        var value = parseDouble(word);
        out.printf("Converted: %f", value);

        String rubbish = "rubbish";
        //var result = parseDouble(rubbish); // This will throw java.lang.NumberFormatException
        // Java doesn't have a built-in tryParseDouble method like some other languages (e.g., C#).
        // However, you can create a utility method to achieve similar functionality.
        double result = tryParseDouble(rubbish, 0);
        System.out.println("Result: " + result);

        // Records
        // This is quite cool
        Student student = new Student("Bill", 29);
    }

    private static double tryParseDouble(String value, double defaultValue) {
        try {
            return Double.parseDouble(value);
        } catch (NumberFormatException e) {
            // Handle the exception (conversion failure)
            System.out.println("Error parsing the double value. Using default value: " + defaultValue);
            return defaultValue;
        }
    }

}
