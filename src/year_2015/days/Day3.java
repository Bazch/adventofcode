package year_2015.days;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Day3 extends AbstractDay {
	
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
	public void execute(boolean isDebug, boolean isHome) {
		readInput(isDebug, isHome);
		System.out.println("Part 1: " + getDistinctPoints(input));
		System.out.println("Part 2: " + getDistinctPointsAlternating(input));
		
	}
	
	public int getDistinctPoints(String path) { 
		List<Point> coordinates = new ArrayList<Point>();
		coordinates.add(new Point(0,0));
		int length = path.length();
	    Point start = new Point(0,0);		
      
    
        for (int i = 0; i < length; i++) { 
 
            char ch = path.charAt(i); 	            
            switch (ch) {
	            case '>':
	            	start.x++;
	            	break;
	            case '<':
	            	start.x--;
	            	break;
	            case '^':
	            	start.y++;
	            	break;
	            case 'v':
	            	start.y--;
	            	break;
            }
            Point p = new Point(start.x, start.y);
            if (!coordinates.contains(p)){         
            	coordinates.add(p);
            }
        }
        return coordinates.size();
	} 

	public int getDistinctPointsAlternating(String path) {
		List<Point> coordinates = new ArrayList<Point>();
		coordinates.add(new Point(0,0));
		Point pointSanta = new Point(0,0);
		Point pointRoboSanta = new Point(0,0);
        int length = path.length();
        
        for (int i = 0; i < length; i++) { 
        	
            char ch = path.charAt(i); 	            
            switch (ch) {
	            case '>':
	            	if (i % 2 == 0) {
	            		pointSanta.x++;
	            	} else {
	            		pointRoboSanta.x++;
	            	}
	            	break;
	            case '<':
	            	if (i % 2 == 0) {
	            		pointSanta.x--;
	            	} else {
	            		pointRoboSanta.x--;
	            	}
	            	break;
	            case '^':
	            	if (i % 2 == 0) {
	            		pointSanta.y++;
	            	} else {
	            		pointRoboSanta.y++;
	            	}
	            	break;
	            case 'v':
	            	if (i % 2 == 0) {
	            		pointSanta.y--;
	            	} else {
	            		pointRoboSanta.y--;
	            	}
	            	break;
            }
            Point p = new Point(pointSanta.x, pointSanta.y);
            Point s = new Point(pointRoboSanta.x, pointRoboSanta.y);
            if (!coordinates.contains(p)) {   
            	coordinates.add(p);
            } else if (!coordinates.contains(s)) {
            	coordinates.add(s);
            }
        }
        return coordinates.size();
	}

}
