package fractionhw;

public class Fraction
{
	private int num;
	private int denom;
	
	public Fraction(int numerator,int denominator) 
	{    
		num = numerator;
		denom = denominator;
	}
	
	public String toString()
	{
		if (denom == 0)
			return "undefined";
		else if (denom == 1)
			return "" + num;
		return num + "/" + denom;
	}
	
	private static int gcd(int one, int two)
	{
		if (0 == two) 
		{
			return one;   
		}
		return gcd(two, one % two);
	}
	
	private static Fraction reduceFraction(int num, int denom)
	{
		int gcd = gcd(num, denom);
		int reducedNum = num / gcd;
		int reducedDenom = denom / gcd;
		
		return new Fraction (reducedNum, reducedDenom);
	}
	 
	public int getNum()
	{
		return num;
	}
	
	public int getDenom()
	{
		return denom;
	}
	
	public int getQuotient()
	{
		return num / denom;
	}
	
	public int getRemainder()
	{
		return num % denom;
	}
	
	public Fraction addition(Fraction that)
	{
		int addDenom = this.getDenom() * that.getDenom();
		int thisNum = this.getNum() * that.getDenom();
		int thatNum = that.getNum() * this.getDenom();
		return reduceFraction(thisNum + thatNum, addDenom);
	}
	
	public Fraction subtraction(Fraction that)
	{
		int subDenom = this.getDenom() * that.getDenom();
		int thisNum = this.getNum() * that.getDenom();
		int thatNum = that.getNum() * this.getDenom();
		return reduceFraction(thisNum - thatNum, subDenom);
	}
	
	public Fraction multiplication(Fraction that)
	{
		int mulNum = this.getNum() * that.getNum();
		int mulDenom = this.getDenom() * that.getDenom();
		return reduceFraction(mulNum, mulDenom);
	}
	
	public Fraction division(Fraction that)
	{
		int divNum = this.getNum() * that.getDenom();
		int divDenom = this.getDenom() * that.getNum();
		return reduceFraction(divNum, divDenom);
	}
}