package ru.tp.lingany.lingany.fragments.fragmentData;

import java.io.Serializable;
import java.util.List;

import ru.tp.lingany.lingany.sdk.api.trainings.Training;

public class SprintData extends FragmentData implements Serializable {
    private int currentTrainingNumber;
    private String wordToTranslateText;
    private String wordTranslationText;
    private String realTranslationText;
    private boolean isFilled;
    private boolean victories = false;
    private int markAndCrossLength = 0;

    public SprintData(List<Training> trainings) {
        super(trainings);
        this.currentTrainingNumber = -1;
        isFilled = false;
    }

    public SprintData(List<Training> trainings, int currentTrainingNumber, String wordToTranslateText, String wordTranslationText, String realTranslationText) {
        super(trainings);
        this.currentTrainingNumber = currentTrainingNumber;
        this.wordToTranslateText = wordToTranslateText;
        this.wordTranslationText = wordTranslationText;
        this.realTranslationText = realTranslationText;
        isFilled = true;
    }

    public int getCurrentTrainingNumber() {
        return currentTrainingNumber;
    }

    public void setCurrentTrainingNumber(int currentTrainingNumber) {
        this.currentTrainingNumber = currentTrainingNumber;
    }

    public String getWordToTranslateText() {
        return wordToTranslateText;
    }

    public void setWordToTranslateText(String wordToTranslateText) {
        this.wordToTranslateText = wordToTranslateText;
    }

    public String getWordTranslationText() {
        return wordTranslationText;
    }

    public void setWordTranslationText(String wordTranslationText) {
        this.wordTranslationText = wordTranslationText;
    }

    public String getRealTranslationText() {
        return realTranslationText;
    }

    public void setRealTranslationText(String realTranslationText) {
        this.realTranslationText = realTranslationText;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }

    public boolean isVictories() {
        return victories;
    }

    public void setVictories(boolean victories) {
        this.victories = victories;
    }

    public int getMarkAndCrossLength() {
        return markAndCrossLength;
    }

    public void setMarkAndCrossLength(int markAndCrossLength) {
        this.markAndCrossLength = markAndCrossLength;
    }
}