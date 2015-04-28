/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w1d1hw;

/**
 *
 * @author stella
 */
public class DigitalCamera {

    String brand;
    int megapixels;
    int price;

    public DigitalCamera(String brand,int megapixels) {
        this.brand = brand;
        this.megapixels = megapixels;

        if (megapixels > 10) {
            megapixels = 10;
        }
        if (megapixels <= 6) {
            price = 99;
        }
        else{
           price = 129;
        }
        
    }
    public void DisplayDetails(){
                System.out.println("Brand:"+ brand);
                System.out.println("Megapixel:"+ megapixels);
                System.out.println("Price:"+price);
                
        }

    
        
}
