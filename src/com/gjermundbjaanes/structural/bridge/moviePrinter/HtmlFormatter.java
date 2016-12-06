package com.gjermundbjaanes.structural.bridge.moviePrinter;

import java.util.List;

public class HtmlFormatter implements Formatter {

    @Override
    public String format(String header, List<Detail> details) {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("<table>");
        stringBuilder.append("<th>");
        stringBuilder.append("Classification");
        stringBuilder.append("</th");
        stringBuilder.append("<th>");
        stringBuilder.append(header);
        stringBuilder.append("</th>");

        for (Detail detail : details) {
            stringBuilder.append("<tr><td>");
            stringBuilder.append(detail.getLabel());
            stringBuilder.append("</td><td>");
            stringBuilder.append(detail.getValue());
            stringBuilder.append("</td></tr>");
        }

        stringBuilder.append("</table>");

        return stringBuilder.toString();
    }

}
