/**
 */
package qcmpresentation.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import qcmpresentation.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see qcmpresentation.QcmpresentationPackage
 * @generated
 */
public class QcmpresentationValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final QcmpresentationValidator INSTANCE = new QcmpresentationValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "qcmpresentation";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Header Not Empty' of 'Page'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PAGE__HEADER_NOT_EMPTY = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Minimum Two Options' of 'Question Page'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTION_PAGE__MINIMUM_TWO_OPTIONS = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Correct Input Type' of 'Question Page'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTION_PAGE__CORRECT_INPUT_TYPE = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Has Correct Answer' of 'Question Page'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTION_PAGE__HAS_CORRECT_ANSWER = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Question Text Not Empty' of 'Question Page'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTION_PAGE__QUESTION_TEXT_NOT_EMPTY = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Answer Text Not Empty' of 'Answer Option'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ANSWER_OPTION__ANSWER_TEXT_NOT_EMPTY = 6;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 6;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QcmpresentationValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return QcmpresentationPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case QcmpresentationPackage.QUESTIONNAIRE_PRESENTATION:
				return validateQuestionnairePresentation((QuestionnairePresentation)value, diagnostics, context);
			case QcmpresentationPackage.PAGE:
				return validatePage((Page)value, diagnostics, context);
			case QcmpresentationPackage.QUESTION_PAGE:
				return validateQuestionPage((QuestionPage)value, diagnostics, context);
			case QcmpresentationPackage.ANSWER_OPTION:
				return validateAnswerOption((AnswerOption)value, diagnostics, context);
			case QcmpresentationPackage.RESULT_PAGE:
				return validateResultPage((ResultPage)value, diagnostics, context);
			case QcmpresentationPackage.INPUT_TYPE:
				return validateInputType((InputType)value, diagnostics, context);
			case QcmpresentationPackage.SCORE_DISPLAY_TYPE:
				return validateScoreDisplayType((ScoreDisplayType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnairePresentation(QuestionnairePresentation questionnairePresentation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(questionnairePresentation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePage(Page page, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(page, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(page, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(page, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(page, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(page, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(page, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(page, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(page, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(page, diagnostics, context);
		if (result || diagnostics != null) result &= validatePage_headerNotEmpty(page, diagnostics, context);
		return result;
	}

	/**
	 * Validates the headerNotEmpty constraint of '<em>Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePage_headerNotEmpty(Page page, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return page.headerNotEmpty(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionPage(QuestionPage questionPage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(questionPage, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(questionPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(questionPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(questionPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(questionPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(questionPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(questionPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(questionPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(questionPage, diagnostics, context);
		if (result || diagnostics != null) result &= validatePage_headerNotEmpty(questionPage, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionPage_questionTextNotEmpty(questionPage, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionPage_minimumTwoOptions(questionPage, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionPage_correctInputType(questionPage, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionPage_hasCorrectAnswer(questionPage, diagnostics, context);
		return result;
	}

	/**
	 * Validates the questionTextNotEmpty constraint of '<em>Question Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionPage_questionTextNotEmpty(QuestionPage questionPage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return questionPage.questionTextNotEmpty(diagnostics, context);
	}

	/**
	 * Validates the minimumTwoOptions constraint of '<em>Question Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionPage_minimumTwoOptions(QuestionPage questionPage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return questionPage.minimumTwoOptions(diagnostics, context);
	}

	/**
	 * Validates the correctInputType constraint of '<em>Question Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionPage_correctInputType(QuestionPage questionPage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return questionPage.correctInputType(diagnostics, context);
	}

	/**
	 * Validates the hasCorrectAnswer constraint of '<em>Question Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionPage_hasCorrectAnswer(QuestionPage questionPage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return questionPage.hasCorrectAnswer(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnswerOption(AnswerOption answerOption, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(answerOption, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(answerOption, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(answerOption, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(answerOption, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(answerOption, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(answerOption, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(answerOption, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(answerOption, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(answerOption, diagnostics, context);
		if (result || diagnostics != null) result &= validateAnswerOption_answerTextNotEmpty(answerOption, diagnostics, context);
		return result;
	}

	/**
	 * Validates the answerTextNotEmpty constraint of '<em>Answer Option</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnswerOption_answerTextNotEmpty(AnswerOption answerOption, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return answerOption.answerTextNotEmpty(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultPage(ResultPage resultPage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(resultPage, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(resultPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(resultPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(resultPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(resultPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(resultPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(resultPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(resultPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(resultPage, diagnostics, context);
		if (result || diagnostics != null) result &= validatePage_headerNotEmpty(resultPage, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputType(InputType inputType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScoreDisplayType(ScoreDisplayType scoreDisplayType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //QcmpresentationValidator
