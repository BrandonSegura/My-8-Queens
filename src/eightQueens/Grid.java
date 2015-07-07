package eightQueens;

import java.util.ArrayList;

public class Grid {
    private final int DIMENSIONS = 8;
    private ArrayList<ArrayList<Boolean>> grid;
    
    public Grid() {
    	for(int i = 0; i < DIMENSIONS; ++i) {
    		ArrayList<Boolean> temp = new ArrayList<Boolean>();
    		
    		for(int j = 0; j < DIMENSIONS; ++j) {
    			temp.add(false);
    		}
    		
    		grid.add(temp);
    	}
    }
    
    public Grid(String definition) {
    	
    }
    
    // Funcion publica que devuelva si el grid es solucion a 8 reinas
    // Que se considera como solucion:
    
    // Hay 8 reinas.
    // Ninguna reina se ataca
    
    private boolean isThreatenedHorizontally(final int x, final int y) {
    	int i = 0;
    	
    	while(i < DIMENSIONS) {
    		if(grid.get(i).get(y) && x != i) {
    			return true;
    		}
    		++i;
    	}
    	
    	return false;
    }
    
    private boolean isThreatenedVertically(int x, int y) {
    	int i = 0;
    	
    	while(i < DIMENSIONS) {
    		if(grid.get(x).get(i) && y != i) {
    			return true;
    		}
    		++i;
    	}
    	
    	return false;
    }
    
    private boolean isThreatenedDiagonally(int x, int y) {
    	
    	int i = x + 1;
    	int j = y + 1;
    	
    	while( i < DIMENSIONS && j < DIMENSIONS) {
    		if(grid.get(i).get(j)){
    			return true;
    		}
    		++i;
    		++j;
    	}
    	
    	i = x - 1;
    	j = y - 1;
    	
    	while( i > 0 && j > 0) {
    		if(grid.get(i).get(j)){
    			return true;
    		}
    		--i;
    		--j;
    	}
    	
    	
    	return false;
    }
    
    private boolean isThreatenedAntiDiagonally(int x, int y) {
    	
    	int i = x - 1;
    	int j = y + 1;
    	
    	while( i > 0 && j < DIMENSIONS) {
    		if(grid.get(i).get(j)){
    			return true;
    		}
    		--i;
    		++j;
    	}
    	
    	i = x + 1;
    	j = y - 1;
    	
    	while(i < DIMENSIONS && j > 0) {
    		if(grid.get(i).get(j)){
    			return true;
    		}
    		++i;
    		--j;
    	}
    	
    	return false;
    }
    
    private boolean isThreatened(int x, int y) {
    	return (isThreatenedHorizontally(x, y) ||
    			isThreatenedVertically(x, y) ||
    			isThreatenedDiagonally(x, y) ||
    			isThreatenedAntiDiagonally(x, y));
    }
}
