public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();

    }

    public static void task1() {
        System.out.println("Задача 1");
        int age = 25;
        if (age >= 18) {
            System.out.println("Ты совершеннолетний");
        }
        if (age < 18) {
            System.out.println("Ты не достиг совершеннолетия, нужно немного подождать");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int temp = 10;
        if (temp < 5) {
            System.out.println("На улице" + temp + "градусов, нужно надеть шапку");
        }
        if (temp >= 5) {
            System.out.println("На улице" + temp + "градусов, можно идти без шапки");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int speed = 70;
        if (speed > 60) {
            System.out.println("Если скорость" + speed + ", то придется заплатить штраф");
        }
        if (speed <= 60) {
            System.out.println("Если скорость" + speed + ", можно ездить спокойно");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int age = 45;
        if (age < 2) {
            System.out.println("Если возраст человека равен" + age + ", то ему пора спать");
        }
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен" + age + ", то ему нужно ходить в детский сад");
        }
        if (age >= 7 && age <= 18) {
            System.out.println("Если возраст человека равен" + age + ", то ему нужно ходить в школу");
        }
        if (age > 18 && age <= 24) {
            System.out.println("Если возраст человека равен" + age + ", то его место в университете");
        }
        if (age > 24 && age <= 60) {
            System.out.println("Если возраст человека равен" + age + ", то ему пора ходить на работу");
        }
        if (age > 60) {
            System.out.println("Если возраст человека раве" + age + ", то он может отдохнуть");
        }
    }
    public static void task5() {
        System.out.println("Задача 5");
        int childAge = 13;
        if (childAge < 5) {
            System.out.println("Если возраст ребенка равен" + childAge + ", то он не может кататься на атракционе");
        } else if (childAge >= 5 && childAge <= 14) {
            System.out.println("Если возраст ребенка равен" + childAge + ", то он может кататься на атракционе в сопровождении");
        } else if (childAge > 14) {
            System.out.println("Если возраст ребенка равен" + childAge + ", то он может кататься без сопровождения");
        }
    }
    static public void task6() {
        System.out.println("Задача 6");
        int yourSeat = 30;
        if (yourSeat <= 102) {
            System.out.println("В вагоне есть место");
        }else  {
            System.out.println("Вагон уже полностью забит");
        }
        if (yourSeat <= 102 && yourSeat <= 60) {
            System.out.println("Место сидячее");
        }else {
            System.out.println("Место стоячее");
        }
    }
    static public void task7(){
        System.out.println("Задача 7");
        int one =20;
        int two =6500;
        int three =50;
        if (one > two && one > three) {
            System.out.println(one);
        }
        else if (two > one && two > three) {
            System.out.println(two);
        }else {
            System.out.println(three);
        }
    }

}