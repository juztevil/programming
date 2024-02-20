import java.util.*;
class rotateAnArray{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the number of elements in the array: ");
		int[] arr=new int[scan.nextInt()];
		System.out.println("Enter "+arr.length+" elements: ");
		for(int i=0;i<arr.length;++i)
		arr[i]=scan.nextInt();
		System.out.print("How many rotations: ");
		int rotations=scan.nextInt();
		System.out.print("For rotation direction\n1) Clock Wise\n2)Anti Clock Wise\nEnter the choice: ");
		int rotationDirection=scan.nextInt();
		if(rotationDirection==1)
		rotateMeInClockWise(arr,rotations);
		else
		rotateMeInAntiClockWise(arr,rotations);
	}
	public static void rotateMeInClockWise(int[] a,int n){
		for(int i=0;i<n;++i){
			System.out.println("In the "+(i+1)+" round: ");
			int temp=a[a.length-1];
			for(int j=a.length-1;j>0;--j)
			a[j]=a[j-1];
			a[0]=temp;
			printMe(a);
			System.out.println();
		}
	}	
	public static void rotateMeInAntiClockWise(int[] a,int n){
		for(int i=0;i<n;++i){
			System.out.println("In the "+(i+1)+" round: ");
			int temp=a[0];
			for(int j=0;j<a.length-1;++j)
			a[j]=a[j+1];
			a[a.length-1]=temp;
			printMe(a);
			System.out.println();
		}
	}
	public static void printMe(int[] arr){
		for(int i=0;i<arr.length;++i)
		System.out.print(arr[i]+"  ");
	}
}


/*

Output
Enter the number of elements in the array: 6
Enter 6 elements:
12
13
14
15
16
17
How many rotations: 9
For rotation direction
1) Clock Wise
2)Anti Clock Wise
Enter the choice: 1
In the 1 round:
17  12  13  14  15  16
In the 2 round:
16  17  12  13  14  15
In the 3 round:
15  16  17  12  13  14
In the 4 round:
14  15  16  17  12  13
In the 5 round:
13  14  15  16  17  12
In the 6 round:
12  13  14  15  16  17
In the 7 round:
17  12  13  14  15  16
In the 8 round:
16  17  12  13  14  15
In the 9 round:
15  16  17  12  13  14




Enter the number of elements in the array: 6
Enter 6 elements:
41
42
43
44
45
46
How many rotations: 6
For rotation direction
1) Clock Wise
2)Anti Clock Wise
Enter the choice: 2
In the 1 round:
42  43  44  45  46  41
In the 2 round:
43  44  45  46  41  42
In the 3 round:
44  45  46  41  42  43
In the 4 round:
45  46  41  42  43  44
In the 5 round:
46  41  42  43  44  45
In the 6 round:
41  42  43  44  45  46

*/
