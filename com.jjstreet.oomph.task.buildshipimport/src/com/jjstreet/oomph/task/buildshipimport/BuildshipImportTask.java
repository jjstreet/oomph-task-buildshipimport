/*
 * Copyright (c) 2014 Eike Stepper (Berlin, Germany) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Eike Stepper - initial API and implementation
 */
package com.jjstreet.oomph.task.buildshipimport;

import org.eclipse.oomph.setup.SetupTask;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Buildship Import Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.jjstreet.oomph.task.buildshipimport.BuildshipImportTask#getProjectRootDirectory <em>Project Root Directory</em>}</li>
 * </ul>
 *
 * @see com.jjstreet.oomph.task.buildshipimport.BuildshipImportPackage#getBuildshipImportTask()
 * @model annotation="http://www.eclipse.org/oomph/setup/Enablement variableName='p2.buildship.import' repository='https://raw.githubusercontent.com/jjstreet/oomph-task-buildshipimport-update-site/master' installableUnits='com.jjstreet.oomph.task.buildshipimport.feature.group'"
 *        annotation="http://www.eclipse.org/oomph/setup/ValidTriggers triggers='STARTUP MANUAL'"
 * @generated
 */
public interface BuildshipImportTask extends SetupTask
{

  /**
   * Returns the value of the '<em><b>Project Root Directory</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Project Root Directory</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Project Root Directory</em>' attribute.
   * @see #setProjectRootDirectory(String)
   * @see com.jjstreet.oomph.task.buildshipimport.BuildshipImportPackage#getBuildshipImportTask_ProjectRootDirectory()
   * @model required="true"
   * @generated
   */
  String getProjectRootDirectory();

  /**
   * Sets the value of the '{@link com.jjstreet.oomph.task.buildshipimport.BuildshipImportTask#getProjectRootDirectory <em>Project Root Directory</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Project Root Directory</em>' attribute.
   * @see #getProjectRootDirectory()
   * @generated
   */
  void setProjectRootDirectory(String value);

} // BuildshipImportTask
