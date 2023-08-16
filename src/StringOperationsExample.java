public class StringOperationsExample {
    public static void main(String[] args) {
        // 1. String Initialization and Concatenation
        String str1 = "Hello";
        String str2 = "World";
        String result1 = str1 + " " + str2;
        System.out.println("Concatenated String: " + result1);

        // 2. Length of a String
        String text = "This is a sample text.";
        int length = text.length();
        System.out.println("Length of the String: " + length);

        // 3. Extract Substring
        String subString = text.substring(5, 15);
        System.out.println("SubString: " + subString);

        // 4. String Comparison
        String str3 = "apple";
        String str4 = "Apple";
        System.out.println("Case-sensitive Comparison: " + str3.equals(str4));
        System.out.println("Case-insensitive Comparison: " + str3.equalsIgnoreCase(str4));

        // 5. Searching within a String
        String searchStr = "sample";
        boolean contains = text.contains(searchStr);
        System.out.println("Contains 'sample': " + contains);

        int indexOfSample = text.indexOf(searchStr);
        if (indexOfSample != -1) {
            System.out.println("Index of 'sample': " + indexOfSample);
        } else {
            System.out.println("'sample' not found in the string.");
        }
    }
}

