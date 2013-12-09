/**
 */
package itculiacan;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plan Estudio</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link itculiacan.PlanEstudio#getClave <em>Clave</em>}</li>
 *   <li>{@link itculiacan.PlanEstudio#getNombre <em>Nombre</em>}</li>
 *   <li>{@link itculiacan.PlanEstudio#getAlumnos <em>Alumnos</em>}</li>
 *   <li>{@link itculiacan.PlanEstudio#getMaterias <em>Materias</em>}</li>
 * </ul>
 * </p>
 *
 * @see itculiacan.ItculiacanPackage#getPlanEstudio()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface PlanEstudio extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Clave</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clave</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clave</em>' attribute.
	 * @see #setClave(int)
	 * @see itculiacan.ItculiacanPackage#getPlanEstudio_Clave()
	 * @model
	 * @generated
	 */
	int getClave();

	/**
	 * Sets the value of the '{@link itculiacan.PlanEstudio#getClave <em>Clave</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clave</em>' attribute.
	 * @see #getClave()
	 * @generated
	 */
	void setClave(int value);

	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see itculiacan.ItculiacanPackage#getPlanEstudio_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link itculiacan.PlanEstudio#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Alumnos</b></em>' reference list.
	 * The list contents are of type {@link itculiacan.Alumno}.
	 * It is bidirectional and its opposite is '{@link itculiacan.Alumno#getCursa <em>Cursa</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alumnos</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alumnos</em>' reference list.
	 * @see itculiacan.ItculiacanPackage#getPlanEstudio_Alumnos()
	 * @see itculiacan.Alumno#getCursa
	 * @model opposite="cursa" required="true"
	 * @generated
	 */
	EList<Alumno> getAlumnos();

	/**
	 * Returns the value of the '<em><b>Materias</b></em>' reference list.
	 * The list contents are of type {@link itculiacan.Materia}.
	 * It is bidirectional and its opposite is '{@link itculiacan.Materia#getPlanesEstudio <em>Planes Estudio</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Materias</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Materias</em>' reference list.
	 * @see itculiacan.ItculiacanPackage#getPlanEstudio_Materias()
	 * @see itculiacan.Materia#getPlanesEstudio
	 * @model opposite="planesEstudio" required="true"
	 * @generated
	 */
	EList<Materia> getMaterias();

} // PlanEstudio
