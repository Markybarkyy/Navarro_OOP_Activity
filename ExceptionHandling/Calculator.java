public class Calculator {
    public int add(int x, int y){
        return x + y;
    }
    
    public double divide(int x, int y) {
    	 try {
             return x / y;
         } catch (ArithmeticException e) {
             System.err.println("Error: Division by Zero");
         }
		return 0;
    }
}
