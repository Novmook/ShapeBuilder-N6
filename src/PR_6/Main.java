package PR_6;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Square> smSquare = new ArrayList<>();
        ArrayList<Circle> smCircle = new ArrayList<>();
        ArrayList<Triangle> smTriangle = new ArrayList<>();

        smSquare.add(new Square());
        smCircle.add(new Circle());
        smTriangle.add(new Triangle());

        smCircle.get(0).draw();
        smSquare.get(0).draw();
        smTriangle.get(0).draw();
        System.out.println("Поместили на склад");
        System.out.println();

        if ( smCircle.isEmpty() || smSquare.isEmpty() || smTriangle.isEmpty()){
            if (smCircle.isEmpty()) {
                System.out.println("Нет круга");
            }
            if (smSquare.isEmpty()){
                System.out.println("Нет квадрата");
            }
            if (smTriangle.isEmpty()){
                System.out.println("Нет треугольника");
            }
        } else if (!smCircle.isEmpty() && !smSquare.isEmpty() && !smTriangle.isEmpty()){
            System.out.println(" Можно строить дом");
            smCircle.get(0).build();
            smSquare.get(0).build();
            smTriangle.get(0).build();
            System.out.println(" Дом построен");
        }

    }
}
