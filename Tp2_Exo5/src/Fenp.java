import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Fenp extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JLabel LPrenom, Lnom, LAnnee, Lage;
	private JTextField Tnom, Tprenom, Tannee, Tage;

	private JButton submit, reset;
	private JPanel P, P1, P2, P3;
	private BorderLayout Be;
	private GridLayout gl;
	private FlowLayout fl;
	private BorderLayout bl;
	private FlowLayout Fe;
	
	

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public JLabel getLPrenom() {
		return LPrenom;
	}

	public JLabel getLnom() {
		return Lnom;
	}

	public JLabel getLAnnee() {
		return LAnnee;
	}

	public JLabel getLage() {
		return Lage;
	}

	public JTextField getTnom() {
		return Tnom;
	}

	public JTextField getTprenom() {
		return Tprenom;
	}

	public JTextField getTannee() {
		return Tannee;
	}

	public JTextField getTage() {
		return Tage;
	}

	public JButton getSubmit() {
		return submit;
	}

	public JButton getReset() {
		return reset;
	}

	public JPanel getP() {
		return P;
	}

	public JPanel getP1() {
		return P1;
	}

	public JPanel getP2() {
		return P2;
	}

	public JPanel getP3() {
		return P3;
	}

	public BorderLayout getBe() {
		return Be;
	}

	public GridLayout getGl() {
		return gl;
	}

	public FlowLayout getFl() {
		return fl;
	}

	public BorderLayout getBl() {
		return bl;
	}

	public FlowLayout getFe() {
		return Fe;
	}

	public void setLPrenom(JLabel lPrenom) {
		LPrenom = lPrenom;
	}

	public void setLnom(JLabel lnom) {
		Lnom = lnom;
	}

	public void setLAnnee(JLabel lAnnee) {
		LAnnee = lAnnee;
	}

	public void setLage(JLabel lage) {
		Lage = lage;
	}

	public void setTnom(JTextField tnom) {
		Tnom = tnom;
	}

	public void setTprenom(JTextField tprenom) {
		Tprenom = tprenom;
	}

	public void setTannee(JTextField tannee) {
		Tannee = tannee;
	}

	public void setTage(JTextField tage) {
		Tage = tage;
	}

	public void setSubmit(JButton submit) {
		this.submit = submit;
	}

	public void setReset(JButton reset) {
		this.reset = reset;
	}

	public void setP(JPanel p) {
		P = p;
	}

	public void setP1(JPanel p1) {
		P1 = p1;
	}

	public void setP2(JPanel p2) {
		P2 = p2;
	}

	public void setP3(JPanel p3) {
		P3 = p3;
	}

	public void setBe(BorderLayout be) {
		Be = be;
	}

	public void setGl(GridLayout gl) {
		this.gl = gl;
	}

	public void setFl(FlowLayout fl) {
		this.fl = fl;
	}

	public void setBl(BorderLayout bl) {
		this.bl = bl;
	}

	public void setFe(FlowLayout fe) {
		Fe = fe;
	}

	public Fenp(String titre, int W, int H) {

		this.setTitle(titre);
		this.setSize(W, H);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);

		Lnom = new JLabel("Votre nom");
		Tnom = new JTextField(" ", 15);

		LPrenom = new JLabel("Votre Prenom");
		Tprenom = new JTextField(" ", 15);
		
		LAnnee = new JLabel("Votre Année");
		Tannee = new JTextField("", 4);
		
		Tage = new JTextField("", 100);
		submit = new JButton("Age?");
		reset = new JButton("Reverse");
		
		P1 = new JPanel();
		gl = new GridLayout(3, 2);
		
		P1.setLayout(gl);
		
		P1.add(Lnom);
		P1.add(Tnom);
		P1.add(LPrenom);
		P1.add(Tprenom);
		P1.add(LAnnee);
		P1.add(Tannee);
		
		//JPanel P11 = new JPanel(new FlowLayout());
				
		P2 = new JPanel();
		fl = new FlowLayout();
		
		P2.setLayout(fl);
		Tage.setEditable(false);
		Tage.setBackground(Color.cyan);
		
		P2.add(Tage);
		P2.setBackground(Color.green);

		

		P3 = new JPanel();
		P3.setLayout(fl);
		P3.add(submit);
		P3.add(reset);

		P3.setBackground(Color.yellow);

		P = new JPanel();
		bl = new BorderLayout();

		P.setLayout(bl);
		P.add(P1, BorderLayout.NORTH);
		P.add(P2, BorderLayout.CENTER);
		P.add(P3, BorderLayout.SOUTH);
		this.setContentPane(P);
		
		this.setVisible(true);
		submit.addActionListener(new TraitementAge(this));

		//this.pack();
	}

	public static void main(String[] args) {
		new Fenp("Age", 400, 400);
	}
}
