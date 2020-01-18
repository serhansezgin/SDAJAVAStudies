package six.after;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Date;
import java.util.List;

public class MethodWithTooManyArguments {

    /**
       very simple example :
        From this
        postLetter(string country, string town, string postcode, string streetAddress, int apartmentNumber)

        To this
        postLetter(Address address)
     **/


    public List<Reservation> getUpcomingReservations(Date dateFrom, Date dateTo,
                                                                User user, int locationId,
                                                                LocationType locationType)
    {
        // validations...
        Date now = new Date();
        if (dateFrom.after(dateTo))
            throw new IllegalArgumentException("dateFrom can not be ....");
        if (dateTo.before(now))
            throw new IllegalArgumentException("dateTo can not be ....");

        // do other validations...

        // get reservations from system...

        throw new NotImplementedException();
    }









    public List<Reservation> GetUpcomingReservationsFirstRefactoring
    (DateRange dateRange, User user, int locationId, LocationType locationType){
        throw new NotImplementedException();
    }

    public List<Reservation> GetUpcomingReservationsSecondRefactoring
            (DateRange dateRange, User user, Location location){
        throw new NotImplementedException();
    }

    public List<Reservation> GetUpcomingReservationsThirdRefactoring(ReservationQuery query){
        throw new NotImplementedException();
    }
}

class DateRange{
    Date dateFrom;
    Date dateTo;
}


class Location{
    int locationId;
    LocationType locationType;
}


class ReservationQuery{
    Date dateFrom;
    Date dateTo;
    User user;
    int locationId;
    LocationType locationType;
}



class LocationType
{

}

class Reservation{


}

class User{

}
