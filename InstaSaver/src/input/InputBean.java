package input;

public class InputBean implements InputData {
	
	private String msg;
	private InputType type;
	
	public InputBean(String msg, InputType type) {
		this.msg = msg;
		this.type = type;
	}
	
	@Override
	public String getInputString() {return msg;}
	public void setMsg(String msg) {this.msg = msg;}
	@Override
	public InputType getType() {return type;}
	public void setType(InputType type) {this.type = type;}
	
}
