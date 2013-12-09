/**
 */
package itculiacan;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aula</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link itculiacan.Aula#getClave <em>Clave</em>}</li>
 *   <li>{@link itculiacan.Aula#getCapacidad <em>Capacidad</em>}</li>
 *   <li>{@link itculiacan.Aula#getGrupos <em>Grupos</em>}</li>
 * </ul>
 * </p>
 *
 * @see itculiacan.ItculiacanPackage#getAula()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Aula extends CDOObject {
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
	 * @see itculiacan.ItculiacanPackage#getAula_Clave()
	 * @model
	 * @generated
	 */
	int getClave();

	/**
	 * Sets the value of the '{@link itculiacan.Aula#getClave <em>Clave</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clave</em>' attribute.
	 * @see #getClave()
	 * @generated
	 */
	void setClave(int value);

	/**
	 * Returns the value of the '<em><b>Capacidad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacidad</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacidad</em>' attribute.
	 * @see #setCapacidad(int)
	 * @see itculiacan.ItculiacanPackage#getAula_Capacidad()
	 * @model
	 * @generated
	 */
	int getCapacidad();

	/**
	 * Sets the value of the '{@link itculiacan.Aula#getCapacidad <em>Capacidad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacidad</em>' attribute.
	 * @see #getCapacidad()
	 * @generated
	 */
	void setCapacidad(int value);

	/**
	 * Returns the value of the '<em><b>Grupos</b></em>' reference list.
	 * The list contents are of type {@link itculiacan.Grupo}.
	 * It is bidirectional and its opposite is '{@link itculiacan.Grupo#getAula <em>Aula</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grupos</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grupos</em>' reference list.
	 * @see itculiacan.ItculiacanPackage#getAula_Grupos()
	 * @see itculiacan.Grupo#getAula
	 * @model opposite="aula" required="true"
	 * @generated
	 */
	EList<Grupo> getGrupos();

} // Aula
