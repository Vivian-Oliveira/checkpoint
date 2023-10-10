import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main{
    public static void main(String[] args) {
        lista();
    }

    public static void lista() {
        
        String[] alunos = {"Edgar", "Fabricio", "Abner", "Lucas", "Fabiana", "Antônia"};
        System.out.println("1) Alunos: " + Arrays.toString(alunos));

        
        String[] codigosAlunos = {"001", "114", "364", "987"};
        System.out.println("2) Códigos dos Alunos: " + Arrays.toString(codigosAlunos));

       
        String[][] produtos = {
            {"Macbook air", "Macbook pro"},
            {"Dell XPS", "Lenovo"},
            {"Samsung 360"}
        };
        int totalElementos = 0;
        for (String[] linha : produtos) {
            totalElementos += linha.length;
        }
        System.out.println("3) Total de elementos na matriz: " + totalElementos);

        
        List<String> nomes = new ArrayList<>();
        nomes.add("Alice");
        nomes.add("Bob");
        nomes.add("Carol");
        nomes.add("David");
        nomes.add("Eve");
        System.out.println("4) Nomes: " + nomes);

 
        List<Integer> valores = Arrays.asList(100, 200, 400, 500, 600, 100, 350, 200);
        Set<Integer> valoresSemDuplicidade = new HashSet<>(valores);
        System.out.println("5) Valores sem duplicidade: " + valoresSemDuplicidade);
    }
}