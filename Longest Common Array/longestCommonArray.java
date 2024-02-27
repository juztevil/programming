import java.util.*;
class longestCommonArray{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		String[] arr=new String[]{};
		System.out.println("The longest common array is "+longestCommonArray(arr));
	}
	public static String longestCommonArray(String[] arr){
		String small=min(arr);
		String returnStr="";
		for(int i=0;i<small.length();++i){
			boolean amIThere=true;
			for(int j=0;j<arr.length;++j){
				if( !(small.charAt(i)+"").equals(arr[j].charAt(i)+"") ){
					amIThere=false;
					break;
				}
			}
			if(amIThere)
			returnStr+=small.charAt(i);
			else
			break;
		}
		return returnStr;
	}
	public static String min(String[] arr){
		String small=arr[0];
		for(int j=1;j<arr.length;++j){
			if(small.length()>arr[j].length())
			small=arr[j];
		}
		return small;
	}
}


/*
The array
{"geeks for geeks","geek","geeks","gee"}

Output
programs>javac longestCommonArray.java

programs>java longestCommonArray
The longest common array is gee

The array 
{"unknown","unknownuser","vnkn","unknownit"}

Output
programs>javac longestCommonArray.java

programs>java longestCommonArray
The longest common array is
*/
