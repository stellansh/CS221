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
public abstract class Dates extends Object implements Cloneable, Comparable<Date>{

private int Year;

private int Month;

private int Day;

public Dates(int year,int month,int day){             

    Calendar calendar = new GregorianCalendar(year,month,day);            

            this.Year=year;

           this.Month=month;

           this.Day=day;

       }

public abstract Date add(Dates n,int m); 

public abstract Date sub(Dates n,int m);  

public boolean equal(Dates n,Dates m){

    boolean check = n.equals(m);

    return check;}

   

public abstract boolean compare(Dates n,Dates m);

public String toString(Dates y){   

return y.toString();

}

   }
