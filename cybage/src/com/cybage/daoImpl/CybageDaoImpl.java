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
package com.cybage.daoImpl;

import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import com.cybage.dao.CybageDao;
import com.cybage.model.CybageEmployeeModel;


/**
 *
 */
public class CybageDaoImpl implements CybageDao
{

	private ModelService modelService;
	private FlexibleSearchService flexibleSearchService;

	@Required
	public void setModelService(final ModelService modelService)
	{
		this.modelService = modelService;
	}

	@Required
	public void setFlexibleSearchService(final FlexibleSearchService flexibleSearchService)
	{
		this.flexibleSearchService = flexibleSearchService;
	}

	@Override
	public boolean createEmp(final CybageEmployeeModel cybageEmployeeModel)
	{
		modelService.save(cybageEmployeeModel);
		return true;
	}

	@SuppressWarnings("finally")
	@Override
	public CybageEmployeeModel getEmployee(final int eid)
	{
		CybageEmployeeModel cybageEmployeeModel = null;
		try
		{
			final String queryString = //
					"SELECT {p:" + CybageEmployeeModel.PK + "} "//
							+ "FROM {" + CybageEmployeeModel._TYPECODE + " AS p} "//
							+ "WHERE " + "{p:" + CybageEmployeeModel.CYBEMPID + "}=?code ";

			final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);
			query.addQueryParameter("code", new Integer(eid));

			cybageEmployeeModel = flexibleSearchService.searchUnique(query);
		}
		catch (final Exception e)
		{

			e.printStackTrace();
		}
		finally
		{
			return cybageEmployeeModel;
		}

	}

	@SuppressWarnings("finally")
	@Override
	public List<CybageEmployeeModel> showEmployee()
	{
		List<CybageEmployeeModel> resultList = null;
		try
		{
			final String queryString = //
					"SELECT {p:" + CybageEmployeeModel.PK + "} "//
							+ "FROM {" + CybageEmployeeModel._TYPECODE + " AS p} ";

			final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);


			resultList = flexibleSearchService.<CybageEmployeeModel> search(query).getResult();
		}
		catch (final Exception e)
		{
			e.printStackTrace();
		}

		finally
		{
			return resultList;
		}

	}

	@Override
	public boolean deleteEmployee(final int eid)
	{
		/*
		 * final String queryString = // "DELETE" // + "FROM {" + CybageEmployeeModel._TYPECODE + " AS p} "// + "WHERE " +
		 * "{p:" + CybageEmployeeModel.CYBEMPID + "}=?code ";
		 *
		 * final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString); query.addQueryParameter("code", new
		 * Integer(empid));
		 *
		 * flexibleSearchService.<CybageEmployeeModel> search(query).getResult();
		 *
		 * return true;
		 */

		final CybageEmployeeModel b = modelService.get(getEmployee(eid).getPk());

		System.out.println(" in if..." + b);
		modelService.remove(b.getPk());



		return true;
	}

	@Override
	public boolean updateEmployee(final CybageEmployeeModel cybageEmployeeModel)
	{
		final CybageEmployeeModel oldmodel = modelService.get(getEmployee(cybageEmployeeModel.getCybempId()).getPk());

		oldmodel.setIsManager(cybageEmployeeModel.getIsManager());
		oldmodel.setFirstName(cybageEmployeeModel.getFirstName());
		oldmodel.setLastName(cybageEmployeeModel.getLastName());
		oldmodel.setCybempId(cybageEmployeeModel.getCybempId());
		oldmodel.setEmpPassword(cybageEmployeeModel.getEmpPassword());
		modelService.save(oldmodel);
		return true;
	}

	@Override
	public void validate(final CybageEmployeeModel empModel)
	{
		final CybageEmployeeModel oldmodel = modelService.get(getEmployee(empModel.getCybempId()).getPk());

		if ((empModel.getCybempId() == oldmodel.getCybempId()) && (empModel.getEmpPassword() == oldmodel.getEmpPassword()))
		{
			System.out.println("Employee Exist");
			return;
		}
		else
		{
			System.out.println("Invalid Credential");
			return;
		}
	}




}
