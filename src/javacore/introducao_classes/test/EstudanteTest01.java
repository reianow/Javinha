package javacore.introducao_classes.test;

import javacore.introducao_classes.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Reinaldo";
        estudante.idade = 23;
        estudante.sexo = 'M';
    }
}
