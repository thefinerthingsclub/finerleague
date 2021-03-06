package com.everis.alicante.thefinerthingsclub.finerleague.data.entity;

import com.everis.alicante.thefinerthingsclub.finerleague.common.domain.constants.RegExpConstants;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.ReadOnlyProperty;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Pattern;
import java.util.Date;
import java.util.List;

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
    private String seasonCycle;

    @DBRef
    private List<Season> seasonList;

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
     * Gets season cycle.
     *
     * @return the season cycle
     */
    public String getSeasonCycle() {
        return seasonCycle;
    }

    /**
     * Sets season cycle.
     *
     * @param seasonCycle the season cycle
     */
    public void setSeasonCycle(String seasonCycle) {
        this.seasonCycle = seasonCycle;
    }

    /**
     * Gets season list.
     *
     * @return the season list
     */
    public List<Season> getSeasonList() {
        return seasonList;
    }

    /**
     * Sets season list.
     *
     * @param seasonList the season list
     */
    public void setSeasonList(List<Season> seasonList) {
        this.seasonList = seasonList;
    }

    @Override
    public String toString() {
        return "SeasonDefinition{" +
                "id='" + id + '\'' +
                ", firstDate=" + firstDate +
                ", seasonCycle='" + seasonCycle + '\'' +
                ", seasonList='" + seasonList + '\'' +
                '}';
    }
}
