/* Problem :- 
    Given a array of characters(String), return the array without a given character.
    Here in this case the character is 'a'.
    
    Approach :- Recursion
    Time :- O(n)
    Space :-  O(n)

*/


public class RemovalofCharacter{
    public static void main(String[] args) {
        String str = "abbcad";
        StringBuilder sb = new StringBuilder(" ");
        System.out.println(" "+removalOfchar(str, sb));
    }
    //Approach 1 :- Use of an extra string to store the resulted array.
    static StringBuilder removalOfchar(String str,StringBuilder resultstr){
        if(str==""){
            return resultstr;
        }
        char firstchar = str.charAt(0);
        if(firstchar != 'a'){
            resultstr.append(firstchar);
        }
        
            return removalOfchar(str.substring(1,str.length()), resultstr);
    }
    
}