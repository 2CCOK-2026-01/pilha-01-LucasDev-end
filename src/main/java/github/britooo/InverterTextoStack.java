package github.britooo;

public class InverterTextoStack {
    public static String inverter(String input) {
        char[] texto = input.toCharArray();
        Integer tamanho = texto.length;
        Pilha<Character> pilhaTexto = new Pilha(tamanho);
        StringBuilder resposta = new StringBuilder();

        for(int i = 0; i < tamanho; i++){
            char letraAtual = texto[i];
            pilhaTexto.push(letraAtual);
        }

        while (!pilhaTexto.isEmpty()){
            resposta.append(pilhaTexto.pop());
        }

        return resposta.toString();
    }
}
