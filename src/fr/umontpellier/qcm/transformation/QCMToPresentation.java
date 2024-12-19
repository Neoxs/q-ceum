package fr.umontpellier.qcm.transformation;

import qcm.*;
import qcmpresentation.*;
import qcmpresentation.impl.QcmpresentationFactoryImpl;

public class QCMToPresentation {
    private final QcmpresentationFactory presentationFactory;
    
    public QCMToPresentation() {
        this.presentationFactory = QcmpresentationFactoryImpl.eINSTANCE;
    }
    
    public QuestionnairePresentation transform(Questionnaire questionnaire) {
        // Create main presentation container
        QuestionnairePresentation presentation = presentationFactory.createQuestionnairePresentation();
        
        // Copy basic properties
        presentation.setTitle(questionnaire.getTitle());
        presentation.setEnableBackNavigation(questionnaire.isAllowBack());
        presentation.setShowProgressBar(true);  // Default setting
        
        // Transform each question into a page
        for (Question question : questionnaire.getQuestions()) {
            QuestionPage page = transformQuestion(question);
            presentation.getPages().add(page);
        }
        
        // Create result page
        ResultPage resultPage = presentationFactory.createResultPage();
        resultPage.setHeader("Quiz Results");
        resultPage.setShowDetailedFeedback(true);
        resultPage.setShowCorrectAnswers(true);
        resultPage.setScoreDisplay(ScoreDisplayType.PERCENTAGE);
        presentation.setResultPage(resultPage);
        
        return presentation;
    }
    
    private QuestionPage transformQuestion(Question question) {
        QuestionPage page = presentationFactory.createQuestionPage();
        
        // Set basic properties
        page.setQuestionText(question.getText());
        page.setHeader("Question");  // Can be customized
        page.setDifficultyDisplay("Difficulty: " + question.getDifficulty());
        
        // Set question type
        page.setMultipleChoice(question instanceof MultipleChoiceQuestion);
        
        // Transform answers
        for (Answer answer : question.getAnswers()) {
            AnswerOption option = transformAnswer(answer, page.isMultipleChoice());
            page.getOptions().add(option);
        }
        
        return page;
    }
    
    private AnswerOption transformAnswer(Answer answer, boolean isMultipleChoice) {
        AnswerOption option = presentationFactory.createAnswerOption();
        option.setText(answer.getText());
        option.setCorrect(answer.isIsCorrect());
        option.setInputType(isMultipleChoice ? InputType.CHECKBOX : InputType.RADIO);
        return option;
    }
}