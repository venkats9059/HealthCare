package com.example.CRMA.entity;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CallingInfoController {
	@Autowired
	private CallinngInfoDAO callinngInfoDAO;

	@RequestMapping("saveCallingInfo")
	public void saveCallingInfo(@RequestBody CallingInfo callingInfo) {

		callingInfo.setCallingDateTime(new Date());
		callinngInfoDAO.save(callingInfo);

	}

	@RequestMapping("getEmpByCustName/{custname}")
	public List<Object[]> getEmpByCustName(@PathVariable("custname") String custname) {

		return callinngInfoDAO.getEmpByCustName(custname);

	}

	@RequestMapping("getCustByEmpName/{ename}")
	public List<Object[]> getCustByEmpName(@PathVariable("ename") String ename) {

		return callinngInfoDAO.getCustByEmpName(ename);
	}

	@RequestMapping("getCustByCompName/{cname}")
	public List<Object[]> getCustByCompName(@PathVariable("cname") String cname) {

		return callinngInfoDAO.getCustByCompName(cname);
	}

	@RequestMapping("getEmpByCompName/{compname}")
	public List<Object[]> getEmpByCompName(@PathVariable("compname") String compname) {

		return callinngInfoDAO.getEmpByCompName(compname);
	}

	@RequestMapping("getCallingInfoNew/{comname}")
	public List<Object[]> getCallingInfoNew(@PathVariable("comname") String comname) {

		return callinngInfoDAO.getCallingInfoNew(comname);

	}
}
