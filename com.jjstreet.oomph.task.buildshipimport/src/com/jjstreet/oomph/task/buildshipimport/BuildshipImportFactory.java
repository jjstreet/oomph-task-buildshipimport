/**
 */
package com.jjstreet.oomph.task.buildshipimport;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.jjstreet.oomph.task.buildshipimport.BuildshipImportPackage
 * @generated
 */
public interface BuildshipImportFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  BuildshipImportFactory eINSTANCE = com.jjstreet.oomph.task.buildshipimport.impl.BuildshipImportFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Task</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Task</em>'.
   * @generated
   */
  BuildshipImportTask createBuildshipImportTask();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  BuildshipImportPackage getBuildshipImportPackage();

} // BuildshipImportFactory
