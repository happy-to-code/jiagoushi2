package com.yida.test2.d_2;

import java.util.StringJoiner;

public enum ObsDataParserEnum {
    /**
     * googleanalytics
     */
    GOOGLE_ANALYTICS_4("GA4", "org.sak.modules.rawdata.parser.customer.GoogleAnalyticsObsDataParser"),

    PORTUGAL_TRACK("PORTUGALTRACK", "org.sak.modules.rawdata.parser.customer.TrackObsDataParser"), SELLFOX("Sellfox", "org.sak.modules.rawdata.parser.customer.SellfoxObsDataParser"),
    ;

    private String type;

    private String text;

    ObsDataParserEnum(String type, String text) {
        this.type = type;

        this.text = text;
    }

    public String getType() {
        return this.type;
    }

    public String getText() {
        return this.text;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setText(String text) {
        this.text = text;
    }

    /**
     * @param type
     * @return
     */
    public static String getText(String type) {
        for (ObsDataParserEnum c : ObsDataParserEnum.values()) {
            if (c.getType().equals(type)) {
                return c.getText();
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", ObsDataParserEnum.class.getSimpleName() + "[", "]")
                .add("type='" + type + "'")
                .add("text='" + text + "'")
                .toString();
    }

    public static void main(String[] args) {
        ObsDataParserEnum[] values = ObsDataParserEnum.values();
        for (ObsDataParserEnum value : values) {
            System.out.println("value = " + value);
        }
    }
}
