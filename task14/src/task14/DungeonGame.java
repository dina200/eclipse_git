package task14;

import java.io.*;

public class DungeonGame implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7608342254442567273L;
	public int x = 3;
	transient long y = 4;
	private short z = 5;
	
	int getX() {
		return this.x;
	}
	
	short getZ() {
		return this.z;
	}
	
	long getY() {
		return this.y;
	}
}
