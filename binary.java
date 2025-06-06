package chowdeswari;

public class binary {

	public static void main(String[] args) {
		
       int[] n = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int tar = 9; 
        int l = 0; 
        int r = n.length - 1; 
        boolean found = false; 
        
        while (l <= r) {
            int mid = (l + r) / 2; 

            
            if (n[mid] == tar) {
                System.out.println("Target " + tar + " found at index " + mid);
                found = true;
                break;
            } 
           
            else if (tar < n[mid]) {
                r = mid - 1; 
            } 
            
            else {
                l = mid + 1; 
            }
        }
        if (!found) {
            System.out.println("Target " + tar + " not found in the array.");
        }
    }
}