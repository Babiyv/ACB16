package week1.day2;

public class _03TestDecrement {
    public static void main (String[] args ) {
     int a = 15 ;
        System.out.println( "Strat A = " + a);
     //POSTdecrement (делает отнимание ПОСЛЕ того как перезаписывает число)
        int b = a--;
        System.out.println("POSTdecrement A = " + a);
        System.out.println("POSTdecrement B = " + b);


        int c = 19;
        System.out.println("Start C = " + c);
        //PREdecrement (выполняет операцию/отнимание перед тем как перезапишет верхнюю строчку "с")
        int d = --c;
        System.out.println("PREdecrement C = " + c);
        System.out.println("PREdecrement D = " + d);



    }
}