package Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria,Long> {

	List<Categoria> findAllByNomeCategoriaContainingIgnoreCase(String nomeCategoria);

	Optional<Categoria> findByNomeCategoria(String nomeCategoria);
}
