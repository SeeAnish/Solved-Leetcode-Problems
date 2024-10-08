class Solution {
    public int[] replaceElements(int[] arr) {
        if(arr.length == 1) return new int[]{-1};
        int temp = 0, max = -1;
        for(int i = arr.length - 1; i >= 0; i--)
        { 
            temp = arr[i];
            arr[i] = max;
            max = Math.max(temp, max);
        }
        return arr;
    }
}