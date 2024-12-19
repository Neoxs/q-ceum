package fr.umontpellier.qcm.transformation;

import org.eclipse.emf.common.util.EList;  // Add this import
import qcm.*;
import qcmpresentation.*;
import qcmpresentation.impl.QcmpresentationFactoryImpl;

public class QCMToPresentation {
    private final QcmpresentationFactory presentationFactory;
    
    public QCMToPresentation() {
        this.presentationFactory = QcmpresentationFactoryImpl.eINSTANCE;
    }
    
    public QuestionnairePresentation transform(Questionnaire questionnaire) {
        QuestionnairePresentation presentation = presentationFactory.createQuestionnairePresentation();
        
        presentation.setTitle(questionnaire.getTitle());  // Changed from getTitle
        presentation.setEnableBackNavigation(questionnaire.isAllowBack());  // Changed from isAllowBack
        presentation.setShowProgressBar(true);
        
        for (Question question : questionnaire.getQuestions()) {  // Changed from getQuestions
            QuestionPage page = transformQuestion(question);
            presentation.getPages().add(page);
        }
        
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
        
        page.setQuestionText(question.getIntitule());  // Changed from getText
        page.setHeader("Question");
        page.setDifficultyDisplay("Difficulty: " + question.getDifficulte());  // Changed from getDifficulty
        
        page.setMultipleChoice(!question.isReponseUnique());  // Changed logic to use reponseUnique
        
        for (Answer answer : question.getResponse()) {  // Changed from getAnswers
            AnswerOption option = transformAnswer(answer, page.isMultipleChoice());
            page.getOptions().add(option);
        }
        
        return page;
    }
    
    private AnswerOption transformAnswer(Answer answer, boolean isMultipleChoice) {
        AnswerOption option = presentationFactory.createAnswerOption();
        option.setText(answer.getIntitule());  // Changed from getText
        option.setCorrect(answer.isValide());  // Changed from isIsCorrect
        option.setInputType(isMultipleChoice ? InputType.CHECKBOX : InputType.RADIO);
        return option;
    }
}