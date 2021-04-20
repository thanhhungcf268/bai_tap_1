public class FindBinary {
    public static void main(String[] args) {
        System.out.println(binarySearch(12));
    }
    static int binarySearch(int a){
        int[] array = {1,2,3,4,5,6,7,8,9,10,121};
        int low = 0;
        int high = array.length-1;
        while (low<=high){
            int midl = (low+high)/2;
            if (a==array[midl]){
                return midl;
            }else {
                if (array[midl]>a){
                    high = midl-1;
                }else {
                    low = midl+1;
                }
            }
        }
        return -1;
    }
}
