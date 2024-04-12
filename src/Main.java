import br.com.desafio.dominio.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Curso ffd = new Curso();
        ffd.setTitulo("Curso Python");
        ffd.setDescricao("Descricao do curso Python");
        ffd.setCargaHoraria(7);


        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descricao do curso java");
        curso1.setCargaHoraria(8);



        Mentoria minhament = new Mentoria();
        minhament.setTitulo("mentoria java");
        minhament.setDescricao("descricao da mentoria");
        minhament.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java developer");
        bootcamp.setDescricao("um bootcamp sobre java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(ffd);
        bootcamp.getConteudos().add(minhament);

        Dev leo = new Dev();
        leo.setNome("Leonardo");
        leo.inscreverBootcamp(bootcamp);
        System.out.println(leo.getConteudosInscritos());
        leo.progredir();
        leo.progredir();
        leo.progredir();
        System.out.println(leo.getConteudosConcluidos());
        System.out.println(leo.getConteudosInscritos());
        System.out.println("XP : " + leo.calcularXp());





    }
}