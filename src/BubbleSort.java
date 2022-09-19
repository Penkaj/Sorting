
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {8,7,2,9,10};        
		int n = arr.length;
		        
		for (int i = 0; i < n; i++)
		            
			for (int j = 0; j < n - i - 1; j++)
		                
				if (arr[j] > arr[j + 1]) {
		                    // swap arr[j+1] and arr[j]
		                    
					int temp = arr[j];
		                    
					arr[j] = arr[j + 1];
		                    
					arr[j + 1] = temp;
					
				}
		   for(int i=0; i < arr.length; i++){  
               System.out.print(arr[i] + " ");  
       }  

	}
}