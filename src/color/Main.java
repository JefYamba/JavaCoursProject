package color;

import java.util.Random;

public class Main {
    private static ShapeColor getColor(){
        int random = new Random().nextInt(5);
        return ShapeColor.values()[random];
    }


    public static void main(String[] args) {

        for(int i = 0; i < 100; i++){
            System.out.println(getColor());
        }
    }
}
