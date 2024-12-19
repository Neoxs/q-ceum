/**
 */
package qcmpresentation.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import qcmpresentation.AnswerOption;
import qcmpresentation.InputType;
import qcmpresentation.Page;
import qcmpresentation.QcmpresentationFactory;
import qcmpresentation.QcmpresentationPackage;
import qcmpresentation.QuestionPage;
import qcmpresentation.QuestionnairePresentation;
import qcmpresentation.ResultPage;
import qcmpresentation.ScoreDisplayType;

import qcmpresentation.util.QcmpresentationValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QcmpresentationPackageImpl extends EPackageImpl implements QcmpresentationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass questionnairePresentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass questionPageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass answerOptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resultPageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum inputTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum scoreDisplayTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see qcmpresentation.QcmpresentationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private QcmpresentationPackageImpl() {
		super(eNS_URI, QcmpresentationFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link QcmpresentationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QcmpresentationPackage init() {
		if (isInited) return (QcmpresentationPackage)EPackage.Registry.INSTANCE.getEPackage(QcmpresentationPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredQcmpresentationPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		QcmpresentationPackageImpl theQcmpresentationPackage = registeredQcmpresentationPackage instanceof QcmpresentationPackageImpl ? (QcmpresentationPackageImpl)registeredQcmpresentationPackage : new QcmpresentationPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theQcmpresentationPackage.createPackageContents();

		// Initialize created meta-data
		theQcmpresentationPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theQcmpresentationPackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return QcmpresentationValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theQcmpresentationPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QcmpresentationPackage.eNS_URI, theQcmpresentationPackage);
		return theQcmpresentationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQuestionnairePresentation() {
		return questionnairePresentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQuestionnairePresentation_Title() {
		return (EAttribute)questionnairePresentationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQuestionnairePresentation_ShowProgressBar() {
		return (EAttribute)questionnairePresentationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQuestionnairePresentation_EnableBackNavigation() {
		return (EAttribute)questionnairePresentationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQuestionnairePresentation_Pages() {
		return (EReference)questionnairePresentationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQuestionnairePresentation_ResultPage() {
		return (EReference)questionnairePresentationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPage() {
		return pageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPage_Header() {
		return (EAttribute)pageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPage_CssClass() {
		return (EAttribute)pageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPage__HeaderNotEmpty__DiagnosticChain_Map() {
		return pageEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQuestionPage() {
		return questionPageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQuestionPage_QuestionText() {
		return (EAttribute)questionPageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQuestionPage_DifficultyDisplay() {
		return (EAttribute)questionPageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQuestionPage_Options() {
		return (EReference)questionPageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQuestionPage_MultipleChoice() {
		return (EAttribute)questionPageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getQuestionPage__MinimumTwoOptions__DiagnosticChain_Map() {
		return questionPageEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getQuestionPage__CorrectInputType__DiagnosticChain_Map() {
		return questionPageEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getQuestionPage__HasCorrectAnswer__DiagnosticChain_Map() {
		return questionPageEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getQuestionPage__QuestionTextNotEmpty__DiagnosticChain_Map() {
		return questionPageEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnswerOption() {
		return answerOptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnswerOption_Text() {
		return (EAttribute)answerOptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnswerOption_Correct() {
		return (EAttribute)answerOptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnswerOption_InputType() {
		return (EAttribute)answerOptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnswerOption__AnswerTextNotEmpty__DiagnosticChain_Map() {
		return answerOptionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResultPage() {
		return resultPageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResultPage_ShowDetailedFeedback() {
		return (EAttribute)resultPageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResultPage_ShowCorrectAnswers() {
		return (EAttribute)resultPageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResultPage_ScoreDisplay() {
		return (EAttribute)resultPageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getInputType() {
		return inputTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getScoreDisplayType() {
		return scoreDisplayTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QcmpresentationFactory getQcmpresentationFactory() {
		return (QcmpresentationFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		questionnairePresentationEClass = createEClass(QUESTIONNAIRE_PRESENTATION);
		createEAttribute(questionnairePresentationEClass, QUESTIONNAIRE_PRESENTATION__TITLE);
		createEAttribute(questionnairePresentationEClass, QUESTIONNAIRE_PRESENTATION__SHOW_PROGRESS_BAR);
		createEAttribute(questionnairePresentationEClass, QUESTIONNAIRE_PRESENTATION__ENABLE_BACK_NAVIGATION);
		createEReference(questionnairePresentationEClass, QUESTIONNAIRE_PRESENTATION__PAGES);
		createEReference(questionnairePresentationEClass, QUESTIONNAIRE_PRESENTATION__RESULT_PAGE);

		pageEClass = createEClass(PAGE);
		createEAttribute(pageEClass, PAGE__HEADER);
		createEAttribute(pageEClass, PAGE__CSS_CLASS);
		createEOperation(pageEClass, PAGE___HEADER_NOT_EMPTY__DIAGNOSTICCHAIN_MAP);

		questionPageEClass = createEClass(QUESTION_PAGE);
		createEAttribute(questionPageEClass, QUESTION_PAGE__QUESTION_TEXT);
		createEAttribute(questionPageEClass, QUESTION_PAGE__DIFFICULTY_DISPLAY);
		createEReference(questionPageEClass, QUESTION_PAGE__OPTIONS);
		createEAttribute(questionPageEClass, QUESTION_PAGE__MULTIPLE_CHOICE);
		createEOperation(questionPageEClass, QUESTION_PAGE___MINIMUM_TWO_OPTIONS__DIAGNOSTICCHAIN_MAP);
		createEOperation(questionPageEClass, QUESTION_PAGE___CORRECT_INPUT_TYPE__DIAGNOSTICCHAIN_MAP);
		createEOperation(questionPageEClass, QUESTION_PAGE___HAS_CORRECT_ANSWER__DIAGNOSTICCHAIN_MAP);
		createEOperation(questionPageEClass, QUESTION_PAGE___QUESTION_TEXT_NOT_EMPTY__DIAGNOSTICCHAIN_MAP);

		answerOptionEClass = createEClass(ANSWER_OPTION);
		createEAttribute(answerOptionEClass, ANSWER_OPTION__TEXT);
		createEAttribute(answerOptionEClass, ANSWER_OPTION__CORRECT);
		createEAttribute(answerOptionEClass, ANSWER_OPTION__INPUT_TYPE);
		createEOperation(answerOptionEClass, ANSWER_OPTION___ANSWER_TEXT_NOT_EMPTY__DIAGNOSTICCHAIN_MAP);

		resultPageEClass = createEClass(RESULT_PAGE);
		createEAttribute(resultPageEClass, RESULT_PAGE__SHOW_DETAILED_FEEDBACK);
		createEAttribute(resultPageEClass, RESULT_PAGE__SHOW_CORRECT_ANSWERS);
		createEAttribute(resultPageEClass, RESULT_PAGE__SCORE_DISPLAY);

		// Create enums
		inputTypeEEnum = createEEnum(INPUT_TYPE);
		scoreDisplayTypeEEnum = createEEnum(SCORE_DISPLAY_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		questionPageEClass.getESuperTypes().add(this.getPage());
		resultPageEClass.getESuperTypes().add(this.getPage());

		// Initialize classes, features, and operations; add parameters
		initEClass(questionnairePresentationEClass, QuestionnairePresentation.class, "QuestionnairePresentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQuestionnairePresentation_Title(), ecorePackage.getEString(), "title", null, 0, 1, QuestionnairePresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuestionnairePresentation_ShowProgressBar(), ecorePackage.getEBoolean(), "showProgressBar", null, 1, 1, QuestionnairePresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuestionnairePresentation_EnableBackNavigation(), ecorePackage.getEBoolean(), "enableBackNavigation", null, 1, 1, QuestionnairePresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuestionnairePresentation_Pages(), this.getQuestionPage(), null, "pages", null, 0, -1, QuestionnairePresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuestionnairePresentation_ResultPage(), this.getResultPage(), null, "resultPage", null, 0, 1, QuestionnairePresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pageEClass, Page.class, "Page", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPage_Header(), ecorePackage.getEString(), "header", null, 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPage_CssClass(), ecorePackage.getEString(), "cssClass", null, 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getPage__HeaderNotEmpty__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "headerNotEmpty", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(questionPageEClass, QuestionPage.class, "QuestionPage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQuestionPage_QuestionText(), ecorePackage.getEString(), "questionText", null, 0, 1, QuestionPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuestionPage_DifficultyDisplay(), ecorePackage.getEString(), "difficultyDisplay", null, 0, 1, QuestionPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuestionPage_Options(), this.getAnswerOption(), null, "options", null, 0, -1, QuestionPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuestionPage_MultipleChoice(), ecorePackage.getEBoolean(), "multipleChoice", null, 1, 1, QuestionPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getQuestionPage__MinimumTwoOptions__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "minimumTwoOptions", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getQuestionPage__CorrectInputType__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "correctInputType", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getQuestionPage__HasCorrectAnswer__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "hasCorrectAnswer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getQuestionPage__QuestionTextNotEmpty__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "questionTextNotEmpty", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(answerOptionEClass, AnswerOption.class, "AnswerOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnswerOption_Text(), ecorePackage.getEString(), "text", null, 0, 1, AnswerOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnswerOption_Correct(), ecorePackage.getEBoolean(), "correct", null, 1, 1, AnswerOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnswerOption_InputType(), this.getInputType(), "inputType", null, 0, 1, AnswerOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getAnswerOption__AnswerTextNotEmpty__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "answerTextNotEmpty", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(resultPageEClass, ResultPage.class, "ResultPage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResultPage_ShowDetailedFeedback(), ecorePackage.getEBoolean(), "showDetailedFeedback", null, 1, 1, ResultPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultPage_ShowCorrectAnswers(), ecorePackage.getEBoolean(), "showCorrectAnswers", null, 1, 1, ResultPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultPage_ScoreDisplay(), this.getScoreDisplayType(), "scoreDisplay", null, 0, 1, ResultPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(inputTypeEEnum, InputType.class, "InputType");
		addEEnumLiteral(inputTypeEEnum, InputType.RADIO);
		addEEnumLiteral(inputTypeEEnum, InputType.CHECKBOX);

		initEEnum(scoreDisplayTypeEEnum, ScoreDisplayType.class, "ScoreDisplayType");
		addEEnumLiteral(scoreDisplayTypeEEnum, ScoreDisplayType.PERCENTAGE);
		addEEnumLiteral(scoreDisplayTypeEEnum, ScoreDisplayType.FRACTION);
		addEEnumLiteral(scoreDisplayTypeEEnum, ScoreDisplayType.SIMPLE_TEXT);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (pageEClass,
		   source,
		   new String[] {
			   "constraints", "headerNotEmpty"
		   });
		addAnnotation
		  (questionPageEClass,
		   source,
		   new String[] {
			   "constraints", "questionTextNotEmpty"
		   });
		addAnnotation
		  (answerOptionEClass,
		   source,
		   new String[] {
			   "constraints", "answerTextNotEmpty"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation
		  (getPage__HeaderNotEmpty__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "header.size() > 0"
		   });
		addAnnotation
		  (getQuestionPage__MinimumTwoOptions__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "options->size() >= 2"
		   });
		addAnnotation
		  (getQuestionPage__CorrectInputType__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t\t\tif multipleChoice then\n        \t\toptions->forAll(o | o.inputType = InputType::CHECKBOX)\n    \t\telse\n        \t\toptions->forAll(o | o.inputType = InputType::RADIO)\n    \t\tendif"
		   });
		addAnnotation
		  (getQuestionPage__HasCorrectAnswer__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "options->exists(o | o.correct)"
		   });
		addAnnotation
		  (getQuestionPage__QuestionTextNotEmpty__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "questionText.size() > 0"
		   });
		addAnnotation
		  (getAnswerOption__AnswerTextNotEmpty__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "text.size() > 0"
		   });
	}

} //QcmpresentationPackageImpl
