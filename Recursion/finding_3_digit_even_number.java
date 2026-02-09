import java.util.*;
public class finding_3_digit_even_number {
    public static void main(String[] args) {
        int[] digits = new int[]{2,3,4};
        System.out.println(findEvenNumbers(digits));
    }

    public static List<Integer> findEvenNumbers(int[] digits ) {
        List<Integer> result = new ArrayList<>();
        int[] countOfDigits = new int[10];
        for(int i = 0;i<digits.length;i++){
            countOfDigits[digits[i]]++;
        }

        
        for(int i = 100;i<=998;i=i+2){
            boolean found = true;
            int[] frequencyCountForeachNumber= new int[10];
            int thousandsplace = i/100;
            int hundreds = (i/10)%10;
            int ones = i%10;
            frequencyCountForeachNumber[thousandsplace]++;
            frequencyCountForeachNumber[hundreds]++;
            frequencyCountForeachNumber[ones]++;
            for(int j= 0 ;j<10;j++){
                if(countOfDigits[j]!=frequencyCountForeachNumber[j]){
                    found = false;
                    break;
                }               
            }
            if(found){
                result.add(i);
            }
        }
        
        return result;
        
    }
    
}



