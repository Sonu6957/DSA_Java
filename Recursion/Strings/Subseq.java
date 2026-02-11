
import java.util.ArrayList;

public class Subseq{
    public static void main(String[] args) {
        String str = "abc";
        ArrayList<String> res = new ArrayList<>();
        subSeqincludingASCIIvalueList("",str, res);
        System.out.println(res);
    }
    static void subSeq(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
            char firstchar = up.charAt(0);
            subSeq(p+firstchar, up.substring(1));
            subSeq(p,up.substring(1));
        
    }
    //By passing the result string in the array. Here, we branch the unprocessed string one by one selecting the first
    //first character. Either we include it or not. We finally recieve the resulted formation in each sequence when there is
    // nothing to be processed in the unprocessed string and thus every character is processed and can be added to the result. 
    static void subSeqinList(String p, String up,ArrayList<String> result){
        if(up.isEmpty()){
            result.add(p);
            return;
        }
            char firstchar = up.charAt(0);
            subSeqinList(p+firstchar, up.substring(1),result);
            subSeqinList(p,up.substring(1),result);        
    }
    static void subSeqincludingASCIIvalueList(String p, String up,ArrayList<String> result){
        if(up.isEmpty()){
            result.add(p);
            return;
        }
            char firstchar = up.charAt(0);
            subSeqincludingASCIIvalueList(p+firstchar, up.substring(1),result);
            subSeqincludingASCIIvalueList(p+(int)(firstchar), up.substring(1),result);
            subSeqincludingASCIIvalueList(p,up.substring(1),result);        
    }
}
