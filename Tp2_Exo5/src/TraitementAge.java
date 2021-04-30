import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;


public class TraitementAge implements ActionListener{

	Fenp f;
	public TraitementAge(Fenp f){
		this.f = f;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==f.getSubmit()){
			if(f.getTannee().getText()!=""){
				int annee_cours = Calendar.getInstance().get(Calendar.YEAR);
				int annee_naisssance = Integer.parseInt(f.getTannee().getText());
				int age = annee_cours - annee_naisssance;

				String chaine = new String();
				chaine = "Mr/Mme " + f.getTnom().getText() + " a " + age;
				System.out.println(chaine);
				f.getTage().setText("DDDDDDDDDDDDDDDDDDDDd");
			}
			//
		}

	}


}
