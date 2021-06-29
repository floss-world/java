class first{
    int a; // default access
    public int b; // public access
    private int c; // private access
}

class check{
    public static void main(String[] args) {
        first f = new first();

        f.a = 10; // ok
        f.b = 100; // ok
        f.c = 1000; // ? error c is not visible to a method inside check

        System.out.println("f.a" + f.a);
        System.out.println("f.b" + f.b);
        System.out.println("f.c" + f.c); // error
    }
}