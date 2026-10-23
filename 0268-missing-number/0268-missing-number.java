class Solution {
    public int missingNumber(int[] arr) {
        int i = 0;
        while( i < arr.length){
            int currentIndex = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[currentIndex]){
                int temp = arr[i];
                arr[i] = arr[currentIndex];
                arr[currentIndex] = temp;
            }else{
                i++;
            }
        }
        for(int index = 0; index < arr.length; index++){
            if(arr[index] != index){
                return index;
            }
        }
        return arr.length;

    }
}