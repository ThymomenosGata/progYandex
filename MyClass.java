import java.util.Scanner;

public class MyClass {
	
public static String kon(String str1, String str2){
	
	String str = "";
	int one = str1.length();
	int two = str2.length();
	for(int i =1;i<=one;i=i+two){
    	str+=str2;
	}
	if(str.equals(str1))
    	str = "Yes";
	else
		str = "No";
	return str;
}
	
public static void main(String[ ] args) {
	Scanner scanner = new Scanner(System.in);
	String str1 = scanner.next();
	String str2 = scanner.next();
	String str = "";
	str = kon(str1,str2);
	System.out.println(str);
}
}
