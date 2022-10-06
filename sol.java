public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) 
    {
        if(n==1){
            return Integer.MAX_VALUE+1;
        }
        StringBuilder st = new StringBuilder(Integer.toBinaryString(n));
        int l = st.length();
        st.reverse();
        System.out.println(st);
       
        if(st.charAt(0)=='1'){
            for(int i=l;i<32;i++){
                st.append('0');
            }
            long x = Long.parseLong(st.toString(),2);
            return (int)x;
        }
        else{
            for(int i=l;i<32;i++){
                st.append('0');
            }
            return Integer.parseInt(st.toString(),2);
        }
        
    }
}
