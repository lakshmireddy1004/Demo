public class BubbleSort {

	public static void main(String[] args) {
		
		int[] array = {20,1,26,55,-55,36,81};
		for(int i=array.length-1;i>0;i--)
		{
			for(int j=0;j<i;j++)
			{
				if(array[j]>array[j+1])
				swap(array,j,j+1);
			}
		}

	}
	
	
	
	public static void swap(int[] arr, int i, int j)
	{
		if(i==j)
			return;
		
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
