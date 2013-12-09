/**
 */
package itculiacan;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Nombramiento</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see itculiacan.ItculiacanPackage#getNombramiento()
 * @model
 * @generated
 */
public enum Nombramiento implements Enumerator {
	/**
	 * The '<em><b>Medio Tiempo</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDIO_TIEMPO_VALUE
	 * @generated
	 * @ordered
	 */
	MEDIO_TIEMPO(1, "medioTiempo", "1"),

	/**
	 * The '<em><b>Tiempo Completo</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIEMPO_COMPLETO_VALUE
	 * @generated
	 * @ordered
	 */
	TIEMPO_COMPLETO(2, "tiempoCompleto", "2");

	/**
	 * The '<em><b>Medio Tiempo</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Medio Tiempo</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MEDIO_TIEMPO
	 * @model name="medioTiempo" literal="1"
	 * @generated
	 * @ordered
	 */
	public static final int MEDIO_TIEMPO_VALUE = 1;

	/**
	 * The '<em><b>Tiempo Completo</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Tiempo Completo</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TIEMPO_COMPLETO
	 * @model name="tiempoCompleto" literal="2"
	 * @generated
	 * @ordered
	 */
	public static final int TIEMPO_COMPLETO_VALUE = 2;

	/**
	 * An array of all the '<em><b>Nombramiento</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Nombramiento[] VALUES_ARRAY =
		new Nombramiento[] {
			MEDIO_TIEMPO,
			TIEMPO_COMPLETO,
		};

	/**
	 * A public read-only list of all the '<em><b>Nombramiento</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Nombramiento> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Nombramiento</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Nombramiento get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Nombramiento result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Nombramiento</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Nombramiento getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Nombramiento result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Nombramiento</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Nombramiento get(int value) {
		switch (value) {
			case MEDIO_TIEMPO_VALUE: return MEDIO_TIEMPO;
			case TIEMPO_COMPLETO_VALUE: return TIEMPO_COMPLETO;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Nombramiento(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //Nombramiento
