package application;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		
		 Curso curso1 = new Curso();
	        curso1.setTitile("curso java");
	        curso1.setDescricao("Intrdução ao java");
	        curso1.setCargaHoraria(50);

	        Curso curso2 = new Curso();
	        curso2.setTitile("curso python");
	        curso2.setDescricao("Introdutorio ao python");
	        curso2.setCargaHoraria(60);

	        Mentoria mentoria = new Mentoria();
	        mentoria.setTitile("mentoria de java");
	        mentoria.setDescricao("descrição da mentoria java");
	        mentoria.setData(LocalDate.now());

	       

	        Bootcamp bootcamp = new Bootcamp();
	        bootcamp.setNome("Bootcamp Java Developer");
	        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
	        bootcamp.getConteudos().add(curso1);
	        bootcamp.getConteudos().add(curso2);
	        bootcamp.getConteudos().add(mentoria);

	        Dev devDiogo = new Dev();
	        devDiogo.setNome("Diogo");
	        devDiogo.inscreverBootcamp(bootcamp);
	        System.out.println("Conteúdos Inscritos Diogo:" + devDiogo.getConteudosInscritos());
	        devDiogo.progredir();
	        devDiogo.progredir();
	        System.out.println("-");
	        System.out.println("Conteúdos Inscritos Diogo:" + devDiogo.getConteudosInscritos());
	        System.out.println("Conteúdos Concluídos Diogo:" + devDiogo.getConteudosConcluidos());
	        System.out.println("XP:" + devDiogo.calcularTotalXp());

	        System.out.println("-------");

	        Dev devMaria = new Dev();
	        devMaria.setNome("Joao");
	        devMaria.inscreverBootcamp(bootcamp);
	        System.out.println("Conteúdos Inscritos maria:" + devMaria.getConteudosInscritos());
	        devMaria.progredir();
	        devMaria.progredir();
	        devMaria.progredir();
	        System.out.println("-");
	        System.out.println("Conteúdos Inscritos maria:" + devMaria.getConteudosInscritos());
	        System.out.println("Conteúdos Concluidos maria:" + devMaria.getConteudosConcluidos());
	        System.out.println("XP:" + devMaria.calcularTotalXp());

	}

}
