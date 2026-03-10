public class peakelement {
    public static void main(String[] args) {
        int arr[] = {7, 2, 5, 3,1};
        int l = 0;
        int r = 1;
        int n = arr.length;
        for(int i = 0; i<n; i++){
            l=(i-1+arr.length)%n;
            r=(i+1)%n;
            if(arr[i]>arr[l] && arr[i]>arr[r]){
                System.out.println(arr[i]);
                break;
            }

        }
    }
}

//find peak element in circular array
