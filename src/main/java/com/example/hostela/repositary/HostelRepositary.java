package com.example.hostela.repositary;

import com.example.hostela.jpamodel.HostelDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HostelRepositary extends JpaRepository<HostelDetails,  Integer>{

}
