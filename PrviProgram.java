package JavaNedelja10;

import javax.swing.JOptionPane;

public class PrviProgram {

	public static void main(String[] args) {
		
		String ime = JOptionPane.showInputDialog(null, "Unesite ime:");
		String prezime = JOptionPane.showInputDialog(null, "Unesite prezime:");
		String godiste = JOptionPane.showInputDialog(null, "Unesite godiste:");
		
		int godisteInt = Integer.parseInt(godiste);
		
		String format = String.format("Pregled podataka:\n" + " Ime: %s \n Prezime: %s \n Godiste rodjenja: %d:  " + 
		"\n\n Da li su puneseni podaci tacni? ", ime, prezime, godisteInt);
				int dugme = JOptionPane.showConfirmDialog(null, format, "Pregled i potvrda unosa" , JOptionPane.YES_NO_OPTION);
				//System.out.println(dugme);
				
				if(dugme == 0) {
					
		String email = String.format("%s.%s%d@kompanija.me", ime, prezime, godisteInt);

		JOptionPane.showMessageDialog(null, "Vas email je: " + email);
				}else {
					JOptionPane.showMessageDialog(null, "Pogresan unos!");
				}
		
	}

}
