import java.util.*

public class linearSearch{

public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int[] arr = {10,23,4,5,6,7,8,14,45,65};

//arr=(10,5,3,2,7,8,14,78,34,23);
int n = arr.length;
int target = 14;
for(int a=0;a<n;a++){
if (arr[a] == target){
System.out.println("Element found at :" + a);
}else{
 System.out.println("Element not found");
}
}

}

}
