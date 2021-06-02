class NumPalSubs {
    public int countSubstrings(String s) {
        int i = 0; 
        int j = s.length()-1; 
        return NPS(s,i,j); 
      }
    
    public int NPS(String s, int i, int j) {
        return 0; 
    }

    public static void main(String [] args) {
        String s = "abcba"; 
        NumPalSubs inst = new NumPalSubs(); 
        int answer = inst.countSubstrings(s); 
        System.out.println(answer); 
    }
}
