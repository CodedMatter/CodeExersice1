public class Checker {

    public boolean areParenThesisCloseAndNested(String string){
        int numOfParen = 0;
        for(char c : string.toCharArray()) {
            if(c == '('){
                numOfParen++;
            }
            else if(c == ')'){
                numOfParen--;
            }
            if(numOfParen == -1) return false;
        }

        return numOfParen == 0;
    }
}
