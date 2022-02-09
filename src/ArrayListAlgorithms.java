import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class ArrayListAlgorithms {
    /**
     * Returns true if any of the elements in stringList contain
     * target as a substring; false otherwise.
     * <p>
     * Does NOT mutate (modify) elements of stringList.
     * PRECONDITION: stringList.size() > 0
     *
     * @param stringList original arraylist of Strings
     * @return true if target is found in any of the strings, false otherwise
     */
    public static boolean containsTarget(ArrayList<String> stringList, String target) {
        boolean x = false;
        for (int i = 0; i < stringList.size(); i++) {
            String e = stringList.get(i);
            if (e.indexOf(target) == -1) {
                x = true;
            } else {
                x = false;
            }
        }
        return x;

    }

    /**
     * Returns number of elements in intList that are less than the
     * average of all elements.
     * <p>
     * Does NOT mutate (modify) elements of intList.
     * PRECONDITION: intList.size() > 0
     *
     * @param intList original arraylist of Integers
     * @return the number of ints in intList that are less than the average
     */
    public static int belowAverage(ArrayList<Integer> intList) {
        int count = 0;
        double average = 0;
        for (int i = 0; i < intList.size(); i++) {
            average += intList.get(i);
        }
        average = average / intList.size();
        for (int b = 0; b < intList.size(); b++) {
            if (intList.get(b) < average) {
                count++;
            }
        }
        return count;
    }

    /**
     * Replaces all words in wordList that end in "s" with the all-uppercase
     * version of the word.  For example, "apples" should be replaced with "APPLES".
     * Assume all letters of all words in wordList are lowercase initially (no need
     * to worry about checking for case or converting first to lowercase)
     * <p>
     * DOES mutate (modify) elements of wordList.
     * PRECONDITION: wordList.size() > 0
     *
     * @param wordList original arraylist of words
     */
    public static void replaceWithCaps(ArrayList<String> wordList) {
        for (int i = 0; i < wordList.size(); i++) {
            String x = wordList.get(i);
            if (x.substring(x.length() - 1).equals("s")) {
                x = x.toUpperCase();
                wordList.set(i, x);
            }
        }
    }

    public static int indexOfMinimum(ArrayList<Integer> intList) {
        int minimum = intList.get(0);
        int index = 0;
        for (int i = 0; i < intList.size(); i++) {
            if (intList.get(i) < minimum) {
                minimum = intList.get(i);
                index = i;
            }
        }
        return index;

    }

    public static boolean areIdentical(ArrayList<Integer> numList1, ArrayList<Integer> numList2) {
        boolean x = false;
        String a = "";
        String b = "";
        if (numList1.size() == numList2.size()) {
            for (int i = 0; i < numList1.size(); i++) {
                a += numList1.get(i);
                b += numList2.get(i);
            }
        }
        if (a.equals(b)) {
            x = true;
        }

        return x;
    }

    public static void removeOdds(ArrayList<Integer> numList) {
        for (int i = 0; i < numList.size(); i++) {
            if (numList.get(i) % 2 == 1) {
                numList.remove(i);
                i--;
            }
        }

    }

    public static void wackyVowels(ArrayList<String> wordList) {

        for (int i = 0; i < wordList.size(); i++) {
            if (wordList.get(i).indexOf("a") != -1) {
                wordList.remove(i);

            }
            if (wordList.get(i).indexOf("e") != -1) {
                wordList.remove(i);

            }
            if (wordList.get(i).indexOf("i") != -1) {
                wordList.remove(i);

            }
            if (wordList.get(i).indexOf("o") != -1) {
                wordList.remove(i);

            }
            i--;
        }
    }

    public static void duplicateUpperAfter(ArrayList<String> wordList) {
        for (int i = 0; i < wordList.size(); i++) {
            wordList.add(i + 1, wordList.get(i).toUpperCase());
            i++;
        }

    }

    public static void duplicateUpperEnd(ArrayList<String> wordList) {
        int size = wordList.size();
        for (int i = 0; i < size; i++) {
            wordList.add(wordList.get(i).toUpperCase());

        }
    }

    public static void moveBWords(ArrayList<String> wordList)
    {
        int size = wordList.size();
        int index=0;
        for (int i = 0; i < size; i++) {
            if (wordList.get(i).indexOf("b")==0){
                String temp= wordList.get(i);
                wordList.remove(i);
                wordList.add(index,temp);
                index++;

            }
        }
    }
    public static ArrayList<Integer> modes(int[] numList)
    {
        ArrayList <Integer> modes= new  ArrayList <Integer>();
        int maxValue = 0, maxCount = 0, i, j;

        for (i = 0; i < numList.length; ++i) {
            int count = 0;
            for (j = 0; j <  numList.length; ++j) {
                if (numList[j] == numList[i])
                    ++count;
            }

            if (count > maxCount) {
                maxCount = count;
                maxValue = numList[i];

            }
            modes. add(i, maxValue);
        }

     return modes;
    }
    }







