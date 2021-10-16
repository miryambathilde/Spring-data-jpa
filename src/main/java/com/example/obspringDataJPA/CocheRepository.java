package com.example.obspringDataJPA;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Notación de repositorio
@Repository

// le pasamos JpaRepository<T, ID>, el primero es el nombre de la clase que es nuestra tabla, en este caso es la clase Coche
// el segundo es el id, que lo tenemos como Long en la clase coche
public interface CocheRepository extends JpaRepository<Coche, Long> {}
