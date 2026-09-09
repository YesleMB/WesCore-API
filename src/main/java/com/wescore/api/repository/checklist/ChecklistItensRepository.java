package com.wescore.api.repository.checklist;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wescore.api.entity.checklists.ChecklistItens;

@Repository 
public interface  ChecklistItensRepository  extends JpaRepository<ChecklistItens, Long> {
    
}
