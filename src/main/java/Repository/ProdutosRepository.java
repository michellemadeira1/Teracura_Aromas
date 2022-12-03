package Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Produtos;

public interface  ProdutosRepository extends JpaRepository<Produtos, Long>{

	List<Produtos> findAllByNomeProdutoContainingIgnoreCase(String nomeProduto);
	Optional<Produtos> findByNomeProduto(String nomeProduto);
}
