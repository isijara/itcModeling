/**
 */
package itculiacan;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alumno</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link itculiacan.Alumno#getNombre <em>Nombre</em>}</li>
 *   <li>{@link itculiacan.Alumno#getNumeroControl <em>Numero Control</em>}</li>
 *   <li>{@link itculiacan.Alumno#getGeneracion <em>Generacion</em>}</li>
 *   <li>{@link itculiacan.Alumno#getCursa <em>Cursa</em>}</li>
 *   <li>{@link itculiacan.Alumno#getGrupos <em>Grupos</em>}</li>
 * </ul>
 * </p>
 *
 * @see itculiacan.ItculiacanPackage#getAlumno()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Alumno extends CDOObject {
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
	 * @see itculiacan.ItculiacanPackage#getAlumno_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link itculiacan.Alumno#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Numero Control</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numero Control</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numero Control</em>' attribute.
	 * @see #setNumeroControl(int)
	 * @see itculiacan.ItculiacanPackage#getAlumno_NumeroControl()
	 * @model
	 * @generated
	 */
	int getNumeroControl();

	/**
	 * Sets the value of the '{@link itculiacan.Alumno#getNumeroControl <em>Numero Control</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero Control</em>' attribute.
	 * @see #getNumeroControl()
	 * @generated
	 */
	void setNumeroControl(int value);

	/**
	 * Returns the value of the '<em><b>Generacion</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link itculiacan.Generacion#getAlumnos <em>Alumnos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generacion</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generacion</em>' reference.
	 * @see #setGeneracion(Generacion)
	 * @see itculiacan.ItculiacanPackage#getAlumno_Generacion()
	 * @see itculiacan.Generacion#getAlumnos
	 * @model opposite="alumnos" required="true"
	 * @generated
	 */
	Generacion getGeneracion();

	/**
	 * Sets the value of the '{@link itculiacan.Alumno#getGeneracion <em>Generacion</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generacion</em>' reference.
	 * @see #getGeneracion()
	 * @generated
	 */
	void setGeneracion(Generacion value);

	/**
	 * Returns the value of the '<em><b>Cursa</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link itculiacan.PlanEstudio#getAlumnos <em>Alumnos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cursa</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cursa</em>' reference.
	 * @see #setCursa(PlanEstudio)
	 * @see itculiacan.ItculiacanPackage#getAlumno_Cursa()
	 * @see itculiacan.PlanEstudio#getAlumnos
	 * @model opposite="alumnos" required="true"
	 * @generated
	 */
	PlanEstudio getCursa();

	/**
	 * Sets the value of the '{@link itculiacan.Alumno#getCursa <em>Cursa</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cursa</em>' reference.
	 * @see #getCursa()
	 * @generated
	 */
	void setCursa(PlanEstudio value);

	/**
	 * Returns the value of the '<em><b>Grupos</b></em>' reference list.
	 * The list contents are of type {@link itculiacan.Grupo}.
	 * It is bidirectional and its opposite is '{@link itculiacan.Grupo#getAlumnos <em>Alumnos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grupos</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grupos</em>' reference list.
	 * @see itculiacan.ItculiacanPackage#getAlumno_Grupos()
	 * @see itculiacan.Grupo#getAlumnos
	 * @model opposite="alumnos" required="true"
	 * @generated
	 */
	EList<Grupo> getGrupos();

} // Alumno
