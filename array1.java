import java.util.*;
public class array1{

    // public static void main(String[] args) {
    //     int marks[] = new int[50];
    //     Scanner sc = new Scanner(System.in);
    //     marks[0] = sc.nextInt();
    //     marks[1] = sc.nextInt();
    //     marks[2] = sc.nextInt();

    //     int percentage = (marks[0] + marks[1] + marks[2])/3;

    //     System.out.println("percentage is  : " + percentage);
        
    // }


 // passing array argument
 
 
//  public static void update(int marks[]){
//     for(int i = 0 ; i < marks.length; i++){
//         marks[i] = marks[i] + 1;
//     }
//  }
//  public static void main(String[] args) {
//     int marks[] = {67,83,87};
//     update(marks);

//     for (int i = 0 ; i < marks.length; i++){
//         System.out.println(marks[i]);
//     }
//  }


//linear search


// public static int leanerSearch(int numbers[] , int key){
//     for(int i = 0; i <= numbers.length ; i++){
//         if(numbers[i] == key ){
//             return i;
//         }
//     }
//     return -1;
// }

// public static void main(String[] args) {
//     int numbers[] = {2,4,6,8,10,1214,16};
//     int key = 10;

//     int index = leanerSearch(numbers, key);
//     if(index == -1){
//         System.out.println("key not found");
//     }else{
//         System.out.println("key found at index :" + index);
//     }
// }


// largest number

public static int largestNumber( int numbers[]){
    int largest = Integer.MIN_VALUE;

    for(int i = 0 ; i < numbers.length ; i++){
        if(largest < numbers[i]){
            largest = numbers[i];
        }
    }
    return largest;
}


//binary search

public static int binarySearch(int numbers[] , int key){
    int start = 0;
    int end = numbers.length-1;

    while ( start <= end ){
        int mid = ( start + end) /2;
        if(numbers[mid] == key){
            return mid;
        }
        if(numbers[mid] < key){
            start = mid+1;
        }else{
            end = mid-1;
        }
    }
    return -1;
}


// Reverse an array

    public static void reverse(int numbers[]){
        int first = 0;
        int last = numbers.length-1;

        while(first<last){
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;
        }
    }

    // public static void main(String[] args) {
    //     int numbers[] = {2,4,6,8,10};
    //     reverse(numbers);
    //     for(int i = 0 ; i < numbers.length ; i++){
    //         System.out.println(numbers[i] + " ");
    //     }
    //     System.out.println();
    // }


//pairs  in an array

    public static void printPairs(int numbers[]){
        for(int i = 0; i < numbers.length; i++){
            int curr = numbers[i];
            for(int j = i+1; j < numbers.length; j++){
                System.out.print("(" + curr + "," + numbers[j] + ")");
            }
            System.out.println();
        }
    }


    //print subarrays

    public static void printSubArrays(int numbers[]){
        for(int i = 0; i < numbers.length; i++){
            int start = i;
            for(int j = i; j < numbers.length; j++){
               int end = j;
               for(int k = start ; k<= end; k++){
                System.out.print( numbers[k]  + " " );
               }
               System.out.println();
            }
            System.out.println();
        }
    }


//max subarray sum (brute force)

    public static void maxSubarraySum(int numbers[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i < numbers.length; i++){
            int start = i;
            for(int j = i; j < numbers.length; j++){
               int end = j;
               currSum = 0;
               for(int k = start ; k<= end; k++){
                currSum += numbers[k];
               }
               System.out.println(currSum);
               if(maxSum < currSum){
                maxSum = currSum;
               }
            }
        }
        System.out.println("max sum = " + maxSum);
    }


//max subarray sun (prefix sum)    
    public static void maxSubarraySumPrefix(int numbers[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        //calculate prefix array
        prefix[0] = numbers[0];
        for(int i = 1; i < prefix.length; i++){
            prefix[i] = prefix[i-1] + numbers[i];
        }

        for(int i = 0; i < numbers.length; i++){
            int start = i;
            for(int j = i; j < numbers.length; j++){
               int end = j;
               currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];


               System.out.println(currSum);
               if(maxSum < currSum){
                maxSum = currSum;
               }
            }
        }
        System.out.println("max sum = " + maxSum);
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        maxSubarraySumPrefix(numbers);
    }
} 