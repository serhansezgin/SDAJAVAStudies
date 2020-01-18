package eleven.after;

public class Duplication {

    /**
     *   !!!!!!!!! DRY !!!!!!!!
     *   Please Don't Repeat Yourself
     *   Always double check
     *
     */


}

class AdmissionService {

    public void admitGuest(String name, String admissionDateTime) {
        // Some logic
        // ...
        AdmissonTime admissonTime = getAdmissonTime(admissionDateTime);

        // Some more logic
        // ...
        if (admissonTime.hours < 10 && admissonTime.minutes < 30) {
            // do admit operation
        }
    }

    public void updateAdmission(int admissionId, String name, String admissionDateTime) {
        // Some logic
        // ...

        AdmissonTime admissonTime = getAdmissonTime(admissionDateTime);
        // Some more logic
        // ...

        if (admissonTime.hours < 10 && admissonTime.minutes < 30) {
            // do update operation
        }
    }


    private AdmissonTime getAdmissonTime(String admissionDateTime) {

        AdmissonTime admissonTime;
        if (!isAdmissonTimeEmpty(admissionDateTime)) {
            admissonTime = calculateTime(admissionDateTime);
        } else
            throw new IllegalArgumentException("admissionDateTime can not be null");
        return admissonTime;
    }

    private AdmissonTime calculateTime(String admissionDateTime) {
        AdmissonTime admissonTime = new AdmissonTime();
        int time;
        try {
            time = Integer.parseInt(admissionDateTime.replace(":", ""));
            admissonTime.hours = time / 100;
            admissonTime.minutes = time % 100;

        } catch (Exception ex) {
            throw new IllegalArgumentException("Invalid admissionDateTime format");
        }
        return admissonTime;
    }

    private boolean isAdmissonTimeEmpty(String admissionDateTime) {
        return admissionDateTime != null && !admissionDateTime.isEmpty();
    }

}

class AdmissonTime {

    int hours;
    int minutes;
}
