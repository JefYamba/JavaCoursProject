package complexeNumber;

public class Main {
    public static void main(String[] args) {

        ComplexNumber com1 = new ComplexNumber(-2, 5);
        ComplexNumber com2 = new ComplexNumber(1, -3);

        ComplexNumber.printComplex(com1);
        ComplexNumber.printComplex(com2);
        ComplexNumber.printComplex(ComplexNumber.add(com1,com2));
        ComplexNumber.printComplex(ComplexNumber.subtract(com1,com2));
        ComplexNumber.printComplex(ComplexNumber.multiply(com1,com2));


    }
}