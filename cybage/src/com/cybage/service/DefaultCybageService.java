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
package com.cybage.service;

import java.util.List;

import com.cybage.model.CybageEmployeeModel;


public interface DefaultCybageService
{

	List<CybageEmployeeModel> showEmployee();

	boolean createEmp(final CybageEmployeeModel cybageEmployeeModel);

	boolean deleteEmployee(int eid);

	CybageEmployeeModel getEmployee(int eid);

	boolean updateEmployee(CybageEmployeeModel cybageEmployeeModel);

	void validate(CybageEmployeeModel empModel);
}