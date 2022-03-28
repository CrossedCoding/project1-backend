package com.revature.p1backend.service;

import java.util.List;

import com.revature.p1backend.model.Reimbursement;

public interface ReimbursementService {

	public List<Reimbursement> findAll();

	public Reimbursement findById(int id);

	public List<Reimbursement> findPending();

	public List<Reimbursement> findApproved();

	public Reimbursement updateReimbursementStatus(int id,int status);
	
	public List<Reimbursement> findByAuthor(int id);

	public Reimbursement createReimb(Reimbursement r);
	
}
