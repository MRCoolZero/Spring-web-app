package com.rickSanchez.Springwebapp.services;

import com.rickSanchez.Springwebapp.entities.MobileOperator;
import com.rickSanchez.Springwebapp.repositories.MobileOperatorRepository;

import java.util.List;

public class OperatorServices {
    private MobileOperatorRepository mobileOperatorRepository;

    public void setMobileOperatorRepository(MobileOperatorRepository mobileOperatorRepository){
        this.mobileOperatorRepository = mobileOperatorRepository;
    }

    public List<MobileOperator> getAllOperators(){
        return mobileOperatorRepository.findAll();
    }

    public MobileOperatorRepository getMobileOperatorRepository(Integer id) {
        return (MobileOperatorRepository) mobileOperatorRepository.getOne(id);
    }

    public void deleteMobileOperatorById(Integer id){
        mobileOperatorRepository.delete(id);
    }
}
