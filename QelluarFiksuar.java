
public class QelluarFiksuar {
	
	public int Qelluar(int ABC, int abc) {
		String sABC = ""+ABC;
		String sabc = ""+abc;
		int count = 0;
		
		if (sABC.charAt(0)==sabc.charAt(1)) { count++;}
		if (sABC.charAt(0)==sabc.charAt(2)) { count++;}
		if (sABC.charAt(1)==sabc.charAt(0)) { count++;}
		if (sABC.charAt(1)==sabc.charAt(2)) { count++;}
		if (sABC.charAt(2)==sabc.charAt(1)) { count++;}
		if (sABC.charAt(2)==sabc.charAt(0)) { count++;}
		
	return count;
	}
	
	public int Fiksuar(int ABC, int abc) {
		String fABC = ""+ABC;
		String fabc = ""+abc;
		int count = 0;
		
		if (fABC.charAt(0)==fabc.charAt(0)) { count++;}
		if (fABC.charAt(1)==fabc.charAt(1)) { count++;}
		if (fABC.charAt(2)==fabc.charAt(2)) { count++;}
		
	return count;
	}
}
