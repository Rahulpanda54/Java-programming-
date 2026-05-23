public class second_smallest_element_array {
        public static void main(String[] args) {
            int arr[] = {1,2,3,4,5};
            for(int i=0;i<arr.length;i++){
                for(int j=i+1;j<arr.length;j++){
                    if(arr[i] > arr[j]){
                        int temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp; 
                    }
                }
            }
          System.out.println(arr[1]);
        }
    }