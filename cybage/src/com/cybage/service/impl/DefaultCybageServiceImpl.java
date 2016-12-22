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

package com.cybage.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import com.cybage.dao.CybageDao;
import com.cybage.model.CybageEmployeeModel;
import com.cybage.service.DefaultCybageService;


public class DefaultCybageServiceImpl implements DefaultCybageService
{

	private CybageDao cybageDao;

	@Required
	public void setCybageDao(final CybageDao cybageDao)
	{
		this.cybageDao = cybageDao;
	}

	@Override
	public boolean createEmp(final CybageEmployeeModel cybageEmployeeModel)
	{
		cybageDao.createEmp(cybageEmployeeModel);
		return false;
	}

	@Override
	public List<CybageEmployeeModel> showEmployee()
	{
		return cybageDao.showEmployee();
	}

	@Override
	public boolean deleteEmployee(final int empid)
	{
		System.out.println("DefaultCybageServiceImpl" + empid);
		cybageDao.deleteEmployee(empid);
		return false;
	}

	@Override
	public CybageEmployeeModel getEmployee(final int eid)
	{
		return cybageDao.getEmployee(eid);
	}

	@Override
	public boolean updateEmployee(final CybageEmployeeModel cybageEmployeeModel)
	{
		cybageDao.updateEmployee(cybageEmployeeModel);
		return false;
	}

	@Override
	public void validate(final CybageEmployeeModel empModel)
	{
		cybageDao.validate(empModel);
	}

}
