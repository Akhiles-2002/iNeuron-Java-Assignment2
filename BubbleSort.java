
//Sorting An Array using Bubble Sort Algorithm

public class BubbleSort {
    public static void main(String []args){
        
        int []arr={10,20,50,80,100,90,50,60,40,30};

        for(int i=0; i<arr.length; i++)
        {
            for(int j=1; j<arr.length-i; j++)
            {
                if(arr[j]<arr[j-1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }

        for(int element:arr)
        {
            System.out.print(element+" ");
        }

    }
}
