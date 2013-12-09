/**
 */
package itculiacan;

import java.util.Date;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generacion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link itculiacan.Generacion#getFechaInicio <em>Fecha Inicio</em>}</li>
 *   <li>{@link itculiacan.Generacion#getFechaFin <em>Fecha Fin</em>}</li>
 *   <li>{@link itculiacan.Generacion#getAlumnos <em>Alumnos</em>}</li>
 * </ul>
 * </p>
 *
 * @see itculiacan.ItculiacanPackage#getGeneracion()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Generacion extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Fecha Inicio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fecha Inicio</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fecha Inicio</em>' attribute.
	 * @see #setFechaInicio(Date)
	 * @see itculiacan.ItculiacanPackage#getGeneracion_FechaInicio()
	 * @model
	 * @generated
	 */
	Date getFechaInicio();

	/**
	 * Sets the value of the '{@link itculiacan.Generacion#getFechaInicio <em>Fecha Inicio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fecha Inicio</em>' attribute.
	 * @see #getFechaInicio()
	 * @generated
	 */
	void setFechaInicio(Date value);

	/**
	 * Returns the value of the '<em><b>Fecha Fin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fecha Fin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fecha Fin</em>' attribute.
	 * @see #setFechaFin(Date)
	 * @see itculiacan.ItculiacanPackage#getGeneracion_FechaFin()
	 * @model
	 * @generated
	 */
	Date getFechaFin();

	/**
	 * Sets the value of the '{@link itculiacan.Generacion#getFechaFin <em>Fecha Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fecha Fin</em>' attribute.
	 * @see #getFechaFin()
	 * @generated
	 */
	void setFechaFin(Date value);

	/**
	 * Returns the value of the '<em><b>Alumnos</b></em>' reference list.
	 * The list contents are of type {@link itculiacan.Alumno}.
	 * It is bidirectional and its opposite is '{@link itculiacan.Alumno#getGeneracion <em>Generacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alumnos</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alumnos</em>' reference list.
	 * @see itculiacan.ItculiacanPackage#getGeneracion_Alumnos()
	 * @see itculiacan.Alumno#getGeneracion
	 * @model opposite="generacion" required="true"
	 * @generated
	 */
	EList<Alumno> getAlumnos();

} // Generacion
