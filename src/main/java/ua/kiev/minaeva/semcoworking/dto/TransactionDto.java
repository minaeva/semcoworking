package ua.kiev.minaeva.semcoworking.dto;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

public class TransactionDto {

    private LocalDate date;
    private LocalTime startTime;
    private LocalTime endTime;
    private double cost;
    private Integer visitorId;


    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Integer getVisitorId() {
        return visitorId;
    }

    public void setVisitorId(Integer visitorId) {
        this.visitorId = visitorId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TransactionDto that = (TransactionDto) o;
        return date.equals(that.date) && Objects.equals(startTime, that.startTime) && visitorId.equals(that.visitorId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, startTime, visitorId);
    }
}


