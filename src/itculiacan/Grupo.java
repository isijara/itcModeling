/**
 */
package itculiacan;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grupo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link itculiacan.Grupo#getClave <em>Clave</em>}</li>
 *   <li>{@link itculiacan.Grupo#getAula <em>Aula</em>}</li>
 *   <li>{@link itculiacan.Grupo#getMateria <em>Materia</em>}</li>
 *   <li>{@link itculiacan.Grupo#getProfesor <em>Profesor</em>}</li>
 *   <li>{@link itculiacan.Grupo#getAlumnos <em>Alumnos</em>}</li>
 * </ul>
 * </p>
 *
 * @see itculiacan.ItculiacanPackage#getGrupo()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Grupo extends CDOObject {
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
	 * @see itculiacan.ItculiacanPackage#getGrupo_Clave()
	 * @model
	 * @generated
	 */
	int getClave();

	/**
	 * Sets the value of the '{@link itculiacan.Grupo#getClave <em>Clave</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clave</em>' attribute.
	 * @see #getClave()
	 * @generated
	 */
	void setClave(int value);

	/**
	 * Returns the value of the '<em><b>Aula</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link itculiacan.Aula#getGrupos <em>Grupos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aula</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aula</em>' reference.
	 * @see #setAula(Aula)
	 * @see itculiacan.ItculiacanPackage#getGrupo_Aula()
	 * @see itculiacan.Aula#getGrupos
	 * @model opposite="grupos" required="true"
	 * @generated
	 */
	Aula getAula();

	/**
	 * Sets the value of the '{@link itculiacan.Grupo#getAula <em>Aula</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aula</em>' reference.
	 * @see #getAula()
	 * @generated
	 */
	void setAula(Aula value);

	/**
	 * Returns the value of the '<em><b>Materia</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link itculiacan.Materia#getGrupos <em>Grupos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Materia</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Materia</em>' reference.
	 * @see #setMateria(Materia)
	 * @see itculiacan.ItculiacanPackage#getGrupo_Materia()
	 * @see itculiacan.Materia#getGrupos
	 * @model opposite="grupos" required="true"
	 * @generated
	 */
	Materia getMateria();

	/**
	 * Sets the value of the '{@link itculiacan.Grupo#getMateria <em>Materia</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Materia</em>' reference.
	 * @see #getMateria()
	 * @generated
	 */
	void setMateria(Materia value);

	/**
	 * Returns the value of the '<em><b>Profesor</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link itculiacan.Profesor#getGrupos <em>Grupos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Profesor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profesor</em>' reference.
	 * @see #setProfesor(Profesor)
	 * @see itculiacan.ItculiacanPackage#getGrupo_Profesor()
	 * @see itculiacan.Profesor#getGrupos
	 * @model opposite="grupos" required="true"
	 * @generated
	 */
	Profesor getProfesor();

	/**
	 * Sets the value of the '{@link itculiacan.Grupo#getProfesor <em>Profesor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profesor</em>' reference.
	 * @see #getProfesor()
	 * @generated
	 */
	void setProfesor(Profesor value);

	/**
	 * Returns the value of the '<em><b>Alumnos</b></em>' reference list.
	 * The list contents are of type {@link itculiacan.Alumno}.
	 * It is bidirectional and its opposite is '{@link itculiacan.Alumno#getGrupos <em>Grupos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alumnos</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alumnos</em>' reference list.
	 * @see itculiacan.ItculiacanPackage#getGrupo_Alumnos()
	 * @see itculiacan.Alumno#getGrupos
	 * @model opposite="grupos" required="true"
	 * @generated
	 */
	EList<Alumno> getAlumnos();

} // Grupo
