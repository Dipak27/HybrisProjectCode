/*
*[y]hybris Platform**Copyright(c)2000-2016 SAP SE*All rights reserved.**This software is the confidential and proprietary information of SAP*Hybris("Confidential Information").You shall not disclose such*Confidential Information and shall use it only in accordance with the*terms of the license agreement you entered into with SAP Hybris.
*/
package com.cybage.facade;

import de.hybris.platform.catalog.data.CybageEmployeeDto;

import java.util.List;


/**
 *
 */
public interface CybageEmployeeFacade
{
	boolean createEmp(CybageEmployeeDto empDto);

	List<CybageEmployeeDto> showEmployee();

	boolean updateEmployee(CybageEmployeeDto cybageEmployeeDto);

	CybageEmployeeDto getEmployee(int eid);

	boolean deleteEmployee(int eid);

	CybageEmployeeDto editEmployeeProcess(final int eid);

	void validate(CybageEmployeeDto empdto);
}
