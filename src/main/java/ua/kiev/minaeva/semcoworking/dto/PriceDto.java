package ua.kiev.minaeva.semcoworking.dto;

import javax.persistence.Column;

public class PriceDto {

    private double hourFirst;

    private double hourSecond;

    private double hourOther;

    private double day;

    private double week;

    private double month;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PriceDto priceDto = (PriceDto) o;

        if (Double.compare(priceDto.hourFirst, hourFirst) != 0) return false;
        if (Double.compare(priceDto.hourSecond, hourSecond) != 0) return false;
        if (Double.compare(priceDto.hourOther, hourOther) != 0) return false;
        if (Double.compare(priceDto.day, day) != 0) return false;
        if (Double.compare(priceDto.week, week) != 0) return false;
        return Double.compare(priceDto.month, month) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(hourFirst);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(hourSecond);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(hourOther);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(day);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(week);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(month);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    public double getHourFirst() {
        return hourFirst;
    }

    public void setHourFirst(double hourFirst) {
        this.hourFirst = hourFirst;
    }

    public double getHourSecond() {
        return hourSecond;
    }

    public void setHourSecond(double hourSecond) {
        this.hourSecond = hourSecond;
    }

    public double getHourOther() {
        return hourOther;
    }

    public void setHourOther(double hourOther) {
        this.hourOther = hourOther;
    }

    public double getDay() {
        return day;
    }

    public void setDay(double day) {
        this.day = day;
    }

    public double getWeek() {
        return week;
    }

    public void setWeek(double week) {
        this.week = week;
    }

    public double getMonth() {
        return month;
    }

    public void setMonth(double month) {
        this.month = month;
    }
}
