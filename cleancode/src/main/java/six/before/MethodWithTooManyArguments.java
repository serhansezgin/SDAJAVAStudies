package six.before;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Date;
import java.util.List;

public class MethodWithTooManyArguments {
    /**
     *  Problem :
     *  Get user reservations from between begin date and end date
     *  Location
     */

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

}
class Reservation{

}
class User{

}

class LocationType
{

}