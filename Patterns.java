class Patterns{

    public static void main(String[] args) {
     //pattrn 5:

    //  for(int i=0 ; i<=5 ; i++){
    //     for(int j = 5; j>=i ; j--){
    //         System.out.print('*');

    //     }
    //     System.out.println();
    //  }


    // pattern 6:
  
   for (int i = 5; i >= 1; i--) {
            // Inner loop for printing numbers in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            // Move to the next line after each row
            System.out.println();
        }


    }
}