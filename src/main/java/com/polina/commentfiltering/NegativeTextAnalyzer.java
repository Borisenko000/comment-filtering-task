package com.polina.commentfiltering;

public class NegativeTextAnalyzer extends KeywordAnalyzer {
    public NegativeTextAnalyzer() {
        super();
    }

    private String[] keywords = new String[]{":(", "=(", ":|"};

    protected String[] getKeywords() {
        return this.keywords;
    }

    protected Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }


}
