package org.stepik.houspi;

import java.util.Arrays;

public class NegativeTextAnalyzer extends KeywordAnalyzer {
    private final String[] keywords = { ":(", "=(", ":|"};

    public String[] getKeywords() {
        return Arrays.copyOf(keywords, keywords.length );
    }
    public Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }
}
