package com.revature.p1backend.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import com.revature.p1backend.model.Reimbursement;
import com.revature.p1backend.repo.ReimbursementRepository;

@Service
public class ReimbursementServiceImpl implements ReimbursementService {

	@Autowired
	ReimbursementRepository reimbursementRepository;

	@Override
	public List<Reimbursement> findAll() {
		// TODO Auto-generated method stub
		return reimbursementRepository.findAll();
	}

	@Override
	public Reimbursement findById(int id) {
		// TODO Auto-generated method stub
		return reimbursementRepository.findById(id).get();
	}

	@Override
	public List<Reimbursement> findPending() {
		// TODO Auto-generated method stub
		return reimbursementRepository.findByStatus(1);
	}
	
	public List<Reimbursement> findDenied() {
		
		
		return reimbursementRepository.findByStatus(2);
	}

	@Override
	public List<Reimbursement> findApproved() {
		// TODO Auto-generated method stub
		return reimbursementRepository.findByStatus(3);
	}

	@PostMapping
	public Reimbursement updateReimbursementStatus(int id, int status) {
		Reimbursement reimburse = null;
		reimburse = findById(id);
		if (reimburse != null) {
			reimburse.setStatus(status);
			reimbursementRepository.save(reimburse);
		}
		return reimburse;
	}

	@Override
	public List<Reimbursement> findByAuthor(int id) {
		// TODO Auto-generated method stub
		return reimbursementRepository.findByAuthor(id);
	}

	@Override
	public Reimbursement createReimb(Reimbursement r) {
		// TODO Auto-generated method stub
		
		if (r != null) {
			
			r.setSubmitted(new Date());
			r.setResolved(new Date());
			
			// Resolver can't be null or view reimbursements don't show up
			r.setResolver(2);
			r.setStatus(1);
			r.setType(1);
			
			reimbursementRepository.save(r);
			
		}
		
		return r;
	}
}
