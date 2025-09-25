
import java.util.ArrayList;

public class Practice {


    public static void main(String[] args){
        int[] numbers = {1, 33, 100, 50, 444, 222};
        ArrayList<Integer> larger = new ArrayList<Integer>();

        int max = numbers[0];

        for(int n=0; n<numbers.length;n++){
            if (numbers[n]>max){
               larger.add(numbers[n]);
            }
        }

        System.out.println(larger);

    }
}
