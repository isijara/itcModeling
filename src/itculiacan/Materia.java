/**
 */
package itculiacan;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Materia</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link itculiacan.Materia#getClave <em>Clave</em>}</li>
 *   <li>{@link itculiacan.Materia#getNombre <em>Nombre</em>}</li>
 *   <li>{@link itculiacan.Materia#getGrupos <em>Grupos</em>}</li>
 *   <li>{@link itculiacan.Materia#getPlanesEstudio <em>Planes Estudio</em>}</li>
 * </ul>
 * </p>
 *
 * @see itculiacan.ItculiacanPackage#getMateria()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Materia extends CDOObject {
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
	 * @see itculiacan.ItculiacanPackage#getMateria_Clave()
	 * @model
	 * @generated
	 */
	int getClave();

	/**
	 * Sets the value of the '{@link itculiacan.Materia#getClave <em>Clave</em>}' attribute.
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
	 * @see itculiacan.ItculiacanPackage#getMateria_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link itculiacan.Materia#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Grupos</b></em>' reference list.
	 * The list contents are of type {@link itculiacan.Grupo}.
	 * It is bidirectional and its opposite is '{@link itculiacan.Grupo#getMateria <em>Materia</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grupos</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grupos</em>' reference list.
	 * @see itculiacan.ItculiacanPackage#getMateria_Grupos()
	 * @see itculiacan.Grupo#getMateria
	 * @model opposite="materia" required="true"
	 * @generated
	 */
	EList<Grupo> getGrupos();

	/**
	 * Returns the value of the '<em><b>Planes Estudio</b></em>' reference list.
	 * The list contents are of type {@link itculiacan.PlanEstudio}.
	 * It is bidirectional and its opposite is '{@link itculiacan.PlanEstudio#getMaterias <em>Materias</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Planes Estudio</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Planes Estudio</em>' reference list.
	 * @see itculiacan.ItculiacanPackage#getMateria_PlanesEstudio()
	 * @see itculiacan.PlanEstudio#getMaterias
	 * @model opposite="materias" required="true"
	 * @generated
	 */
	EList<PlanEstudio> getPlanesEstudio();

} // Materia
