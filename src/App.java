public class App {
    public static void main(String[] args) throws Exception {
        int n=10, cant_menos=1, cant_mas=1;
    
        for(int i=1; i<=n; i++){
        if(i%2!=0){
            for(int j=1; j<=cant_menos; j++){
                System.out.print("-");
            }
            System.out.print(" ");
            cant_menos++;
        }else{
            for(int k=1; k<=cant_mas; k++){
                System.out.print("+");
            }
            System.out.print(" ");
            cant_mas++;
        }
    }
    }
}
