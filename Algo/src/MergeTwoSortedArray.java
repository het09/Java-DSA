
public class MergeTwoSortedArray {

    public static void mergeArrays(int[] num1, int[] num2, int n1, 
                                int n2, int[] arrFinal) 
    { 
        int i = 0, j = 0, k = 0; 
      
        while (i<n1 && j <n2) 
        { 
            if (num1[i] < num2[j]) { 
                arrFinal[k] = num1[i];
                k++;
                i++;
            }
            else {
                arrFinal[k] = num2[j];
                k++;
                j++;
            }
        }
     
      
        while (i < n1) {
            arrFinal[k] = num1[i];
            k++;
            i++;
        }
      
        while (j < n2) { 
            arrFinal[k] = num2[j];
            k++;
            j++;
        }
    } 
      
    public static void main (String[] args)  
    { 
        int[] num1 = {1, 3, 5, 7}; 
        int n1 = num1.length; 
      
        int[] num2 = {2, 4, 6, 8}; 
        int n2 = num2.length; 
      
        int[] arrFinal = new int[n1+n2]; 
          
        mergeArrays(num1, num2, n1, n2, arrFinal); 
      
        System.out.println("Array after merging"); 
        for (int i=0; i < n1+n2; i++) 
            System.out.print(arrFinal[i] + " "); 
    } 

}
