package lab6;

import java.util.Scanner;

/**
 *
 * @author srohan
 */


class Main {

        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LandTractProgram lt1 = new LandTractProgram();
        System.out.print("Enter length of 1st tract: ");
        lt1.length = sc.nextInt();
        System.out.print("Enter width of 2nd tract: ");
        lt1.width = sc.nextInt();
        
        LandTractProgram lt2 = new LandTractProgram();
        System.out.print("Enter length of 1st tract: ");
        lt2.length = sc.nextInt();
        System.out.print("Enter width of 2nd tract: ");
        lt2.width = sc.nextInt();
        
        System.out.println(lt1);
        System.out.println(lt2);

        if(lt1.area() == lt2.area()){
        System.out.println("They are of equal size");
        }else{
        System.out.println("They are not of equal size");
        }

        }
}

class LandTractProgram {

        int length;
        int  width;

        int area(){
            return length*width;
        }

    public String toString(){
        
        return "Length: "+length+" | Width: "+width+" | Area: "+area();
    
    }

}
