/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package materi;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
class SimpleCircle {
    double radius=1;
   
    
    SimpleCircle() {
    }
    
    SimpleCircle(double newRadius) {
        radius = newRadius;
    }
    
    double getArea() {
        return radius * radius * Math.PI;
    }
    
    double setRadius(double newRadius){
        radius = newRadius;
        return 0;
    }

   

       
}
