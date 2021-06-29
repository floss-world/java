/**
 * loop
 */
public class loop {

    public static void main(String[] args) {

        /* 
            using for loop
        */
        System.out.println("using for loop");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        /* 
            using while loop
        */
        System.out.println("using while");
        int i = 10;
        while (i < 10) {
            System.out.println(i);
            i++;
        }

        /* 
            do while
        */
        System.out.println("using do while");
        i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 10);
    }
}