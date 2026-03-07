class Solution {
    public int getSecondLargest(int[] arr) {
        int largest = -1;
        int second = -1;
        for(int i : arr){
            if(i>largest){
                second = largest;
                largest = i;
            }
            else if(i>second && i<largest){
                second = i;
            }
        }
        return second;
    }
}