package com.example.obspringDataJPA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ObSpringDataJpaApplication {

    public static void main(String[] args) {

        // primero añadimos el contexto para poder acceder
        ApplicationContext context = SpringApplication.run(ObSpringDataJpaApplication.class, args);

        //a partir del contexto con el metodo getBean, le pasamos la clase, para que nos de un objeto de la clase repository
        CocheRepository repository = context.getBean(CocheRepository.class);

        System.out.println("find");
        System.out.println("El número de coches en base de datos es: "  + repository.count());

        // crear y almacenar un coche en base de datos

        // 1. creamos un objeto de tipo coche:
        Coche toyota = new Coche(null, "Toyota", "Prius", 2010);

        // 2. Lo guardamos en nuestro repositorio:
        repository.save(toyota);
        System.out.println("El número de coches en base de datos es: "  + repository.count());

        // recuperar un coche por ID
        repository.findAll();
        System.out.println(repository.findAll());
    }

}
