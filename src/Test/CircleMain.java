package Test;
import java.util.*;

class Circle {
	   private double x, y;
	   private int radius;
	   
	   
	   
	   public Circle(double x, double y, int radius) {
		  this.x = x;
		  this.y = y;
		  this.radius = radius;
	      
	   }
	   
	   
	   int r() {
		   return radius;
		   
	   }
	
	   public void show() {
		     System.out.printf("(%.1f), (%.1f) %d\n",x, y, radius);
		     
		   }
}



public class CircleMain {
	public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      Circle c[] = new Circle[3]; 
	      
	      for(int i=0; i < c.length; i ++) {
	         System.out.print("x, y, radius >>");
	         
	         c[i] = new Circle(sc.nextDouble(),sc.nextDouble(),sc.nextInt());  
	      }
	      
	      for (int i = 0; i < c.length; i++) {
			int a = c[i].r();
			System.out.println(a);
		}
	      
	      
	
//	      for(int i=0; i<c.length; i++) {
//	         c[i].show();
//	      }
	      
	      
	      
	      
	      
	      // 모든 Circle 객체 출력
	      sc.close();
	      
	      
	      
	      
	      
   }

}
