import javax.swing.*;

public class MainClass {
	static private int qelluar, fiksuar;

	public static void main(String[] args) {
		int ABC = new GjeneroNumrin().random();
		boolean gjetur = false;
		int njesi = 40;
		
		JFrame n = new JFrame();
		ViewClass v = new ViewClass();
		
		n.setTitle("Loja Oxygen");
		n.setSize(5*njesi + njesi/2, 6*njesi + njesi/2);
		n.getContentPane().add(v);
		n.setResizable(true);
		n.setVisible(true);
		n.setResizable(false);
		n.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		while(!gjetur) {
			int abc = new MerrHyrjen().Hyrja();
			v.setNumber(abc);
			if (abc != 0) {
				qelluar = new QelluarFiksuar().Qelluar(ABC, abc);
				v.setQelluar(qelluar);
			
				fiksuar = new QelluarFiksuar().Fiksuar(ABC, abc);
				v.setFiksuar(fiksuar);
				
				System.out.println("Ju i keni "+qelluar+" te qelluara dhe "+fiksuar+" te fiksuara.");
			
				if(fiksuar==3) {System.out.println("Urime, keni fituar !"); 
								v.setFituar();
								gjetur = true;}
			} else { System.exit(0); }
		}
	}
}
