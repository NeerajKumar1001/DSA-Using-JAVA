public class majorityelement {
    public static void main(String[] args) {
        int nums[] = {2,2,1,1,1,2,2};
        int i = 0;
        int j = 0;

        for (int num : nums) {
            if (i == 0) {
                j = num;
            }

           if(num == j){
              i++ ;
           }else {
              i--;
           }
        } 

        System.out.println(j);
    }
}
