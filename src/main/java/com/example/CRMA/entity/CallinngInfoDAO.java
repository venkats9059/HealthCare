package com.example.CRMA.entity;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CallinngInfoDAO extends JpaRepository<CallingInfo, Integer> {
	@Query("select e.name,ci.purpose,ci.description from CallingInfo ci join ci.customer c join ci.employee e where c.name=?1")
	public List<Object[]> getEmpByCustName(String custname);

	@Query("select ci.customer.name,ci.customer.phone,ci.purpose from CallingInfo ci where ci.employee.name=?1")
	public List<Object[]> getCustByEmpName(String ename);

	@Query("select cu.name,cu.phone from Company c  join c.customer cu where c.name=?1")
	public List<Object[]> getCustByCompName(String cname);

	@Query("select el.name,el.sal from Company c join c.emplist el where c.name=?1")
	public List<Object[]> getEmpByCompName(String compname);

	@Query("from  Company c join c.emplist el where el.name=?1")
	public List<Object[]> getCallingInfo(String company);

	@Query("select ci.purpose,ci.description from CallingInfo ci where ci.employee.company.name=?1")
	public List<Object[]> getCallingInfoNew(String comname);
}
