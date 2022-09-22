package br.com.sigep.apresentacao.aplicacao_spring;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

import javafx.application.Application;

@EntityScan("br.com.sigep")
@ComponentScan("br.com.sigep")
@SpringBootApplication
public class AplicacaoSpring {

    public static void main(String[] args) {
		Application.launch(AplicacaoJavaFX.class, args);
	}
       
}