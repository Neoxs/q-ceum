/**
 */
package qcmpresentation;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Answer Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qcmpresentation.AnswerOption#getText <em>Text</em>}</li>
 *   <li>{@link qcmpresentation.AnswerOption#isCorrect <em>Correct</em>}</li>
 *   <li>{@link qcmpresentation.AnswerOption#getInputType <em>Input Type</em>}</li>
 * </ul>
 *
 * @see qcmpresentation.QcmpresentationPackage#getAnswerOption()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='answerTextNotEmpty'"
 * @generated
 */
public interface AnswerOption extends EObject {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see qcmpresentation.QcmpresentationPackage#getAnswerOption_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link qcmpresentation.AnswerOption#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Correct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correct</em>' attribute.
	 * @see #setCorrect(boolean)
	 * @see qcmpresentation.QcmpresentationPackage#getAnswerOption_Correct()
	 * @model required="true"
	 * @generated
	 */
	boolean isCorrect();

	/**
	 * Sets the value of the '{@link qcmpresentation.AnswerOption#isCorrect <em>Correct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Correct</em>' attribute.
	 * @see #isCorrect()
	 * @generated
	 */
	void setCorrect(boolean value);

	/**
	 * Returns the value of the '<em><b>Input Type</b></em>' attribute.
	 * The literals are from the enumeration {@link qcmpresentation.InputType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Type</em>' attribute.
	 * @see qcmpresentation.InputType
	 * @see #setInputType(InputType)
	 * @see qcmpresentation.QcmpresentationPackage#getAnswerOption_InputType()
	 * @model
	 * @generated
	 */
	InputType getInputType();

	/**
	 * Sets the value of the '{@link qcmpresentation.AnswerOption#getInputType <em>Input Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Type</em>' attribute.
	 * @see qcmpresentation.InputType
	 * @see #getInputType()
	 * @generated
	 */
	void setInputType(InputType value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='text.size() &gt; 0'"
	 * @generated
	 */
	boolean answerTextNotEmpty(DiagnosticChain diagnostics, Map<Object, Object> context);

} // AnswerOption
