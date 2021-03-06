class Solution {
    public void sortColors(int[] a) {

        int l = 0, m = 0, h = a.length-1;
        
        while(m<=h){
            
            if(a[m] == 0){
                swap(a,l,m);
                l++;
                m++;
            }else if(a[m] == 1){
                m++;
            }else{
                swap(a,m,h);
                h--;
            }
            
        }
    }
    
    public void swap(int[] arr, int x, int y){
        int t = arr[x];
            arr[x] = arr[y];
            arr[y] = t;
    }
}
