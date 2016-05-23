import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by User-01 on 11.5.2016 г..
 */
public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String,Double> points=new HashMap<String, Double>();
        for (int i = 1; i <=3 ; i++) {
            double x = Double.parseDouble(scanner.nextLine());
            double y = Double.parseDouble(scanner.nextLine());
            points.put(String.format("x%d",i),x);
            points.put(String.format("y%d",i),y);
        }

        double area=points.get("x1")*(points.get("y2")-points.get("y3"))
                +points.get("x2")*(points.get("y3")-points.get("y1"))
                +points.get("x3")*(points.get("y1")-points.get("y2"));

       if(area==0){
           System.out.println("Three points does not form a triangle");
       }else{
area=Math.abs(area/2);
           System.out.printf("Area of rectangle is %.0f",area);
       }


    }

}
