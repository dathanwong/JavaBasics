class BasicsTest{
    public static void main(String[] args){
        Basics b = new Basics();

        b.print1To255();
        b.printOdd1To255();
        b.printSum();
        Integer[] array = {1,3,5,7,9,13};
        b.iterateArray(array);
        int[] testArray = {-1,2,-5,19,3};
        System.out.println(b.maxValue(testArray));
        b.getAverage(testArray);
        System.out.println(b.arrayWithOdds());
        b.greaterThanY(testArray, 2);
        System.out.println(b.squaredValues(testArray));
        System.out.println(b.elimNegative(testArray));
        double[] output = b.maxMinAvg(testArray);
        System.out.println(b.shiftArray(testArray));
    }
}