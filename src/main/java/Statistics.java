import java.util.Arrays;
public class Statistics {
    public static int getMode(int[] arr) {
        int max_count = 1;
        int result = arr[0];
        int count = 0;

        for(int i =1; i < arr.length; i++) {
            if(arr[i] == arr[i-1]) {
                count++;
            } else {
                if( count > max_count) {
                    max_count = count;
                    result = arr[i-1];
                }
                count = 1;
            }
        }
        if(count > max_count) {
            max_count = count;
            result = arr[arr.length - 1];
        }
        return result;
    }

    public static double getMedian(int[] arr){
        Arrays.sort(arr);

        if(arr.length % 2 == 0){
            return (double) (arr[arr.length/2] + arr[arr.length/2-1])/2;
        }
        return   arr[arr.length/2];
    }

    public static double getMean(int[] arr){
        if(arr.length != 0){
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
            }
            return (double) sum / arr.length;
        }
        return Integer.MIN_VALUE;
    }

    public static double[] getRatio(int[] array) {
        double[] result = new double[3];
        double positives = 0.0;
        double negatives = 0.0;
        double zeros = 0.0;

        for(int i =0; i < array.length; i++) {
            if(array[i] > 0) {
                positives += 1;
            }
            else if(array[i] < 0) {
                negatives += 1;
            } else {
                zeros +=1;
            }
        }
        result[0] = (positives/ array.length);
        result[1] = (negatives/ array.length);
        result[2] = (zeros/ array.length);
        return result;
    }


}
