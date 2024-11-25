package days7.array.sdetQA;

public class SecondLargestFromArray {


    public static void main(String[] args) {

    int [] arr = {54,30, 50, 40, 12, -77, 67};
    int max=0;
    int secondMax =0;

    for(int i=0; i<arr.length; i++){
        if(arr[i] >max){
            secondMax= max;
            max= arr[i];
            System.out.println("2nd Max is :"+secondMax);
        }else if((secondMax!=max)&&secondMax<max){
            System.out.println("Condition Failed for :"+arr[i]);
             secondMax=arr[i];
        }

    }
        System.out.println("*****");

        System.out.println("Max is :"+max);
        System.out.println("2nd Max is :"+secondMax);



    }
}
