/**
 */
package qcmpresentation.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.EnumerationLiteralId;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;

import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanEqualOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.library.string.StringSizeOperation;

import org.eclipse.ocl.pivot.messages.PivotMessages;

import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;

import qcmpresentation.AnswerOption;
import qcmpresentation.InputType;
import qcmpresentation.QcmpresentationPackage;
import qcmpresentation.QcmpresentationTables;
import qcmpresentation.QuestionPage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Question Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qcmpresentation.impl.QuestionPageImpl#getQuestionText <em>Question Text</em>}</li>
 *   <li>{@link qcmpresentation.impl.QuestionPageImpl#getDifficultyDisplay <em>Difficulty Display</em>}</li>
 *   <li>{@link qcmpresentation.impl.QuestionPageImpl#getOptions <em>Options</em>}</li>
 *   <li>{@link qcmpresentation.impl.QuestionPageImpl#isMultipleChoice <em>Multiple Choice</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuestionPageImpl extends PageImpl implements QuestionPage {
	/**
	 * The default value of the '{@link #getQuestionText() <em>Question Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestionText()
	 * @generated
	 * @ordered
	 */
	protected static final String QUESTION_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuestionText() <em>Question Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestionText()
	 * @generated
	 * @ordered
	 */
	protected String questionText = QUESTION_TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDifficultyDisplay() <em>Difficulty Display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDifficultyDisplay()
	 * @generated
	 * @ordered
	 */
	protected static final String DIFFICULTY_DISPLAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDifficultyDisplay() <em>Difficulty Display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDifficultyDisplay()
	 * @generated
	 * @ordered
	 */
	protected String difficultyDisplay = DIFFICULTY_DISPLAY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOptions() <em>Options</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptions()
	 * @generated
	 * @ordered
	 */
	protected EList<AnswerOption> options;

	/**
	 * The default value of the '{@link #isMultipleChoice() <em>Multiple Choice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultipleChoice()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MULTIPLE_CHOICE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMultipleChoice() <em>Multiple Choice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultipleChoice()
	 * @generated
	 * @ordered
	 */
	protected boolean multipleChoice = MULTIPLE_CHOICE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionPageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QcmpresentationPackage.Literals.QUESTION_PAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getQuestionText() {
		return questionText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuestionText(String newQuestionText) {
		String oldQuestionText = questionText;
		questionText = newQuestionText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QcmpresentationPackage.QUESTION_PAGE__QUESTION_TEXT, oldQuestionText, questionText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDifficultyDisplay() {
		return difficultyDisplay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDifficultyDisplay(String newDifficultyDisplay) {
		String oldDifficultyDisplay = difficultyDisplay;
		difficultyDisplay = newDifficultyDisplay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QcmpresentationPackage.QUESTION_PAGE__DIFFICULTY_DISPLAY, oldDifficultyDisplay, difficultyDisplay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AnswerOption> getOptions() {
		if (options == null) {
			options = new EObjectContainmentEList<AnswerOption>(AnswerOption.class, this, QcmpresentationPackage.QUESTION_PAGE__OPTIONS);
		}
		return options;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isMultipleChoice() {
		return multipleChoice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMultipleChoice(boolean newMultipleChoice) {
		boolean oldMultipleChoice = multipleChoice;
		multipleChoice = newMultipleChoice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QcmpresentationPackage.QUESTION_PAGE__MULTIPLE_CHOICE, oldMultipleChoice, multipleChoice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean minimumTwoOptions(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "QuestionPage::minimumTwoOptions";
		try {
			/**
			 *
			 * inv minimumTwoOptions:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = options->size() >= 2
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, QcmpresentationPackage.Literals.QUESTION_PAGE___MINIMUM_TWO_OPTIONS__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, QcmpresentationTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				final /*@NonInvalid*/ List<AnswerOption> options = this.getOptions();
				final /*@NonInvalid*/ OrderedSetValue BOXED_options = idResolver.createOrderedSetOfAll(QcmpresentationTables.ORD_CLSSid_AnswerOption, options);
				final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(BOXED_options);
				final /*@NonInvalid*/ boolean result = OclComparableGreaterThanEqualOperation.INSTANCE.evaluate(executor, size, QcmpresentationTables.INT_2).booleanValue();
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, QcmpresentationTables.INT_0).booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean correctInputType(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "QuestionPage::correctInputType";
		try {
			/**
			 *
			 * inv correctInputType:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = if multipleChoice
			 *         then options->forAll(o | o.inputType = InputType::CHECKBOX)
			 *         else options->forAll(o | o.inputType = InputType::RADIO)
			 *         endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, QcmpresentationPackage.Literals.QUESTION_PAGE___CORRECT_INPUT_TYPE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, QcmpresentationTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				final /*@NonInvalid*/ List<AnswerOption> options_0 = this.getOptions();
				final /*@NonInvalid*/ OrderedSetValue BOXED_options_0 = idResolver.createOrderedSetOfAll(QcmpresentationTables.ORD_CLSSid_AnswerOption, options_0);
				final /*@NonInvalid*/ boolean multipleChoice = this.isMultipleChoice();
				/*@NonInvalid*/ Boolean result;
				if (multipleChoice) {
					/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
					Iterator<Object> ITERATOR_o = BOXED_options_0.iterator();
					/*@NonInvalid*/ Boolean forAll;
					while (true) {
						if (!ITERATOR_o.hasNext()) {
							if (accumulator == ValueUtil.TRUE_VALUE) {
								forAll = ValueUtil.TRUE_VALUE;
							}
							else {
								throw (InvalidValueException)accumulator;
							}
							break;
						}
						/*@NonInvalid*/ AnswerOption o = (AnswerOption)ITERATOR_o.next();
						/**
						 * o.inputType = InputType::CHECKBOX
						 */
						final /*@NonInvalid*/ InputType inputType = o.getInputType();
						final /*@NonInvalid*/ EnumerationLiteralId BOXED_inputType = inputType == null ? null : QcmpresentationTables.ENUMid_InputType.getEnumerationLiteralId(ClassUtil.nonNullState(inputType.getName()));
						final /*@NonInvalid*/ boolean eq = BOXED_inputType == QcmpresentationTables.ELITid_CHECKBOX;
						//
						if (!eq) {					// Normal unsuccessful body evaluation result
							forAll = ValueUtil.FALSE_VALUE;
							break;														// Stop immediately
						}
						else if (eq) {				// Normal successful body evaluation result
							;															// Carry on
						}
						else {															// Impossible badly typed result
							accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
						}
					}
					result = forAll;
				}
				else {
					/*@Thrown*/ Object accumulator_0 = ValueUtil.TRUE_VALUE;
					Iterator<Object> ITERATOR_o_0 = BOXED_options_0.iterator();
					/*@NonInvalid*/ Boolean forAll_0;
					while (true) {
						if (!ITERATOR_o_0.hasNext()) {
							if (accumulator_0 == ValueUtil.TRUE_VALUE) {
								forAll_0 = ValueUtil.TRUE_VALUE;
							}
							else {
								throw (InvalidValueException)accumulator_0;
							}
							break;
						}
						/*@NonInvalid*/ AnswerOption o_0 = (AnswerOption)ITERATOR_o_0.next();
						/**
						 * o.inputType = InputType::RADIO
						 */
						final /*@NonInvalid*/ InputType inputType_0 = o_0.getInputType();
						final /*@NonInvalid*/ EnumerationLiteralId BOXED_inputType_0 = inputType_0 == null ? null : QcmpresentationTables.ENUMid_InputType.getEnumerationLiteralId(ClassUtil.nonNullState(inputType_0.getName()));
						final /*@NonInvalid*/ boolean eq_0 = BOXED_inputType_0 == QcmpresentationTables.ELITid_RADIO;
						//
						if (!eq_0) {					// Normal unsuccessful body evaluation result
							forAll_0 = ValueUtil.FALSE_VALUE;
							break;														// Stop immediately
						}
						else if (eq_0) {				// Normal successful body evaluation result
							;															// Carry on
						}
						else {															// Impossible badly typed result
							accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
						}
					}
					result = forAll_0;
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, QcmpresentationTables.INT_0).booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean hasCorrectAnswer(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "QuestionPage::hasCorrectAnswer";
		try {
			/**
			 *
			 * inv hasCorrectAnswer:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[?] = options->exists(o | o.correct)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, QcmpresentationPackage.Literals.QUESTION_PAGE___HAS_CORRECT_ANSWER__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, QcmpresentationTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				final /*@NonInvalid*/ List<AnswerOption> options = this.getOptions();
				final /*@NonInvalid*/ OrderedSetValue BOXED_options = idResolver.createOrderedSetOfAll(QcmpresentationTables.ORD_CLSSid_AnswerOption, options);
				/*@Thrown*/ Object accumulator = ValueUtil.FALSE_VALUE;
				Iterator<Object> ITERATOR_o = BOXED_options.iterator();
				/*@NonInvalid*/ Boolean result;
				while (true) {
					if (!ITERATOR_o.hasNext()) {
						if (accumulator == ValueUtil.FALSE_VALUE) {
							result = ValueUtil.FALSE_VALUE;
						}
						else {
							throw (InvalidValueException)accumulator;
						}
						break;
					}
					/*@NonInvalid*/ AnswerOption o = (AnswerOption)ITERATOR_o.next();
					/**
					 * o.correct
					 */
					final /*@NonInvalid*/ boolean correct = o.isCorrect();
					//
					if (correct) {					// Normal successful body evaluation result
						result = ValueUtil.TRUE_VALUE;
						break;														// Stop immediately
					}
					else if (!correct) {				// Normal unsuccessful body evaluation result
						;															// Carry on
					}
					else {															// Impossible badly typed result
						accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
					}
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, QcmpresentationTables.INT_0).booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean questionTextNotEmpty(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "QuestionPage::questionTextNotEmpty";
		try {
			/**
			 *
			 * inv questionTextNotEmpty:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = questionText.size() > 0
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, QcmpresentationPackage.Literals.QUESTION_PAGE___QUESTION_TEXT_NOT_EMPTY__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, QcmpresentationTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ String questionText = this.getQuestionText();
					if (questionText == null) {
						throw new InvalidValueException("Null \'\'String\'\' rather than \'\'OclVoid\'\' value required");
					}
					final /*@Thrown*/ IntegerValue size = StringSizeOperation.INSTANCE.evaluate(questionText);
					final /*@Thrown*/ boolean result = OclComparableGreaterThanOperation.INSTANCE.evaluate(executor, size, QcmpresentationTables.INT_0).booleanValue();
					CAUGHT_result = result;
				}
				catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, QcmpresentationTables.INT_0).booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QcmpresentationPackage.QUESTION_PAGE__OPTIONS:
				return ((InternalEList<?>)getOptions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QcmpresentationPackage.QUESTION_PAGE__QUESTION_TEXT:
				return getQuestionText();
			case QcmpresentationPackage.QUESTION_PAGE__DIFFICULTY_DISPLAY:
				return getDifficultyDisplay();
			case QcmpresentationPackage.QUESTION_PAGE__OPTIONS:
				return getOptions();
			case QcmpresentationPackage.QUESTION_PAGE__MULTIPLE_CHOICE:
				return isMultipleChoice();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QcmpresentationPackage.QUESTION_PAGE__QUESTION_TEXT:
				setQuestionText((String)newValue);
				return;
			case QcmpresentationPackage.QUESTION_PAGE__DIFFICULTY_DISPLAY:
				setDifficultyDisplay((String)newValue);
				return;
			case QcmpresentationPackage.QUESTION_PAGE__OPTIONS:
				getOptions().clear();
				getOptions().addAll((Collection<? extends AnswerOption>)newValue);
				return;
			case QcmpresentationPackage.QUESTION_PAGE__MULTIPLE_CHOICE:
				setMultipleChoice((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case QcmpresentationPackage.QUESTION_PAGE__QUESTION_TEXT:
				setQuestionText(QUESTION_TEXT_EDEFAULT);
				return;
			case QcmpresentationPackage.QUESTION_PAGE__DIFFICULTY_DISPLAY:
				setDifficultyDisplay(DIFFICULTY_DISPLAY_EDEFAULT);
				return;
			case QcmpresentationPackage.QUESTION_PAGE__OPTIONS:
				getOptions().clear();
				return;
			case QcmpresentationPackage.QUESTION_PAGE__MULTIPLE_CHOICE:
				setMultipleChoice(MULTIPLE_CHOICE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case QcmpresentationPackage.QUESTION_PAGE__QUESTION_TEXT:
				return QUESTION_TEXT_EDEFAULT == null ? questionText != null : !QUESTION_TEXT_EDEFAULT.equals(questionText);
			case QcmpresentationPackage.QUESTION_PAGE__DIFFICULTY_DISPLAY:
				return DIFFICULTY_DISPLAY_EDEFAULT == null ? difficultyDisplay != null : !DIFFICULTY_DISPLAY_EDEFAULT.equals(difficultyDisplay);
			case QcmpresentationPackage.QUESTION_PAGE__OPTIONS:
				return options != null && !options.isEmpty();
			case QcmpresentationPackage.QUESTION_PAGE__MULTIPLE_CHOICE:
				return multipleChoice != MULTIPLE_CHOICE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case QcmpresentationPackage.QUESTION_PAGE___MINIMUM_TWO_OPTIONS__DIAGNOSTICCHAIN_MAP:
				return minimumTwoOptions((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case QcmpresentationPackage.QUESTION_PAGE___CORRECT_INPUT_TYPE__DIAGNOSTICCHAIN_MAP:
				return correctInputType((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case QcmpresentationPackage.QUESTION_PAGE___HAS_CORRECT_ANSWER__DIAGNOSTICCHAIN_MAP:
				return hasCorrectAnswer((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case QcmpresentationPackage.QUESTION_PAGE___QUESTION_TEXT_NOT_EMPTY__DIAGNOSTICCHAIN_MAP:
				return questionTextNotEmpty((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (questionText: ");
		result.append(questionText);
		result.append(", difficultyDisplay: ");
		result.append(difficultyDisplay);
		result.append(", multipleChoice: ");
		result.append(multipleChoice);
		result.append(')');
		return result.toString();
	}

} //QuestionPageImpl
