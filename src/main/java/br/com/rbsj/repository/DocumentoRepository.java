package br.com.rbsj.repository;

import br.com.rbsj.model.Documento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentoRepository  extends JpaRepository<Documento, Long> {
}
