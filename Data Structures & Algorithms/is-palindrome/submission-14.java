class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() -1; 
        char cOne;
        char cTwo;

        while(i < j){
            cOne = Character.toLowerCase(s.charAt(i)); 
            cTwo = Character.toLowerCase(s.charAt(j));     
           if(!Character.isLetterOrDigit(cOne)){ 
                i++;
                continue;
            } 
            if (!Character.isLetterOrDigit(cTwo)){
                j--;
                continue;
            } 
            if(cOne != cTwo){
                return false;
            }
            i++;
            j--;
        }
        return true;

            }
}
