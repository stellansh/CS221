/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w1d1practice;

/**
 *
 * @author stella
 */
public class CarWindow {

    private int width;
    private int height;
    private int number;

    public CarWindow(int width, int height, int number) {
        this.height = height;
        this.width = width;
        this.number = number;

    }
   public int ComputerWindowArea(){
       int area= width*height;
        return (area);
   }
      
}
