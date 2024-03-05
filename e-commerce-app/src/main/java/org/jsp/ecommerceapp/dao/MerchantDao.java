package org.jsp.ecommerceapp.dao;

import java.util.Optional;

import org.jsp.ecommerceapp.model.Merchant;
import org.jsp.ecommerceapp.repository.MerchantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MerchantDao {
	@Autowired
	private MerchantRepository merchantRepository;

	public Merchant saveMerchant(Merchant merchant) {
		return merchantRepository.save(merchant);
	}

	public Optional<Merchant> findById(int id) {
		return merchantRepository.findById(id);
	}
	
	public Merchant updateMerchant(Merchant merchant) {
		return merchantRepository.save(merchant);
	}
	
	public Optional<Merchant> verifyMerchant(String email,String password) {
		return merchantRepository.verifyMerchant(email, password);
	}
	
	public Optional<Merchant> verifyMerchant(long phone,String password) {
		return merchantRepository.verifyMerchant(phone, password);
	}
	
	public Optional<Merchant> verifyMerchant(int id,String password) {
		return merchantRepository.verifyMerchant(id, password);
	}
}

