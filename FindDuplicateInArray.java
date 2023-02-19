//Find duplicates Present Array or not

class FindDuplicateInArray
{
    public static void main(String []args)
    {
        int []arr={10,20,30,50,60,30,50,10,90,100};

        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.print(arr[j]+" ");
                }
            }
        }        



    }
}