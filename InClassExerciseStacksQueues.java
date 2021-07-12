import java.util.*;

public class InClassExerciseStacksQueues {
    public static void main( String[] args ) {
        int[] data = {2, 8, 3, 19, 7, 3, 2, 3, 2, 7, 12, -8, 4};
        Stack<Integer> numbers = new Stack<Integer>();
        for ( int i : data ) {
            numbers.push( i );
        }
        System.out.println("data: " + numbers);
        int min = removeMin( numbers );
        System.out.println("min = " + min );
        System.out.println("data: " + numbers);
        min = removeMin( numbers );
        System.out.println("min = " + min );
        System.out.println("data: " + numbers);
        
        
        String group = "{}[]()";
        System.out.println( isMatching( group ) );
        group = "{[()]}";
        System.out.println( isMatching( group ) );
        group = "{[()})";
        System.out.println( isMatching( group ) );
        
    }
    public static int removeMin( Stack<Integer> s ) {//0(n)
        Queue<Integer> q = new LinkedList<>();
        int min = s.peek();
        while(!s.isEmpty()){
            int value = s.pop();
            q.add(value);
            if(value < min){
                min = value;
            }   
        }
        while(!q.isEmpty()){
            if(q.peek() != min){
                s.push(q.remove());
            }
            else{
                q.remove();
            }
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
        while(!q.isEmpty()){
            s.push(q.remove());
        }
        return min;
    }

    public static boolean isMatching( String str ) {//O(n)
        Stack<Character> lefts = new Stack<>();
        String leftSymbols ="{[(";
        String rightSymbols ="}])";
        for(int i = 0; i < str.length(); i++){
           char ch = str.charAt(i);
              if(leftSymbols.indexOf(ch) > -1){
                 lefts.push(ch);
              }
              else if (rightSymbols.indexOf(ch) > -1){
                  if(rightSymbols.indexOf(ch) == leftSymbols.indexOf(lefts.peek())){
                       lefts.pop();
                  }
                  else{
                     return false;
                  }
            }      
        }
        return true;
    }
    public static Queue<Integer> primes( int n ) {
        Queue<Integer> q = new LinkedList<Integer>();
        
        return q;
    }
}