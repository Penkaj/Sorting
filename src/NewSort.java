
public class NewSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {8,7,2,9,10}; 
		int size = arr.length;
		for(int i=0;i<size-1;i++){
	        int min=i;
	        for(int j=i+1;j<size;j++){
	            if(arr[min]>arr[j]){
	             min = j;
	            }   
	        }
	        int temp = arr[min];	     			
	        arr[min] = arr[i];
	        arr[i] = temp;
	    }
	   

	    for(int i=0;i<size;i++){
	    	System.out.print(arr[i] + " "); 
	    }

	}

}
