class Solution {
    int missingNum(int arr[]) {
        // code here
        int n = arr.length;
        if(arr[0] == 2 && arr.length == 1){
            return 1;
        }
        if(arr.length == 1){
            return 2;
        }
        int sum = 0;
        int sum1 = 0;
        for(int i = 1; i<=n+1; i++){
            sum = sum+i;
        }
        for(int i = 0; i<arr.length; i++){
            sum1 = sum1+arr[i];
        }
        return sum-sum1;
    }

}

// This is solution of missing element in array from gfg
// click the below link to practice
// https://www.geeksforgeeks.org/problems/missing-number-in-array1416/1?page=1&category=Arrays,Java&sortBy=submissions
