class FibonacciRecurs{
	
	public static void main(String[] arg){
		
		if(arg.length != 1 || ! isNumeric(arg[0]) || Integer.parseInt(arg[0]) < 1){
			System.out.println("Usage: java FibonacciRecurs fibonacci_positive_number" + "\n");
			return;
		}
		
		System.out.println(fibRecurs(Integer.parseInt(arg[0])) + "\n");
	}
	
	static int fibRecurs(int i){
		
		return i < 3 ? 1 : fibRecurs(i - 1) + fibRecurs(i - 2);
	}
	
	static boolean isNumeric(String input){
		
	    try {
			Integer.parseInt(input);
			return true;
		}
		catch (NumberFormatException e){
		// string is not numeric
		return false;
		}
	}
}	