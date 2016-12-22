/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2016 SAP SE
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * Hybris ("Confidential Information"). You shall not disclose such
 * Confidential Information and shall use it only in accordance with the
 * terms of the license agreement you entered into with SAP Hybris.
 */
package com.cybage.dao;

import java.util.List;

import com.cybage.model.CybageEmployeeModel;


/**
 *
 */
public interface CybageDao
{
	boolean createEmp(final CybageEmployeeModel cybageEmployeeModel);

	List<CybageEmployeeModel> showEmployee();

	boolean deleteEmployee(int empid);

	boolean updateEmployee(CybageEmployeeModel cybageEmployeeModel);

	CybageEmployeeModel getEmployee(int empid);

	void validate(CybageEmployeeModel empModel);

}
