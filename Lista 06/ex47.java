public class ex47 {
    public static void main(String[] args) throws Exception {
        
        int contagemDivisores = 0;

        for(int i = 0; i < 100; i++){
            for(int j = 1; j <= i; j++){
                if(i % j == 0){
                    contagemDivisores++;

                }
            }

            if(contagemDivisores == 2){
                System.out.println("O numero " + i + " e primo");

            }

            contagemDivisores = 0;
            
        }
    }
}
