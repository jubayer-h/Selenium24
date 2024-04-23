package Selenium;

public class findoutvalue {
    public static void main(String[] args) {

        // comparing content of 2 Integer array to find common value
       // int [] array1 = {10,20,30,60};
       // int [] array2 = {50,20,40,60};
        //for(int i=0; i<array1.length; i++) {
         //   for(int j=0; j<array2.length; j++) {
            //    if(array1[i]==array2[j]) {
             //       System.out.println("Common value: "+array1[i]);

        int [] arry1={10,20,30,60};
        int [] arry2={50,20,30,90};

        for(int i=0; i<arry1.length; i++){
            for(int j=0; j<arry2.length; j++){
                if(arry1[i]==arry2[j]){
                    System.out.println("common value : "+arry1[i]);
                }

            }
        }
    }
}
