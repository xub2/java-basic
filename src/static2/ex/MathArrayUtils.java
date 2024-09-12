package static2.ex;

public class MathArrayUtils {

    private MathArrayUtils(){

    }

    public static int sum(int[] array){
        int total = 0;

        for (int i : array) {
            total += i;
        }

        return total;
    }

    public static double average(int[] array){
       return (double) sum(array) / array.length;
    }

    public static int min(int[] array){
        int minValue = array[0];
        for(int i = 0 ; i < array.length ; i++){
            if(array[i] < minValue){
                minValue = array[i];
            }
        }
        return minValue;
    }

    public static int max(int[] array){
        int maxValue = array[0];
        for(int i = 0 ; i < array.length ; i ++){
            if(array[i] > maxValue){
                maxValue = array[i];
            }
        }
        return maxValue;
    }
}
