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
package org.projecttraining.setup;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import org.projecttraining.constants.ProjecttrainingConstants;
import org.projecttraining.service.ProjecttrainingService;


@SystemSetup(extension = ProjecttrainingConstants.EXTENSIONNAME)
public class ProjecttrainingSystemSetup
{
	//private final ProjecttrainingService projecttrainingService;

	public ProjecttrainingSystemSetup(final ProjecttrainingService projecttrainingService)
	{
		//this.projecttrainingService = projecttrainingService;
	}

	@SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		//projecttrainingService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return ProjecttrainingSystemSetup.class.getResourceAsStream("/projecttraining/sap-hybris-platform.png");
	}
}
