// Java Program for Insertion Sort
// Time Complexity : O(N^2)
// Space Complexity : O(1)
// Best Case, Worst Case, Avg Case : O(n^2)
class SelectionSort
{
    // Main method, responsible for the execution of the code
    public static void main(String args[])
    {
        int []arr={10,20,50,80,100,90,50,60,40,30};

        selectionSort(arr);

        System.out.println("Sorted array");

        printArray(arr);
    }

    static void selectionSort(int a[])
    {
        int len = a.length;      
        
        // One by one move boundary of unsorted sub-array
        for (int i = 0; i < len-1; i++)
        {
            // Find the minimum element in unsorted array
            int min = i;
            for (int j = i+1; j < len; j++)
                if (a[j] < a[min])
                    min = j;

            // Swap the found minimum element with the
            // first element in unsorted part of the array
            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;
        }
    }

    // Prints the sorted array
    static void printArray(int a[])
    {
        int len = a.length;
        for (int i=0; i<len; ++i)
            System.out.print(a[i] + " ");

        System.out.println();
    }
}