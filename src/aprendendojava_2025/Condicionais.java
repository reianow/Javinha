package aprendendojava_2025;

public class Condicionais {
    public static void main(String[] args) {
        int idade = 25;
        String categoria;
//        if (idade < 15){
//            categoria = "Você está na categoria infantil";
//        } else if (idade >= 15 && idade < 18){
//            categoria = ("Você está na categoria juvenil");
//        } else {
//            categoria = ("Você está na categoria adulto");
//        }
        categoria = idade < 15 ? "categoria infantil" : idade >= 15 && idade < 18 ? "categoria juvenil" : "categoria adulto";
        System.out.println(categoria);
    }
}
