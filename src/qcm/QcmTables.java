/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /fr.umontpellier.qcm.model/model/qcm.ecore
 * using:
 *   /fr.umontpellier.qcm.model/model/qcm.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package qcm;

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
// import qcm.QcmPackage;
// import qcm.QcmTables;

/**
 * QcmTables provides the dispatch tables for the qcm for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class QcmTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(QcmPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_example_org_s_qcm = IdManager.getNsURIPackageId("http://www.example.org/qcm", null, QcmPackage.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_Answer = QcmTables.PACKid_http_c_s_s_www_example_org_s_qcm.getClassId("Answer", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_MultipleChoiceQuestion = QcmTables.PACKid_http_c_s_s_www_example_org_s_qcm.getClassId("MultipleChoiceQuestion", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Question = QcmTables.PACKid_http_c_s_s_www_example_org_s_qcm.getClassId("Question", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Questionnaire = QcmTables.PACKid_http_c_s_s_www_example_org_s_qcm.getClassId("Questionnaire", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_SingleChoiceQuestion = QcmTables.PACKid_http_c_s_s_www_example_org_s_qcm.getClassId("SingleChoiceQuestion", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Tag = QcmTables.PACKid_http_c_s_s_www_example_org_s_qcm.getClassId("Tag", 0);
	public static final /*@NonInvalid*/ EnumerationId ENUMid_DifficultyLevel = QcmTables.PACKid_http_c_s_s_www_example_org_s_qcm.getEnumerationId("DifficultyLevel");
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ IntegerValue INT_1 = ValueUtil.integerValueOf("1");
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Question = TypeId.BAG.getSpecializedId(QcmTables.CLSSid_Question, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Tag = TypeId.BAG.getSpecializedId(QcmTables.CLSSid_Tag, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_LEVEL_1 = QcmTables.ENUMid_DifficultyLevel.getEnumerationLiteralId("LEVEL_1");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_LEVEL_2 = QcmTables.ENUMid_DifficultyLevel.getEnumerationLiteralId("LEVEL_2");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_LEVEL_3 = QcmTables.ENUMid_DifficultyLevel.getEnumerationLiteralId("LEVEL_3");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_LEVEL_4 = QcmTables.ENUMid_DifficultyLevel.getEnumerationLiteralId("LEVEL_4");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_LEVEL_5 = QcmTables.ENUMid_DifficultyLevel.getEnumerationLiteralId("LEVEL_5");
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Answer = TypeId.ORDERED_SET.getSpecializedId(QcmTables.CLSSid_Answer, true, ValueUtil.integerValueOf(2), ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Answer_0 = TypeId.ORDERED_SET.getSpecializedId(QcmTables.CLSSid_Answer, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Question = TypeId.ORDERED_SET.getSpecializedId(QcmTables.CLSSid_Question, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Tag = TypeId.ORDERED_SET.getSpecializedId(QcmTables.CLSSid_Tag, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			QcmTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of QcmTables::TypeParameters and all preceding sub-packages.
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

		public static final EcoreExecutorType _Answer = new EcoreExecutorType(QcmPackage.Literals.ANSWER, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _DifficultyLevel = new EcoreExecutorEnumeration(QcmPackage.Literals.DIFFICULTY_LEVEL, PACKAGE, 0);
		public static final EcoreExecutorType _MultipleChoiceQuestion = new EcoreExecutorType(QcmPackage.Literals.MULTIPLE_CHOICE_QUESTION, PACKAGE, 0);
		public static final EcoreExecutorType _Question = new EcoreExecutorType(QcmPackage.Literals.QUESTION, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _Questionnaire = new EcoreExecutorType(QcmPackage.Literals.QUESTIONNAIRE, PACKAGE, 0);
		public static final EcoreExecutorType _SingleChoiceQuestion = new EcoreExecutorType(QcmPackage.Literals.SINGLE_CHOICE_QUESTION, PACKAGE, 0);
		public static final EcoreExecutorType _Tag = new EcoreExecutorType(QcmPackage.Literals.TAG, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_Answer,
			_DifficultyLevel,
			_MultipleChoiceQuestion,
			_Question,
			_Questionnaire,
			_SingleChoiceQuestion,
			_Tag
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of QcmTables::Types and all preceding sub-packages.
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

		private static final ExecutorFragment _Answer__Answer = new ExecutorFragment(Types._Answer, QcmTables.Types._Answer);
		private static final ExecutorFragment _Answer__OclAny = new ExecutorFragment(Types._Answer, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Answer__OclElement = new ExecutorFragment(Types._Answer, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _DifficultyLevel__DifficultyLevel = new ExecutorFragment(Types._DifficultyLevel, QcmTables.Types._DifficultyLevel);
		private static final ExecutorFragment _DifficultyLevel__OclAny = new ExecutorFragment(Types._DifficultyLevel, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _DifficultyLevel__OclElement = new ExecutorFragment(Types._DifficultyLevel, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _DifficultyLevel__OclEnumeration = new ExecutorFragment(Types._DifficultyLevel, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _DifficultyLevel__OclType = new ExecutorFragment(Types._DifficultyLevel, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _MultipleChoiceQuestion__MultipleChoiceQuestion = new ExecutorFragment(Types._MultipleChoiceQuestion, QcmTables.Types._MultipleChoiceQuestion);
		private static final ExecutorFragment _MultipleChoiceQuestion__OclAny = new ExecutorFragment(Types._MultipleChoiceQuestion, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _MultipleChoiceQuestion__OclElement = new ExecutorFragment(Types._MultipleChoiceQuestion, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _MultipleChoiceQuestion__Question = new ExecutorFragment(Types._MultipleChoiceQuestion, QcmTables.Types._Question);

		private static final ExecutorFragment _Question__OclAny = new ExecutorFragment(Types._Question, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Question__OclElement = new ExecutorFragment(Types._Question, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Question__Question = new ExecutorFragment(Types._Question, QcmTables.Types._Question);

		private static final ExecutorFragment _Questionnaire__OclAny = new ExecutorFragment(Types._Questionnaire, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Questionnaire__OclElement = new ExecutorFragment(Types._Questionnaire, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Questionnaire__Questionnaire = new ExecutorFragment(Types._Questionnaire, QcmTables.Types._Questionnaire);

		private static final ExecutorFragment _SingleChoiceQuestion__OclAny = new ExecutorFragment(Types._SingleChoiceQuestion, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _SingleChoiceQuestion__OclElement = new ExecutorFragment(Types._SingleChoiceQuestion, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _SingleChoiceQuestion__Question = new ExecutorFragment(Types._SingleChoiceQuestion, QcmTables.Types._Question);
		private static final ExecutorFragment _SingleChoiceQuestion__SingleChoiceQuestion = new ExecutorFragment(Types._SingleChoiceQuestion, QcmTables.Types._SingleChoiceQuestion);

		private static final ExecutorFragment _Tag__OclAny = new ExecutorFragment(Types._Tag, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Tag__OclElement = new ExecutorFragment(Types._Tag, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Tag__Tag = new ExecutorFragment(Types._Tag, QcmTables.Types._Tag);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of QcmTables::Fragments and all preceding sub-packages.
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
		 * Force initialization of the fields of QcmTables::Parameters and all preceding sub-packages.
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
		 * Force initialization of the fields of QcmTables::Operations and all preceding sub-packages.
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

		public static final ExecutorProperty _Answer__isCorrect = new EcoreExecutorProperty(QcmPackage.Literals.ANSWER__IS_CORRECT, Types._Answer, 0);
		public static final ExecutorProperty _Answer__text = new EcoreExecutorProperty(QcmPackage.Literals.ANSWER__TEXT, Types._Answer, 1);
		public static final ExecutorProperty _Answer__Question__answers = new ExecutorPropertyWithImplementation("Question", Types._Answer, 2, new EcoreLibraryOppositeProperty(QcmPackage.Literals.QUESTION__ANSWERS));

		public static final ExecutorProperty _Question__answers = new EcoreExecutorProperty(QcmPackage.Literals.QUESTION__ANSWERS, Types._Question, 0);
		public static final ExecutorProperty _Question__difficulty = new EcoreExecutorProperty(QcmPackage.Literals.QUESTION__DIFFICULTY, Types._Question, 1);
		public static final ExecutorProperty _Question__tags = new EcoreExecutorProperty(QcmPackage.Literals.QUESTION__TAGS, Types._Question, 2);
		public static final ExecutorProperty _Question__text = new EcoreExecutorProperty(QcmPackage.Literals.QUESTION__TEXT, Types._Question, 3);
		public static final ExecutorProperty _Question__Questionnaire__questions = new ExecutorPropertyWithImplementation("Questionnaire", Types._Question, 4, new EcoreLibraryOppositeProperty(QcmPackage.Literals.QUESTIONNAIRE__QUESTIONS));

		public static final ExecutorProperty _Questionnaire__allowBack = new EcoreExecutorProperty(QcmPackage.Literals.QUESTIONNAIRE__ALLOW_BACK, Types._Questionnaire, 0);
		public static final ExecutorProperty _Questionnaire__questions = new EcoreExecutorProperty(QcmPackage.Literals.QUESTIONNAIRE__QUESTIONS, Types._Questionnaire, 1);
		public static final ExecutorProperty _Questionnaire__shuffleQuestions = new EcoreExecutorProperty(QcmPackage.Literals.QUESTIONNAIRE__SHUFFLE_QUESTIONS, Types._Questionnaire, 2);
		public static final ExecutorProperty _Questionnaire__tags = new EcoreExecutorProperty(QcmPackage.Literals.QUESTIONNAIRE__TAGS, Types._Questionnaire, 3);
		public static final ExecutorProperty _Questionnaire__title = new EcoreExecutorProperty(QcmPackage.Literals.QUESTIONNAIRE__TITLE, Types._Questionnaire, 4);

		public static final ExecutorProperty _Tag__name = new EcoreExecutorProperty(QcmPackage.Literals.TAG__NAME, Types._Tag, 0);
		public static final ExecutorProperty _Tag__parent = new EcoreExecutorProperty(QcmPackage.Literals.TAG__PARENT, Types._Tag, 1);
		public static final ExecutorProperty _Tag__Question__tags = new ExecutorPropertyWithImplementation("Question", Types._Tag, 2, new EcoreLibraryOppositeProperty(QcmPackage.Literals.QUESTION__TAGS));
		public static final ExecutorProperty _Tag__Questionnaire__tags = new ExecutorPropertyWithImplementation("Questionnaire", Types._Tag, 3, new EcoreLibraryOppositeProperty(QcmPackage.Literals.QUESTIONNAIRE__TAGS));
		public static final ExecutorProperty _Tag__Tag__parent = new ExecutorPropertyWithImplementation("Tag", Types._Tag, 4, new EcoreLibraryOppositeProperty(QcmPackage.Literals.TAG__PARENT));
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of QcmTables::Properties and all preceding sub-packages.
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

		private static final ExecutorFragment /*@NonNull*/ [] _Answer =
			{
				Fragments._Answer__OclAny /* 0 */,
				Fragments._Answer__OclElement /* 1 */,
				Fragments._Answer__Answer /* 2 */
			};
		private static final int /*@NonNull*/ [] __Answer = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _DifficultyLevel =
			{
				Fragments._DifficultyLevel__OclAny /* 0 */,
				Fragments._DifficultyLevel__OclElement /* 1 */,
				Fragments._DifficultyLevel__OclType /* 2 */,
				Fragments._DifficultyLevel__OclEnumeration /* 3 */,
				Fragments._DifficultyLevel__DifficultyLevel /* 4 */
			};
		private static final int /*@NonNull*/ [] __DifficultyLevel = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _MultipleChoiceQuestion =
			{
				Fragments._MultipleChoiceQuestion__OclAny /* 0 */,
				Fragments._MultipleChoiceQuestion__OclElement /* 1 */,
				Fragments._MultipleChoiceQuestion__Question /* 2 */,
				Fragments._MultipleChoiceQuestion__MultipleChoiceQuestion /* 3 */
			};
		private static final int /*@NonNull*/ [] __MultipleChoiceQuestion = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Question =
			{
				Fragments._Question__OclAny /* 0 */,
				Fragments._Question__OclElement /* 1 */,
				Fragments._Question__Question /* 2 */
			};
		private static final int /*@NonNull*/ [] __Question = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Questionnaire =
			{
				Fragments._Questionnaire__OclAny /* 0 */,
				Fragments._Questionnaire__OclElement /* 1 */,
				Fragments._Questionnaire__Questionnaire /* 2 */
			};
		private static final int /*@NonNull*/ [] __Questionnaire = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _SingleChoiceQuestion =
			{
				Fragments._SingleChoiceQuestion__OclAny /* 0 */,
				Fragments._SingleChoiceQuestion__OclElement /* 1 */,
				Fragments._SingleChoiceQuestion__Question /* 2 */,
				Fragments._SingleChoiceQuestion__SingleChoiceQuestion /* 3 */
			};
		private static final int /*@NonNull*/ [] __SingleChoiceQuestion = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Tag =
			{
				Fragments._Tag__OclAny /* 0 */,
				Fragments._Tag__OclElement /* 1 */,
				Fragments._Tag__Tag /* 2 */
			};
		private static final int /*@NonNull*/ [] __Tag = { 1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Answer.initFragments(_Answer, __Answer);
			Types._DifficultyLevel.initFragments(_DifficultyLevel, __DifficultyLevel);
			Types._MultipleChoiceQuestion.initFragments(_MultipleChoiceQuestion, __MultipleChoiceQuestion);
			Types._Question.initFragments(_Question, __Question);
			Types._Questionnaire.initFragments(_Questionnaire, __Questionnaire);
			Types._SingleChoiceQuestion.initFragments(_SingleChoiceQuestion, __SingleChoiceQuestion);
			Types._Tag.initFragments(_Tag, __Tag);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of QcmTables::TypeFragments and all preceding sub-packages.
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

		private static final ExecutorOperation /*@NonNull*/ [] _Answer__Answer = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Answer__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _Answer__OclElement = {
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

		private static final ExecutorOperation /*@NonNull*/ [] _DifficultyLevel__DifficultyLevel = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DifficultyLevel__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _DifficultyLevel__OclElement = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _DifficultyLevel__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DifficultyLevel__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _MultipleChoiceQuestion__MultipleChoiceQuestion = {};
		private static final ExecutorOperation /*@NonNull*/ [] _MultipleChoiceQuestion__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _MultipleChoiceQuestion__OclElement = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _MultipleChoiceQuestion__Question = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Question__Question = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Question__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _Question__OclElement = {
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

		private static final ExecutorOperation /*@NonNull*/ [] _Questionnaire__Questionnaire = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Questionnaire__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _Questionnaire__OclElement = {
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

		private static final ExecutorOperation /*@NonNull*/ [] _SingleChoiceQuestion__SingleChoiceQuestion = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SingleChoiceQuestion__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _SingleChoiceQuestion__OclElement = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _SingleChoiceQuestion__Question = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Tag__Tag = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Tag__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _Tag__OclElement = {
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

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Answer__Answer.initOperations(_Answer__Answer);
			Fragments._Answer__OclAny.initOperations(_Answer__OclAny);
			Fragments._Answer__OclElement.initOperations(_Answer__OclElement);

			Fragments._DifficultyLevel__DifficultyLevel.initOperations(_DifficultyLevel__DifficultyLevel);
			Fragments._DifficultyLevel__OclAny.initOperations(_DifficultyLevel__OclAny);
			Fragments._DifficultyLevel__OclElement.initOperations(_DifficultyLevel__OclElement);
			Fragments._DifficultyLevel__OclEnumeration.initOperations(_DifficultyLevel__OclEnumeration);
			Fragments._DifficultyLevel__OclType.initOperations(_DifficultyLevel__OclType);

			Fragments._MultipleChoiceQuestion__MultipleChoiceQuestion.initOperations(_MultipleChoiceQuestion__MultipleChoiceQuestion);
			Fragments._MultipleChoiceQuestion__OclAny.initOperations(_MultipleChoiceQuestion__OclAny);
			Fragments._MultipleChoiceQuestion__OclElement.initOperations(_MultipleChoiceQuestion__OclElement);
			Fragments._MultipleChoiceQuestion__Question.initOperations(_MultipleChoiceQuestion__Question);

			Fragments._Question__OclAny.initOperations(_Question__OclAny);
			Fragments._Question__OclElement.initOperations(_Question__OclElement);
			Fragments._Question__Question.initOperations(_Question__Question);

			Fragments._Questionnaire__OclAny.initOperations(_Questionnaire__OclAny);
			Fragments._Questionnaire__OclElement.initOperations(_Questionnaire__OclElement);
			Fragments._Questionnaire__Questionnaire.initOperations(_Questionnaire__Questionnaire);

			Fragments._SingleChoiceQuestion__OclAny.initOperations(_SingleChoiceQuestion__OclAny);
			Fragments._SingleChoiceQuestion__OclElement.initOperations(_SingleChoiceQuestion__OclElement);
			Fragments._SingleChoiceQuestion__Question.initOperations(_SingleChoiceQuestion__Question);
			Fragments._SingleChoiceQuestion__SingleChoiceQuestion.initOperations(_SingleChoiceQuestion__SingleChoiceQuestion);

			Fragments._Tag__OclAny.initOperations(_Tag__OclAny);
			Fragments._Tag__OclElement.initOperations(_Tag__OclElement);
			Fragments._Tag__Tag.initOperations(_Tag__Tag);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of QcmTables::FragmentOperations and all preceding sub-packages.
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

		private static final ExecutorProperty /*@NonNull*/ [] _Answer = {
			QcmTables.Properties._Answer__isCorrect,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			QcmTables.Properties._Answer__text
		};

		private static final ExecutorProperty /*@NonNull*/ [] _DifficultyLevel = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _MultipleChoiceQuestion = {
			QcmTables.Properties._Question__answers,
			QcmTables.Properties._Question__difficulty,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			QcmTables.Properties._Question__tags,
			QcmTables.Properties._Question__text
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Question = {
			QcmTables.Properties._Question__answers,
			QcmTables.Properties._Question__difficulty,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			QcmTables.Properties._Question__tags,
			QcmTables.Properties._Question__text
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Questionnaire = {
			QcmTables.Properties._Questionnaire__allowBack,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			QcmTables.Properties._Questionnaire__questions,
			QcmTables.Properties._Questionnaire__shuffleQuestions,
			QcmTables.Properties._Questionnaire__tags,
			QcmTables.Properties._Questionnaire__title
		};

		private static final ExecutorProperty /*@NonNull*/ [] _SingleChoiceQuestion = {
			QcmTables.Properties._Question__answers,
			QcmTables.Properties._Question__difficulty,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			QcmTables.Properties._Question__tags,
			QcmTables.Properties._Question__text
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Tag = {
			QcmTables.Properties._Tag__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			QcmTables.Properties._Tag__parent
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Answer__Answer.initProperties(_Answer);
			Fragments._DifficultyLevel__DifficultyLevel.initProperties(_DifficultyLevel);
			Fragments._MultipleChoiceQuestion__MultipleChoiceQuestion.initProperties(_MultipleChoiceQuestion);
			Fragments._Question__Question.initProperties(_Question);
			Fragments._Questionnaire__Questionnaire.initProperties(_Questionnaire);
			Fragments._SingleChoiceQuestion__SingleChoiceQuestion.initProperties(_SingleChoiceQuestion);
			Fragments._Tag__Tag.initProperties(_Tag);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of QcmTables::FragmentProperties and all preceding sub-packages.
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

		public static final EcoreExecutorEnumerationLiteral _DifficultyLevel__LEVEL_1 = new EcoreExecutorEnumerationLiteral(QcmPackage.Literals.DIFFICULTY_LEVEL.getEEnumLiteral("LEVEL_1"), Types._DifficultyLevel, 0);
		public static final EcoreExecutorEnumerationLiteral _DifficultyLevel__LEVEL_2 = new EcoreExecutorEnumerationLiteral(QcmPackage.Literals.DIFFICULTY_LEVEL.getEEnumLiteral("LEVEL_2"), Types._DifficultyLevel, 1);
		public static final EcoreExecutorEnumerationLiteral _DifficultyLevel__LEVEL_3 = new EcoreExecutorEnumerationLiteral(QcmPackage.Literals.DIFFICULTY_LEVEL.getEEnumLiteral("LEVEL_3"), Types._DifficultyLevel, 2);
		public static final EcoreExecutorEnumerationLiteral _DifficultyLevel__LEVEL_4 = new EcoreExecutorEnumerationLiteral(QcmPackage.Literals.DIFFICULTY_LEVEL.getEEnumLiteral("LEVEL_4"), Types._DifficultyLevel, 3);
		public static final EcoreExecutorEnumerationLiteral _DifficultyLevel__LEVEL_5 = new EcoreExecutorEnumerationLiteral(QcmPackage.Literals.DIFFICULTY_LEVEL.getEEnumLiteral("LEVEL_5"), Types._DifficultyLevel, 4);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _DifficultyLevel = {
			_DifficultyLevel__LEVEL_1,
			_DifficultyLevel__LEVEL_2,
			_DifficultyLevel__LEVEL_3,
			_DifficultyLevel__LEVEL_4,
			_DifficultyLevel__LEVEL_5
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types._DifficultyLevel.initLiterals(_DifficultyLevel);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of QcmTables::EnumerationLiterals and all preceding sub-packages.
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
		new QcmTables();
	}

	private QcmTables() {
		super(QcmPackage.eNS_URI);
	}
}
