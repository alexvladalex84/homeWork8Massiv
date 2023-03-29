import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        task2();
//        task3();
//          task4();

    }
    public static void task2(){
        System.out.println("task1,2");

        int [] x = new int [3];
        x [0] = 1;
        x [1] = 2;
        x [2] = 3;
        int x1 = x[0];
        int x2 = x[1];
        int x3 = x[2];

        double [] y = {1.57, 7.654, 9.986};

        int [] z = new int[3];

        System.out.println(x1+","+x2+","+x3);
//        System.out.println(x[2]+","+x[1]+","+x[0]+".");
        System.out.println(y[0]+","+y[1]+","+y[2]);
        System.out.println(z[0]+","+z[1]+","+z[2]);


    }

    public static void task3(){
        System.out.println("task3");
        int [] x = new int [3];
        x [0] = 1;
        x [1] = 2;
        x [2] = 3;
        int x1 = x[0];
        int x2 = x[1];
        int x3 = x[2];

        double [] y = {1.57, 7.654, 9.986};

        int [] z = new int[3];

        System.out.println(x3+","+x2+","+x1);
//        System.out.println(x[0]+","+x[1]+","+x[2]+".");
        System.out.println(y[2]+","+y[1]+","+y[0]);
        System.out.println(z[2]+","+z[1]+","+z[0]);


    }



    public static void task4() {
        System.out.println("task4");

        int[] x = new int[3];
        x[0] = 1 + 1;
        x[1] = 2;
        x[2] = 3 + 1;
        int per = x[0];
        System.out.println(Arrays.toString(x));
        for (int i = 0; i < x.length; i++) {


            System.out.print(x[i] + ",");
        }

    }


}