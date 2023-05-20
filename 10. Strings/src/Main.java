public class Main {
    public static void main(String[] args) {
        //A.charAt(i)>=a && A.charAt(i)<=z) || (A.charAt(i)>=A && A.charAt(i)<=Z
        //String A = "Ab";
        //int B = 98;
        //System.out.println(A.charAt(0)>='0');
        //int ascii = 69;
        //char asciiToChar = (char) ascii;
        String A = "shiva";
        String sm = "";
        for(int i=0; i<A.length(); i++){

            if(A.charAt(i)>96) {
                sm = sm + (char)(A.charAt(i) - 32);
            }
        }
        System.out.println(0%2);
    }
    public int solve(final String A, final int B) {
        for(int i=0; i<A.length(); i++){
            if((int)A.charAt(i)==B){
                return i;
            }
        }
        return -1;
    }
}