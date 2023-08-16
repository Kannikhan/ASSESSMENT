public class StringOperationsDemo {
    public static void main(String[] args) {
        // 1. String Initialization and Concatenation
        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + " " + lastName;
        System.out.println("Full Name: " + fullName);

        // 2. Length of a String
        String text = "Hello, World!";
        int length = text.length();
        System.out.println("Length of the String: " + length);

        // 3. Extract Substring
        String subString = text.substring(7);
        System.out.println("Substring: " + subString);

        // 4. String Comparison
        String str1 = "apple";
        String str2 = "banana";
        System.out.println("Equals: " + str1.equals(str2));
        System.out.println("IgnoreCase: " + str1.equalsIgnoreCase(str2));

        // 5. Searching within a String
        String sentence = "This is a simple example sentence.";
        boolean containsWord = sentence.contains("example");
        System.out.println("Contains 'example': " + containsWord);

        int indexOfWord = sentence.indexOf("simple");
        if (indexOfWord != -1) {
            System.out.println("Index of 'simple': " + indexOfWord);
        } else {
            System.out.println("'simple' not found in the string.");
        }
    }
}

