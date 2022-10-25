import java.util.ArrayList;
import java.util.List;

public class SymbolTable {
	List<VarSym> symbols = new ArrayList<>();
	
	
	public void addSymbol(VarSym symbol) {
		this.symbols.add(symbol);
	}
	
}
