public class Test{
	public static void main(String[] args){
		//System.out.println("ddddddddd");
		int[] arr = {6,7,8,1,4,6,7,2,3,4,67,8,111,3,7,4,7,3};
		bs(arr);
		print(arr);
	}

	static void bs (int[] arr){
		for(int i = 0; i < arr.length; i++){
			int index = i;
			int small = arr[i];
			for(int j = i + 1; j< arr.length ; j++){
				if (arr[j]< small){
					index = j;
					small = arr[j];
				}
			}
			int tmp = arr[index];
			arr[index] = arr[i];
			arr[i] = tmp;
		}
		// for(int i = 0; i < arr.length; i ++){
		// 	for (int j = 1; j< arr.length-i; j++){
		// 		if(arr[j]<arr[j-1]){
		// 			int tmp = arr[j];
		// 			arr[j] = arr[j-1];
		// 			arr[j-1] = tmp;
		// 		}
		// 	}
		// }
	}

	static void print(int[] arr){

		for(int i : arr){
			System.out.print(i+"  ");
		}

	}
}