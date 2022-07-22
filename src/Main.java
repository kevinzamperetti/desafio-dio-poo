import br.com.dio.desafio.dominio.*;
import br.com.dio.desafio.dominio.enums.Categoria;
import br.com.dio.desafio.dominio.enums.Nivel;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso cursoJava = new Curso();
        cursoJava.setTitulo("Curso de Java");
        cursoJava.setDescricao("Descrição Curso de Java");
        cursoJava.setCargaHoraria(8);
        cursoJava.setCategoria(Categoria.DESENVOLVIMENTO);
        cursoJava.setNivel(Nivel.INTERMEDIARIO);

        Curso cursoJs = new Curso();
        cursoJs.setTitulo("Curso de JavaScript");
        cursoJs.setDescricao("Descrição Curso de Java");
        cursoJs.setCargaHoraria(4);
        cursoJs.setCategoria(Categoria.DESENVOLVIMENTO);
        cursoJs.setNivel(Nivel.BASICO);

        Curso cursoLinux = new Curso();
        cursoLinux.setTitulo("Curso de Linux");
        cursoLinux.setDescricao("Descrição Curso de Linux");
        cursoLinux.setCargaHoraria(6);
        cursoLinux.setCategoria(Categoria.SYSADMIN);
        cursoLinux.setNivel(Nivel.BASICO);

        Mentoria mentoriaJava = new Mentoria();
        mentoriaJava.setTitulo("Mentoria de Java");
        mentoriaJava.setDescricao("Descrição da Mentoria de Java");
        mentoriaJava.setData(LocalDate.now());
        mentoriaJava.setCategoria(Categoria.DESENVOLVIMENTO);
        mentoriaJava.setNivel(Nivel.BASICO);

        Mentoria mentoriaLinux = new Mentoria();
        mentoriaLinux.setTitulo("Mentoria de Linux");
        mentoriaLinux.setDescricao("Descrição da Mentoria de Linux");
        mentoriaLinux.setData(LocalDate.now());
        mentoriaLinux.setCategoria(Categoria.SYSADMIN);
        mentoriaLinux.setNivel(Nivel.BASICO);

        Bootcamp bootcampJava = new Bootcamp();
        bootcampJava.setNome("Bootcamp Java Developer");
        bootcampJava.setDescricao("Descrição Bootcamp Java Developer");
        bootcampJava.getConteudos().add(cursoJava);
        bootcampJava.getConteudos().add(cursoJs);
        bootcampJava.getConteudos().add(mentoriaJava);

        Bootcamp bootcampLinux = new Bootcamp();
        bootcampLinux.setNome("Bootcamp Linux SysAdmin");
        bootcampLinux.setDescricao("Descrição Bootcamp Linux SysAdmin");
        bootcampLinux.getConteudos().add(mentoriaLinux);
        bootcampLinux.getConteudos().add(cursoLinux);

        System.out.println("Lista de Devs Inscritos no Bootcamp Java: " + bootcampJava.listarDevsBootcamp());
        System.out.println("Lista de Devs Inscritos no Bootcamp Linux: " + bootcampLinux.listarDevsBootcamp());

        System.out.println("------------");
        Dev devKevin = new Dev();
        devKevin.setNome("Kevin");
        devKevin.inscreverBootcamp(bootcampJava);
        System.out.println("Conteúdos Inscritos Kevin: " + devKevin.getConteudosInscritos());
        devKevin.progredir();
        devKevin.progredir();
        System.out.println("---Após Progredir---");
        System.out.println("Conteúdos Inscritos Kevin: " + devKevin.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Kevin: " + devKevin.getConteudosConcluidos());
        System.out.println("Categorias dos Conteúdos Kevin: " + devKevin.getCategoriasConteudos());
        System.out.println("Nivel dos Conteúdos Kevin: " + devKevin.getNivelConteudos());
        System.out.println("XP" + devKevin.calcularTotalXp());

        System.out.println("------------");
        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcampJava);
        devJoao.inscreverBootcamp(bootcampLinux);
        System.out.println("Conteúdos Inscritos João: " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("---Após Progredir---");
        System.out.println("Conteúdos Inscritos João: " + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos João: " + devJoao.getConteudosConcluidos());
        System.out.println("Categorias dos Conteúdos João: " + devJoao.getCategoriasConteudos());
        System.out.println("Nivel dos Conteúdos João: " + devJoao.getNivelConteudos());
        System.out.println("XP" + devJoao.calcularTotalXp());

        System.out.println("------------");
        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        devMaria.inscreverBootcamp(bootcampLinux);
        System.out.println("Conteúdos Inscritos Maria: " + devMaria.getConteudosInscritos());
        devMaria.progredir();
        System.out.println("---Após Progredir---");
        System.out.println("Conteúdos Inscritos Maria: " + devMaria.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Maria: " + devMaria.getConteudosConcluidos());
        System.out.println("Categorias dos Conteúdos Maria: " + devMaria.getCategoriasConteudos());
        System.out.println("Nivel dos Conteúdos Maria: " + devMaria.getNivelConteudos());
        System.out.println("XP" + devMaria.calcularTotalXp());

        System.out.println("------------");
        System.out.println("Lista de Devs Inscritos no Bootcamp Java: " + bootcampJava.listarDevsBootcamp());
        System.out.println("Lista de Devs Inscritos no Bootcamp Linux: " + bootcampLinux.listarDevsBootcamp());

    }
}
