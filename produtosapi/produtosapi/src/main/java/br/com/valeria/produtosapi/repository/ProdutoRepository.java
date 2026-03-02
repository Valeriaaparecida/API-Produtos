package br.com.valeria.produtosapi.repository;

import br.com.valeria.produtosapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository <Produto, String>{
}
