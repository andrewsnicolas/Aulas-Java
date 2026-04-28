import com.github.javafaker.Faker;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Random;
public class Ex050 {
    public static void main(String args[]){
        Faker faker = new Faker();
        float[] notas = new float[4];
        DecimalFormat df = new DecimalFormat("##.##");
        float min = 0F;
        float max = 10.0F;
        Random random = new Random();
        float notaAleatoria;
        int c;
        String conteudo;
        try (FileWriter escritor = new FileWriter("notasAlunos.txt")){
            ;
            for(int i = 0; i<=50; i++){
                c=0;
                do{
                    notas[c] = min - random.nextFloat() * (max-min);
                    notas[c]*=-1;
                    c++;
                }while(c<4);
                conteudo = faker.name().name()+";"+ df.format(notas[0])+";"+df.format(notas[1])+";"+df.format(notas[2])+";"+df.format(notas[3]);
                escritor.write(conteudo+"\n");
            }
            System.out.println(System.getProperty("user.dir"));
            System.out.println("Deu tudo certo");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
