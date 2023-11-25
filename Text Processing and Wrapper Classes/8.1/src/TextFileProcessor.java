public class TextFileProcessor{

    public static int wordCount(String s){
        int count = 0;

        for(int i = 0; i < s.length(); i ++){
            char c = s.charAt(i);

            if(Character.isWhitespace(c)){
                count++;
            }

        }
        return count;
    }

    public static int countWe(String s){
        int count = 0;
        int index = 0;
        String temp = s.toLowerCase();

        while(index < s.length()){ // Within the length of the string

            if(temp.contains("we")){ // If it contains "we"
                count ++;
                int i = temp.indexOf("we"); // Find and save the location you found "we" at
                index += i+2; // Move the index to the point where you found "we" and move it past the "we"
                temp = s.substring(index).toLowerCase(); // And substring the rest of the string so you can check from there again
            }else{

                break;
            }
        }
        
        return count; // returning the we count.
    }

    public static String capitalizePeople(String s){
        String temp = s;
        temp = temp.replace("people", "People");
        return temp;
        
    }
}
