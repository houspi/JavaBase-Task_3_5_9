package org.stepik.houspi;

import java.util.Arrays;

public class SpamAnalyzer extends KeywordAnalyzer {
    private final String[] keywords;

    public SpamAnalyzer(String[] spamWords) {
        this.keywords = Arrays.copyOf(spamWords, spamWords.length);
    }

    public String[] getKeywords() {
        return Arrays.copyOf(keywords, keywords.length );
    }
    public Label getLabel() {
        return Label.SPAM;
    }
}
