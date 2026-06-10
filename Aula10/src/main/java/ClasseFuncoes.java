import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.FileWriter;
import java.lang.Character;
public class ClasseFuncoes {
    //Variáveis globais
    static Scanner reader = new Scanner(System.in);
    static String caminhoAtual = System.getProperty("user.dir") + "\\Aulas\\Aula10\\notasAlunos.txt";
    static File arquivo = new File(caminhoAtual);


    //OPÇÃO 1 - Criar um aluno
    public static void criarAluno() throws IOException {
        boolean errou = false;
        char entrada;
        String nome = "";

        //Verificador de se o usuário não digitou nada
        while(nome == null){
            if(errou) System.out.println("\033[1;31mNOME INVÁLIDO! \n" +
                    "POR FAVOR, INSIRA UM NOME COM PELO MENOS UMA LETRA\033[0m");
            System.out.println("\nDigite o nome do aluno que deseja criar:\n ");
            nome = reader.nextLine();
            errou = true;
        }

        errou = false;
        entrada = 'f';

        //Verifica se o usuário quer mesmo esse nome
        while (Character.toLowerCase(entrada) != 's'){
            if(errou) System.out.println("\033[1;31mVALOR INVÁLIDO! \n" +
                    "POR FAVOR, INSIRA UM VALOR DE ENTRADA VÁLIDO\033[0m");
            System.out.printf("Você tem certeza que deseja adicionar esse (%s) nome?" +
                    "\nDigite 's' para sim\nDigite 'n' para não\n", nome);
            entrada = reader.next().charAt(0);
            errou = true; //É usada para dizer se o usuário digitou algo errado

            //Se ele não quiser, volta toda a função para ele digitar o nome
            if(Character.toLowerCase(entrada) == 'n') criarAluno();
        }

        float[] notas = new float[4];

        //Pede para o usuário digitar as notas
        for(int i = 0; i<4; i++){
            errou = false;
            notas[i] = -1;
            while(notas[i] < 0 && notas[i]>10){
                if(errou) System.out.println("\033[1;31mVALOR INVÁLIDO! \n" +
                        "POR FAVOR, INSIRA UM VALOR DE ENTRADA VÁLIDO\033[0m");
                System.out.printf("\nDigite a %d° nota do aluno %s:  ", (i+1), nome);
                notas[i] = reader.nextFloat();
                errou = true;
            }
        }

        //Escreve no arquivo o nome e as notas
        try(FileWriter escritor = new FileWriter(caminhoAtual))
        {
            String conteudo = nome + ";" + notas[0] + ";" + notas[1] + ";" + notas[2] + ";" + notas[3];
            escritor.write(conteudo);
            System.out.println("Aluno adicionado com sucesso!");
        } catch(IOException e){
            throw new RuntimeException(e);
        }
    }

