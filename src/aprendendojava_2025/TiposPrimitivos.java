package aprendendojava_2025;

public class TiposPrimitivos {
    public static void main(String[] args) {
    // int, double, float, char, boolean, byte, short, long
        char letter = 'R';
        int age = 24;
        double height = 1.81;
        float weight = 61;
        boolean man = true, woman = false;
        byte b = -127;
        short s = 18;
        long l = 10000000;
        String name = "Reinaldo Santos";
        String presentation = "Olá, meu nome é "+name+", tenho "+age+" anos, sou "+man+" homem, "+height+"cm de altura e "+weight+"kg.";

        /*
       Olá, meu nome é <nome> , tenho <idade> anos, sou <sexo> homem, <altura> cm de altura e <peso> kg.
         */

        System.out.println(presentation);



        System.out.println("I am "+age+" years old");
    }
}

