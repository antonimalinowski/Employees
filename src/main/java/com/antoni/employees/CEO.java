package com.antoni.employees;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CEO extends Employee {
    private int avgStockPrice = 0;

    private final String ceoRegex = "\\w+=(?<avgStockPrice>\\w+)";
    private final Pattern ceoPat = Pattern.compile(ceoRegex);

    public CEO(String personText) {
        super(personText);
        Matcher ceoMat = ceoPat.matcher(peopleMat.group("details"));
        if (ceoMat.find()) {
            this.avgStockPrice = Integer.parseInt(ceoMat.group("avgStockPrice"));
        }
    }

    public int getSalary() {
        return 5000 * avgStockPrice;
    }
}
