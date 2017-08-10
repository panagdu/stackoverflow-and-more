package uk.panaghiea.asserts.questions.question33563768;

public class MySchool{
    private long timestamp;
    private SchoolEvent event;
    private Object value;

    public MySchool(SchoolEvent event) {
        this.event = event;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public SchoolEvent getEvent() {
        return event;
    }

    public void setEvent(SchoolEvent event) {
        this.event = event;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "MySchool [timestamp=" + timestamp + ", event="
                + event + ", value=" + value + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MySchool mySchool = (MySchool) o;

        if (timestamp != mySchool.timestamp) return false;
        if (event != mySchool.event) return false;
        return !(value != null ? !value.equals(mySchool.value) : mySchool.value != null);

    }
}