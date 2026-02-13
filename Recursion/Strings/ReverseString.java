/* Problem :- 
    Write a function that reverses a string. The input string is given as an array of characters s.

    You must do this by modifying the input array in-place with O(1) extra memory.
    
    Approach :- Recursion
    Time :- O(n)
    Space :-  O(n)

*/

class ReverseString {
    public static void main(String[] args){
        char[] s = {'h','e','l','l','o'};
        swap(s,0,s.length-1);
        System.err.println(s);
    }
    static void swap(char[]s ,int first, int second){
        if(first>=second){
            return;
        }
        char temp = s[first];
        s[first]=s[second];
        s[second] = temp;
        swap(s , first + 1, second - 1);
    }
}