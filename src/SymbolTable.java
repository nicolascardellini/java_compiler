import java.util.ArrayList;
import java.util.List;

public class SymbolTable {
	List<VarSym> symbols = new ArrayList<>();
	
	
	public void addSymbol(VarSym symbol) {
		this.symbols.add(symbol);
	}
	
	public VarSym getSymbol(String name) {
		for(VarSym sym : symbols) {
			if(sym.getName().equals(name)) {
				return sym;
			}
		}
		return null;
	}
	
	public boolean exist(String name) {
		return this.getSymbol(name)!=null;
	}
}
