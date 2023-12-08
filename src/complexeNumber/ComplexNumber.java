package complexeNumber;


public class ComplexNumber {  // Z = a + ib
    private float real; // real part of a complex number
    private float img; // imaginary part of a complex number

    public ComplexNumber() {
    }
    public ComplexNumber(int real, int img) {
        this.real = real;
        this.img = img;
    }

    // Usual methods for complex numbers
    public static void printComplex(ComplexNumber comNum){
        if (comNum.img < 0 ){
            System.out.println(comNum.real +" - "+ (-1)*comNum.img + "i");
        } else {
            System.out.println(comNum.real +" + "+ comNum.img + "i");
        }
    }
    public static ComplexNumber add(ComplexNumber comNum1, ComplexNumber comNum2){
        ComplexNumber sum = new ComplexNumber();
        sum.real = comNum1.real + comNum2.real;
        sum.img = comNum1.img + comNum2.img;

        return sum;
    }
    public static ComplexNumber subtract(ComplexNumber comNum1, ComplexNumber comNum2){
        ComplexNumber difference = new ComplexNumber();
        difference.real = comNum1.real - comNum2.real;
        difference.img = comNum1.img - comNum2.img;

        return difference;
    }
    public static ComplexNumber multiply(ComplexNumber multiplicand, ComplexNumber multiplier){
        ComplexNumber product = new ComplexNumber();
        product.real = (multiplicand.real * multiplier.real) - (multiplicand.img * multiplier.img);
        product.img = (multiplicand.real * multiplier.img) + (multiplicand.img * multiplier.real);

        return product;

    }
    /* ================ There is a error with this function ================ */
    /*
     public static ComplexNumber divide(ComplexNumber numerator, ComplexNumber deniminator){
         ComplexNumber quotient = new ComplexNumber();
         float temp = (float) (Math.pow(deniminator.img , 2) + Math.pow(deniminator.real , 2));
         quotient.real = ((numerator.real * deniminator.real) - (numerator.img * deniminator.img)) / (temp);
         quotient.img = ((numerator.real * deniminator.img) - (numerator.img * deniminator.real)) / (temp);

         return quotient;
     }
    */

}
