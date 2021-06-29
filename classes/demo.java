/* 
    @author - shivanshu
*/

public class demo {
    public static void main(String[] args) {
        demo d = new demo();
        demo2 dd = new demo2();
        demo3 ddd = new demo3();
        d.display();
        dd.display();
        ddd.display();
    }

    void display(){
        System.out.println("in --> " + this.toString());
    }
}

class demo2 extends demo{
    @Override
    void display(){
        System.out.println("in --> " + this.toString());
    }
}

class demo3 extends demo2{
    @Override
    void display(){
        System.out.println("in --> " + this.toString());
    }
}