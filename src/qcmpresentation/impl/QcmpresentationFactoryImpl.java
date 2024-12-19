/**
 */
package qcmpresentation.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import qcmpresentation.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QcmpresentationFactoryImpl extends EFactoryImpl implements QcmpresentationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QcmpresentationFactory init() {
		try {
			QcmpresentationFactory theQcmpresentationFactory = (QcmpresentationFactory)EPackage.Registry.INSTANCE.getEFactory(QcmpresentationPackage.eNS_URI);
			if (theQcmpresentationFactory != null) {
				return theQcmpresentationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new QcmpresentationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QcmpresentationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case QcmpresentationPackage.QUESTIONNAIRE_PRESENTATION: return createQuestionnairePresentation();
			case QcmpresentationPackage.QUESTION_PAGE: return createQuestionPage();
			case QcmpresentationPackage.ANSWER_OPTION: return createAnswerOption();
			case QcmpresentationPackage.RESULT_PAGE: return createResultPage();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case QcmpresentationPackage.INPUT_TYPE:
				return createInputTypeFromString(eDataType, initialValue);
			case QcmpresentationPackage.SCORE_DISPLAY_TYPE:
				return createScoreDisplayTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case QcmpresentationPackage.INPUT_TYPE:
				return convertInputTypeToString(eDataType, instanceValue);
			case QcmpresentationPackage.SCORE_DISPLAY_TYPE:
				return convertScoreDisplayTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuestionnairePresentation createQuestionnairePresentation() {
		QuestionnairePresentationImpl questionnairePresentation = new QuestionnairePresentationImpl();
		return questionnairePresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuestionPage createQuestionPage() {
		QuestionPageImpl questionPage = new QuestionPageImpl();
		return questionPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnswerOption createAnswerOption() {
		AnswerOptionImpl answerOption = new AnswerOptionImpl();
		return answerOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResultPage createResultPage() {
		ResultPageImpl resultPage = new ResultPageImpl();
		return resultPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputType createInputTypeFromString(EDataType eDataType, String initialValue) {
		InputType result = InputType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInputTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScoreDisplayType createScoreDisplayTypeFromString(EDataType eDataType, String initialValue) {
		ScoreDisplayType result = ScoreDisplayType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScoreDisplayTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QcmpresentationPackage getQcmpresentationPackage() {
		return (QcmpresentationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QcmpresentationPackage getPackage() {
		return QcmpresentationPackage.eINSTANCE;
	}

} //QcmpresentationFactoryImpl
