
package CartaoWeb;

public abstract class CartaoWeb {
	private String destinatario;

	public CartaoWeb(String destinatario) {
		super();
		this.destinatario = destinatario;
	}
	
	public CartaoWeb() {
		this.destinatario = "="; 
	}
	
	public abstract void ShowMessage(); 

	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

	@Override
	public String toString() {
		return "CartaoWeb [destinatario=" + destinatario + "]";
	}
	
	
	
	
	

}
