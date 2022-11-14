package CartaoWeb;

public class Aniversario extends CartaoWeb{
	
	

	public Aniversario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Aniversario(String destinatario) {
		super(destinatario);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ShowMessage() {
		System.out.println("Feliz Aniversario!!\t" + getDestinatario()+ " S2 \n");
		// TODO Auto-generated method stub
		
	}
	

}
