/* Generated By:JJTree: Do not edit this line. ASTAtom.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTAtom extends SimpleNode {
	
	
	
  public ASTAtom(int id) {
    super(id);
  }

  public ASTAtom(Parser p, int id) {
    super(p, id);
  }
  
  public ASTAtom(int id, String value) {
	  super(id);
	  this.name = value;
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
  
  public SimpleNode interpret(Environment env) {
	  if(this.type.equals("int") || this.type.equals("float")) {
		  return this;
	  }
	  else if (this.type.equals("ident")) {
		  if (env.idList.containsKey(this.name)) {
			  return env.get(this.name);
		  } else {
			  return this;
		  }
	  }
	  else {
		int children = jjtGetNumChildren();
		for(int i = 0; i < children; i++)
			((SimpleNode)jjtGetChild(i)).interpret(env);
		return null;
	  }
  }
}
/* JavaCC - OriginalChecksum=f115b6ea13355cb6e7231e7ad5c6f52b (do not edit this line) */