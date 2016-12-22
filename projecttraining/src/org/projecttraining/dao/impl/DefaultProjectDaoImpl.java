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
package org.projecttraining.dao.impl;

import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;

import java.util.List;

import org.projecttraining.dao.CybageProjectDao;
import org.projecttraining.model.CybageProjectModel;
import org.springframework.beans.factory.annotation.Required;


/**
 *
 */
public class DefaultProjectDaoImpl implements CybageProjectDao
{

	FlexibleSearchService flexibleSearchService;
	ModelService modelService;

	@Required
	public void setFlexibleSearchService(final FlexibleSearchService flexibleSearchService)
	{
		this.flexibleSearchService = flexibleSearchService;
	}

	@Required
	public void setModelService(final ModelService modelService)
	{
		this.modelService = modelService;
	}

	@Override
	public boolean save(final CybageProjectModel projectModel)
	{
		modelService.save(projectModel);
		return false;
	}

	@SuppressWarnings("finally")
	@Override
	public List<CybageProjectModel> showProject()
	{
		List<CybageProjectModel> resultList = null;
		try
		{
			final String queryString = //
					"SELECT {p:" + CybageProjectModel.PK + "} "//
							+ "FROM {" + CybageProjectModel._TYPECODE + " AS p} ";

			final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);


			resultList = flexibleSearchService.<CybageProjectModel> search(query).getResult();
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
	public CybageProjectModel getProject(final int id)
	{
		final Integer intObj = new Integer(id);
		System.out.println("***** Interger ID : " + intObj.intValue());
		final String queryString = "SELECT {p:" + CybageProjectModel.PK + "}" + "FROM {" + CybageProjectModel._TYPECODE + " AS p}"
				+ "WHERE " + "{p:" + CybageProjectModel.PROJECTID + "}=?code";
		final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);
		query.addQueryParameter("code", intObj);
		return flexibleSearchService.<CybageProjectModel> searchUnique(query);

	}

	@Override
	public void updateProject(final CybageProjectModel newProject)
	{
		final CybageProjectModel model = getProject(newProject.getProjectId());
		model.setClientName(newProject.getClientName());
		model.setProjectDomain(newProject.getProjectDomain());
		model.setProjectDuration(newProject.getProjectDuration());
		model.setProjectName(newProject.getProjectName());
		modelService.save(model);
	}

	@Override
	public void deleteProject(final CybageProjectModel project)
	{
		modelService.remove(getProject(project.getProjectId()));
	}


}
