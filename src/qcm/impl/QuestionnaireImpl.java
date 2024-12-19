/**
 */
package qcm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import qcm.QcmPackage;
import qcm.Question;
import qcm.Questionnaire;
import qcm.Tag;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Questionnaire</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qcm.impl.QuestionnaireImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link qcm.impl.QuestionnaireImpl#isShuffleQuestions <em>Shuffle Questions</em>}</li>
 *   <li>{@link qcm.impl.QuestionnaireImpl#isAllowBack <em>Allow Back</em>}</li>
 *   <li>{@link qcm.impl.QuestionnaireImpl#getQuestions <em>Questions</em>}</li>
 *   <li>{@link qcm.impl.QuestionnaireImpl#getTags <em>Tags</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuestionnaireImpl extends MinimalEObjectImpl.Container implements Questionnaire {
	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isShuffleQuestions() <em>Shuffle Questions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShuffleQuestions()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHUFFLE_QUESTIONS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isShuffleQuestions() <em>Shuffle Questions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShuffleQuestions()
	 * @generated
	 * @ordered
	 */
	protected boolean shuffleQuestions = SHUFFLE_QUESTIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #isAllowBack() <em>Allow Back</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowBack()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALLOW_BACK_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAllowBack() <em>Allow Back</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowBack()
	 * @generated
	 * @ordered
	 */
	protected boolean allowBack = ALLOW_BACK_EDEFAULT;

	/**
	 * The cached value of the '{@link #getQuestions() <em>Questions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestions()
	 * @generated
	 * @ordered
	 */
	protected EList<Question> questions;

	/**
	 * The cached value of the '{@link #getTags() <em>Tags</em>}' containment reference list.
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
	protected QuestionnaireImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QcmPackage.Literals.QUESTIONNAIRE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QcmPackage.QUESTIONNAIRE__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isShuffleQuestions() {
		return shuffleQuestions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShuffleQuestions(boolean newShuffleQuestions) {
		boolean oldShuffleQuestions = shuffleQuestions;
		shuffleQuestions = newShuffleQuestions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QcmPackage.QUESTIONNAIRE__SHUFFLE_QUESTIONS, oldShuffleQuestions, shuffleQuestions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAllowBack() {
		return allowBack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllowBack(boolean newAllowBack) {
		boolean oldAllowBack = allowBack;
		allowBack = newAllowBack;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QcmPackage.QUESTIONNAIRE__ALLOW_BACK, oldAllowBack, allowBack));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Question> getQuestions() {
		if (questions == null) {
			questions = new EObjectContainmentEList<Question>(Question.class, this, QcmPackage.QUESTIONNAIRE__QUESTIONS);
		}
		return questions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Tag> getTags() {
		if (tags == null) {
			tags = new EObjectContainmentEList<Tag>(Tag.class, this, QcmPackage.QUESTIONNAIRE__TAGS);
		}
		return tags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QcmPackage.QUESTIONNAIRE__QUESTIONS:
				return ((InternalEList<?>)getQuestions()).basicRemove(otherEnd, msgs);
			case QcmPackage.QUESTIONNAIRE__TAGS:
				return ((InternalEList<?>)getTags()).basicRemove(otherEnd, msgs);
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
			case QcmPackage.QUESTIONNAIRE__TITLE:
				return getTitle();
			case QcmPackage.QUESTIONNAIRE__SHUFFLE_QUESTIONS:
				return isShuffleQuestions();
			case QcmPackage.QUESTIONNAIRE__ALLOW_BACK:
				return isAllowBack();
			case QcmPackage.QUESTIONNAIRE__QUESTIONS:
				return getQuestions();
			case QcmPackage.QUESTIONNAIRE__TAGS:
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
			case QcmPackage.QUESTIONNAIRE__TITLE:
				setTitle((String)newValue);
				return;
			case QcmPackage.QUESTIONNAIRE__SHUFFLE_QUESTIONS:
				setShuffleQuestions((Boolean)newValue);
				return;
			case QcmPackage.QUESTIONNAIRE__ALLOW_BACK:
				setAllowBack((Boolean)newValue);
				return;
			case QcmPackage.QUESTIONNAIRE__QUESTIONS:
				getQuestions().clear();
				getQuestions().addAll((Collection<? extends Question>)newValue);
				return;
			case QcmPackage.QUESTIONNAIRE__TAGS:
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
			case QcmPackage.QUESTIONNAIRE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case QcmPackage.QUESTIONNAIRE__SHUFFLE_QUESTIONS:
				setShuffleQuestions(SHUFFLE_QUESTIONS_EDEFAULT);
				return;
			case QcmPackage.QUESTIONNAIRE__ALLOW_BACK:
				setAllowBack(ALLOW_BACK_EDEFAULT);
				return;
			case QcmPackage.QUESTIONNAIRE__QUESTIONS:
				getQuestions().clear();
				return;
			case QcmPackage.QUESTIONNAIRE__TAGS:
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
			case QcmPackage.QUESTIONNAIRE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case QcmPackage.QUESTIONNAIRE__SHUFFLE_QUESTIONS:
				return shuffleQuestions != SHUFFLE_QUESTIONS_EDEFAULT;
			case QcmPackage.QUESTIONNAIRE__ALLOW_BACK:
				return allowBack != ALLOW_BACK_EDEFAULT;
			case QcmPackage.QUESTIONNAIRE__QUESTIONS:
				return questions != null && !questions.isEmpty();
			case QcmPackage.QUESTIONNAIRE__TAGS:
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (title: ");
		result.append(title);
		result.append(", shuffleQuestions: ");
		result.append(shuffleQuestions);
		result.append(", allowBack: ");
		result.append(allowBack);
		result.append(')');
		return result.toString();
	}

} //QuestionnaireImpl
