/**
 */
package qcmpresentation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Score Display Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see qcmpresentation.QcmpresentationPackage#getScoreDisplayType()
 * @model
 * @generated
 */
public enum ScoreDisplayType implements Enumerator {
	/**
	 * The '<em><b>PERCENTAGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERCENTAGE_VALUE
	 * @generated
	 * @ordered
	 */
	PERCENTAGE(0, "PERCENTAGE", "PERCENTAGE"),

	/**
	 * The '<em><b>FRACTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FRACTION_VALUE
	 * @generated
	 * @ordered
	 */
	FRACTION(1, "FRACTION", "FRACTION"),

	/**
	 * The '<em><b>SIMPLE TEXT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIMPLE_TEXT_VALUE
	 * @generated
	 * @ordered
	 */
	SIMPLE_TEXT(2, "SIMPLE_TEXT", "SIMPLE_TEXT");

	/**
	 * The '<em><b>PERCENTAGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERCENTAGE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PERCENTAGE_VALUE = 0;

	/**
	 * The '<em><b>FRACTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FRACTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FRACTION_VALUE = 1;

	/**
	 * The '<em><b>SIMPLE TEXT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIMPLE_TEXT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SIMPLE_TEXT_VALUE = 2;

	/**
	 * An array of all the '<em><b>Score Display Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ScoreDisplayType[] VALUES_ARRAY =
		new ScoreDisplayType[] {
			PERCENTAGE,
			FRACTION,
			SIMPLE_TEXT,
		};

	/**
	 * A public read-only list of all the '<em><b>Score Display Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ScoreDisplayType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Score Display Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ScoreDisplayType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ScoreDisplayType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Score Display Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ScoreDisplayType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ScoreDisplayType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Score Display Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ScoreDisplayType get(int value) {
		switch (value) {
			case PERCENTAGE_VALUE: return PERCENTAGE;
			case FRACTION_VALUE: return FRACTION;
			case SIMPLE_TEXT_VALUE: return SIMPLE_TEXT;
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
	private ScoreDisplayType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	
} //ScoreDisplayType
