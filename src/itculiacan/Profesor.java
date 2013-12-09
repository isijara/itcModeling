/**
 */
package itculiacan;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Profesor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link itculiacan.Profesor#getClave <em>Clave</em>}</li>
 *   <li>{@link itculiacan.Profesor#getNombre <em>Nombre</em>}</li>
 *   <li>{@link itculiacan.Profesor#getNumeroMaterias <em>Numero Materias</em>}</li>
 *   <li>{@link itculiacan.Profesor#getGrupos <em>Grupos</em>}</li>
 *   <li>{@link itculiacan.Profesor#getNombramiento <em>Nombramiento</em>}</li>
 * </ul>
 * </p>
 *
 * @see itculiacan.ItculiacanPackage#getProfesor()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Profesor extends CDOObject {
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
	 * @see itculiacan.ItculiacanPackage#getProfesor_Clave()
	 * @model
	 * @generated
	 */
	int getClave();

	/**
	 * Sets the value of the '{@link itculiacan.Profesor#getClave <em>Clave</em>}' attribute.
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
	 * @see itculiacan.ItculiacanPackage#getProfesor_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link itculiacan.Profesor#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Numero Materias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numero Materias</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numero Materias</em>' attribute.
	 * @see #setNumeroMaterias(int)
	 * @see itculiacan.ItculiacanPackage#getProfesor_NumeroMaterias()
	 * @model derived="true"
	 * @generated
	 */
	int getNumeroMaterias();

	/**
	 * Sets the value of the '{@link itculiacan.Profesor#getNumeroMaterias <em>Numero Materias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero Materias</em>' attribute.
	 * @see #getNumeroMaterias()
	 * @generated
	 */
	void setNumeroMaterias(int value);

	/**
	 * Returns the value of the '<em><b>Grupos</b></em>' reference list.
	 * The list contents are of type {@link itculiacan.Grupo}.
	 * It is bidirectional and its opposite is '{@link itculiacan.Grupo#getProfesor <em>Profesor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grupos</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grupos</em>' reference list.
	 * @see itculiacan.ItculiacanPackage#getProfesor_Grupos()
	 * @see itculiacan.Grupo#getProfesor
	 * @model opposite="profesor" required="true"
	 * @generated
	 */
	EList<Grupo> getGrupos();

	/**
	 * Returns the value of the '<em><b>Nombramiento</b></em>' attribute.
	 * The literals are from the enumeration {@link itculiacan.Nombramiento}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombramiento</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombramiento</em>' attribute.
	 * @see itculiacan.Nombramiento
	 * @see #setNombramiento(Nombramiento)
	 * @see itculiacan.ItculiacanPackage#getProfesor_Nombramiento()
	 * @model
	 * @generated
	 */
	Nombramiento getNombramiento();

	/**
	 * Sets the value of the '{@link itculiacan.Profesor#getNombramiento <em>Nombramiento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombramiento</em>' attribute.
	 * @see itculiacan.Nombramiento
	 * @see #getNombramiento()
	 * @generated
	 */
	void setNombramiento(Nombramiento value);

} // Profesor
