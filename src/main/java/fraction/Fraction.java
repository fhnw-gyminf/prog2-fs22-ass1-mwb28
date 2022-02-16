package fraction;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator){
        int gcd = gcd(numerator, denominator);
        
        this.numerator = numerator / gcd;
        this.denominator = denominator / gcd;
    }
    public Fraction(int nominator){
        this(nominator,1);
    }
    public Fraction (Fraction source){
        this.numerator = source.numerator ;
        this.denominator = source.denominator;

    }
    
    public int getNumerator() {
        return numerator;
    }
    
    public int getDenumerator() {
        return denominator;
    }
    
    public  Fraction addFraction(Fraction source){
           
        int newNumerator;
        int newDenominator;
        if (this.denominator == source.denominator){
            newNumerator = this.numerator + source.numerator;
            newDenominator = denominator;
        }
        else {
           newNumerator = numerator * source.denominator + source.numerator * denominator;
           newDenominator = denominator * source.denominator ;   
        }
        int gcd = gcd(newNumerator, newDenominator);
        newNumerator = newNumerator / gcd;
        newDenominator = newDenominator / gcd;
        
        return new Fraction(newNumerator,newDenominator);
    }
    public Fraction subFraction(Fraction source){
          
        int newNumerator;
        int newDenominator;
        
        if (this.denominator == source.denominator){
            newNumerator = this.numerator - source.numerator;
            newDenominator = denominator;
        }
        else {
           newNumerator = numerator * source.denominator - source.numerator * denominator;
           newDenominator = denominator * source.denominator ;   
        }
        int gcd = gcd(newNumerator,newDenominator);
        newNumerator = newNumerator / gcd;
        newDenominator = newDenominator / gcd;
        return new Fraction(newNumerator,newDenominator);
        
    }
    public Fraction divFraction(Fraction source){
        
        int newNumerator;
        int newDenominator;
         newNumerator = this.numerator * source.denominator;
         newDenominator = this.denominator * source.numerator;
         int gcd = gcd(newNumerator, newDenominator);
         newNumerator = newNumerator / gcd;
         newDenominator = newDenominator / gcd;
         
         return new Fraction(newNumerator,newDenominator);S
    }
    public Fraction multyFraction(Fraction source){
           
        int newNumerator;
        int newDenominator;
         newNumerator = this.numerator * source.numerator;
         newDenominator = this.denominator * source.denominator;
        int gcd = gcd(newNumerator, newDenominator);
         newNumerator = newNumerator / gcd;
         newDenominator = newDenominator / gcd;
        
         return new Fraction(newNumerator,newDenominator);
         
    }
    public boolean equals (Fraction f){
        if(f.denominator== this.denominator && f.numerator==this.numerator){
            return true;
        }
        return false;
    }

    public String toString(){
         
        return numerator + "/"+ denominator;

    }
    


    private static int gcd(int x, int y) {
        if (y == 0) {
        return x;
        } else {
        int r = x % y;
        while (r != 0) {
        x = y;
        y = r;
        r = x % y;
        }
        return y;
        }
        }
       
        
public static void main(String[] args) {
    Fraction f1 = new Fraction(1,2);
    Fraction f2 = new Fraction(1,3);
    System.out.println(f1 + "+" + f2 + "=" + f1.addFraction(f2));
    
}



}
