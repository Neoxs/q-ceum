/**
 */
package qcm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Difficulty Level</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see qcm.QcmPackage#getDifficultyLevel()
 * @model
 * @generated
 */
public enum DifficultyLevel implements Enumerator {
	/**
	 * The '<em><b>LEVEL 1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEVEL_1_VALUE
	 * @generated
	 * @ordered
	 */
	LEVEL_1(1, "LEVEL_1", "LEVEL_1"),

	/**
	 * The '<em><b>LEVEL 2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEVEL_2_VALUE
	 * @generated
	 * @ordered
	 */
	LEVEL_2(2, "LEVEL_2", "LEVEL_2"),

	/**
	 * The '<em><b>LEVEL 3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEVEL_3_VALUE
	 * @generated
	 * @ordered
	 */
	LEVEL_3(3, "LEVEL_3", "LEVEL_3"),

	/**
	 * The '<em><b>LEVEL 4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEVEL_4_VALUE
	 * @generated
	 * @ordered
	 */
	LEVEL_4(4, "LEVEL_4", "LEVEL_4"),

	/**
	 * The '<em><b>LEVEL 5</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEVEL_5_VALUE
	 * @generated
	 * @ordered
	 */
	LEVEL_5(5, "LEVEL_5", "LEVEL_5");

	/**
	 * The '<em><b>LEVEL 1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEVEL_1
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LEVEL_1_VALUE = 1;

	/**
	 * The '<em><b>LEVEL 2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEVEL_2
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LEVEL_2_VALUE = 2;

	/**
	 * The '<em><b>LEVEL 3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEVEL_3
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LEVEL_3_VALUE = 3;

	/**
	 * The '<em><b>LEVEL 4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEVEL_4
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LEVEL_4_VALUE = 4;

	/**
	 * The '<em><b>LEVEL 5</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEVEL_5
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LEVEL_5_VALUE = 5;

	/**
	 * An array of all the '<em><b>Difficulty Level</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DifficultyLevel[] VALUES_ARRAY =
		new DifficultyLevel[] {
			LEVEL_1,
			LEVEL_2,
			LEVEL_3,
			LEVEL_4,
			LEVEL_5,
		};

	/**
	 * A public read-only list of all the '<em><b>Difficulty Level</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DifficultyLevel> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Difficulty Level</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DifficultyLevel get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DifficultyLevel result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Difficulty Level</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DifficultyLevel getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DifficultyLevel result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Difficulty Level</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DifficultyLevel get(int value) {
		switch (value) {
			case LEVEL_1_VALUE: return LEVEL_1;
			case LEVEL_2_VALUE: return LEVEL_2;
			case LEVEL_3_VALUE: return LEVEL_3;
			case LEVEL_4_VALUE: return LEVEL_4;
			case LEVEL_5_VALUE: return LEVEL_5;
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
	private DifficultyLevel(int value, String name, String literal) {
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
	
} //DifficultyLevel
