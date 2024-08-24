import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {

        Curso curso = new Curso(
                "Curso Java POO",
                "Aprenda Java",
                8);
        Curso curso2 = new Curso(
                "Curso de Introdução Collection Java",
                "Aprenda a ultilizar a coleção java",
                8);
        Mentoria mentoria = new Mentoria(
                "Mentoria Java",
                "java 20",
                LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(mentoria);

        Dev devJosenildo = new Dev();
        devJosenildo.setNome("Josenildo Souza Reis");
        devJosenildo.inscreverBootcamp(bootcamp);
        devJosenildo.progredir();

        System.out.println("Esses são os cursos que você esta inscrito " + devJosenildo.getConteudosInscritos());
        System.out.println("Esses são os cursos que você concluiu " + devJosenildo.getConteudosConcluidos());
        System.out.println("Você ganhou mais " + devJosenildo.calcularXp() + " de Xp");

    }
}
