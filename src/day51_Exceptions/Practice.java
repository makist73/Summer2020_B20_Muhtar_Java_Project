package day51_Exceptions;

class X{

    public X(){
        System.out.println("X");
    }

}

class Y extends X{
    public Y(){
        // super(); //X
        System.out.println("Y"); // Y
    }
}

class Z extends Y{
    public Z(){
        // super(); // X Y
        System.out.println("Z"); // Z
    }
}


public class Practice {

    public static void main(String[] args) {

        new Z();

    }

}
