public class BinarySearch1 {
    //sử dụng đệ quy

    static int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
    static int binarySearch(int[] list, int low, int high, int value){
        int mid = low+(high-low)/2;
        if (high>=low){
            if (list[mid] == value){
                return mid;
            }
            if (list[mid] > value){
                return binarySearch(list,low,mid-1,value);
            }
            else {
                return binarySearch(list,mid+1,high,value);
            }
        }
        return -1;  //now high < low, key not found
    }

    public static void main(String[] args) {
        System.out.println( binarySearch(list, 0, 10, 45));
        System.out.println( binarySearch(list, 5, 13, 79));
        System.out.println( binarySearch(list, 4, 13, 59));
        System.out.println( binarySearch(list, 8, 13, 2));
        System.out.println( binarySearch(list, 0, 13, 69));
    }
}
