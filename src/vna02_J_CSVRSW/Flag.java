package vna02_J_CSVRSW;

final class Flag {
	private volatile boolean flag = true;
	
	public synchronized void toggle() { 
		flag ^= true; // Same as flag = !flag;
	}
	
	public boolean getFlag() { 
		return flag;
	}
	}
