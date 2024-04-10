import br.com.desafio.dominio.Curso;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descricao do curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso1.setTitulo("Curso Python");
        curso1.setDescricao("Descricao do curso Python");
        curso1.setCargaHoraria(8);



        List<Curso> minhalista  = new LinkedList<>(){{
            add(curso1);
            add(curso2);
        }};


        System.out.println(minhalista.toString());
    }
}