
//----------------------------------------------------
// The following code was generated by CUP v0.10k
// Fri Apr 24 17:45:54 KST 2015
//----------------------------------------------------

import java_cup.runtime.*;

/** CUP v0.10k generated parser.
  * @version Fri Apr 24 17:45:54 KST 2015
  */
public class parser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\020\000\002\003\004\000\002\002\004\000\002\003" +
    "\003\000\002\004\003\000\002\004\003\000\002\004\003" +
    "\000\002\004\003\000\002\004\003\000\002\004\003\000" +
    "\002\004\003\000\002\004\003\000\002\004\003\000\002" +
    "\004\003\000\002\004\003\000\002\004\003\000\002\004" +
    "\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\022\000\034\004\013\005\004\006\010\007\015\010" +
    "\020\011\012\012\006\013\022\014\014\015\011\016\021" +
    "\017\016\020\007\001\002\000\036\002\ufffd\004\ufffd\005" +
    "\ufffd\006\ufffd\007\ufffd\010\ufffd\011\ufffd\012\ufffd\013\ufffd" +
    "\014\ufffd\015\ufffd\016\ufffd\017\ufffd\020\ufffd\001\002\000" +
    "\036\002\uffff\004\uffff\005\uffff\006\uffff\007\uffff\010\uffff" +
    "\011\uffff\012\uffff\013\uffff\014\uffff\015\uffff\016\uffff\017" +
    "\uffff\020\uffff\001\002\000\036\002\ufff8\004\ufff8\005\ufff8" +
    "\006\ufff8\007\ufff8\010\ufff8\011\ufff8\012\ufff8\013\ufff8\014" +
    "\ufff8\015\ufff8\016\ufff8\017\ufff8\020\ufff8\001\002\000\036" +
    "\002\ufff2\004\ufff2\005\ufff2\006\ufff2\007\ufff2\010\ufff2\011" +
    "\ufff2\012\ufff2\013\ufff2\014\ufff2\015\ufff2\016\ufff2\017\ufff2" +
    "\020\ufff2\001\002\000\036\002\ufffc\004\ufffc\005\ufffc\006" +
    "\ufffc\007\ufffc\010\ufffc\011\ufffc\012\ufffc\013\ufffc\014\ufffc" +
    "\015\ufffc\016\ufffc\017\ufffc\020\ufffc\001\002\000\036\002" +
    "\ufff5\004\ufff5\005\ufff5\006\ufff5\007\ufff5\010\ufff5\011\ufff5" +
    "\012\ufff5\013\ufff5\014\ufff5\015\ufff5\016\ufff5\017\ufff5\020" +
    "\ufff5\001\002\000\036\002\ufff9\004\ufff9\005\ufff9\006\ufff9" +
    "\007\ufff9\010\ufff9\011\ufff9\012\ufff9\013\ufff9\014\ufff9\015" +
    "\ufff9\016\ufff9\017\ufff9\020\ufff9\001\002\000\036\002\ufffe" +
    "\004\ufffe\005\ufffe\006\ufffe\007\ufffe\010\ufffe\011\ufffe\012" +
    "\ufffe\013\ufffe\014\ufffe\015\ufffe\016\ufffe\017\ufffe\020\ufffe" +
    "\001\002\000\036\002\ufff6\004\ufff6\005\ufff6\006\ufff6\007" +
    "\ufff6\010\ufff6\011\ufff6\012\ufff6\013\ufff6\014\ufff6\015\ufff6" +
    "\016\ufff6\017\ufff6\020\ufff6\001\002\000\036\002\ufffb\004" +
    "\ufffb\005\ufffb\006\ufffb\007\ufffb\010\ufffb\011\ufffb\012\ufffb" +
    "\013\ufffb\014\ufffb\015\ufffb\016\ufffb\017\ufffb\020\ufffb\001" +
    "\002\000\036\002\ufff3\004\ufff3\005\ufff3\006\ufff3\007\ufff3" +
    "\010\ufff3\011\ufff3\012\ufff3\013\ufff3\014\ufff3\015\ufff3\016" +
    "\ufff3\017\ufff3\020\ufff3\001\002\000\036\002\024\004\013" +
    "\005\004\006\010\007\015\010\020\011\012\012\006\013" +
    "\022\014\014\015\011\016\021\017\016\020\007\001\002" +
    "\000\036\002\ufffa\004\ufffa\005\ufffa\006\ufffa\007\ufffa\010" +
    "\ufffa\011\ufffa\012\ufffa\013\ufffa\014\ufffa\015\ufffa\016\ufffa" +
    "\017\ufffa\020\ufffa\001\002\000\036\002\ufff4\004\ufff4\005" +
    "\ufff4\006\ufff4\007\ufff4\010\ufff4\011\ufff4\012\ufff4\013\ufff4" +
    "\014\ufff4\015\ufff4\016\ufff4\017\ufff4\020\ufff4\001\002\000" +
    "\036\002\ufff7\004\ufff7\005\ufff7\006\ufff7\007\ufff7\010\ufff7" +
    "\011\ufff7\012\ufff7\013\ufff7\014\ufff7\015\ufff7\016\ufff7\017" +
    "\ufff7\020\ufff7\001\002\000\036\002\001\004\001\005\001" +
    "\006\001\007\001\010\001\011\001\012\001\013\001\014" +
    "\001\015\001\016\001\017\001\020\001\001\002\000\004" +
    "\002\000\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\022\000\006\003\016\004\004\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\004\022\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001" });

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

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
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
          case 15: // node ::= GE 
            {
              Object RESULT = null;
		 System.out.println("KEYWORD(GE)"); 
              CUP$parser$result = new java_cup.runtime.Symbol(2/*node*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // node ::= GT 
            {
              Object RESULT = null;
		 System.out.println("KEYWORD(GT)"); 
              CUP$parser$result = new java_cup.runtime.Symbol(2/*node*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // node ::= NE 
            {
              Object RESULT = null;
		 System.out.println("KEYWORD(NE)"); 
              CUP$parser$result = new java_cup.runtime.Symbol(2/*node*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // node ::= EQ 
            {
              Object RESULT = null;
		 System.out.println("KEYWORD(EQ)"); 
              CUP$parser$result = new java_cup.runtime.Symbol(2/*node*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // node ::= LE 
            {
              Object RESULT = null;
		 System.out.println("KEYWORD(LE)"); 
              CUP$parser$result = new java_cup.runtime.Symbol(2/*node*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // node ::= LT 
            {
              Object RESULT = null;
		 System.out.println("KEYWORD(LT)"); 
              CUP$parser$result = new java_cup.runtime.Symbol(2/*node*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // node ::= NUMBER 
            {
              Object RESULT = null;
		 System.out.println("NUMBER"); 
              CUP$parser$result = new java_cup.runtime.Symbol(2/*node*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // node ::= STRING 
            {
              Object RESULT = null;
		 System.out.println("STRING"); 
              CUP$parser$result = new java_cup.runtime.Symbol(2/*node*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // node ::= IDENTIFIER 
            {
              Object RESULT = null;
		 System.out.println("IDENTIFIER"); 
              CUP$parser$result = new java_cup.runtime.Symbol(2/*node*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // node ::= ELSE 
            {
              Object RESULT = null;
		 System.out.println("KEYWORD(ELSE)"); 
              CUP$parser$result = new java_cup.runtime.Symbol(2/*node*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // node ::= THEN 
            {
              Object RESULT = null;
		 System.out.println("KEYWORD(THEN)"); 
              CUP$parser$result = new java_cup.runtime.Symbol(2/*node*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // node ::= WHILE 
            {
              Object RESULT = null;
		 System.out.println("KEYWORD(WHILE)"); 
              CUP$parser$result = new java_cup.runtime.Symbol(2/*node*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // node ::= IF 
            {
              Object RESULT = null;
		 System.out.println("KEYWORD(IF)"); 
              CUP$parser$result = new java_cup.runtime.Symbol(2/*node*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // start_symbol ::= node 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(1/*start_symbol*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= start_symbol EOF 
            {
              Object RESULT = null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = new java_cup.runtime.Symbol(0/*$START*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // start_symbol ::= start_symbol node 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(1/*start_symbol*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

