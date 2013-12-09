/**
 */
package itculiacan;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Universidad</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link itculiacan.Universidad#getRefProfesor <em>Ref Profesor</em>}</li>
 *   <li>{@link itculiacan.Universidad#getRefAulas <em>Ref Aulas</em>}</li>
 *   <li>{@link itculiacan.Universidad#getRefPlanEstudio <em>Ref Plan Estudio</em>}</li>
 *   <li>{@link itculiacan.Universidad#getRefAlumno <em>Ref Alumno</em>}</li>
 *   <li>{@link itculiacan.Universidad#getRefGeneracion <em>Ref Generacion</em>}</li>
 *   <li>{@link itculiacan.Universidad#getRefMateria <em>Ref Materia</em>}</li>
 *   <li>{@link itculiacan.Universidad#getRefGrupo <em>Ref Grupo</em>}</li>
 * </ul>
 * </p>
 *
 * @see itculiacan.ItculiacanPackage#getUniversidad()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Universidad extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Ref Profesor</b></em>' containment reference list.
	 * The list contents are of type {@link itculiacan.Profesor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref Profesor</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Profesor</em>' containment reference list.
	 * @see itculiacan.ItculiacanPackage#getUniversidad_RefProfesor()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Profesor> getRefProfesor();

	/**
	 * Returns the value of the '<em><b>Ref Aulas</b></em>' containment reference list.
	 * The list contents are of type {@link itculiacan.Aula}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref Aulas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Aulas</em>' containment reference list.
	 * @see itculiacan.ItculiacanPackage#getUniversidad_RefAulas()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Aula> getRefAulas();

	/**
	 * Returns the value of the '<em><b>Ref Plan Estudio</b></em>' containment reference list.
	 * The list contents are of type {@link itculiacan.PlanEstudio}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref Plan Estudio</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Plan Estudio</em>' containment reference list.
	 * @see itculiacan.ItculiacanPackage#getUniversidad_RefPlanEstudio()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<PlanEstudio> getRefPlanEstudio();

	/**
	 * Returns the value of the '<em><b>Ref Alumno</b></em>' containment reference list.
	 * The list contents are of type {@link itculiacan.Alumno}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref Alumno</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Alumno</em>' containment reference list.
	 * @see itculiacan.ItculiacanPackage#getUniversidad_RefAlumno()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Alumno> getRefAlumno();

	/**
	 * Returns the value of the '<em><b>Ref Generacion</b></em>' containment reference list.
	 * The list contents are of type {@link itculiacan.Generacion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref Generacion</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Generacion</em>' containment reference list.
	 * @see itculiacan.ItculiacanPackage#getUniversidad_RefGeneracion()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Generacion> getRefGeneracion();

	/**
	 * Returns the value of the '<em><b>Ref Materia</b></em>' containment reference list.
	 * The list contents are of type {@link itculiacan.Materia}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref Materia</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Materia</em>' containment reference list.
	 * @see itculiacan.ItculiacanPackage#getUniversidad_RefMateria()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Materia> getRefMateria();

	/**
	 * Returns the value of the '<em><b>Ref Grupo</b></em>' containment reference list.
	 * The list contents are of type {@link itculiacan.Grupo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref Grupo</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Grupo</em>' containment reference list.
	 * @see itculiacan.ItculiacanPackage#getUniversidad_RefGrupo()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Grupo> getRefGrupo();

} // Universidad
