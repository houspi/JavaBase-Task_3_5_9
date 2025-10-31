package org.stepik.houspi;

enum Label {
    SPAM, NEGATIVE_TEXT, TOO_LONG, OK
}
public interface TextAnalyzer {
    Label processText(String text);
}
