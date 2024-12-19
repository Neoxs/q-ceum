package fr.umontpellier.qcm.transformation;

import qcm.*;
import qcm.impl.QcmFactoryImpl;
import qcmpresentation.*;

public class TransformationTest {
    public static void main(String[] args) {
        // Create a sample questionnaire
        QcmFactory factory = QcmFactoryImpl.eINSTANCE;
        
        Questionnaire questionnaire = factory.createQuestionnaire();
        questionnaire.setTitle("Test Quiz");
        questionnaire.setAllowBack(true);
        
        // Create a single choice question
        SingleChoiceQuestion q1 = factory.createSingleChoiceQuestion();
        q1.setText("What is the capital of France?");
        q1.setDifficulty(DifficultyLevel.LEVEL_2);
        
        Answer a1 = factory.createAnswer();
        a1.setText("Paris");
        a1.setIsCorrect(true);
        q1.getAnswers().add(a1);
        
        Answer a2 = factory.createAnswer();
        a2.setText("London");
        a2.setIsCorrect(false);
        q1.getAnswers().add(a2);
        
        questionnaire.getQuestions().add(q1);
        
        // Transform the questionnaire
        QCMToPresentation transformer = new QCMToPresentation();
        QuestionnairePresentation presentation = transformer.transform(questionnaire);
        
        // Verify the transformation
        System.out.println("Title: " + presentation.getTitle());
        System.out.println("Number of pages: " + presentation.getPages().size());
        for (QuestionPage page : presentation.getPages()) {
            System.out.println("Question: " + page.getQuestionText());
            System.out.println("Multiple choice: " + page.isMultipleChoice());
            for (AnswerOption option : page.getOptions()) {
                System.out.println("  - " + option.getText() + 
                                 " (correct: " + option.isCorrect() + 
                                 ", type: " + option.getInputType() + ")");
            }
        }
    }
}