public class ex30 {
    public static void main(String[] args) throws Exception {
        
        for(int i = 1; i <= 10; i++){
            
            System.out.print(i + ", ");

            for(int j = 1; j <= i; j++){

                if(i % 2 == 0){

                    System.out.print((j * 2) + " ");

                }else{

                    for(j = 1; j <= i * 2; j += 2)
				    {
					System.out.print(j + " ");		
				    }
                    
                }

            }

            System.out.print("\n");

        }

    }
}
