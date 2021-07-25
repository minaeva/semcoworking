package ua.kiev.minaeva.semcoworking.dto;

import java.time.LocalDate;
import java.util.Objects;

public class PrepaidDto {

    private Integer id;
    private int durationDays;
    private LocalDate startDate;


    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public int getDurationDays() {
        return durationDays;
    }

    public void setDurationDays(int durationDays) {
        this.durationDays = durationDays;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PrepaidDto that = (PrepaidDto) o;

        if (durationDays != that.durationDays) return false;
        if (!Objects.equals(id, that.id)) return false;
        return Objects.equals(startDate, that.startDate);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + durationDays;
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        return result;
    }
}

