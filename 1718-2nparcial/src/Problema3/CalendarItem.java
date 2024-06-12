package Problema3;

import java.util.ArrayList;
import java.util.List;

public class CalendarItem {
    private final String name;
    private final Place place;
    private final DayOfYear date;
    private final HoursMinutes begin;
    private final HoursMinutes end;

    public String getName() {
        return name;
    }

    public Place getPlace() {
        return place;
    }

    public DayOfYear getDate() {
        return date;
    }

    public HoursMinutes getBegin() {
        return begin;
    }

    public HoursMinutes getEnd() {
        return end;
    }

    public List<Contact> getOthers() {
        return others;
    }

    private final List<Contact> others;

    public CalendarItem(Builder builder) {
        this.name = builder.name;
        this.place = builder.place;
        this.date = builder.date;
        this.begin = builder.begin;
        this.end = builder.end;
        this.others = builder.others;
    }

    public static class Builder{
        private final String name;
        private Place place;
        private DayOfYear date;
        private HoursMinutes begin;
        private HoursMinutes end;
        private List<Contact> others;

        boolean hasIn, hasAt, hasFrom, hasTo;

        private Builder(String name){
            this.name = name;
            this.hasIn = false;
            this.hasAt = false;
            this.hasFrom = false;
            this.hasTo = false;
            this.others = new ArrayList<>();
        }

        public static Builder create(String name) { return new Builder(name); }
        private <E> void checkNull(E e){ if(e == null){ throw new IllegalArgumentException(">:("); } }

        public Builder in(Place place){
            checkNull(place);
            if(!hasIn){
                this.place = place;
                hasIn = true;
                return this;
            }

            throw new IllegalStateException("<@[:)");
        }

        public Builder at(DayOfYear doy){
            checkNull(doy);
            if(!hasAt){
                this.date = doy;
                hasAt = true;
                return this;
            }

            throw new IllegalStateException("<@[:)");
        }

        public Builder from(HoursMinutes from){
            checkNull(from);

            if(hasTo){
                if(from.compareTo(this.end) > 0){
                    throw new IllegalArgumentException("To no puede ser mayor a from");
                }
            }

            if(!hasFrom){
                this.begin = from;
                hasFrom = true;
                return this;
            }

            throw new IllegalStateException("<@[:)");
        }

        public Builder to(HoursMinutes to){
            checkNull(to);

            if(hasFrom){
                if(to.compareTo(this.begin) < 0){
                    throw new IllegalArgumentException("To no puede ser mayor a from");
                }
            }

            if(!hasTo){
                this.end = to;
                hasTo = true;
                return this;
            }

            throw new IllegalStateException("<@[:)");
        }

        public Builder with(Contact contact){
            this.others.add(contact);
            return this;
        }

        public CalendarItem build(){
            return new CalendarItem(this);
        }
    }
}
