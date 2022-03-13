import java.util.regex.*;    
import java.util.*;    
public class EmailValidation{  
    public static void main(String[]args){  
       
    	ArrayList<String> emails = new ArrayList<String>();  
        emails.add("bhfghfgh@domain.co.in");  
        emails.add("bhjjgh@domain.com");  
        emails.add("gbhgh.name@domain.com");  
        emails.add("yjjnj#@domain.co.in");  
        emails.add("jkhj@domain.com");  
        emails.add("abc@domaincom"); 
        
        //Adding invalid emails in list  
        emails.add("ghbg@yahoo.com");  
        emails.add("vgfhg#domain.com"); 
        
        //Regular Expression   
         String regex = "^(.+)@(.+)$";  
        //Compile regular expression to get the pattern  
        Pattern pattern = Pattern.compile(regex);  
        //Iterate emails array list  
        for(String email : emails){  
            //Create instance of matcher   
            Matcher matcher = pattern.matcher(email);  
            System.out.println(email +" : "+ matcher.matches()+"\n");  
        }  
    }  
}  

