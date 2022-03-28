package com.revature.p1backend.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.p1backend.model.Reimbursement;

public interface ReimbursementRepository extends JpaRepository<Reimbursement, Integer> {

	public List<Reimbursement> findByStatus(int statusId);
	
	public List<Reimbursement> findByAuthor(int authorId);

}
