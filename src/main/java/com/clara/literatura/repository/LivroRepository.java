package com.clara.literatura.repository;

import com.clara.literatura.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long> {

    @Query("SELECT l FROM Livro l JOIN FETCH l.autor")
    List<Livro> findAllWithAutor();

    List<Livro> findByIdioma(String idioma);
}
