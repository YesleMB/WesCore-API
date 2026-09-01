package com.wescore.api.repository;
import com.wescore.api.entity.Cliente;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface ClientesRepository extends JpaRepository<Cliente, Long> {
    @Query("
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
	pr.qt_visitas  
from promo_relacao pr 
inner join promo_clientes pc
	on pr.codcli = pc.codcli 
where pr.id_promotor = :idPromotor
;")
    List<Cliente> findClientesByIdPromotor(Long idPromotor);
    
}
