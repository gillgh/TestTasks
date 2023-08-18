public class First {
    public static final int ARRAY_SIZE = 5;
    public static void main(String[] args){
        double max = 0;
        double min = 1;
        double avg = 0;

        double [] arr = new double[ARRAY_SIZE];
        for (int i = 0; i < ARRAY_SIZE; i++){
            arr[i] = Math.random();
        }

        for (double v : arr) {
            System.out.println("Element of array: " + v);
        }

        for(double v : arr){
            if(v > max){
                max = v;
            }
        }

        for (double v : arr) {
            if (v < min) {
                min = v;
            }
        }

        for (double v : arr) {
            avg += v;
        }
        avg = avg / arr.length;

        System.out.println("Max element: " + max);
        System.out.println("Min element: " + min);
        System.out.println("Average value: " + avg);
    }

}
