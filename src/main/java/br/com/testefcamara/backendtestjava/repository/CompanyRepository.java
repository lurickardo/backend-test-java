package br.com.testefcamara.backendtestjava.repository;

import br.com.testefcamara.backendtestjava.models.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CompanyRepository extends JpaRepository<Company, Long> {

    @Query("SELECT a FROM Company a WHERE a.nmCompany LIKE %:nmCompany%")
    List<Company> findByNmCompanyLike(String nmCompany);

    Company findByNmCompany(String nmCompany);
}
