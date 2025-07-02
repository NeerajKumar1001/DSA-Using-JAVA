public class patterns {

//Hollow_rectangle    

    public static void hollow_rectangle(int Rows , int Cols){
        //outerloop
        for(int i = 1 ; i <= Rows ; i++){
            // innerloop
            for(int j = 1 ; j <= Cols ; j++){
                if(i == 1 || i == Rows || j == 1 | j == Cols){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

// inverted half pyramid

    public static void inverted_Pyramid(int n){
        for(int i = 1 ; i <= n ; i++){
            //spaces
            for(int j = 1 ; j <= n-i ; j++){
                System.out.print(" ");
            }
            for(int j = 1 ; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }

//Inverted half-pyramid with numbers

    public static void Number_Pyramid(int n){
        for(int i = 1 ; i <= n ; i++){
            // stars
            for(int j = 1; j <= n ; j++){
                System.out.print(j);
            }
            for(int j = 1 ; j <= n-i+1 ; j++){
                System.out.println(" ");
            }
            System.out.println();
        }
        
    }

    public static void main(String[] args) {
        Number_Pyramid(5);
    }
}
