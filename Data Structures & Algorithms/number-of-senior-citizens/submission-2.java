class Solution {
    public int countSeniors(String[] details) {
       /*
       0-9 phone
       10 gender 
       11-12 age 
       */ 
       int count = 0;
       for ( String s: details){
         int age = Integer.parseInt(s.substring(11,13));

         if (age > 60) count ++;
       }
       return count;
    }
}