    //Opção 3: Verificar notas de alunos
    public static void verificarNota() throws FileNotFoundException {
        //Opções de alunos que podem aparecer após o usuário digitar os nomes
        Map<Integer, String> alunosPossiveis = new HashMap<Integer, String>();

        /*
        Opção Inválida é para caso o usuário tenha digitado o nome errado
        Opção Inválida SN serve para verificar se o usuário digitou S ou N
         */
        boolean opcaoInvalida = false, opcaoInvalidaSN, opcaoInvalidaIndx;

        //Variável que recebe S ou N - verifica se o usuário quer continuar procurando o aluno
        char continuarProcurando;
        /*
        nome - recebe o nome digitado pelo usuário
        linha - recebe o valor de cada linha do arquivo
        */
        String linha = "", nome;

        //Aluno - armazena os dados de cada aluno
        String[] aluno = new String[5];

        /*
        contLinhas - contador para a linha que o usuário está
        quantAlunPossiv - alunos que aparecem no filtro após digitar o nome
        opcaoEscol - Qual é o nome que ele quer as notas
        */
        int contLinhas = 0, quantAlunPossiv, opcaoEscol = -1;

        reader.nextLine(); //limpa o reader
        while(opcaoEscol < 0){
            alunosPossiveis.clear(); //limpa o vetor
            continuarProcurando = 'a'; //garante que o loop seja feito
            opcaoInvalidaSN = false;
            if(opcaoInvalida) {
                while(true){
                    if(opcaoInvalidaSN) System.out.println("\033[1;31mLETRA INSERIDA INVÁLIDA\n" +
                                    "DIGITE 'S' PARA SIM E 'N' PARA NÃO\033[0m");

                    System.out.println("O nome que você digitou não foi encontrado\n" +
                            "Deseja continuar procurando? [S/N]");
                    continuarProcurando = reader.next().charAt(0);


                    if(Character.toLowerCase(continuarProcurando) == 'n' ||
                            Character.toLowerCase(continuarProcurando) == 's') break;
                    opcaoInvalidaSN = true; //Se o loop acontecer, ele mostrará que a opção digitada foi inválida
                }
            }
            if(Character.toLowerCase(continuarProcurando) == 's') {
                reader.nextLine(); //limpa o readline
                opcaoInvalida = false;
            }
            if(Character.toLowerCase(continuarProcurando) == 'n') {
                System.out.println("\nVocê decidiu encerrar a busca");
                break;
            }

            System.out.println("Digite o nome do aluno que está procurando: ");
            nome = reader.nextLine();

            Scanner readerArq = new Scanner(arquivo);
            contLinhas = 0;

            //Lê a linha e confirma se o nome é igual ou possui caracteres semelhantes ao que o usuário digitou
            while(readerArq.hasNext()){
                linha = readerArq.nextLine();
                if(linha.contains(nome)) {
                    aluno = linha.split(";");

                    /*
                    Crie uma lista de nomes que podem ser possiveis por possuir a mesma cadeia de texto
                    que o usuário digitou
                    */
                    alunosPossiveis.put(contLinhas, aluno[0]);
                }
                contLinhas++;
            }

            quantAlunPossiv = alunosPossiveis.size();

            //Se não houver nenhum usuario semelhante, o nome digitado é inválido
            if(quantAlunPossiv==0) opcaoInvalida = true;


            else if(quantAlunPossiv<=8){
                System.out.println("Quais desses alunos você quer saber as informações? (Escolha pelo índice)");
                for(Integer i : alunosPossiveis.keySet()){
                    System.out.printf("\n Índice - %d   Nome: %s", i, alunosPossiveis.get(i));
                }
                opcaoInvalidaIndx = false;
                do{
                    if(opcaoInvalidaIndx)
                        System.out.println("\nDIGITE UM VALOR DENTRO DO INTERVALO");

                    System.out.println("\nDigite o índice que você deseja: ");
                    opcaoEscol = reader.nextInt();

                    opcaoInvalidaIndx = true; //Caso o usuário digite valor inválido
                } while(alunosPossiveis.get(opcaoEscol) == null);

                //Caso o usuário definitivamente escolha qual aluno ele quer
                aluno = linha.split(";");
            }

            //A fim de que o usuário não pegue muitas informações ou o nome fique muito longe
            else
                System.out.println("NÃO FOI POSSÍVEL LOCALIZAR (HÁ MUITOS NOMES)\nREESCREVA E DÊ MAIS DETALHE DOS NOMES");

            //Termina a função de ler o arquivo (ou seja, volta para a primeira linha quando for reaberto)
            readerArq.close();

        }
        if(opcaoEscol >=0){

            System.out.printf(
                    "O nome completo do aluno é: %s\n" +
                    "1° nota: %s\n" +
                    "2° nota: %s\n" +
                    "3° nota: %s\n" +
                    "4° nota: %s", aluno[0], aluno[1], aluno[2], aluno[3], aluno[4]);
        }
    }
}
