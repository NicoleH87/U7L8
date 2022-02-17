import java.util.ArrayList;

public class Sort
{
    // Part A.  Which Sort is Which?
    public static void selectionSort(int[] elements)
    {
        int counter = 0;
        for (int j = 0; j < elements.length - 1; j++)
        {
            int minIndex = j;
            for (int k = j + 1; k < elements.length; k++)
            {
                counter++;
                if (elements[k] < elements[minIndex])
                {
                    minIndex = k;
                }
            }
            int temp = elements[j];
            elements[j] = elements[minIndex];
            elements[minIndex] = temp;
        }
        System.out.println("Selection sort, number of iterations: " + counter);
    }

    public static void insertionSort(int[] elements)
    {
        int counter = 0;
        for (int j = 1; j < elements.length; j++)
        {
            int temp = elements[j];
            int possibleIndex = j;
            while (possibleIndex > 0 && temp < elements[possibleIndex - 1])
            {
                counter++;
                elements[possibleIndex] = elements[possibleIndex - 1];
                possibleIndex--;
            }
            elements[possibleIndex] = temp;
        }
        System.out.println("Insertion sort, number of iterations: " + counter);
    }

    // Part C.  Sorting a 1000-word list!
    public static void selectionSortWordList(ArrayList<String> words)
    {
        for(int i = 0; i < words.size(); i++)
        {
            int minIndex = i;
            for (int t = i + 1; t < words.size(); t++)
            {
                if (words.get(minIndex).compareTo(words.get(t)) > 0)
                {
                    minIndex = t;
                }
            }
            String temp = words.get(i);
            words.set(i, words.get(minIndex));
            words.set(minIndex, temp);
        }
    }

    public static void insertionSortWordList(ArrayList<String> words)
    {
        for (int i = 1; i < words.size(); i++) {
            String temp = words.get(i);
            int possibleIndex = i;
            while (possibleIndex > 0 && temp.compareTo(words.get(possibleIndex - 1)) < 0) {
                words.set(possibleIndex, words.get(possibleIndex - 1));
                possibleIndex--;
            }
            words.set(possibleIndex, temp);
        }
    }
}
