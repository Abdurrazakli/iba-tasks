package lesson31w02.web;

public class Calculator {
    public String doOperation(String x, String y, String op) {
        try {
            int a = Integer.parseInt(x.trim());
            int b = Integer.parseInt(y.trim());
            String result;
            switch (op){
                case "add":
                    result = Integer.toString(a+b);
                    break;
                case "sub":
                    result = Integer.toString(a-b);
                    break;
                case "mul":
                    result = Integer.toString(a*b);
                    break;
                case "div":
                    if(b==0){
                        result = "Trying to divide 0!";
                    }
                    else {
                        result = Integer.toString(a / b);
                    }
                    break;
                default:result = "wrong operation!";
            }
            return result;
        }
        catch (NumberFormatException e){
            return "Problems with numbers";
        }
    }
}
