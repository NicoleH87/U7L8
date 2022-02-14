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
                if (elements[k] < elements[minIndex])
                {
                    minIndex = k;
                }
                counter++;
            }
            int temp = elements[j];
            elements[j] = elements[minIndex];
            elements[minIndex] = temp;
        }
        System.out.println(counter);
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
                elements[possibleIndex] = elements[possibleIndex - 1];
                possibleIndex--;
                counter++;
            }
            elements[possibleIndex] = temp;
        }
        System.out.println(counter);
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
            while (possibleIndex > 0 && words.get(i).compareTo(words.get(i - 1)) < 1) {
                words.set(i, words.get(i - 1));
                possibleIndex--;
            }
            words.set(possibleIndex, temp);
        }
    }
}
