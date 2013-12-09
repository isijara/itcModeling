/**
 */
package itculiacan.util;

import itculiacan.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see itculiacan.ItculiacanPackage
 * @generated
 */
public class ItculiacanAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ItculiacanPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItculiacanAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ItculiacanPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItculiacanSwitch<Adapter> modelSwitch =
		new ItculiacanSwitch<Adapter>() {
			@Override
			public Adapter caseAlumno(Alumno object) {
				return createAlumnoAdapter();
			}
			@Override
			public Adapter caseGeneracion(Generacion object) {
				return createGeneracionAdapter();
			}
			@Override
			public Adapter caseGrupo(Grupo object) {
				return createGrupoAdapter();
			}
			@Override
			public Adapter caseAula(Aula object) {
				return createAulaAdapter();
			}
			@Override
			public Adapter caseMateria(Materia object) {
				return createMateriaAdapter();
			}
			@Override
			public Adapter caseProfesor(Profesor object) {
				return createProfesorAdapter();
			}
			@Override
			public Adapter casePlanEstudio(PlanEstudio object) {
				return createPlanEstudioAdapter();
			}
			@Override
			public Adapter caseUniversidad(Universidad object) {
				return createUniversidadAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link itculiacan.Alumno <em>Alumno</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see itculiacan.Alumno
	 * @generated
	 */
	public Adapter createAlumnoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link itculiacan.Generacion <em>Generacion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see itculiacan.Generacion
	 * @generated
	 */
	public Adapter createGeneracionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link itculiacan.Grupo <em>Grupo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see itculiacan.Grupo
	 * @generated
	 */
	public Adapter createGrupoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link itculiacan.Aula <em>Aula</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see itculiacan.Aula
	 * @generated
	 */
	public Adapter createAulaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link itculiacan.Materia <em>Materia</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see itculiacan.Materia
	 * @generated
	 */
	public Adapter createMateriaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link itculiacan.Profesor <em>Profesor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see itculiacan.Profesor
	 * @generated
	 */
	public Adapter createProfesorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link itculiacan.PlanEstudio <em>Plan Estudio</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see itculiacan.PlanEstudio
	 * @generated
	 */
	public Adapter createPlanEstudioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link itculiacan.Universidad <em>Universidad</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see itculiacan.Universidad
	 * @generated
	 */
	public Adapter createUniversidadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ItculiacanAdapterFactory
