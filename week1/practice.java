import java.util.Scanner;

public class practice {
    
    public static void main(String[] args) {

        System.out.println("HI MOM");
    }

    public static void findDupesHarder(String string) {
    	
    	String dupes = "";
    	
    	for (int i = 0; i < string.length()-1; i++) {
    		
    		for (int j = i+1; j < string.length(); j++) {
				
    			if(string.charAt(i) == string.charAt(j)) {
    				
    				// dupes = dupes.concat(Character.toString(string.charAt(j)));
                    dupes = dupes + Character.toString(string.charAt(j));
    				break;
    				
    			}
				
			}
			
		}

        //System.out.println(dupes);

        for (int i = 0; i < dupes.length(); i++) {

            string = string.replaceAll(Character.toString(dupes.charAt(i)), "");
            // System.out.println(string);
        }

        System.out.println(string);
    	
    }

}
