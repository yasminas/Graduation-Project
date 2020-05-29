package app.app.Dto;

import java.util.Date;
import java.util.List;

public class Filters {
    private String Type;
    private String name;
    private List<String> value;
    private  Date  from ;
    private Date to ;
    public Filters()
    {
        super();
    }
    public Filters(String type, String name, List<String> value, Date from, Date to) {
        Type = type;
        this.name = name;
        this.value = value;
        this.from = from;
        this.to = to;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getValue() {
        return value;
    }

    public void setValue(List<String> value) {
        this.value = value;
    }

    public Date getFrom() {
        return from;
    }

    public void setFrom(Date from) {
        this.from = from;
    }

    public Date getTo() {
        return to;
    }

    public void setTo(Date to) {
        this.to = to;
    }
}
