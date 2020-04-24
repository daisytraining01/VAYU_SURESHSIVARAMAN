package Project;

public class Test5 {
	public static void main(String[] args) {  
        String str1 = "REST ASSURED";  
        String str2 = "SURESH";
        
      //  System.out.println(charRemoveAt(str, 3));
        if (str1.equals(str2)){
        	System.out.println("Strings are equal");
        	
        }
        else
        {
        	System.out.println("Strings are not equal");
        }
        System.out.println(charRemoveAt(str1, 2));
     }  
     public static String charRemoveAt(String str1, int p) {  
        return str1.substring(0, p) + str1.substring(p + 1);  
     }  


}

/*Output
Strings are not equal
RET ASSURED
*/
