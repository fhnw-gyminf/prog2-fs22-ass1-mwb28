package fraction;

public class Fraction {
    private int numerator;
    private int denumerator;

    public Fraction(int numerator, int denumerator){
        int gcd = gcd(numerator, denumerator);
        
        this.numerator = numerator / gcd;
        this.denumerator = denumerator / gcd;
    }
    public Fraction(int nominator){
        this(nominator,1);
    }
    public Fraction (Fraction source){
        this.numerator = source.numerator ;
        this.denumerator = source.denumerator;

    }
    
    public int getNumerator() {
        return numerator;
    }
    
    public int getDenumerator() {
        return denumerator;
    }
    
    public  Fraction addFraction(Fraction source){
        Fraction newFraction;    
        int newNumerator;
        int newDenumerator;
        if (this.denumerator == source.denumerator){
            newNumerator = this.numerator + source.numerator;
            newDenumerator = denumerator;
        }
        else {
           newNumerator = numerator * source.denumerator + source.numerator * denumerator;
           newDenumerator = denumerator * source.denumerator ;   
        }

        newNumerator = newNumerator / gcd(newNumerator, newDenumerator);
        newDenumerator = newDenumerator / gcd(newDenumerator, newDenumerator);
        newFraction = new Fraction(newNumerator,newDenumerator);
        return newFraction;
    }
    public Fraction subFraction(Fraction source){
        Fraction newFraction;    
        int newNumerator;
        int newDenumerator;
        if (this.denumerator == source.denumerator){
            newNumerator = this.numerator - source.numerator;
            newDenumerator = denumerator;
        }
        else {
           newNumerator = numerator * source.denumerator - source.numerator * denumerator;
           newDenumerator = denumerator * source.denumerator ;   
        }

        newNumerator = newNumerator / gcd(newNumerator, newDenumerator);
        newDenumerator = newDenumerator / gcd(newDenumerator, newDenumerator);
        newFraction = new Fraction(newNumerator,newDenumerator);
        return newFraction;
        
    }
    public Fraction divFraction(Fraction source){
        Fraction newFraction;    
        int newNumerator;
        int newDenumerator;
         newNumerator = this.numerator * source.denumerator;
         newDenumerator = this.denumerator * source.numerator;
         
         newNumerator = newNumerator / gcd(newNumerator, newDenumerator);
         newDenumerator = newDenumerator / gcd(newDenumerator, newDenumerator);
         newFraction = new Fraction(newNumerator,newDenumerator);
         return newFraction;
    }
    public Fraction multyFraction(Fraction source){
        Fraction newFraction;    
        int newNumerator;
        int newDenumerator;
         newNumerator = this.numerator * source.numerator;
         newDenumerator = this.denumerator * source.denumerator;

         newNumerator = newNumerator / gcd(newNumerator, newDenumerator);
         newDenumerator = newDenumerator / gcd(newDenumerator, newDenumerator);
         newFraction = new Fraction(newNumerator,newDenumerator);
         return newFraction;
         
    }
    public boolean equals (Fraction f){
        if(f.denumerator== this.denumerator && f.numerator==this.numerator){
            return true;
        }
        return false;
    }

    public String toString(){
         
        return numerator + "/"+ denumerator;

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
       
        




}
