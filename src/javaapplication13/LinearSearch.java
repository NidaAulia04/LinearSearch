
package javaapplication13;

public class LinearSearch {
    public static int linearSearch(int[] arr, int X){    
            for(int i=0;i<arr.length;i++){    
                if(arr[i] == X){    
                    return i;    
                }    
            }    
            return -1;    
        }    
        public static void main(String a[]){    
            int[] L= {10,20,30,50,70,90};    
            int X = 50;    
            System.out.println(X+" Ditemukan Pada index: "+linearSearch(L, X));    
 
    }
    
}
