import java.util.Scanner;

public class App {

    // 1. Deixamos o 'Scanner' como "static" (estático)
    // Assim, ele pode ser usado por todos os outros métodos estáticos da classe sem precisarmos criá-lo várias vezes.
    static Scanner ler = new Scanner(System.in);

    /**
     * Método principal (main)
     * Ele vai chamar todos os outros métodos que demonstram os operadores.
     */
    public static void main(String[] args) throws Exception {
        
        // Chamando cada método de demonstração, um por um
        demonstrarAritmeticos();
        demonstrarIncrementoDecremento();
        demonstrarAtribuicao();
        demonstrarComparacao();
        demonstrarLogicos();
        
        System.out.println("\n--- Demonstração Concluída ---");
        
        // Boa prática: Fechar o Scanner quando não for mais usá-lo
        ler.close();
    }

    /**
     * Escopo da Atividade:
     * Método para demonstrar os operadores Aritméticos: +, -, *, /, %
     * (Conforme a primeira imagem do README)
     */
    public static void demonstrarAritmeticos() {
        System.out.println("\n--- 1. Operadores Aritméticos ---");
        System.out.print("Digite o primeiro número (inteiro): ");
        int a = ler.nextInt();
        System.out.print("Digite o segundo número (inteiro): ");
        int b = ler.nextInt();

        System.out.println(a + " + " + b + " = " + (a + b)); // Soma
        System.out.println(a + " - " + b + " = " + (a - b)); // Subtração
        System.out.println(a + " * " + b + " = " + (a * b)); // Multiplicação
        
        // Vamos checar se o segundo número é zero para evitar erros na divisão
        if (b != 0) {
            // Divisão entre inteiros resulta em um inteiro (ignora casas decimais)
            System.out.println(a + " / " + b + " = " + (a / b) + " (Divisão Inteira)");
            
            // Para ter um resultado "real", convertemos um dos números para double
            System.out.println(a + " / " + b + " = " + ((double)a / b) + " (Divisão Real)");
            
            // Módulo (resto da divisão)
            System.out.println(a + " % " + b + " = " + (a % b) + " (Módulo/Resto)");
        } else {
            System.out.println("Não é possível dividir por zero.");
        }
    }

    /**
     * Escopo da Atividade:
     * Método para demonstrar os operadores de Incremento e Decremento: ++, --
     * (Conforme a segunda imagem do README)
     */
    public static void demonstrarIncrementoDecremento() {
        System.out.println("\n--- 2. Operadores Incremento/Decremento ---");
        System.out.print("Digite um número inicial: ");
        int num = ler.nextInt();

        // Pós-incremento: usa o valor ATUAL e DEPOIS soma 1
        System.out.println("Valor atual: " + num);
        System.out.println("Usando Pós-incremento (num++): " + (num++)); 
        System.out.println("Valor após o pós-incremento: " + num);

        // Pré-incremento: PRIMEIRO soma 1 e DEPOIS usa o valor
        System.out.println("Usando Pré-incremento (++num): " + (++num));
        System.out.println("Valor após o pré-incremento: " + num);

        // Pós-decremento: usa o valor ATUAL e DEPOIS subtrai 1
        System.out.println("Usando Pós-decremento (num--): " + (num--));
        System.out.println("Valor após o pós-decremento: " + num);

        // Pré-decremento: PRIMEIRO subtrai 1 e DEPOIS usa o valor
        System.out.println("Usando Pré-decremento (--num): " + (--num));
        System.out.println("Valor após o pré-decremento: " + num);
    }

    /**
     * Desafio da Atividade:
     * Método para demonstrar os operadores de Atribuição: =, +=, -=, *=, /=, %=
     */
    public static void demonstrarAtribuicao() {
        System.out.println("\n--- 3. Operadores de Atribuição ---");
        System.out.print("Digite um valor inicial (ex: 100): ");
        int valor = ler.nextInt();
        System.out.print("Digite um valor para operar (ex: 5): ");
        int op = ler.nextInt();

        System.out.println("Valor inicial: " + valor);
        
        valor += op; // Equivalente a: valor = valor + op;
        System.out.println("Após (valor += " + op + "): " + valor);

        valor -= op; // Equivalente a: valor = valor - op;
        System.out.println("Após (valor -= " + op + "): " + valor);

        valor *= op; // Equivalente a: valor = valor * op;
        System.out.println("Após (valor *= " + op + "): " + valor);

        if (op != 0) {
            valor /= op; // Equivalente a: valor = valor / op;
            System.out.println("Após (valor /= " + op + "): " + valor);

            valor %= op; // Equivalente a: valor = valor % op;
            System.out.println("Após (valor %= " + op + "): " + valor);
        } else {
             System.out.println("Operações de /= e %= puladas para evitar divisão por zero.");
        }
    }

    /**
     * Desafio da Atividade:
     * Método para demonstrar os operadores de Comparação (Relacionais): ==, !=, >, <, >=, <=
     */
    public static void demonstrarComparacao() {
        System.out.println("\n--- 4. Operadores de Comparação (Relacionais)");
        System.out.println("Estes operadores sempre retornam 'true' (verdadeiro) ou 'false' (falso).");
        System.out.print("Digite o primeiro número: ");
        int a = ler.nextInt();
        System.out.print("Digite o segundo número: ");
        int b = ler.nextInt();

        System.out.println(a + " == " + b + " (Igual a): " + (a == b));
        System.out.println(a + " != " + b + " (Diferente de): " + (a != b));
        System.out.println(a + " > " + b + " (Maior que): " + (a > b));
        System.out.println(a + " < " + b + " (Menor que): " + (a < b));
        System.out.println(a + " >= " + b + " (Maior ou igual a): " + (a >= b));
        System.out.println(a + " <= " + b + " (Menor ou igual a): " + (a <= b));
    }
    
    /**
     * Desafio da Atividade:
     * Método para demonstrar os operadores Lógicos: && (E), || (OU), ! (NÃO)
     */
    public static void demonstrarLogicos() {
        System.out.println("\n--- 5. Operadores Lógicos ---");
        System.out.println("Vamos testar duas condições lógicas:");
        System.out.println("Condição 1: O número é maior que 10?");
        System.out.println("Condição 2: O número é par?");
        
        System.out.print("\nDigite um número: ");
        int num = ler.nextInt();

        // Criando as duas condições booleanas
        boolean cond1 = (num > 10);
        boolean cond2 = (num % 2 == 0); // (Resto da divisão por 2 é 0)
        
        System.out.println("Número digitado: " + num);
        System.out.println("Condição 1 (num > 10) é: " + cond1);
        System.out.println("Condição 2 (num % 2 == 0) é: " + cond2);

        // && (E Lógico) - SÓ é verdade se AMBAS forem verdadeiras
        System.out.println("(Condição 1 E Condição 2) -> (cond1 && cond2): " + (cond1 && cond2));

        // || (OU Lógico) - SÓ é falso se AMBAS forem falsas
        System.out.println("(Condição 1 OU Condição 2) -> (cond1 || cond2): " + (cond1 || cond2));

        // ! (NÃO Lógico) - Inverte o valor (true vira false, false vira true)
        System.out.println("Negação da Condição 1 -> (!cond1): " + (!cond1));
    }
}
