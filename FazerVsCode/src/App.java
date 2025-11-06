import java.util.Scanner;

// --- CLASSE DE OPERAÇÕES ---
// Contém todos os métodos para os cálculos
class Operadores {

    // --- MÉTODOS ARITMÉTICOS (TEAMS) ---
    public float adicao(float v1, float v2) {
        return v1 + v2;
    }

    public float subtracao(float v1, float v2) {
        return v1 - v2;
    }

    public float multiplicacao(float v1, float v2) {
        return v1 * v2;
    }

    public float divisao(float v1, float v2) {
        // Adicionando uma verificação para evitar divisão por zero
        if (v2 == 0) {
            System.out.println("Erro: Divisão por zero!");
            return 0; // Retorna 0 em caso de erro
        }
        return v1 / v2;
    }

    // --- MÉTODO (ATRIBUIÇÃO) ---
    // Este método demonstra os operadores de atribuição em cadeia
    public void demonstrarAtribuicao(float valor, float op) {
        System.out.println("\n--- Demonstração: Operadores de Atribuição ---");
        System.out.println("Valor inicial: " + valor + ", Operador: " + op);
        
        // O valor é modificado em cada passo
        valor += op; // Ex: 150 + 2 = 152
        System.out.println("Após (valor += " + op + "): " + valor);
        
        valor -= op; // Ex: 152 - 2 = 150
        System.out.println("Após (valor -= " + op + "): " + valor);
        
        valor *= op; // Ex: 150 * 2 = 300
        System.out.println("Após (valor *= " + op + "): " + valor);
        
        valor /= op; // Ex: 300 / 2 = 150
        System.out.println("Após (valor /= " + op + "): " + valor);
        
        valor %= op; // Ex: 150 % 2 = 0
        System.out.println("Após (valor %= " + op + "): " + valor);
        
        System.out.println("----------------------------------------------");
    }

    // --- MÉTODOS (COMPARAÇÃO) ---
    // Retornam verdadeiro (true) ou falso (false)
    public boolean maiorQue(float v1, float v2) {
        return v1 > v2;
    }

    public boolean menorQue(float v1, float v2) {
        return v1 < v2;
    }

    public boolean igualA(float v1, float v2) {
        return v1 == v2;
    }

    public boolean diferenteDe(float v1, float v2) {
        return v1 != v2;
    }

    public boolean maiorOuIgual(float v1, float v2) {
        return v1 >= v2;
    }

    public boolean menorOuIgual(float v1, float v2) {
        return v1 <= v2;
    }

    // --- NOVOS MÉTODOS (LÓGICOS) ---
    // Operam sobre valores booleanos
    public boolean logE(boolean b1, boolean b2) {
        return b1 && b2;
    }

    public boolean logOU(boolean b1, boolean b2) {
        return b1 || b2;
    }

    public boolean logNAO(boolean b1) {
        return !b1;
    }
}

// --- CLASSE PRINCIPAL ---
public class App {

    public static void main(String[] args) {
        
        // Criando a instância da classe Operadores
        Operadores op = new Operadores();

        // 2. Craindo o scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // 3. Pedindo os valores para os operadores aritméticos e de comparação
        System.out.println("--- Entrada de Valores ---");
        System.out.print("Digite o primeiro valor (v1): ");
        float v1 = scanner.nextFloat(); // Lê o primeiro número

        System.out.print("Digite o segundo valor (v2): ");
        float v2 = scanner.nextFloat(); // Lê o segundo número


        // --- EXEMPLOS DE USO (ARITMÉTICOS) ---
        // Agora usando as variáveis v1 e v2
        System.out.println("\n--- Operadores Aritméticos ---");
        System.out.println("Resultado da adição (" + v1 + " + " + v2 + "): " + op.adicao(v1, v2));
        System.out.println("Resultado da subtração (" + v1 + " - " + v2 + "): " + op.subtracao(v1, v2));
        System.out.println("Resultado da multiplicação (" + v1 + " * " + v2 + "): " + op.multiplicacao(v1, v2));
        System.out.println("Resultado da divisão (" + v1 + " / " + v2 + "): " + op.divisao(v1, v2));
        
        // --- EXEMPLOS DE USO (ATRIBUIÇÃO) ---
        // Vou usar os mesmos v1 e v2 para a demonstração
        System.out.println("\n(Usando v1 = " + v1 + " como valor inicial e v2 = " + v2 + " como operador para atribuição)");
        op.demonstrarAtribuicao(v1, v2);

        // --- EXEMPLOS DE USO (COMPARAÇÃO) ---
        // Reutilizando os valores v1 e v2
        System.out.println("\n--- Operadores de Comparação ---");
        System.out.println(v1 + " > " + v2 + " é: " + op.maiorQue(v1, v2));
        System.out.println(v1 + " < " + v2 + " é: " + op.menorQue(v1, v2));
        System.out.println(v1 + " == " + v2 + " é: " + op.igualA(v1, v2));
        System.out.println(v1 + " != " + v2 + " é: " + op.diferenteDe(v1, v2));
        
        // --- EXEMPLOS DE USO (LÓGICOS) ---
        // Usando os resultados das comparações como entradas lógicas
        System.out.println("\n--- Operadores Lógicos ---");
        boolean b1 = op.maiorQue(v1, v2); // Resultado de (v1 > v2)
        boolean b2 = op.igualA(v1, v2);  // Resultado de (v1 == v2)
        
        System.out.println("(Usando b1 = '" + v1 + " > " + v2 + "' e b2 = '" + v1 + " == " + v2 + "')");
        System.out.println(b1 + " E " + b2 + " é: " + op.logE(b1, b2));
        System.out.println(b1 + " OU " + b2 + " é: " + op.logOU(b1, b2));
        System.out.println("NÃO " + b1 + " é: " + op.logNAO(b1));

        // 4. FECHAR O SCANNER (Boa prática)
        scanner.close();
    }
}