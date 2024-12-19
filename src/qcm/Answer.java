/**
 */
package qcm;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Answer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qcm.Answer#getText <em>Text</em>}</li>
 *   <li>{@link qcm.Answer#isIsCorrect <em>Is Correct</em>}</li>
 * </ul>
 *
 * @see qcm.QcmPackage#getAnswer()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='answerTextNotEmpty'"
 * @generated
 */
public interface Answer extends EObject {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see qcm.QcmPackage#getAnswer_Text()
	 * @model required="true"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link qcm.Answer#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Is Correct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Correct</em>' attribute.
	 * @see #setIsCorrect(boolean)
	 * @see qcm.QcmPackage#getAnswer_IsCorrect()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsCorrect();

	/**
	 * Sets the value of the '{@link qcm.Answer#isIsCorrect <em>Is Correct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Correct</em>' attribute.
	 * @see #isIsCorrect()
	 * @generated
	 */
	void setIsCorrect(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='text.size() &gt; 0'"
	 * @generated
	 */
	boolean answerTextNotEmpty(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Answer
