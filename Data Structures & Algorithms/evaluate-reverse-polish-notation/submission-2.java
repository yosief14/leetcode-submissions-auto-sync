class Solution {
    public int evalRPN(String[] tokens) {
       Stack <Integer>  operands = new Stack<>();
       int fOperand,sOperand, res;
       for (String token : tokens){
           if(token.matches("-?\\d+")){
            operands.add(Integer.valueOf(token));            
           }else{

            sOperand = operands.pop();
            fOperand = operands.pop();
            res = switch (token) {
                case "*" -> fOperand * sOperand; 
                case "/" -> fOperand / sOperand; 
                case "-" -> fOperand - sOperand; 
                case "+" -> fOperand + sOperand; 
                default -> throw new IllegalArgumentException("Unknown operator");
            }; 
            operands.add(res);
           }

       }
       return operands.pop(); 
    }
}
