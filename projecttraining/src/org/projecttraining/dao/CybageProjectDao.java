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
package org.projecttraining.dao;

import java.util.List;

import org.projecttraining.model.CybageProjectModel;


/**
 *
 */
public interface CybageProjectDao
{
	boolean save(CybageProjectModel projectModel);

	List<CybageProjectModel> showProject();

	public CybageProjectModel getProject(final int id);

	public void updateProject(final CybageProjectModel newProject);

	public void deleteProject(final CybageProjectModel project);
}
