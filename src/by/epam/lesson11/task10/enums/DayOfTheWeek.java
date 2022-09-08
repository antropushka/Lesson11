package by.epam.lesson11.task10.enums;

public enum DayOfTheWeek {
    MONDAY("monday"),
    TUESDAY("tuesday"),
    WEDNESDAY("wednesday"),
    THURSDAY("thursday"),
    FRIDAY("friday"),
    SATURDAY("saturday"),
    SUNDAY("sunday");

    private String day;

    DayOfTheWeek(String day) {
        this.day = day;
    }

    public String getDay() {
        return day;
    }
    //    public enum Blah {
//        A("text1"),
//        B("text2"),
//        C("text3"),
//        D("text4");
//
//        private String text;
//
//        Blah(String text) {
//            this.text = text;
//        }
//
//        public String getText() {
//            return this.text;
//        }
//
//        public static Blah fromString(String text) {
//            for (Blah b : Blah.values()) {
//                if (b.text.equalsIgnoreCase(text)) {
//                    return b;
//                }
//            }
//            return null;
//        }
//    }
}
