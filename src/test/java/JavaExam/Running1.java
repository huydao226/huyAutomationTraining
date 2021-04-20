package JavaExam;

public class Running1 {

    public void swap(int a, int b){




        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }

    public static void main(String[] args) {

        String strA = "Hello";
        String strB;

//        System.out.println(strA + " World");

        String helloWorld = "Hello World";

        int intC = 3;
        float flD = 1.1f;
        double dbE = 1.5;

//        System.out.println(intC);
//        System.out.println(flD);
//        System.out.println(dbE);

        boolean bF = true;

        //ifElse

//        if(intC<0) {
//            System.out.println("INTC");
//        } else if(intC>2) {
//            System.out.println(">2");
//        } else if (intC == 3){
//            System.out.println("=3");
//        } else {
//            System.out.println("Not Match");
//        }

        //Array
        int[] arrayInteger = {12,13,14};
//        System.out.println(arrayInteger[0]);
//        System.out.println(arrayInteger.length);

        //For
        for(int i=0; i<arrayInteger.length ;i++){
//            System.out.println(arrayInteger[i]);
        }

        //While
        int i = 5;
//        while(i<113) {
//            i++;
//            System.out.println(i);
//        }

        //SwitchCase
        switch (i){
            case 0:
                System.out.println("i = " + i);
                break;
            case 1:
                System.out.println("i1 = " + i);
                break;
            case 3:
                System.out.println("i2 = " + i);
                break;
            default:
                System.out.println("Not match");
                break;
        }

    }

}
