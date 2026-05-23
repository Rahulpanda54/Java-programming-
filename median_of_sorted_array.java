public class median_of_sorted_array{
      public static int median(int arr1[], int arr2[]){

        int n1 = arr1.length;
        int n2 = arr2.length;

        int n = (n1 + n2);

        int idx2 = n/2;
        int idx1 = idx2-1;

        int i=0;  int j=0; 

        int ele1 = 0; int ele2 = 0;  int cnt = 0;

        while(i<n1 && j<n2){

            if(arr1[i] <= arr2[j]){
                  
                if(cnt == idx1){
                    ele1 = arr1[i];
                }

                if(cnt == idx2){
                    ele2 = arr1[i];
                }

                cnt++;
                i++;
            }

            else{
                    if(cnt == idx1){
                        ele1 = arr2[j];
                     }

                    if(cnt == idx2){
                        ele2 = arr2[j];
                     }

                    cnt++;
                    j++;
               }
        }

        while(i<n1){

            if(cnt == idx1){

                ele1 = arr1[i];
            }

            if(cnt == idx2){

                ele2 = arr1[i];
            }

            cnt++; i++;
        }

        while(j<n2){

            if(cnt == idx1){

                ele1 = arr2[j];
            }

            if(cnt == idx2){

                ele2 = arr2[j];
            }

            cnt++;
            j++;
        }

        if(n%2 == 1){
            return ele2;
        }

        else{
                return (int)((ele1 + ele2)/2.0);
            }
      }

    public static void main(String[] args) {
        
        int arr1[] = {1,2,3};
        int arr2[] = {4, 5};

        System.out.println(" The median is : " + median(arr1, arr2));
    }
    
}
