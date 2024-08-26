public class DuplicateWord {
    public static void main(String args[]) {
        String str = "big black bug bit a big black dog";
        int count;

        // Convert the string to lowercase
        str = str.toLowerCase();

        // Split the string into words
        String words[] = str.split(" ");

        System.out.println("Duplicate words in a given string:");

        // Iterate through the words array
        for (int i = 0; i < words.length; i++) {
            count = 1;

            // Check for duplicate words
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                    // Mark the word as "0" to avoid counting it again
                    words[j] = "0";
                }
            }

            // If a word is found more than once and is not marked as "0"
            if (count > 1 && !words[i].equals("0")) {
                System.out.println(words[i]);
            }
        }
    }
}
