/**
 */
package qcm.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.EnumerationLiteralId;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.library.string.StringSizeOperation;

import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;

import qcm.Answer;
import qcm.DifficultyLevel;
import qcm.QcmPackage;
import qcm.QcmTables;
import qcm.Question;
import qcm.Tag;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Question</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qcm.impl.QuestionImpl#getText <em>Text</em>}</li>
 *   <li>{@link qcm.impl.QuestionImpl#getDifficulty <em>Difficulty</em>}</li>
 *   <li>{@link qcm.impl.QuestionImpl#getAnswers <em>Answers</em>}</li>
 *   <li>{@link qcm.impl.QuestionImpl#getTags <em>Tags</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class QuestionImpl extends MinimalEObjectImpl.Container implements Question {
	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDifficulty() <em>Difficulty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDifficulty()
	 * @generated
	 * @ordered
	 */
	protected static final DifficultyLevel DIFFICULTY_EDEFAULT = DifficultyLevel.LEVEL_1;

	/**
	 * The cached value of the '{@link #getDifficulty() <em>Difficulty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDifficulty()
	 * @generated
	 * @ordered
	 */
	protected DifficultyLevel difficulty = DIFFICULTY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAnswers() <em>Answers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnswers()
	 * @generated
	 * @ordered
	 */
	protected EList<Answer> answers;

	/**
	 * The cached value of the '{@link #getTags() <em>Tags</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTags()
	 * @generated
	 * @ordered
	 */
	protected EList<Tag> tags;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QcmPackage.Literals.QUESTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QcmPackage.QUESTION__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DifficultyLevel getDifficulty() {
		return difficulty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDifficulty(DifficultyLevel newDifficulty) {
		DifficultyLevel oldDifficulty = difficulty;
		difficulty = newDifficulty == null ? DIFFICULTY_EDEFAULT : newDifficulty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QcmPackage.QUESTION__DIFFICULTY, oldDifficulty, difficulty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Answer> getAnswers() {
		if (answers == null) {
			answers = new EObjectContainmentEList<Answer>(Answer.class, this, QcmPackage.QUESTION__ANSWERS);
		}
		return answers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Tag> getTags() {
		if (tags == null) {
			tags = new EObjectResolvingEList<Tag>(Tag.class, this, QcmPackage.QUESTION__TAGS);
		}
		return tags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validDifficultyLevel(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Question::validDifficultyLevel";
		try {
			/**
			 *
			 * inv validDifficultyLevel:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[?] = difficulty = DifficultyLevel::LEVEL_1 or difficulty = DifficultyLevel::LEVEL_2 or difficulty = DifficultyLevel::LEVEL_3 or difficulty = DifficultyLevel::LEVEL_4 or difficulty = DifficultyLevel::LEVEL_5
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, QcmPackage.Literals.QUESTION___VALID_DIFFICULTY_LEVEL__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, QcmTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ DifficultyLevel difficulty_3 = this.getDifficulty();
					final /*@NonInvalid*/ EnumerationLiteralId BOXED_difficulty_3 = QcmTables.ENUMid_DifficultyLevel.getEnumerationLiteralId(ClassUtil.nonNullState(difficulty_3.getName()));
					/*@Caught*/ Object CAUGHT_or_1;
					try {
						/*@Caught*/ Object CAUGHT_or_0;
						try {
							final /*@NonInvalid*/ boolean eq = BOXED_difficulty_3 == QcmTables.ELITid_LEVEL_1;
							final /*@NonInvalid*/ Boolean or;
							if (eq) {
								or = ValueUtil.TRUE_VALUE;
							}
							else {
								final /*@NonInvalid*/ boolean eq_0 = BOXED_difficulty_3 == QcmTables.ELITid_LEVEL_2;
								if (eq_0) {
									or = ValueUtil.TRUE_VALUE;
								}
								else {
									or = ValueUtil.FALSE_VALUE;
								}
							}
							final /*@Thrown*/ Boolean or_0;
							if (or == ValueUtil.TRUE_VALUE) {
								or_0 = ValueUtil.TRUE_VALUE;
							}
							else {
								final /*@NonInvalid*/ boolean eq_1 = BOXED_difficulty_3 == QcmTables.ELITid_LEVEL_3;
								if (eq_1) {
									or_0 = ValueUtil.TRUE_VALUE;
								}
								else {
									if (or == null) {
										or_0 = null;
									}
									else {
										or_0 = ValueUtil.FALSE_VALUE;
									}
								}
							}
							CAUGHT_or_0 = or_0;
						}
						catch (Exception e) {
							CAUGHT_or_0 = ValueUtil.createInvalidValue(e);
						}
						final /*@Thrown*/ Boolean or_1;
						if (CAUGHT_or_0 == ValueUtil.TRUE_VALUE) {
							or_1 = ValueUtil.TRUE_VALUE;
						}
						else {
							final /*@NonInvalid*/ boolean eq_2 = BOXED_difficulty_3 == QcmTables.ELITid_LEVEL_4;
							if (eq_2) {
								or_1 = ValueUtil.TRUE_VALUE;
							}
							else {
								if (CAUGHT_or_0 instanceof InvalidValueException) {
									throw (InvalidValueException)CAUGHT_or_0;
								}
								if (CAUGHT_or_0 == null) {
									or_1 = null;
								}
								else {
									or_1 = ValueUtil.FALSE_VALUE;
								}
							}
						}
						CAUGHT_or_1 = or_1;
					}
					catch (Exception e) {
						CAUGHT_or_1 = ValueUtil.createInvalidValue(e);
					}
					final /*@Thrown*/ Boolean result;
					if (CAUGHT_or_1 == ValueUtil.TRUE_VALUE) {
						result = ValueUtil.TRUE_VALUE;
					}
					else {
						final /*@NonInvalid*/ boolean eq_3 = BOXED_difficulty_3 == QcmTables.ELITid_LEVEL_5;
						if (eq_3) {
							result = ValueUtil.TRUE_VALUE;
						}
						else {
							if (CAUGHT_or_1 instanceof InvalidValueException) {
								throw (InvalidValueException)CAUGHT_or_1;
							}
							if (CAUGHT_or_1 == null) {
								result = null;
							}
							else {
								result = ValueUtil.FALSE_VALUE;
							}
						}
					}
					CAUGHT_result = result;
				}
				catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, QcmTables.INT_0).booleanValue();
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
	public boolean textNotEmpty(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Question::textNotEmpty";
		try {
			/**
			 *
			 * inv textNotEmpty:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = text.size() > 0
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, QcmPackage.Literals.QUESTION___TEXT_NOT_EMPTY__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, QcmTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				final /*@NonInvalid*/ String text = this.getText();
				final /*@NonInvalid*/ IntegerValue size = StringSizeOperation.INSTANCE.evaluate(text);
				final /*@NonInvalid*/ boolean result = OclComparableGreaterThanOperation.INSTANCE.evaluate(executor, size, QcmTables.INT_0).booleanValue();
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, QcmTables.INT_0).booleanValue();
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
			case QcmPackage.QUESTION__ANSWERS:
				return ((InternalEList<?>)getAnswers()).basicRemove(otherEnd, msgs);
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
			case QcmPackage.QUESTION__TEXT:
				return getText();
			case QcmPackage.QUESTION__DIFFICULTY:
				return getDifficulty();
			case QcmPackage.QUESTION__ANSWERS:
				return getAnswers();
			case QcmPackage.QUESTION__TAGS:
				return getTags();
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
			case QcmPackage.QUESTION__TEXT:
				setText((String)newValue);
				return;
			case QcmPackage.QUESTION__DIFFICULTY:
				setDifficulty((DifficultyLevel)newValue);
				return;
			case QcmPackage.QUESTION__ANSWERS:
				getAnswers().clear();
				getAnswers().addAll((Collection<? extends Answer>)newValue);
				return;
			case QcmPackage.QUESTION__TAGS:
				getTags().clear();
				getTags().addAll((Collection<? extends Tag>)newValue);
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
			case QcmPackage.QUESTION__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case QcmPackage.QUESTION__DIFFICULTY:
				setDifficulty(DIFFICULTY_EDEFAULT);
				return;
			case QcmPackage.QUESTION__ANSWERS:
				getAnswers().clear();
				return;
			case QcmPackage.QUESTION__TAGS:
				getTags().clear();
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
			case QcmPackage.QUESTION__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
			case QcmPackage.QUESTION__DIFFICULTY:
				return difficulty != DIFFICULTY_EDEFAULT;
			case QcmPackage.QUESTION__ANSWERS:
				return answers != null && !answers.isEmpty();
			case QcmPackage.QUESTION__TAGS:
				return tags != null && !tags.isEmpty();
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
			case QcmPackage.QUESTION___VALID_DIFFICULTY_LEVEL__DIAGNOSTICCHAIN_MAP:
				return validDifficultyLevel((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case QcmPackage.QUESTION___TEXT_NOT_EMPTY__DIAGNOSTICCHAIN_MAP:
				return textNotEmpty((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (text: ");
		result.append(text);
		result.append(", difficulty: ");
		result.append(difficulty);
		result.append(')');
		return result.toString();
	}

} //QuestionImpl
