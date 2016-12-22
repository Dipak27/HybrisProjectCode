/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2016 SAP SE
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * Hybris ("Confidential Information"). You shall not disclose such
 * Confidential Information and shall use it only in accordance with the
 * terms of the license agreement you entered into with SAP Hybris.*/

package com.cybage.facadeImpl;

import de.hybris.platform.catalog.data.CybageEmployeeDto;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import com.cybage.converters.EmployeeDtotoModel;
import com.cybage.converters.EmployeeModeltoDto;
import com.cybage.converters.EmployeeMoldelListtoDtoList;
import com.cybage.facade.CybageEmployeeFacade;
import com.cybage.model.CybageEmployeeModel;
import com.cybage.service.DefaultCybageService;


/**
 *
 */
public class CybageEmployeeFacadeImpl implements CybageEmployeeFacade
{
	EmployeeDtotoModel employeeDtotoModel;

	EmployeeModeltoDto employeeModeltoDto;

	DefaultCybageService defaultCybageService;

	List<CybageEmployeeDto> cybageEmployeeDtoList;

	List<CybageEmployeeModel> EmployeeModelList;

	@Required
	public void setEmployeeDtotoModel(final EmployeeDtotoModel employeeDtotoModel)
	{
		this.employeeDtotoModel = employeeDtotoModel;
	}

	@Required
	public void setEmployeeModeltoDto(final EmployeeModeltoDto employeeModeltoDto)
	{
		this.employeeModeltoDto = employeeModeltoDto;
	}

	@Required
	public void setDefaultCybageService(final DefaultCybageService defaultCybageService)
	{
		this.defaultCybageService = defaultCybageService;
	}

	@Override
	public boolean createEmp(final CybageEmployeeDto empDto)
	{
		defaultCybageService.createEmp(employeeDtotoModel.convert(empDto));
		return false;
	}

	@Override
	public List<CybageEmployeeDto> showEmployee()
	{
		final EmployeeMoldelListtoDtoList employeeMoldelListtoDtoList = new EmployeeMoldelListtoDtoList();
		List<CybageEmployeeDto> cybageEmployeeDtoS = null;
		cybageEmployeeDtoS = employeeMoldelListtoDtoList.convert(defaultCybageService.showEmployee());

		return cybageEmployeeDtoS;
	}

	@Override
	public boolean deleteEmployee(final int empid)
	{
		System.out.println("CybageEmployeeFacadeImpl" + empid);
		defaultCybageService.deleteEmployee(empid);
		return false;
	}

	@Override
	public boolean updateEmployee(final CybageEmployeeDto cybageEmployeeDto)
	{
		defaultCybageService.updateEmployee(employeeDtotoModel.convert(cybageEmployeeDto));

		return false;
	}

	@Override
	public CybageEmployeeDto getEmployee(final int eid)
	{
		defaultCybageService.getEmployee(eid);
		return null;
	}

	@Override
	public CybageEmployeeDto editEmployeeProcess(final int eid)
	{
		return employeeModeltoDto.convert(defaultCybageService.getEmployee(eid));
	}

	@Override
	public void validate(final CybageEmployeeDto empdto)
	{
		defaultCybageService.validate(employeeDtotoModel.convert(empdto));
	}

}
