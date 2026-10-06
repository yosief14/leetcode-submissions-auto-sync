class Solution {
    public int lengthOfLastWord(String s) {
       /*
       iterate through list backwards 
       if char is a space and length is 0 ignore 
       if char is space and length is >0 break 
       if char isn't a space length ++
       return length
       */ 

       int length = 0;
       
       for(int i = s.length() - 1; i >= 0 ; i --){
        if (s.charAt(i) != ' '){
            length ++;
            continue;
        }
        if(length > 0){
            return length;
        }
       }

       return length;
       
    }
}