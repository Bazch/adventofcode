package year_2015.days;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Day3 implements Day {

	private static final String FILE_PATH = "C:\\Users\\basv_\\git\\adventofcode\\resources\\Day3.txt";
	private static final String FILE_PATH_DEBUG= "C:\\Users\\basv_\\git\\adventofcode\\resources\\Day3_test.txt";
	private static String input;
	
	public static class Point {
		public int x;
		public int y;
		
		public Point(int x, int y)
		{
			this.x = x;
			this.y = y;
		}
		
		@Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Point point = (Point) o;
            return x == point.x &&
                    y == point.y;
        }
	}
	
	@Override
	public void execute(boolean isDebug) {
		if (isDebug) {
			input = readFile(FILE_PATH_DEBUG);
		} else {
			input = readFile(FILE_PATH);
		}
		System.out.println(getDistinctPoints(input));
		
	}
	
	 public int getDistinctPoints(String path) { 
		List<Point> coordinates = new ArrayList<Point>();
		int x = 0;
		int y = 0;	
        int length = path.length();
        
        for (int i = 0; i < length; i++) { 
  
            char ch = path.charAt(i); 	            
            switch (ch) {
	            case '>':
	            	x++;
	            	break;
	            case '<':
	            	x--;
	            	break;
	            case '^':
	            	y++;
	            	break;
	            case 'v':
	            	y--;
	            	break;
            }
            Point p = new Point(x,y);
            if (!coordinates.contains(p)){         
            	coordinates.add(p);
            }
        }
        return coordinates.size();
	} 

	 public void removeDuplicatePoints() {
	
	}

}
