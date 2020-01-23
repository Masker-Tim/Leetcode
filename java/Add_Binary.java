public class Add_Binary{
    public static String addBinary(String a, String b) {
        int max_length = (a.length()>b.length())?a.length():b.length();
        int zeros = 0;
        char carry = '0';
        char[] answer = (a.length()>b.length())?a.toCharArray():b.toCharArray();
        if(a.length()==0 && b.length()==0){return "0";}
        if(a.length()>b.length()){
            zeros = a.length()-b.length();
            for(int i=0;i<zeros;i++){b="0"+b;}
        }else if(a.length()<b.length()){
            zeros = b.length()-a.length();
            for(int i=0;i<zeros;i++){a="0"+a;} 
        }

        for(int i=max_length-1;i>=0;i--){
            answer[i] = (char)(a.charAt(i)^b.charAt(i)^carry);
            if(((a.charAt(i)&b.charAt(i))=='1')){carry='1';}
            else if(((a.charAt(i)&carry)=='1')){carry='1';}
            else if(((b.charAt(i)&carry)=='1')){carry='1';}
            else{carry='0';}
        }
        String ans = String.valueOf(answer);
        if(carry=='1'){ans="1"+ans;}
        return ans;
    }
    public static void main(String args[]){
        String a = "1010";
        String b = "1011";
        System.out.println(addBinary(a,b));
    }
}