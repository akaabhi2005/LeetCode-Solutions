class Solution {
    public int findDuplicate(int[] arr) {
        int i = 0;

        while(i < arr.length){
            int currentIndex = arr[i] - 1;
            if(arr[i] != arr[currentIndex]){
                int temp  = arr[i];
                arr[i] = arr[currentIndex];
                arr[currentIndex] = temp;
            }else{
                i++;
            }
        }  
        for(int index = 0; index < arr.length; index++){
            if(arr[index] != index + 1){
                return arr[index];
            }
        }
        return -1;
   }     

}