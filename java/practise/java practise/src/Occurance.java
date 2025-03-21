public class Occurance {

    public static int occur(String statement, char c){
        int count = 0;
        for(char letter: statement.toCharArray()){
            if(letter == c){
                count += 1;
            }
        }
        return count;
    }
}
