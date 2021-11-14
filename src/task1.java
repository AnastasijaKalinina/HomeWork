public class task1 {
    /**
     * В переменной minutes лежит число от 0 до 59.
     * Написать функцию, которая принимает в качестве параметра значение переменной minutes и выводит
     * на консоль в какую четверть часа попадает это число (в первую, вторую, третью или четвертую).
     * Протестировать функцию в main.
     */
    public static void main(String[] args) {
        int minutes = 39;
        someTime(minutes);
    }

    public static int someTime(int minutes) {
        if (minutes >= 0 && minutes <= 14) {
            System.out.println("Первая четверть часа");
        } else if (minutes >= 15 && minutes <= 24) {
            System.out.println("Вторая четверть часа");
        } else if (minutes >= 25 && minutes <= 44) {
            System.out.println("Третья четверть часа");
        } else if (minutes >= 45 && minutes <= 59) {
            System.out.println("Четвертая четверсть часа");
        }else{
            System.out.println("Минуты заданы неправильно");
        }
        return minutes; // не нашла, как изменить название класса, что бы писало Task1, а не task1
    }
}
