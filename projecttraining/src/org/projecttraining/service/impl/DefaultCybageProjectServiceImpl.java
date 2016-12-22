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
package org.projecttraining.service.impl;

import java.util.List;

import org.projecttraining.dao.CybageProjectDao;
import org.projecttraining.model.CybageProjectModel;
import org.projecttraining.service.CybageProjectService;
import org.springframework.beans.factory.annotation.Required;


/**
 *
 */
public class DefaultCybageProjectServiceImpl implements CybageProjectService
{

	CybageProjectDao projectDao;

	@Required
	public void setProjectDao(final CybageProjectDao projectDao)
	{
		this.projectDao = projectDao;
	}

	@Override
	public boolean save(final CybageProjectModel projectModel)
	{
		return projectDao.save(projectModel);
	}

	@Override
	public List<CybageProjectModel> showProject()
	{

		return projectDao.showProject();
	}

	@Override
	public void updateProject(final CybageProjectModel newProject)
	{
		projectDao.updateProject(newProject);

	}

}
