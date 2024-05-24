public class Operadores {
    public static void main(String[] args) {
        
        String nomeUm = "RAFAELY";
        String nomeDois = "RAFAELY";

        System.out.println(nomeUm.equals(nomeDois));
        
            
        int numero1 = 1;
        int numero2 = 2;
        
        boolean simNao = numero1 == numero2;
        if(numero1 < numero2){
            System.out.println("a nossa condição é verdadeira");
        }

        if(numero1 == numero2){
            System.out.println("a nossa condição é verdadeira");
        }

        System.out.println("numero Um é igual a numero Dois? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("numero Um é diferente a numero Dois? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("numero Um é maior que numero Dois? " + simNao);
    }
}
