
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

import java_cup.runtime.*;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\027\000\002\004\004\000\002\002\004\000\002\004" +
    "\003\000\002\005\004\000\002\005\003\000\002\006\004" +
    "\000\002\006\003\000\002\007\007\000\002\010\006\000" +
    "\002\010\005\000\002\002\003\000\002\002\003\000\002" +
    "\003\005\000\002\003\005\000\002\003\005\000\002\003" +
    "\005\000\002\003\005\000\002\003\005\000\002\003\005" +
    "\000\002\003\003\000\002\003\003\000\002\003\003\000" +
    "\002\003\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\053\000\012\017\013\020\015\021\012\024\010\001" +
    "\002\000\006\021\012\024\010\001\002\000\004\002\054" +
    "\001\002\000\004\002\uffff\001\002\000\012\017\013\020" +
    "\015\021\ufffd\024\ufffd\001\002\000\004\022\050\001\002" +
    "\000\004\024\044\001\002\000\014\011\023\015\020\016" +
    "\022\023\021\024\017\001\002\000\004\024\ufff6\001\002" +
    "\000\010\002\ufffb\021\012\024\010\001\002\000\004\024" +
    "\ufff7\001\002\000\004\002\ufffc\001\002\000\022\004\uffed" +
    "\005\uffed\006\uffed\007\uffed\010\uffed\012\uffed\013\uffed\014" +
    "\uffed\001\002\000\022\004\uffec\005\uffec\006\uffec\007\uffec" +
    "\010\uffec\012\uffec\013\uffec\014\uffec\001\002\000\022\004" +
    "\uffee\005\uffee\006\uffee\007\uffee\010\uffee\012\uffee\013\uffee" +
    "\014\uffee\001\002\000\022\004\uffeb\005\uffeb\006\uffeb\007" +
    "\uffeb\010\uffeb\012\uffeb\013\uffeb\014\uffeb\001\002\000\014" +
    "\011\023\015\020\016\022\023\021\024\017\001\002\000" +
    "\020\004\027\005\026\006\030\007\033\010\031\013\025" +
    "\014\032\001\002\000\014\011\023\015\020\016\022\023" +
    "\021\024\017\001\002\000\014\011\023\015\020\016\022" +
    "\023\021\024\017\001\002\000\010\002\ufff8\021\ufff8\024" +
    "\ufff8\001\002\000\014\011\023\015\020\016\022\023\021" +
    "\024\017\001\002\000\014\011\023\015\020\016\022\023" +
    "\021\024\017\001\002\000\014\011\023\015\020\016\022" +
    "\023\021\024\017\001\002\000\014\011\023\015\020\016" +
    "\022\023\021\024\017\001\002\000\022\004\ufff1\005\ufff1" +
    "\006\ufff1\007\ufff1\010\ufff1\012\ufff1\013\ufff1\014\ufff1\001" +
    "\002\000\022\004\ufff4\005\026\006\030\007\033\010\031" +
    "\012\ufff4\013\ufff4\014\ufff4\001\002\000\022\004\ufff0\005" +
    "\ufff0\006\ufff0\007\ufff0\010\ufff0\012\ufff0\013\ufff0\014\ufff0" +
    "\001\002\000\022\004\ufff2\005\ufff2\006\ufff2\007\033\010" +
    "\031\012\ufff2\013\ufff2\014\ufff2\001\002\000\022\004\ufff3" +
    "\005\ufff3\006\ufff3\007\033\010\031\012\ufff3\013\ufff3\014" +
    "\ufff3\001\002\000\022\004\ufff5\005\026\006\030\007\033" +
    "\010\031\012\ufff5\013\ufff5\014\032\001\002\000\020\005" +
    "\026\006\030\007\033\010\031\012\043\013\025\014\032" +
    "\001\002\000\022\004\uffef\005\uffef\006\uffef\007\uffef\010" +
    "\uffef\012\uffef\013\uffef\014\uffef\001\002\000\004\022\045" +
    "\001\002\000\014\011\023\015\020\016\022\023\021\024" +
    "\017\001\002\000\020\004\047\005\026\006\030\007\033" +
    "\010\031\013\025\014\032\001\002\000\012\017\ufffa\020" +
    "\ufffa\021\ufffa\024\ufffa\001\002\000\014\011\023\015\020" +
    "\016\022\023\021\024\017\001\002\000\020\004\052\005" +
    "\026\006\030\007\033\010\031\013\025\014\032\001\002" +
    "\000\010\002\ufff9\021\ufff9\024\ufff9\001\002\000\006\021" +
    "\ufffe\024\ufffe\001\002\000\004\002\000\001\002\000\004" +
    "\002\001\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\053\000\016\002\010\004\004\005\003\006\005\007" +
    "\006\010\013\001\001\000\006\006\054\010\013\001\001" +
    "\000\002\001\001\000\002\001\001\000\010\002\010\005" +
    "\052\007\006\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\003\023\001\001\000\002\001\001\000\006\006" +
    "\015\010\013\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\003\041\001\001\000\002\001\001" +
    "\000\004\003\040\001\001\000\004\003\037\001\001\000" +
    "\002\001\001\000\004\003\036\001\001\000\004\003\035" +
    "\001\001\000\004\003\034\001\001\000\004\003\033\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\003\045\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\003\050\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



	
	SymbolTable st = new SymbolTable();
	int globalOffset = -4;
    
    
    
    public void report_error(String message, Object info) {
   
        /* Create a StringBuffer called 'm' with the string 'Error' in it. */
        StringBuffer m = new StringBuffer("Error");
   
        /* Check if the information passed to the method is the same
           type as the type java_cup.runtime.Symbol. */
        if (info instanceof java_cup.runtime.Symbol) {
            /* Declare a java_cup.runtime.Symbol object 's' with the
               information in the object info that is being typecasted
               as a java_cup.runtime.Symbol object. */
            java_cup.runtime.Symbol s = ((java_cup.runtime.Symbol) info);
   
            /* Check if the line number in the input is greater or
               equal to zero. */
            if (s.left >= 0) {                
                /* Add to the end of the StringBuffer error message
                   the line number of the error in the input. */
                m.append(" in line "+(s.left+1));   
                /* Check if the column number in the input is greater
                   or equal to zero. */
                if (s.right >= 0)                    
                    /* Add to the end of the StringBuffer error message
                       the column number of the error in the input. */
                    m.append(", column "+(s.right+1));
            }
        }
   
        /* Add to the end of the StringBuffer error message created in
           this method the message that was passed into this method. */
        m.append(" : "+message);
   
        /* Print the contents of the StringBuffer 'm', which contains
           an error message, out on a line. */
        System.err.println(m);
    }
   
    /* Change the method report_fatal_error so when it reports a fatal
       error it will display the line and column number of where the
       fatal error occurred in the input as well as the reason for the
       fatal error which is passed into the method in the object
       'message' and then exit.*/
    public void report_fatal_error(String message, Object info) {
        report_error(message, info);
        System.exit(1);
    }


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$parser$do_action_part00000000(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // program ::= ld ls 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("program",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= program EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // program ::= ls 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("program",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // ld ::= d ld 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("ld",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // ld ::= d 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("ld",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // ls ::= s ls 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("ls",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // ls ::= s 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("ls",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // d ::= type ID ASSIG expr SEMI 
            {
              Object RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).left;
		int tright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).right;
		Integer t = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-4)).value;
		int Ileft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int Iright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		String I = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		VarSym e = (VarSym)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		
   		  
   		  	if(st.exist(I)){
   		  		System.out.println("Error: variable redefined: " + I);
                System.exit(1);
   		  	}
   		  	st.addSymbol(new VarSym(I, t, e.getValue(),1, globalOffset));
   		  	globalOffset -= 4;
   		  	
   		  	if(e.getFlag() == 1){
   		  		System.out.println("mov " + e.getOffset() + "(%ebp), %ed");
   		  	}
   		  	
   		  	else {
   		  		System.out.println("mov $" + e.getValue() + ", " + st.getSymbol(I).getOffset() + "(%ebp)");
   		  	}
   		  	
   		  
   		 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("d",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // s ::= ID ASSIG expr SEMI 
            {
              Object RESULT =null;
		int Ileft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int Iright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		String I = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		VarSym e = (VarSym)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		
   		  
   		  	if(!st.exist(I)){
   		  		System.out.println("Error: variable redefined: " + I);
                System.exit(1);
   		  	}
   		  	
   		  	st.getSymbol(I).setValue(e.getValue());
   		  	
   		  
   		 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("s",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // s ::= RETURN expr SEMI 
            {
              Object RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		VarSym e = (VarSym)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		
         	{ if (e.getFlag() == 0) {
                                            System.out.println("mov $" + e.getValue() +", %ed");
                                            System.out.println("call print");
                                       }else{
                                            System.out.println("mov " + e.getOffset() +"(%rbp), %ed");
                                            System.out.println("call print");
                                       } 
                                 }
         
              CUP$parser$result = parser.getSymbolFactory().newSymbol("s",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // type ::= TYPEBOOL 
            {
              Integer RESULT =null;
		 RESULT = new Integer(0); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("type",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // type ::= TYPEINT 
            {
              Integer RESULT =null;
		 RESULT = new Integer(1); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("type",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // expr ::= expr AND expr 
            {
              VarSym RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		VarSym e1 = (VarSym)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		VarSym e2 = (VarSym)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		if(e1.getType() == 1 && e2.getType() == 1) 
                 							{
	                 							if(e1.getValue() == 1 && e2.getValue() == 1){
	                 								RESULT = new VarSym("aux", 1, 1);
	                 							}
	                 							else
	                 							{
	                 								RESULT = new VarSym ("aux", 1, 0);
	                 							}
                 							}
                 							else{
	                 							System.out.println("Error: operacion boleana no valida con numeros");
	                                          	System.exit(1);
                 							}
                 						
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // expr ::= expr OR expr 
            {
              VarSym RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		VarSym e1 = (VarSym)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		VarSym e2 = (VarSym)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		if(e1.getType() == 1 && e2.getType() == 1) 
                 							{
	                 							if(e1.getValue() == 1 || e2.getValue() == 1){
	                 								RESULT = new VarSym("aux", 1, 1);
	                 							}
	                 							else {
	                 								System.out.println("Error: operacion aritmetica no valida con booleanos");
                                             		System.exit(1);
	                 							}
                 							}
                 							else{
	                 							System.out.println("Error: operacion boleana no valida con numeros");
	                                          	System.exit(1);
                 							}
                 						
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // expr ::= expr PLUS expr 
            {
              VarSym RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		VarSym e1 = (VarSym)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		VarSym e2 = (VarSym)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
                 							//flag = 0 -> number, flag = 1 -> variable 
                 							if(e1.getType() == 1 && e2.getType() == 1){
                 								RESULT = new VarSym("aux", 1, e1.getValue() + e2.getValue(), 1, globalOffset);
                 								VarSym aux = new VarSym("aux", 1, e1.getValue() + e2.getValue(), 1, globalOffset);
                 								globalOffset -= 4;
                 								if(e1.getFlag() == 1){
                 									System.out.println("mov " + st.getSymbol(e1.getName()).getOffset() + "(%ebp), %eax");
                 									if(e2.getFlag() == 1){
                 										System.out.println("add " + st.getSymbol(e2.getName()).getOffset() + ", " + st.getSymbol(e2.getName()).getOffset() + "%eax");
                 									}
                 									else {
                 										
                 										System.out.println("add " + e2.getValue() + ",%eax");
                 										System.out.println("mov %eax," + globalOffset + "(%ebp)");
                 										
                 									}
                 								}
                 								
                 								else{
                 									if(e2.getFlag() == 1){
                 										System.out.println("add $" + e1.getValue() + ",%eax" );
                 										System.out.println("mov %eax," + globalOffset + "(%ebp)");
                 									}
                 									else{
                 										System.out.println("mov $" + e1.getValue() + ",%eax" );
                 										System.out.println("add $" + e2.getValue() + ",%eax" );
                 										System.out.println("mov %eax, %ed");
                 										
                 									}
                 								}
                 								
                 							}
                 							else {
	                 								System.out.println("Error: operacion aritmetica no valida con booleanos");
                                             		System.exit(1);
	                 						}
                 						
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // expr ::= expr MINUS expr 
            {
              VarSym RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		VarSym e1 = (VarSym)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		VarSym e2 = (VarSym)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
                 							if(e1.getType() == 0 && e2.getType() == 0){
                 								RESULT  =  new VarSym("aux", 0, e1.getValue() - e2.getValue());
                 							}
                 							else {
	                 								System.out.println("Error: operacion aritmetica no valida con booleanos");
                                             		System.exit(1);
	                 						}
                 						 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // expr ::= expr TIMES expr 
            {
              VarSym RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		VarSym e1 = (VarSym)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		VarSym e2 = (VarSym)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
                 							if(e1.getType() == 0 && e2.getType() == 0){
                 							 RESULT = new VarSym("aux", 0, e1.getValue() * e2.getValue());
                 							}
                 							else {
	                 								System.out.println("Error: operacion aritmetica no valida con booleanos");
                                             		System.exit(1);
	                 						}
                 						 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // expr ::= expr DIVIDE expr 
            {
              VarSym RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		VarSym e1 = (VarSym)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		VarSym e2 = (VarSym)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
                 							if(e1.getType() == 0 && e2.getType() == 0){
                 								RESULT = new VarSym("aux", 0, e1.getValue() / e2.getValue());
                 							}
                 							else {
	                 								System.out.println("Error: operacion aritmetica no valida con booleanos");
                                             		System.exit(1);
	                 						}
                 						  
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // expr ::= LPAREN expr RPAREN 
            {
              VarSym RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		VarSym e = (VarSym)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = new VarSym("aux", e.getType(), e.getValue());  
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // expr ::= NUMBER 
            {
              VarSym RESULT =null;
		int Nleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int Nright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Integer N = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new VarSym("num", new Integer(1), new Integer((int) N), 0, 0); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // expr ::= ID 
            {
              VarSym RESULT =null;
		int Ileft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int Iright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String I = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
                 			if(!st.exist(I)){
                 				System.out.println("Error: undefined variable " + I);
                                System.exit(1);
                 			}
                 			RESULT = st.getSymbol(I);
                 				
                 		
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // expr ::= TRUE 
            {
              VarSym RESULT =null;
		
                 			RESULT = new VarSym("BOOL", new Integer(0), new Integer(1)); 
                 		
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // expr ::= FALSE 
            {
              VarSym RESULT =null;
		
                 			RESULT = new VarSym("BOOL", new Integer(0), new Integer(0));
                 		
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
              return CUP$parser$do_action_part00000000(
                               CUP$parser$act_num,
                               CUP$parser$parser,
                               CUP$parser$stack,
                               CUP$parser$top);
    }
}

}
