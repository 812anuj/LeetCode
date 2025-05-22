package LeetCode.Que26;
//26. Remove Duplicates from Sorted Array
class RemoveDuplicates {

    public static void main(String[] args) {
        
        int[] a = new int[] {0, 0, 1, 1, 2, 2, 3, 3};

        RemoveDuplicates obj = new RemoveDuplicates();
       int k = obj.Operation(a);

       // ✅ Print the result
        System.out.println("Unique elements count: " + k);
        System.out.print("Modified array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(a[i] + " ");
        }
        
    }

    public int Operation(int[] num){
        if(num.length == 0) return 0 ;
        int i = 0;
        for (int j = 1; j < num.length; j++) {
            if (num[j] != num[i] ) {
                i++;
                num[i] = num [j];
            }
        }



        return i+1;
    }
    
}