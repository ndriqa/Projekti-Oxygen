import javax.swing.*;
public class MerrHyrjen {
	
	public int Hyrja() {
		int numri = 0;
		boolean processing = true;
		
		while(processing) {
			String temp = JOptionPane.showInputDialog("Shkruani numrin: ");
			if(temp!=null && temp!="") {
				numri = new Integer(temp).intValue();
				if (numri == 0) { processing = false;
					JOptionPane.showMessageDialog(null, "Loja po nderpritet... ");
				} else if (numri <= 100) {JOptionPane.showMessageDialog(null, "Gabim: Te hyra jo te vlefshme...");
				  	
				  }
				  else { break; }
			}	else {	JOptionPane.showMessageDialog(null, "Loja po nderpritet... ");
						processing = false;
					 }
			
		}
	return numri;
	}
}
