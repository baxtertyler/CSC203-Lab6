package comparator;

import java.util.Comparator;

public class ComposedComparator implements Comparator<Song>{

    public int compare(Song c1, Song c2)
    {
        int j = c2.getYear() - c1.getYear();
        if (j == 0)
        {
            j = c2.getTitle().compareTo(c1.getTitle());
        }
        return j;
    }
}
