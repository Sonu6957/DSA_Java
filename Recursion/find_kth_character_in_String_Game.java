public class find_kth_character_in_String_Game {
 public static void main(String[] args) {
     StringBuilder sb = new StringBuilder("a");
     System.out.print(kth(sb,10));
 }
 static char kth(StringBuilder stringb,int target){
    String string = stringb.toString();
    if(string.length()>=target){
        return string.charAt(target-1);
    }
    else{
        for(int i=0;i<string.length();i++){
            char nextChar = (char)((int)string.charAt(i)+1);
            stringb.append(nextChar);
        }
        return kth(stringb,target);
    }
 }

}

