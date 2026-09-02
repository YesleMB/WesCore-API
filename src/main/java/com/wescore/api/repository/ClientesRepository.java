package com.wescore.api.repository;
import com.wescore.api.entity.Cliente;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface ClientesRepository extends JpaRepository<Cliente, Long> {
    @Query(value = """
				   select 
	pc.codcli,
	pc.tipopessoa,
	pc.cliente,
	pc.fantasia,
	pc.cgc,
	pc.uf,
	pc.municipio,
	pc.bairro,
	pc.endereco,
	pc.numero,
	pr.qt_Visitas  
from promo_relacao pr 
inner join promo_clientes pc
	on pr.codcli = pc.codcli 
where pr.id_promotor = :idPromotor
;
""", nativeQuery = true)
 
    List<Cliente> findClientesByIdPromotor(Long idPromotor);
    
}
