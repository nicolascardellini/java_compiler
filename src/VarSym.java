
   
public class VarSym {
	private String name;
	private int type;
	private int value;
	private int flag;
	private int offset = 0;
	
	public VarSym(String name, int type, int value) {
		this.name = name;
		this.type = type;
		this.value = value;
	}
	
	public VarSym(String name, int type, int value, int flag, int offset) {
		this.name = name;
		this.type = type;
		this.value = value;
		this.flag = flag;
		this.offset = offset;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public int getOffset() {
		return offset;
	}
	public void setOffset(int offset) {
		this.offset = offset;
	}

	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}
}