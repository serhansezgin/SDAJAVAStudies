package seven.before;

public class MagicNumbers {

    // Most probably you are gonna say WTF is this SHIT!

    /**
     * Problem:
     *
     * please implement a method that
     * approve/reject document in order to its status
     *
     */
    public void approveDocument(int status)
    {
        if (status == 1) // Draft
        {
            // ...
        }
        else if (status == 2) // Lodged
        {
            // ...
        }
        else if (status == 3) // Sent
        {
            // ...
        }
    }

    public void rejectDoument(String status)
    {
        switch (status)
        {
            case "1":
                // ...
                break;
            case "2":
                // ...
                break;
        }
    }
}
