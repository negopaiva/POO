package CartaoWeb;

public class Natal extends CartaoWeb {
	
	

	public Natal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Natal(String destinatario) {
		super(destinatario);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ShowMessage() {
		System.out.println("Feliz natal!\t" + getDestinatario() + " S2 \n");
		// TODO Auto-generated method stub
		
	}
	

}
