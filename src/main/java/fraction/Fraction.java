package fraction;

public class Fraction {
    private int nominator;
    private int denominator;

    public Fraction(int nominator, int denominator){
        
        this.nominator = nominator / gcd(nominator, denominator);
        this.denominator = denominator / gcd(nominator, denominator);
    }
    public Fraction(int nominator){
        this.nominator = nominator;
        denominator = 1;
    }
    public Fraction (Fraction source){
        this.nominator = source.nominator / gcd(source.nominator, source.denominator);
        this.denominator = source.denominator / gcd(source.nominator, source.denominator);

    }
    
    public int getNominator() {
        return nominator;
    }
    public void setNominator(int nominator) {
        this.nominator = nominator;
    }
    public int getDenominator() {
        return denominator;
    }
    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }
    public  Fraction addtitionFraction(Fraction source){
        Fraction newFraction;    
        int newNominator;
        int newDenominator;
        if (this.denominator == source.denominator){
            newNominator = this.nominator + source.nominator;
            newDenominator = denominator;
        }
        else {
           newNominator = nominator * source.denominator + source.nominator * denominator;
           newDenominator = denominator * source.denominator ;   
        }

        newNominator = newNominator / gcd(newNominator, newDenominator);
        newDenominator = newDenominator / gcd(newDenominator, newDenominator);
        newFraction = new Fraction(newNominator,newDenominator);
        return newFraction;
    }
    public Fraction divisionFraction(Fraction source){
        Fraction newFraction;    
        int newNominator;
        int newDenominator;
        if (this.denominator == source.denominator){
            newNominator = this.nominator - source.nominator;
            newDenominator = denominator;
        }
        else {
           newNominator = nominator * source.denominator - source.nominator * denominator;
           newDenominator = denominator * source.denominator ;   
        }

        newNominator = newNominator / gcd(newNominator, newDenominator);
        newDenominator = newDenominator / gcd(newDenominator, newDenominator);
        newFraction = new Fraction(newNominator,newDenominator);
        return newFraction;
        
    }
    public Fraction divideFraction(Fraction source){
        Fraction newFraction;    
        int newNominator;
        int newDenominator;
         newNominator = this.nominator * source.denominator;
         newDenominator = this.denominator * source.nominator;
         
         newNominator = newNominator / gcd(newNominator, newDenominator);
         newDenominator = newDenominator / gcd(newDenominator, newDenominator);
         newFraction = new Fraction(newNominator,newDenominator);
         return newFraction;
    }
    public Fraction mulitplyFraction(Fraction source){
        Fraction newFraction;    
        int newNominator;
        int newDenominator;
         newNominator = this.nominator * source.nominator;
         newDenominator = this.denominator * source.denominator;

         newNominator = newNominator / gcd(newNominator, newDenominator);
         newDenominator = newDenominator / gcd(newDenominator, newDenominator);
         newFraction = new Fraction(newNominator,newDenominator);
         return newFraction;
         
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
