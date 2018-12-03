import java.util.*;

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class Library {


    public static void main(String[] args) {

    }

    public static int[] roll(int n) {

        int[] rollResultArray = new int[n];
        Random randomRoll = new Random();

        for (int i = 0; i < n; i++) {
            int rolledDie = randomRoll.nextInt(6) + 1;
            rollResultArray[i] = rolledDie;
        }
        return rollResultArray;
    }


    public static boolean containsDuplicates(String[] inputArray) {
        boolean duplicates = false;

        for (int i = 0; i < inputArray.length; i++) {
            for (int j = i + 1; j < inputArray.length; j++) {
                if (j != i && inputArray[j] == inputArray[i])
                    duplicates = true;
            }

        }
        return duplicates;
    }

    public static double calculateAverageOfArray(int[] inputArray) {
        int aggregate = 0;

        for (int i = 0; i < inputArray.length; i++) {
            aggregate += inputArray[i];
        }

        double average = (double) aggregate / inputArray.length;
        return average;

    }

    public static int[] lowestAverageArray(int[][] inputNestedArray) {

        int lowestArrayIndex = 0;

        for (int i = 1; i < inputNestedArray.length; i++) {
            if (calculateAverageOfArray(inputNestedArray[i]) < calculateAverageOfArray(inputNestedArray[lowestArrayIndex])) {
                lowestArrayIndex = i;
            }
        }
        return inputNestedArray[lowestArrayIndex];
    }


    /**
     * Section for Lab -03
     * Maps and File I/O
     */

    public static int getMaxValue(HashSet<Integer> element) {
        return Collections.max(element);
    }

    public static int getMinValue(HashSet<Integer> element) {
        return Collections.min(element);
    }


    public static HashSet<Integer> getMissingElement(int[][] dimensionalData) {

        HashSet<Integer> missingElement = new HashSet();

        for (int[] arrayOfInts : dimensionalData) {
            for (int value : arrayOfInts) {
                if (!missingElement.contains(value)) {
                    missingElement.add(value);
                }
            }
        }
        return missingElement;
    }

    public static List<String> getUniqueValue(int[][] dimensionalDataArray) {
        HashSet<Integer> missingElement = getMissingElement(dimensionalDataArray);
        List<String> outputList = new ArrayList<>();

        int maxValue = getMaxValue(missingElement);
        int minValue = getMinValue(missingElement);


        for (int i = minValue; i <= maxValue; i++) {
            if (!missingElement.contains(i)) {
                outputList.add("Never saw temperature: " + i);
            }
        }
        return outputList;
    }


    public static String tally(List<String> votesParameter) {
        HashMap<String, Integer> votesMap = new HashMap<>();



        for (String candidate : votesParameter) {
            if (!votesMap.containsKey(candidate)) {
                votesMap.put(candidate, 1);
            } else {
                votesMap.put(candidate, votesMap.get(candidate) + 1);
            }
        }

        return voting(votesMap) + " received the most votes!";


    }

    public static String voting(Map<String, Integer> votes) {

        Map.Entry<String, Integer> results = votes.entrySet().iterator().next();
        String candidate = results.getKey();
        int mostVotes = results.getValue();

        for (Map.Entry<String, Integer> map : votes.entrySet()) {
            int voteCount = map.getValue();
            if (voteCount > mostVotes) {
                mostVotes = voteCount;
                candidate = map.getKey();
            }
        }
        return candidate;
    }
}




