public class LinearSearch {
    public static void main(String[] args) {
        int arr[]={32,23,64,34,98,23};
        int element =64;
        int result=linearSearch(arr,64);

    }
    public static int linearSearch(int arr[],int element){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==element){
                System.out.println(i);
                break;
            }
            }
        return -1;

    }
    }




