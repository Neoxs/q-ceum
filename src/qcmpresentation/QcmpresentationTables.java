/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /fr.umontpellier.qcm.model/model/qcm.presentation.ecore
 * using:
 *   /fr.umontpellier.qcm.model/model/qcm.presentation.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package qcmpresentation;

import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.EnumerationId;
import org.eclipse.ocl.pivot.ids.EnumerationLiteralId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumeration;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumerationLiteral;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorType;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
// import qcmpresentation.QcmpresentationPackage;
// import qcmpresentation.QcmpresentationTables;

/**
 * QcmpresentationTables provides the dispatch tables for the qcmpresentation for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class QcmpresentationTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(QcmpresentationPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_example_org_s_qcmpresentation = IdManager.getNsURIPackageId("http://www.example.org/qcmpresentation", null, QcmpresentationPackage.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_AnswerOption = QcmpresentationTables.PACKid_http_c_s_s_www_example_org_s_qcmpresentation.getClassId("AnswerOption", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Page = QcmpresentationTables.PACKid_http_c_s_s_www_example_org_s_qcmpresentation.getClassId("Page", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_QuestionPage = QcmpresentationTables.PACKid_http_c_s_s_www_example_org_s_qcmpresentation.getClassId("QuestionPage", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_QuestionnairePresentation = QcmpresentationTables.PACKid_http_c_s_s_www_example_org_s_qcmpresentation.getClassId("QuestionnairePresentation", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ResultPage = QcmpresentationTables.PACKid_http_c_s_s_www_example_org_s_qcmpresentation.getClassId("ResultPage", 0);
	public static final /*@NonInvalid*/ EnumerationId ENUMid_InputType = QcmpresentationTables.PACKid_http_c_s_s_www_example_org_s_qcmpresentation.getEnumerationId("InputType");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_ScoreDisplayType = QcmpresentationTables.PACKid_http_c_s_s_www_example_org_s_qcmpresentation.getEnumerationId("ScoreDisplayType");
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ IntegerValue INT_2 = ValueUtil.integerValueOf("2");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_CHECKBOX = QcmpresentationTables.ENUMid_InputType.getEnumerationLiteralId("CHECKBOX");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_RADIO = QcmpresentationTables.ENUMid_InputType.getEnumerationLiteralId("RADIO");
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_AnswerOption = TypeId.ORDERED_SET.getSpecializedId(QcmpresentationTables.CLSSid_AnswerOption, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_QuestionPage = TypeId.ORDERED_SET.getSpecializedId(QcmpresentationTables.CLSSid_QuestionPage, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			QcmpresentationTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of QcmpresentationTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorType _AnswerOption = new EcoreExecutorType(QcmpresentationPackage.Literals.ANSWER_OPTION, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _InputType = new EcoreExecutorEnumeration(QcmpresentationPackage.Literals.INPUT_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _Page = new EcoreExecutorType(QcmpresentationPackage.Literals.PAGE, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _QuestionPage = new EcoreExecutorType(QcmpresentationPackage.Literals.QUESTION_PAGE, PACKAGE, 0);
		public static final EcoreExecutorType _QuestionnairePresentation = new EcoreExecutorType(QcmpresentationPackage.Literals.QUESTIONNAIRE_PRESENTATION, PACKAGE, 0);
		public static final EcoreExecutorType _ResultPage = new EcoreExecutorType(QcmpresentationPackage.Literals.RESULT_PAGE, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _ScoreDisplayType = new EcoreExecutorEnumeration(QcmpresentationPackage.Literals.SCORE_DISPLAY_TYPE, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_AnswerOption,
			_InputType,
			_Page,
			_QuestionPage,
			_QuestionnairePresentation,
			_ResultPage,
			_ScoreDisplayType
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of QcmpresentationTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _AnswerOption__AnswerOption = new ExecutorFragment(Types._AnswerOption, QcmpresentationTables.Types._AnswerOption);
		private static final ExecutorFragment _AnswerOption__OclAny = new ExecutorFragment(Types._AnswerOption, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _AnswerOption__OclElement = new ExecutorFragment(Types._AnswerOption, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _InputType__InputType = new ExecutorFragment(Types._InputType, QcmpresentationTables.Types._InputType);
		private static final ExecutorFragment _InputType__OclAny = new ExecutorFragment(Types._InputType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _InputType__OclElement = new ExecutorFragment(Types._InputType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _InputType__OclEnumeration = new ExecutorFragment(Types._InputType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _InputType__OclType = new ExecutorFragment(Types._InputType, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _Page__OclAny = new ExecutorFragment(Types._Page, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Page__OclElement = new ExecutorFragment(Types._Page, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Page__Page = new ExecutorFragment(Types._Page, QcmpresentationTables.Types._Page);

		private static final ExecutorFragment _QuestionPage__OclAny = new ExecutorFragment(Types._QuestionPage, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _QuestionPage__OclElement = new ExecutorFragment(Types._QuestionPage, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _QuestionPage__Page = new ExecutorFragment(Types._QuestionPage, QcmpresentationTables.Types._Page);
		private static final ExecutorFragment _QuestionPage__QuestionPage = new ExecutorFragment(Types._QuestionPage, QcmpresentationTables.Types._QuestionPage);

		private static final ExecutorFragment _QuestionnairePresentation__OclAny = new ExecutorFragment(Types._QuestionnairePresentation, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _QuestionnairePresentation__OclElement = new ExecutorFragment(Types._QuestionnairePresentation, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _QuestionnairePresentation__QuestionnairePresentation = new ExecutorFragment(Types._QuestionnairePresentation, QcmpresentationTables.Types._QuestionnairePresentation);

		private static final ExecutorFragment _ResultPage__OclAny = new ExecutorFragment(Types._ResultPage, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ResultPage__OclElement = new ExecutorFragment(Types._ResultPage, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _ResultPage__Page = new ExecutorFragment(Types._ResultPage, QcmpresentationTables.Types._Page);
		private static final ExecutorFragment _ResultPage__ResultPage = new ExecutorFragment(Types._ResultPage, QcmpresentationTables.Types._ResultPage);

		private static final ExecutorFragment _ScoreDisplayType__OclAny = new ExecutorFragment(Types._ScoreDisplayType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ScoreDisplayType__OclElement = new ExecutorFragment(Types._ScoreDisplayType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _ScoreDisplayType__OclEnumeration = new ExecutorFragment(Types._ScoreDisplayType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _ScoreDisplayType__OclType = new ExecutorFragment(Types._ScoreDisplayType, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _ScoreDisplayType__ScoreDisplayType = new ExecutorFragment(Types._ScoreDisplayType, QcmpresentationTables.Types._ScoreDisplayType);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of QcmpresentationTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of QcmpresentationTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of QcmpresentationTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final ExecutorProperty _AnswerOption__correct = new EcoreExecutorProperty(QcmpresentationPackage.Literals.ANSWER_OPTION__CORRECT, Types._AnswerOption, 0);
		public static final ExecutorProperty _AnswerOption__inputType = new EcoreExecutorProperty(QcmpresentationPackage.Literals.ANSWER_OPTION__INPUT_TYPE, Types._AnswerOption, 1);
		public static final ExecutorProperty _AnswerOption__text = new EcoreExecutorProperty(QcmpresentationPackage.Literals.ANSWER_OPTION__TEXT, Types._AnswerOption, 2);
		public static final ExecutorProperty _AnswerOption__QuestionPage__options = new ExecutorPropertyWithImplementation("QuestionPage", Types._AnswerOption, 3, new EcoreLibraryOppositeProperty(QcmpresentationPackage.Literals.QUESTION_PAGE__OPTIONS));

		public static final ExecutorProperty _Page__cssClass = new EcoreExecutorProperty(QcmpresentationPackage.Literals.PAGE__CSS_CLASS, Types._Page, 0);
		public static final ExecutorProperty _Page__header = new EcoreExecutorProperty(QcmpresentationPackage.Literals.PAGE__HEADER, Types._Page, 1);

		public static final ExecutorProperty _QuestionPage__difficultyDisplay = new EcoreExecutorProperty(QcmpresentationPackage.Literals.QUESTION_PAGE__DIFFICULTY_DISPLAY, Types._QuestionPage, 0);
		public static final ExecutorProperty _QuestionPage__multipleChoice = new EcoreExecutorProperty(QcmpresentationPackage.Literals.QUESTION_PAGE__MULTIPLE_CHOICE, Types._QuestionPage, 1);
		public static final ExecutorProperty _QuestionPage__options = new EcoreExecutorProperty(QcmpresentationPackage.Literals.QUESTION_PAGE__OPTIONS, Types._QuestionPage, 2);
		public static final ExecutorProperty _QuestionPage__questionText = new EcoreExecutorProperty(QcmpresentationPackage.Literals.QUESTION_PAGE__QUESTION_TEXT, Types._QuestionPage, 3);
		public static final ExecutorProperty _QuestionPage__QuestionnairePresentation__pages = new ExecutorPropertyWithImplementation("QuestionnairePresentation", Types._QuestionPage, 4, new EcoreLibraryOppositeProperty(QcmpresentationPackage.Literals.QUESTIONNAIRE_PRESENTATION__PAGES));

		public static final ExecutorProperty _QuestionnairePresentation__enableBackNavigation = new EcoreExecutorProperty(QcmpresentationPackage.Literals.QUESTIONNAIRE_PRESENTATION__ENABLE_BACK_NAVIGATION, Types._QuestionnairePresentation, 0);
		public static final ExecutorProperty _QuestionnairePresentation__pages = new EcoreExecutorProperty(QcmpresentationPackage.Literals.QUESTIONNAIRE_PRESENTATION__PAGES, Types._QuestionnairePresentation, 1);
		public static final ExecutorProperty _QuestionnairePresentation__resultPage = new EcoreExecutorProperty(QcmpresentationPackage.Literals.QUESTIONNAIRE_PRESENTATION__RESULT_PAGE, Types._QuestionnairePresentation, 2);
		public static final ExecutorProperty _QuestionnairePresentation__showProgressBar = new EcoreExecutorProperty(QcmpresentationPackage.Literals.QUESTIONNAIRE_PRESENTATION__SHOW_PROGRESS_BAR, Types._QuestionnairePresentation, 3);
		public static final ExecutorProperty _QuestionnairePresentation__title = new EcoreExecutorProperty(QcmpresentationPackage.Literals.QUESTIONNAIRE_PRESENTATION__TITLE, Types._QuestionnairePresentation, 4);

		public static final ExecutorProperty _ResultPage__scoreDisplay = new EcoreExecutorProperty(QcmpresentationPackage.Literals.RESULT_PAGE__SCORE_DISPLAY, Types._ResultPage, 0);
		public static final ExecutorProperty _ResultPage__showCorrectAnswers = new EcoreExecutorProperty(QcmpresentationPackage.Literals.RESULT_PAGE__SHOW_CORRECT_ANSWERS, Types._ResultPage, 1);
		public static final ExecutorProperty _ResultPage__showDetailedFeedback = new EcoreExecutorProperty(QcmpresentationPackage.Literals.RESULT_PAGE__SHOW_DETAILED_FEEDBACK, Types._ResultPage, 2);
		public static final ExecutorProperty _ResultPage__QuestionnairePresentation__resultPage = new ExecutorPropertyWithImplementation("QuestionnairePresentation", Types._ResultPage, 3, new EcoreLibraryOppositeProperty(QcmpresentationPackage.Literals.QUESTIONNAIRE_PRESENTATION__RESULT_PAGE));
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of QcmpresentationTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _AnswerOption =
			{
				Fragments._AnswerOption__OclAny /* 0 */,
				Fragments._AnswerOption__OclElement /* 1 */,
				Fragments._AnswerOption__AnswerOption /* 2 */
			};
		private static final int /*@NonNull*/ [] __AnswerOption = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _InputType =
			{
				Fragments._InputType__OclAny /* 0 */,
				Fragments._InputType__OclElement /* 1 */,
				Fragments._InputType__OclType /* 2 */,
				Fragments._InputType__OclEnumeration /* 3 */,
				Fragments._InputType__InputType /* 4 */
			};
		private static final int /*@NonNull*/ [] __InputType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Page =
			{
				Fragments._Page__OclAny /* 0 */,
				Fragments._Page__OclElement /* 1 */,
				Fragments._Page__Page /* 2 */
			};
		private static final int /*@NonNull*/ [] __Page = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _QuestionPage =
			{
				Fragments._QuestionPage__OclAny /* 0 */,
				Fragments._QuestionPage__OclElement /* 1 */,
				Fragments._QuestionPage__Page /* 2 */,
				Fragments._QuestionPage__QuestionPage /* 3 */
			};
		private static final int /*@NonNull*/ [] __QuestionPage = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _QuestionnairePresentation =
			{
				Fragments._QuestionnairePresentation__OclAny /* 0 */,
				Fragments._QuestionnairePresentation__OclElement /* 1 */,
				Fragments._QuestionnairePresentation__QuestionnairePresentation /* 2 */
			};
		private static final int /*@NonNull*/ [] __QuestionnairePresentation = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ResultPage =
			{
				Fragments._ResultPage__OclAny /* 0 */,
				Fragments._ResultPage__OclElement /* 1 */,
				Fragments._ResultPage__Page /* 2 */,
				Fragments._ResultPage__ResultPage /* 3 */
			};
		private static final int /*@NonNull*/ [] __ResultPage = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ScoreDisplayType =
			{
				Fragments._ScoreDisplayType__OclAny /* 0 */,
				Fragments._ScoreDisplayType__OclElement /* 1 */,
				Fragments._ScoreDisplayType__OclType /* 2 */,
				Fragments._ScoreDisplayType__OclEnumeration /* 3 */,
				Fragments._ScoreDisplayType__ScoreDisplayType /* 4 */
			};
		private static final int /*@NonNull*/ [] __ScoreDisplayType = { 1,1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._AnswerOption.initFragments(_AnswerOption, __AnswerOption);
			Types._InputType.initFragments(_InputType, __InputType);
			Types._Page.initFragments(_Page, __Page);
			Types._QuestionPage.initFragments(_QuestionPage, __QuestionPage);
			Types._QuestionnairePresentation.initFragments(_QuestionnairePresentation, __QuestionnairePresentation);
			Types._ResultPage.initFragments(_ResultPage, __ResultPage);
			Types._ScoreDisplayType.initFragments(_ScoreDisplayType, __ScoreDisplayType);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of QcmpresentationTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _AnswerOption__AnswerOption = {};
		private static final ExecutorOperation /*@NonNull*/ [] _AnswerOption__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _AnswerOption__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _InputType__InputType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _InputType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _InputType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _InputType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _InputType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Page__Page = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Page__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Page__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _QuestionPage__QuestionPage = {};
		private static final ExecutorOperation /*@NonNull*/ [] _QuestionPage__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _QuestionPage__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _QuestionPage__Page = {};

		private static final ExecutorOperation /*@NonNull*/ [] _QuestionnairePresentation__QuestionnairePresentation = {};
		private static final ExecutorOperation /*@NonNull*/ [] _QuestionnairePresentation__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _QuestionnairePresentation__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ResultPage__ResultPage = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ResultPage__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ResultPage__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ResultPage__Page = {};

		private static final ExecutorOperation /*@NonNull*/ [] _ScoreDisplayType__ScoreDisplayType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ScoreDisplayType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ScoreDisplayType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ScoreDisplayType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ScoreDisplayType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._AnswerOption__AnswerOption.initOperations(_AnswerOption__AnswerOption);
			Fragments._AnswerOption__OclAny.initOperations(_AnswerOption__OclAny);
			Fragments._AnswerOption__OclElement.initOperations(_AnswerOption__OclElement);

			Fragments._InputType__InputType.initOperations(_InputType__InputType);
			Fragments._InputType__OclAny.initOperations(_InputType__OclAny);
			Fragments._InputType__OclElement.initOperations(_InputType__OclElement);
			Fragments._InputType__OclEnumeration.initOperations(_InputType__OclEnumeration);
			Fragments._InputType__OclType.initOperations(_InputType__OclType);

			Fragments._Page__OclAny.initOperations(_Page__OclAny);
			Fragments._Page__OclElement.initOperations(_Page__OclElement);
			Fragments._Page__Page.initOperations(_Page__Page);

			Fragments._QuestionPage__OclAny.initOperations(_QuestionPage__OclAny);
			Fragments._QuestionPage__OclElement.initOperations(_QuestionPage__OclElement);
			Fragments._QuestionPage__Page.initOperations(_QuestionPage__Page);
			Fragments._QuestionPage__QuestionPage.initOperations(_QuestionPage__QuestionPage);

			Fragments._QuestionnairePresentation__OclAny.initOperations(_QuestionnairePresentation__OclAny);
			Fragments._QuestionnairePresentation__OclElement.initOperations(_QuestionnairePresentation__OclElement);
			Fragments._QuestionnairePresentation__QuestionnairePresentation.initOperations(_QuestionnairePresentation__QuestionnairePresentation);

			Fragments._ResultPage__OclAny.initOperations(_ResultPage__OclAny);
			Fragments._ResultPage__OclElement.initOperations(_ResultPage__OclElement);
			Fragments._ResultPage__Page.initOperations(_ResultPage__Page);
			Fragments._ResultPage__ResultPage.initOperations(_ResultPage__ResultPage);

			Fragments._ScoreDisplayType__OclAny.initOperations(_ScoreDisplayType__OclAny);
			Fragments._ScoreDisplayType__OclElement.initOperations(_ScoreDisplayType__OclElement);
			Fragments._ScoreDisplayType__OclEnumeration.initOperations(_ScoreDisplayType__OclEnumeration);
			Fragments._ScoreDisplayType__OclType.initOperations(_ScoreDisplayType__OclType);
			Fragments._ScoreDisplayType__ScoreDisplayType.initOperations(_ScoreDisplayType__ScoreDisplayType);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of QcmpresentationTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _AnswerOption = {
			QcmpresentationTables.Properties._AnswerOption__correct,
			QcmpresentationTables.Properties._AnswerOption__inputType,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			QcmpresentationTables.Properties._AnswerOption__text
		};

		private static final ExecutorProperty /*@NonNull*/ [] _InputType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Page = {
			QcmpresentationTables.Properties._Page__cssClass,
			QcmpresentationTables.Properties._Page__header,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _QuestionPage = {
			QcmpresentationTables.Properties._Page__cssClass,
			QcmpresentationTables.Properties._QuestionPage__difficultyDisplay,
			QcmpresentationTables.Properties._Page__header,
			QcmpresentationTables.Properties._QuestionPage__multipleChoice,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			QcmpresentationTables.Properties._QuestionPage__options,
			QcmpresentationTables.Properties._QuestionPage__questionText
		};

		private static final ExecutorProperty /*@NonNull*/ [] _QuestionnairePresentation = {
			QcmpresentationTables.Properties._QuestionnairePresentation__enableBackNavigation,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			QcmpresentationTables.Properties._QuestionnairePresentation__pages,
			QcmpresentationTables.Properties._QuestionnairePresentation__resultPage,
			QcmpresentationTables.Properties._QuestionnairePresentation__showProgressBar,
			QcmpresentationTables.Properties._QuestionnairePresentation__title
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ResultPage = {
			QcmpresentationTables.Properties._Page__cssClass,
			QcmpresentationTables.Properties._Page__header,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			QcmpresentationTables.Properties._ResultPage__scoreDisplay,
			QcmpresentationTables.Properties._ResultPage__showCorrectAnswers,
			QcmpresentationTables.Properties._ResultPage__showDetailedFeedback
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ScoreDisplayType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._AnswerOption__AnswerOption.initProperties(_AnswerOption);
			Fragments._InputType__InputType.initProperties(_InputType);
			Fragments._Page__Page.initProperties(_Page);
			Fragments._QuestionPage__QuestionPage.initProperties(_QuestionPage);
			Fragments._QuestionnairePresentation__QuestionnairePresentation.initProperties(_QuestionnairePresentation);
			Fragments._ResultPage__ResultPage.initProperties(_ResultPage);
			Fragments._ScoreDisplayType__ScoreDisplayType.initProperties(_ScoreDisplayType);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of QcmpresentationTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		public static final EcoreExecutorEnumerationLiteral _InputType__RADIO = new EcoreExecutorEnumerationLiteral(QcmpresentationPackage.Literals.INPUT_TYPE.getEEnumLiteral("RADIO"), Types._InputType, 0);
		public static final EcoreExecutorEnumerationLiteral _InputType__CHECKBOX = new EcoreExecutorEnumerationLiteral(QcmpresentationPackage.Literals.INPUT_TYPE.getEEnumLiteral("CHECKBOX"), Types._InputType, 1);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _InputType = {
			_InputType__RADIO,
			_InputType__CHECKBOX
		};

		public static final EcoreExecutorEnumerationLiteral _ScoreDisplayType__PERCENTAGE = new EcoreExecutorEnumerationLiteral(QcmpresentationPackage.Literals.SCORE_DISPLAY_TYPE.getEEnumLiteral("PERCENTAGE"), Types._ScoreDisplayType, 0);
		public static final EcoreExecutorEnumerationLiteral _ScoreDisplayType__FRACTION = new EcoreExecutorEnumerationLiteral(QcmpresentationPackage.Literals.SCORE_DISPLAY_TYPE.getEEnumLiteral("FRACTION"), Types._ScoreDisplayType, 1);
		public static final EcoreExecutorEnumerationLiteral _ScoreDisplayType__SIMPLE_TEXT = new EcoreExecutorEnumerationLiteral(QcmpresentationPackage.Literals.SCORE_DISPLAY_TYPE.getEEnumLiteral("SIMPLE_TEXT"), Types._ScoreDisplayType, 2);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _ScoreDisplayType = {
			_ScoreDisplayType__PERCENTAGE,
			_ScoreDisplayType__FRACTION,
			_ScoreDisplayType__SIMPLE_TEXT
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types._InputType.initLiterals(_InputType);
			Types._ScoreDisplayType.initLiterals(_ScoreDisplayType);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of QcmpresentationTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new QcmpresentationTables();
	}

	private QcmpresentationTables() {
		super(QcmpresentationPackage.eNS_URI);
	}
}
