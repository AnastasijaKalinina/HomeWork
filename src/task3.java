public class task3 {
    /*
    Даны два прямоугольных треугольника. Каждый из них задается двумя целочисленными переменными a и b -
    стороны треугольника.
Написать код, в котором вычисляется площадь каждого треугольника и затем эти площади сравниваются друг с другом.
Для этого понадобится написать 2 функции.
Первая: по двум сторонам прямоугольного треугольника возвращает его площадь.
Вторая: сравнивает переданные площади двух треугольников и выводит на консоль первый треугольник больше,
 меньше или равен второму.
Учитывать, что площадь может быть вещественным числом.
     */
    public static void main(String[] args) {
        int a1 = 6, a2 = 7;
        int b1 = 2, b2 = 5;
        areaTriangle(a1, b1, a2, b2);
        comparison(area1, area2); // не понимаю, почему не могу вставить с возвратом эти параметры...
    }


    public static void areaTriangle(int a1, int b1, int a2, int b2) {
        double area1 = (double) (a1 * b1) / 2;
        double area2 = (double) (a2 * b2) / 2;

        System.out.println(area1);
        System.out.println(area2);
    }


    public static void comparison(double area1, double area2) {
        if (area1 > area2) {
            System.out.println("Первый треугольник больше второго");
        } else if (area1 < area2) {
            System.out.println("Первый треугольник меньше второго");
        } else {
            System.out.println("Первый треугольник равен второму");
        }

    }
}


