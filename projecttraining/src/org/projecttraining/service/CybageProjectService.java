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
package org.projecttraining.service;

import java.util.List;

import org.projecttraining.model.CybageProjectModel;


/**
 *
 */
public interface CybageProjectService
{
	boolean save(CybageProjectModel projectModel);

	List<CybageProjectModel> showProject();

	public void updateProject(final CybageProjectModel newProject);
}
