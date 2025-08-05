package com.polina.commentfiltering;

public class CommentFilter {

    public static Label checkLabels(TextAnalyzer[] analyzers, String text) {
        for (TextAnalyzer analyzer : analyzers) {
            Label result = analyzer.processText(text);
            if (result != Label.OK) {
                return result;
            }
        }
        return Label.OK;
    }

    public static void main(String[] args) {

        String[] spamKeywords = {"spam", "buy", "sale"};

        TextAnalyzer[] analyzers = {
                new SpamAnalyzer(spamKeywords),
                new TooLongTextAnalyzer(100),
                new NegativeTextAnalyzer()
        };

        String text = "Random test text.";
        Label result = checkLabels(analyzers, text);
        System.out.println("Text: " + text);
        System.out.println("Result: " + result);
    }
}