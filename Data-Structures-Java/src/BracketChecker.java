import java.util.Stack;

public class BracketChecker {
    private int position;

    private char [] opening;

    private char [] closing;

    private Stack<Character> stack;

    public BracketChecker(char[] opening, char[] closing) {
        this.opening = opening;
        this.closing = closing;
        this.stack = new Stack<>();
    }

    public int getPosition() {
        return position;
    }

    public boolean checker (String text){
        for (int i=0; i<text.toCharArray().length; i++) {
            if (text.charAt(i) == opening[0]) {
                stack.push(text.charAt(i));
            }

            if (text.charAt(i) == closing[0]) {
                if(stack.empty()){
                    return false;
                }
                stack.pop();
            }
        }
        return stack.empty();
    }
}
