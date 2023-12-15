package color;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    private static ShapeColor getColor(){
        int random = new Random().nextInt(5);
        return ShapeColor.values()[random];
    }



    public int[] twoSum(int[] nums, int target) {
        int w = nums.length;

        for(int i = 0; i < nums.length ; i++){
            for(int j = 0; j < nums.length; j++){
                if(i != j){
                    if(nums[i] + nums[j] == target){
                        return new int[]{i,j};
                    }
                }
            }
        }
        return new int[0];
    }


    public int romanToInt(String s) {
        char[] chars = s.toCharArray();
        int r = 0;

        for(int i = 0; i < chars.length; i++){
            switch(chars[i]){
                case 'M' :
                    if(i != 0 && chars[i - 1] == 'C')
                        r += 800;
                    else
                        r += 1000;
                    break;

                case 'D' :
                    if(i != 0 && chars[i - 1] == 'C')
                        r += 300;
                    else
                        r += 500;
                    break;

                case 'C' :
                    if(i != 0 && chars[i - 1] == 'X')
                        r += 80;
                    else
                        r += 100;
                    break;

                case 'L' :
                    if(i != 0 && chars[i - 1] == 'X')
                        r += 30;
                    else
                        r += 50;
                    break;

                case 'X' :
                    if(i != 0 && chars[i - 1] == 'I')
                        r += 8;
                    else
                        r += 10;
                    break;

                case 'V' :
                    if(i != 0 && chars[i - 1] == 'I')
                        r += 3;
                    else
                        r += 5;
                    break;

                case 'I' :
                    r += 1;
                    break;


                default :
                    break;

            }
        }

        return r;
    }

    public static void main(String[] args) {

        String str = "maman";
        char[] chars = str.toCharArray();
        if (chars[0] != 'm')
            System.out.println(chars[0]);

    }
}
