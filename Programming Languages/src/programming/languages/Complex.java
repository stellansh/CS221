/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programming.languages;

/**
 *
 * @author stella
 */
public abstract class Complex{

    private double real;

    private double imaginary;

    public Complex()

    {

        this( 0.0, 0.0 );

    }

    public Complex( double r, double i )

    {

        this.real = r;

        this.imaginary = i;

    }

    public double getReal() {

      return this.real;

    }

    public double getImaginary() {

      return this.imaginary;

    }

    public static Complex complexAdd(Complex one, Complex two) {

        return Complex(one.getReal() + two.getReal(),

                      one.getImaginary() + two.getImaginary());

    }

    public static Complex complexSub(Complex one, Complex two) {

        return Complex(one.getReal() - two.getReal(),

                       one.getImaginary - two.getImaginary());

    }

 public abstract void multiply();
 public abstract void divide();
}

