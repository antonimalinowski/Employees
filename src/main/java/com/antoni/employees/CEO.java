package com.antoni.employees;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CEO extends Employee implements Flyer{
    private int avgStockPrice = 0;
    private Pilot pilot = new Pilot(1000, true);

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

    public void fly() {
        pilot.fly();
    }

    public int getHoursFlown() {
        return pilot.getHoursFlown();
    }

    public void setHoursFlown(int hoursFlown) {
        pilot.setHoursFlown(hoursFlown);
    }

    public boolean isIfr() {
        return pilot.isIfr();
    }

    public void setIfr(boolean ifr) {
        pilot.setIfr(ifr);
    }
}
