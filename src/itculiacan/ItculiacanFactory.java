/**
 */
package itculiacan;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see itculiacan.ItculiacanPackage
 * @generated
 */
public interface ItculiacanFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ItculiacanFactory eINSTANCE = itculiacan.impl.ItculiacanFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Alumno</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Alumno</em>'.
	 * @generated
	 */
	Alumno createAlumno();

	/**
	 * Returns a new object of class '<em>Generacion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generacion</em>'.
	 * @generated
	 */
	Generacion createGeneracion();

	/**
	 * Returns a new object of class '<em>Grupo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Grupo</em>'.
	 * @generated
	 */
	Grupo createGrupo();

	/**
	 * Returns a new object of class '<em>Aula</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aula</em>'.
	 * @generated
	 */
	Aula createAula();

	/**
	 * Returns a new object of class '<em>Materia</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Materia</em>'.
	 * @generated
	 */
	Materia createMateria();

	/**
	 * Returns a new object of class '<em>Profesor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Profesor</em>'.
	 * @generated
	 */
	Profesor createProfesor();

	/**
	 * Returns a new object of class '<em>Plan Estudio</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plan Estudio</em>'.
	 * @generated
	 */
	PlanEstudio createPlanEstudio();

	/**
	 * Returns a new object of class '<em>Universidad</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Universidad</em>'.
	 * @generated
	 */
	Universidad createUniversidad();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ItculiacanPackage getItculiacanPackage();

} //ItculiacanFactory
