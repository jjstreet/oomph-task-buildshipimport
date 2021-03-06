/**
 */
package com.jjstreet.oomph.task.buildshipimport;

import org.eclipse.oomph.setup.SetupPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.jjstreet.oomph.task.buildshipimport.BuildshipImportFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore schemaLocation='https://raw.githubusercontent.com/jjstreet/oomph-task-buildshipimport/master/com.jjstreet.oomph.task.buildshipimport/model/BuildshipImport.ecore'"
 * @generated
 */
public interface BuildshipImportPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "buildshipimport";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "https://github.com/jjstreet/oomph-task-buildshipimport/1.0";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "buildshipimport";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  BuildshipImportPackage eINSTANCE = com.jjstreet.oomph.task.buildshipimport.impl.BuildshipImportPackageImpl.init();

  /**
   * The meta object id for the '{@link com.jjstreet.oomph.task.buildshipimport.impl.BuildshipImportTaskImpl <em>Task</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.jjstreet.oomph.task.buildshipimport.impl.BuildshipImportTaskImpl
   * @see com.jjstreet.oomph.task.buildshipimport.impl.BuildshipImportPackageImpl#getBuildshipImportTask()
   * @generated
   */
  int BUILDSHIP_IMPORT_TASK = 0;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILDSHIP_IMPORT_TASK__ANNOTATIONS = SetupPackage.SETUP_TASK__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILDSHIP_IMPORT_TASK__ID = SetupPackage.SETUP_TASK__ID;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILDSHIP_IMPORT_TASK__DESCRIPTION = SetupPackage.SETUP_TASK__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Scope Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILDSHIP_IMPORT_TASK__SCOPE_TYPE = SetupPackage.SETUP_TASK__SCOPE_TYPE;

  /**
   * The feature id for the '<em><b>Excluded Triggers</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILDSHIP_IMPORT_TASK__EXCLUDED_TRIGGERS = SetupPackage.SETUP_TASK__EXCLUDED_TRIGGERS;

  /**
   * The feature id for the '<em><b>Disabled</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILDSHIP_IMPORT_TASK__DISABLED = SetupPackage.SETUP_TASK__DISABLED;

  /**
   * The feature id for the '<em><b>Predecessors</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILDSHIP_IMPORT_TASK__PREDECESSORS = SetupPackage.SETUP_TASK__PREDECESSORS;

  /**
   * The feature id for the '<em><b>Successors</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILDSHIP_IMPORT_TASK__SUCCESSORS = SetupPackage.SETUP_TASK__SUCCESSORS;

  /**
   * The feature id for the '<em><b>Restrictions</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILDSHIP_IMPORT_TASK__RESTRICTIONS = SetupPackage.SETUP_TASK__RESTRICTIONS;

  /**
   * The feature id for the '<em><b>Filter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILDSHIP_IMPORT_TASK__FILTER = SetupPackage.SETUP_TASK__FILTER;

  /**
   * The feature id for the '<em><b>Project Root Directory</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILDSHIP_IMPORT_TASK__PROJECT_ROOT_DIRECTORY = SetupPackage.SETUP_TASK_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Task</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILDSHIP_IMPORT_TASK_FEATURE_COUNT = SetupPackage.SETUP_TASK_FEATURE_COUNT + 1;

  /**
   * Returns the meta object for class '{@link com.jjstreet.oomph.task.buildshipimport.BuildshipImportTask <em>Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Task</em>'.
   * @see com.jjstreet.oomph.task.buildshipimport.BuildshipImportTask
   * @generated
   */
  EClass getBuildshipImportTask();

  /**
   * Returns the meta object for the attribute '{@link com.jjstreet.oomph.task.buildshipimport.BuildshipImportTask#getProjectRootDirectory <em>Project Root Directory</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Project Root Directory</em>'.
   * @see com.jjstreet.oomph.task.buildshipimport.BuildshipImportTask#getProjectRootDirectory()
   * @see #getBuildshipImportTask()
   * @generated
   */
  EAttribute getBuildshipImportTask_ProjectRootDirectory();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  BuildshipImportFactory getBuildshipImportFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.jjstreet.oomph.task.buildshipimport.impl.BuildshipImportTaskImpl <em>Task</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.jjstreet.oomph.task.buildshipimport.impl.BuildshipImportTaskImpl
     * @see com.jjstreet.oomph.task.buildshipimport.impl.BuildshipImportPackageImpl#getBuildshipImportTask()
     * @generated
     */
    EClass BUILDSHIP_IMPORT_TASK = eINSTANCE.getBuildshipImportTask();

    /**
     * The meta object literal for the '<em><b>Project Root Directory</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUILDSHIP_IMPORT_TASK__PROJECT_ROOT_DIRECTORY = eINSTANCE.getBuildshipImportTask_ProjectRootDirectory();

  }

} // BuildshipImportPackage
