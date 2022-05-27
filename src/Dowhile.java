public class Dowhile {

    static void Table(int a){

        int i = 1;
        do {
            System.out.printf("%4d"  , a * i);
            i = i + 1;

        }while (i<=3);
        System.out.println( " " + " ");
    }

    public static void main(String [] args){

        int i = 1;
        do {
            Table(i);
            i = i+1;

        }while (i<=3);

    }
}


