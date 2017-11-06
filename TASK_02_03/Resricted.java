package TASK_02_03;

/**
 * Created by Роман on 06.11.2017.
 */
public class Resricted
{
    private Class<?>[] restrictedList = new Class<?>[0];

    public Resricted () {}

    public Resricted (Class<?>[] restrictedList)
    {
        this.restrictedList = restrictedList;
    }

    public void add(Class<?> input) {
        int length;
        length = restrictedList.length;

        Class<?>[] newRList = new Class<?>[length + 1];
        if (length == 0) {
            newRList[0] = input;
        } else {
            System.arraycopy(restrictedList, 0, newRList, 1, length);
            newRList[0] = input;
        }
        restrictedList = newRList;
    }

    public void remove() {
        int length;
        length = restrictedList.length;

        if (length == 0) {
            System.out.println("BLACK LIST IS ALREADY EMPTY!");
        } else if (length == 1) {
            restrictedList = new Class<?>[0];
        } else {
            Class<?>[] newRList = new Class<?>[length - 1];
            System.arraycopy(restrictedList, 1, newRList, 0, length - 1);
            restrictedList = newRList;
        }
    }

    public void checkRestricted (Object object) throws RestrictedException {
        {
            for (Class<?> item : restrictedList)
            {
                if (object.getClass() == item)
                    throw new RestrictedException(item);
            }
        }
    }

}
