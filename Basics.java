import java.util.ArrayList;

class Basics {

    public void print1To255(){
        for(int i = 1; i <= 255; i++){
            System.out.println(i);
        }
    }

    public void printOdd1To255(){
        for(int i = 1; i <= 255; i = i+2){
            System.out.println(i);
        }
    }

    public void printSum(){
        int sum = 0;
        for(int i = 1; i <=255; i++){
            sum += i;
            System.out.println("New number: " + i + " Sum: " + sum);
        }
    }

    public void iterateArray(Object[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }

    public int maxValue(int[] array){
        int max = array[0];
        for(int value : array){
            if(value > max) max = value;
        }
        return max;
    }

    public void getAverage(int[] array){
        double sum = 0;
        for(int value : array){
            sum += value;
        }
        System.out.println(sum/array.length);
    }

    public ArrayList<Integer> arrayWithOdds(){
        ArrayList<Integer> output = new ArrayList<Integer>();
        for(int i = 1; i <= 255; i=i+2){
            output.add(i);
        }
        return output;
    }

    public void greaterThanY(int[] array, int y){
        int count = 0;
        for(int value : array){
            if(value > y) count++;
        }
        System.out.println(count);
    }

    public int[] squaredValues(int[] array){
        for(int i = 0; i < array.length; i++){
            array[i] = array[i]*array[i];
        }
        return array;
    }

    public int[] elimNegative(int[] array){
        for(int i = 0; i < array.length; i++){
            if(array[i] < 0) array[i] = 0;
        }
        return array;
    }

    public double[] maxMinAvg(int[] array){
        int max = array[0];
        int min = array[0];
        double sum = 0;
        for(int i =0; i < array.length; i++){
            if(array[i] > max) max = array[i];
            if(array[i] < min) min = array[i];
            sum += array[i];
        }
        double[] output = {max, min, sum/array.length};
        return output;
    }

    public int[] shiftArray(int[] array){
        for(int i =0; i < array.length-1; i++){
            array[i] = array[i+1];
        }
        array[array.length-2] = array[array.length-1];
        return array;
    }
}