import java.util.*;

class Codechef {
    public static void main(String[] args) {
        String s = "aabbccefgh";
        String d = "abcef";

        // Frequency map for s
        Map<Character, Integer> h = new HashMap<>();
        for (char c : s.toCharArray()) {
            h.put(c, h.getOrDefault(c, 0) + 1);
        }

        // Frequency map for d
        Map<Character, Integer> h1 = new HashMap<>();
        for (char c : d.toCharArray()) {
            h1.put(c, h1.getOrDefault(c, 0) + 1);
        }

        // Print frequencies in s
        System.out.println("Frequencies in string s:");
        for (Map.Entry<Character, Integer> entry : h.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Print frequencies in d
        System.out.println("\nFrequencies in string d:");
        for (Map.Entry<Character, Integer> entry : h1.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Check for removed characters
        System.out.println("\nRemoved characters:");
        for (char key : h.keySet()) {
            int countInS = h.get(key);
            int countInD = h1.getOrDefault(key, 0);
            if (countInD != countInS) {
                System.out.println(key + " → Removed " + (countInS - countInD) + " time(s)");
            }
        }

        // Check for added characters
        System.out.println("\nAdded characters:");
        for (char key : h1.keySet()) {
            if (!h.containsKey(key)) {
                System.out.println(key + " → Added " + h1.get(key) + " time(s)");
            }
        }
    }
}
