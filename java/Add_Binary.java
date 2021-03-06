public class Add_Binary{
    public static String addBinary(String a, String b) {
        int max_length = (a.length()>b.length())?a.length():b.length(); // 記錄最大長度的字串
        int zeros = 0;  // 補零數目
        char carry = '0';   // 記錄進為
        char[] answer = (a.length()>b.length())?a.toCharArray():b.toCharArray();    // 記錄答案
        if(a.length()==0 && b.length()==0){return "0";} // 若都無字串，則回傳0
        if(a.length()>b.length()){  // 將長度不一的情況，以補0補齊
            zeros = a.length()-b.length();
            for(int i=0;i<zeros;i++){b="0"+b;}
        }else if(a.length()<b.length()){
            zeros = b.length()-a.length();
            for(int i=0;i<zeros;i++){a="0"+a;} 
        }

        /* 位元計算 */
        for(int i=max_length-1;i>=0;i--){
            answer[i] = (char)(a.charAt(i)^b.charAt(i)^carry);  // XOR運算
            // 以AND計算判斷有無進位，記錄carry
            if(((a.charAt(i)&b.charAt(i))=='1')){carry='1';}    
            else if(((a.charAt(i)&carry)=='1')){carry='1';}
            else if(((b.charAt(i)&carry)=='1')){carry='1';}
            else{carry='0';}
        }
        String ans = String.valueOf(answer);    // 轉為String
        if(carry=='1'){ans="1"+ans;}    // 若有剩餘進位，則多補一位
        return ans;
    }
    public static void main(String args[]){
        String a = "1010";
        String b = "1011";
        System.out.println(addBinary(a,b));
    }
}