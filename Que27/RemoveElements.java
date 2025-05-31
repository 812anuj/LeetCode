package Que27;

public record RemoveElements() {
    
    public int removeElements(int[] nums,int val){

        int k = 0 ;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k ;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {0,1,2,2,3,3,4,5,6,6,7,7,8} ;
         for (int i : arr) {
            System.out.print(i +" " );
        }
        System.out.println();
        System.out.println("Removing 2 from array.");
        int a = 2;
        RemoveElements re = new RemoveElements();
        int k = re.removeElements(arr, a);
        System.out.println("Remaining elements count (k): " + k);
        System.out.println("Updated Array: ");
        for (int i : arr) {
            System.out.print(i +" " );
        }
        System.out.println();
        System.out.println("Similary removin 3,6 and 7.");
        re.removeElements(arr, 3);
        re.removeElements(arr, 6);
        k = re.removeElements(arr, 7);
          System.out.println("Remaining elements count (k): " + k);
        System.out.println("Updated Array: ");
        for (int i : arr) {
            System.out.print(i +" " );
        }
    }



}
