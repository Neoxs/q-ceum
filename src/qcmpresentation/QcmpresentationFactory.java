/**
 */
package qcmpresentation;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see qcmpresentation.QcmpresentationPackage
 * @generated
 */
public interface QcmpresentationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QcmpresentationFactory eINSTANCE = qcmpresentation.impl.QcmpresentationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Questionnaire Presentation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Questionnaire Presentation</em>'.
	 * @generated
	 */
	QuestionnairePresentation createQuestionnairePresentation();

	/**
	 * Returns a new object of class '<em>Question Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Question Page</em>'.
	 * @generated
	 */
	QuestionPage createQuestionPage();

	/**
	 * Returns a new object of class '<em>Answer Option</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Answer Option</em>'.
	 * @generated
	 */
	AnswerOption createAnswerOption();

	/**
	 * Returns a new object of class '<em>Result Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Result Page</em>'.
	 * @generated
	 */
	ResultPage createResultPage();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	QcmpresentationPackage getQcmpresentationPackage();

} //QcmpresentationFactory
