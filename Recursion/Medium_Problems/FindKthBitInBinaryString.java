package Medium_Problems;

public class FindKthBitInBinaryString {
    public static void main(String[] args) {
        System.out.println(ans(4,11));

    }
    static char ans(int n , int k){
        StringBuilder sb = new StringBuilder();
        sb.append(findS(n));
        System.out.println(sb);
        char ans = sb.charAt(k-1);
        return ans;
    }
    static StringBuilder findS(int n){
        if(n==1){
            StringBuilder sb = new StringBuilder();
            sb.append('0');
            return sb;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(findS(n-1));
        sb.append('1');
        sb.append(reverse(invert(findS(n-1))));
        return sb;

    }
    static StringBuilder invert(StringBuilder sb){
        for (int i = 0; i < sb.length(); i++) {
            if(sb.charAt(i)=='0'){
                sb.setCharAt(i, '1');
            }
            else if(sb.charAt(i)=='1'){
                sb.setCharAt(i, '0');
            }
        }
        return sb; 
    }
    static StringBuilder reverse(StringBuilder sb){
        return sb.reverse();
    }
}
