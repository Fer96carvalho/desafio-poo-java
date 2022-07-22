import entity.Curso;
import entity.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Javascript");
        curso2.setDescricao("Descrição curso javascript");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria("Mentoria Java", "Descrição mentoria Java", LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);


    }
}
