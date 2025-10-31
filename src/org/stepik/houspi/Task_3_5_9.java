
package org.stepik.houspi;

public class Task_3_5_9 {
    public static void main(String[] args) {
        System.out.println("Hello, I'm here!");
        String str = "ABC spa text =. =( spam";
        System.out.println(str);
        SpamAnalyzer sa = new SpamAnalyzer(new String[] {"spam", "adv"});
        NegativeTextAnalyzer nta = new NegativeTextAnalyzer();
        TooLongTextAnalyzer tla = new TooLongTextAnalyzer(7);
        System.out.println(checkLabels(new TextAnalyzer[]{sa, nta, tla}, str));
    }

    public static  Label checkLabels(TextAnalyzer[] analyzers, String text) {
        for (TextAnalyzer analyzer: analyzers) {
            Label l = analyzer.processText(text);
            if ( l != Label.OK ) {
                return l;
            }
        }
        return Label.OK;
    }
}
