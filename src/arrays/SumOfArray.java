package arrays;

public class SumOfArray {

    public static void main(String[] args){
        int[] array1 ={0,1,2,3,4,5};
        SumOfArray calc =new SumOfArray();
        System.out.println("the sum of array is : "+calc.sum(array1));
    }

    public int sum(int[] array1){
        int sum =0;
        for(int i=0; i<array1.length; i++){
            sum=sum+i;
        }
        return sum;
    }
}
