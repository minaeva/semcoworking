package ua.kiev.minaeva.semcoworking.controller.dto;

public class UpdatePriceDto {

    private String period;

    private double value;

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UpdatePriceDto that = (UpdatePriceDto) o;

        if (Double.compare(that.value, value) != 0) return false;
        return period != null ? period.equals(that.period) : that.period == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = period != null ? period.hashCode() : 0;
        temp = Double.doubleToLongBits(value);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
