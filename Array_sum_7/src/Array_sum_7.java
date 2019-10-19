import java.util.Arrays;

            public class Array_sum_7 {
                public static void main(String[] args) {


                    int arr[] = {4, 2, 6, 8,-2, 9, 3, 1,-1};

                    int sum = 7;

                        for(int i=0; i<arr.length; i++){

                            for(int j=i; j<arr.length;j++){

                                if(arr[i]+arr[j] == sum)
                                    System.out.println("("+arr[i]+","+arr[j]+")");
                        }

                    }
                }
            }







