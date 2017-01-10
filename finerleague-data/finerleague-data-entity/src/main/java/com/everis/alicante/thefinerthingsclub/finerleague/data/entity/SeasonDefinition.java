package com.everis.alicante.thefinerthingsclub.finerleague.data.entity;

import com.everis.alicante.thefinerthingsclub.finerleague.common.domain.constants.RegExpConstants;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.ReadOnlyProperty;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Pattern;
import java.util.Date;

/**
 * The type Season definition.
 */
public class SeasonDefinition implements EntityDocument {

    @Id
    @ReadOnlyProperty
    private String id;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private Date firstDate;

    @Pattern(regexp = RegExpConstants.CRON_EXPRESSION)
    private String cronExpression;

    /**
     * Gets id.
     *
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Gets first date.
     *
     * @return the first date
     */
    public Date getFirstDate() {
        return firstDate;
    }

    /**
     * Sets first date.
     *
     * @param firstDate the first date
     */
    public void setFirstDate(Date firstDate) {
        this.firstDate = firstDate;
    }

    /**
     * Gets cron expression.
     *
     * @return the cron expression
     */
    public String getCronExpression() {
        return cronExpression;
    }

    /**
     * Sets cron expression.
     *
     * @param cronExpression the cron expression
     */
    public void setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
    }

    @Override
    public String toString() {
        return "SeasonDefinition{" +
                "id='" + id + '\'' +
                ", firstDate=" + firstDate +
                ", cronExpression='" + cronExpression + '\'' +
                '}';
    }
}
