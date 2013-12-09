/**
 */
package itculiacan.util;

import itculiacan.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see itculiacan.ItculiacanPackage
 * @generated
 */
public class ItculiacanSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ItculiacanPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItculiacanSwitch() {
		if (modelPackage == null) {
			modelPackage = ItculiacanPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ItculiacanPackage.ALUMNO: {
				Alumno alumno = (Alumno)theEObject;
				T result = caseAlumno(alumno);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ItculiacanPackage.GENERACION: {
				Generacion generacion = (Generacion)theEObject;
				T result = caseGeneracion(generacion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ItculiacanPackage.GRUPO: {
				Grupo grupo = (Grupo)theEObject;
				T result = caseGrupo(grupo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ItculiacanPackage.AULA: {
				Aula aula = (Aula)theEObject;
				T result = caseAula(aula);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ItculiacanPackage.MATERIA: {
				Materia materia = (Materia)theEObject;
				T result = caseMateria(materia);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ItculiacanPackage.PROFESOR: {
				Profesor profesor = (Profesor)theEObject;
				T result = caseProfesor(profesor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ItculiacanPackage.PLAN_ESTUDIO: {
				PlanEstudio planEstudio = (PlanEstudio)theEObject;
				T result = casePlanEstudio(planEstudio);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ItculiacanPackage.UNIVERSIDAD: {
				Universidad universidad = (Universidad)theEObject;
				T result = caseUniversidad(universidad);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alumno</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alumno</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlumno(Alumno object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generacion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generacion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneracion(Generacion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Grupo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Grupo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGrupo(Grupo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aula</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aula</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAula(Aula object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Materia</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Materia</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMateria(Materia object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Profesor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Profesor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProfesor(Profesor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plan Estudio</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plan Estudio</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlanEstudio(PlanEstudio object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Universidad</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Universidad</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUniversidad(Universidad object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ItculiacanSwitch
