package calculator;

public class StringCalculator {

    public int add(String input) {
    
    	if(input.isEmpty()) {
    		return returnValue;
    	} else {
    		return Integer.parseInt(input);
    	}
    	
    }
    private static int delimiter(final String input, final String delimiter) {
        int returnValue = 0;
        String[] numbersArray = input.split(delimiter);
        for (String number : numbersArray) {
            if (!number.trim().isEmpty()) {
                returnValue += Integer.parseInt(number.trim());
            }
        }
        return returnValue;
    }

}
