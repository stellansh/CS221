/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w2d4class;

/**
 *
 * @author stella
 */
public class Car {
    private String Model;
    private int  Year;
    private String Color;
    
     public Car(String Model,int Year,String Color){
         this.Model=Model;
         this.Year=Year;
         this.Color=Color;
     }
    public String getModel() {
        return Model;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        this.Color = color;
    }
    
    
    
}
