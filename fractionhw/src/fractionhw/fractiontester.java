package fractionhw;

public class fractiontester
{
	private static Fraction testAddition(Fraction one, Fraction two)
	{
		return one.addition(two);
	}
	
	private static Fraction testSubtraction(Fraction one, Fraction two)
	{
		return one.subtraction(two);
	}
	
	private static Fraction testMultiplication(Fraction one, Fraction two)
	{
		return one.multiplication(two);
	}
	
	private static Fraction testDivision(Fraction one, Fraction two)
	{
		return one.division(two);
	}
	
	private static String testToString(Fraction one)
	{
		return one.toString();
	}
	
	public static void main(String[] args)
	{
		Fraction resultAddition = testAddition(new Fraction(1,3), new Fraction(1,4));
		System.out.println("Result of addition: " + resultAddition.toString());
		
		Fraction resultSubtraction = testSubtraction(new Fraction(2,7), new Fraction(1,14));
		System.out.println("Result of subtraction: " + resultSubtraction.toString());
		
		Fraction resultMult = testMultiplication(new Fraction(1,5), new Fraction(2,4));
		System.out.println("Result of multiplication: " + resultMult.toString());
		
		Fraction resultDiv = testDivision(new Fraction(1,5), new Fraction(2,4));
		System.out.println("Result of division: " + resultDiv.toString());
		
		Fraction resultAddition2 = testAddition(new Fraction(1,0), new Fraction (0, 3));
		System.out.println("Result of fraction 0/0: " + resultAddition2);
	}
}
