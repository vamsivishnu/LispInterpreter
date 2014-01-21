/* Generated By:JJTree&JavaCC: Do not edit this line. Parser.java */
import java.io.*;

public class Parser/*@bgen(jjtree)*/implements ParserTreeConstants, ParserConstants {/*@bgen(jjtree)*/
  protected static JJTParserState jjtree = new JJTParserState();

  static final public ASTLispNode prog() throws ParseException {
 /*@bgen(jjtree) LispNode */
  ASTLispNode jjtn000 = new ASTLispNode(JJTLISPNODE);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);String s;
    try {
      if (jj_2_1(2)) {
        s = list();

      } else {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case NIL:
        case INTEGER:
        case FLOAT:
        case LAMBDA:
        case LET:
        case LETREC:
        case ADD_OP:
        case SUB_OP:
        case CAR:
        case CDR:
        case CONS:
        case IDENTIFIER:
          s = atom();

          break;
        default:
          jj_la1[0] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
      }
          jjtree.closeNodeScope(jjtn000, true);
          jjtc000 = false;
          jjtn000.name = "root"; {if (true) return jjtn000;}
    } catch (Throwable jjte000) {
          if (jjtc000) {
            jjtree.clearNodeScope(jjtn000);
            jjtc000 = false;
          } else {
            jjtree.popNode();
          }
          if (jjte000 instanceof RuntimeException) {
            {if (true) throw (RuntimeException)jjte000;}
          }
          if (jjte000 instanceof ParseException) {
            {if (true) throw (ParseException)jjte000;}
          }
          {if (true) throw (Error)jjte000;}
    } finally {
          if (jjtc000) {
            jjtree.closeNodeScope(jjtn000, true);
          }
    }
    throw new Error("Missing return statement in function");
  }

  static final public String list() throws ParseException {
 /*@bgen(jjtree) List */
  ASTList jjtn000 = new ASTList(JJTLIST);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);String s; String ret = "";
    try {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case LPAR:
            ret += "(";
        jj_consume_token(LPAR);
        label_1:
        while (true) {
          switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
          case NIL:
          case LPAR:
          case TICK:
          case INTEGER:
          case FLOAT:
          case LAMBDA:
          case LET:
          case LETREC:
          case ADD_OP:
          case SUB_OP:
          case CAR:
          case CDR:
          case CONS:
          case IDENTIFIER:
            ;
            break;
          default:
            jj_la1[1] = jj_gen;
            break label_1;
          }
          if (jj_2_2(2)) {
            s = list();
                                           ret += s;
          } else {
            switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
            case NIL:
            case INTEGER:
            case FLOAT:
            case LAMBDA:
            case LET:
            case LETREC:
            case ADD_OP:
            case SUB_OP:
            case CAR:
            case CDR:
            case CONS:
            case IDENTIFIER:
              s = atom();
                               ret += s + " ";
              break;
            default:
              jj_la1[2] = jj_gen;
              jj_consume_token(-1);
              throw new ParseException();
            }
          }
        }
        jj_consume_token(RPAR);
        break;
      case TICK:
            ret += "'(";
        jj_consume_token(TICK);
        jj_consume_token(LPAR);
        label_2:
        while (true) {
          switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
          case NIL:
          case LPAR:
          case TICK:
          case INTEGER:
          case FLOAT:
          case LAMBDA:
          case LET:
          case LETREC:
          case ADD_OP:
          case SUB_OP:
          case CAR:
          case CDR:
          case CONS:
          case IDENTIFIER:
            ;
            break;
          default:
            jj_la1[3] = jj_gen;
            break label_2;
          }
          if (jj_2_3(2)) {
            s = list();
                                           ret += s;
          } else {
            switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
            case NIL:
            case INTEGER:
            case FLOAT:
            case LAMBDA:
            case LET:
            case LETREC:
            case ADD_OP:
            case SUB_OP:
            case CAR:
            case CDR:
            case CONS:
            case IDENTIFIER:
              s = atom();
                               ret += s + " ";
              break;
            default:
              jj_la1[4] = jj_gen;
              jj_consume_token(-1);
              throw new ParseException();
            }
          }
        }
        jj_consume_token(RPAR);
        break;
      default:
        jj_la1[5] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
          jjtree.closeNodeScope(jjtn000, true);
          jjtc000 = false;
                ret += ") ";
                jjtn000.name = ret;
                jjtn000.type = "list";
                {if (true) return ret;}
    } catch (Throwable jjte000) {
          if (jjtc000) {
            jjtree.clearNodeScope(jjtn000);
            jjtc000 = false;
          } else {
            jjtree.popNode();
          }
          if (jjte000 instanceof RuntimeException) {
            {if (true) throw (RuntimeException)jjte000;}
          }
          if (jjte000 instanceof ParseException) {
            {if (true) throw (ParseException)jjte000;}
          }
          {if (true) throw (Error)jjte000;}
    } finally {
          if (jjtc000) {
            jjtree.closeNodeScope(jjtn000, true);
          }
    }
    throw new Error("Missing return statement in function");
  }

  static final public String atom() throws ParseException {
 /*@bgen(jjtree) Atom */
  ASTAtom jjtn000 = new ASTAtom(JJTATOM);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);Token n; String l;
    try {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case NIL:
        n = jj_consume_token(NIL);
                          jjtree.closeNodeScope(jjtn000, true);
                          jjtc000 = false;
                          jjtn000.name = n.image; jjtn000.type = "nil"; jjtn000.value = null; {if (true) return n.image;}
        break;
      case INTEGER:
        n = jj_consume_token(INTEGER);
                                  jjtree.closeNodeScope(jjtn000, true);
                                  jjtc000 = false;
                                  jjtn000.name = n.image; jjtn000.type = "int"; jjtn000.value = n.getValue(); {if (true) return n.image;}
        break;
      case FLOAT:
        n = jj_consume_token(FLOAT);
                                  jjtree.closeNodeScope(jjtn000, true);
                                  jjtc000 = false;
                          jjtn000.name = n.image; jjtn000.type = "float"; jjtn000.value = n.getValue(); {if (true) return n.image;}
        break;
      case IDENTIFIER:
        n = jj_consume_token(IDENTIFIER);
                                  jjtree.closeNodeScope(jjtn000, true);
                                  jjtc000 = false;
                                  jjtn000.name = n.image; jjtn000.type = "ident"; {if (true) return n.image;}
        break;
      case LAMBDA:
        n = jj_consume_token(LAMBDA);
                                  jjtree.closeNodeScope(jjtn000, true);
                                  jjtc000 = false;
                                  jjtn000.name = n.image; jjtn000.type = "lambda"; l = lambdaExpr(); {if (true) return "lambda" + l;}
        break;
      case ADD_OP:
        n = jj_consume_token(ADD_OP);
                                  jjtree.closeNodeScope(jjtn000, true);
                                  jjtc000 = false;
                                  jjtn000.name = n.image; jjtn000.type = "operator"; l = addExpr(); {if (true) return n.image + l;}
        break;
      case SUB_OP:
        n = jj_consume_token(SUB_OP);
                                  jjtree.closeNodeScope(jjtn000, true);
                                  jjtc000 = false;
                                  jjtn000.name = n.image; jjtn000.type = "operator"; l = subExpr(); {if (true) return n.image + l;}
        break;
      case CAR:
        n = jj_consume_token(CAR);
                                  jjtree.closeNodeScope(jjtn000, true);
                                  jjtc000 = false;
                                  jjtn000.name = n.image; jjtn000.type = "car"; l = car(); {if (true) return n.image + l;}
        break;
      case CDR:
        n = jj_consume_token(CDR);
                                  jjtree.closeNodeScope(jjtn000, true);
                                  jjtc000 = false;
                                  jjtn000.name = n.image; jjtn000.type = "cdr"; l = cdr(); {if (true) return n.image + l;}
        break;
      case CONS:
        n = jj_consume_token(CONS);
                                  jjtree.closeNodeScope(jjtn000, true);
                                  jjtc000 = false;
                                  jjtn000.name = n.image; jjtn000.type = "cons"; l = cons(); {if (true) return n.image + l;}
        break;
      case LET:
        n = jj_consume_token(LET);
                                  jjtree.closeNodeScope(jjtn000, true);
                                  jjtc000 = false;
                                  jjtn000.name = n.image; jjtn000.type = "let"; l = let(); {if (true) return n.image + l;}
        break;
      case LETREC:
        n = jj_consume_token(LETREC);
                                  jjtree.closeNodeScope(jjtn000, true);
                                  jjtc000 = false;
                                  jjtn000.name = n.image; jjtn000.type = "let"; l = let(); {if (true) return n.image + l;}
        break;
      default:
        jj_la1[6] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    } finally {
        if (jjtc000) {
          jjtree.closeNodeScope(jjtn000, true);
        }
    }
    throw new Error("Missing return statement in function");
  }

  static final public String car() throws ParseException {
 /*@bgen(jjtree) car */
  ASTcar jjtn000 = new ASTcar(JJTCAR);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);String s; String ret = " ";
    try {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case LPAR:
      case TICK:
        s = list();
                             ret += s;
        break;
      case NIL:
      case INTEGER:
      case FLOAT:
      case LAMBDA:
      case LET:
      case LETREC:
      case ADD_OP:
      case SUB_OP:
      case CAR:
      case CDR:
      case CONS:
      case IDENTIFIER:
        s = atom();
                               ret += s;
        break;
      default:
        jj_la1[7] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
          jjtree.closeNodeScope(jjtn000, true);
          jjtc000 = false;
          jjtn000.name = ret; jjtn000.type = "car"; {if (true) return ret;}
    } catch (Throwable jjte000) {
          if (jjtc000) {
            jjtree.clearNodeScope(jjtn000);
            jjtc000 = false;
          } else {
            jjtree.popNode();
          }
          if (jjte000 instanceof RuntimeException) {
            {if (true) throw (RuntimeException)jjte000;}
          }
          if (jjte000 instanceof ParseException) {
            {if (true) throw (ParseException)jjte000;}
          }
          {if (true) throw (Error)jjte000;}
    } finally {
          if (jjtc000) {
            jjtree.closeNodeScope(jjtn000, true);
          }
    }
    throw new Error("Missing return statement in function");
  }

  static final public String cdr() throws ParseException {
 /*@bgen(jjtree) cdr */
  ASTcdr jjtn000 = new ASTcdr(JJTCDR);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);String s; String ret = " ";
    try {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case LPAR:
      case TICK:
        s = list();
                             ret += s;
        break;
      case NIL:
      case INTEGER:
      case FLOAT:
      case LAMBDA:
      case LET:
      case LETREC:
      case ADD_OP:
      case SUB_OP:
      case CAR:
      case CDR:
      case CONS:
      case IDENTIFIER:
        s = atom();
                               ret += s;
        break;
      default:
        jj_la1[8] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
          jjtree.closeNodeScope(jjtn000, true);
          jjtc000 = false;
          jjtn000.name = ret; jjtn000.type = "cdr"; {if (true) return ret;}
    } catch (Throwable jjte000) {
          if (jjtc000) {
            jjtree.clearNodeScope(jjtn000);
            jjtc000 = false;
          } else {
            jjtree.popNode();
          }
          if (jjte000 instanceof RuntimeException) {
            {if (true) throw (RuntimeException)jjte000;}
          }
          if (jjte000 instanceof ParseException) {
            {if (true) throw (ParseException)jjte000;}
          }
          {if (true) throw (Error)jjte000;}
    } finally {
          if (jjtc000) {
            jjtree.closeNodeScope(jjtn000, true);
          }
    }
    throw new Error("Missing return statement in function");
  }

  static final public String cons() throws ParseException {
 /*@bgen(jjtree) cons */
  ASTcons jjtn000 = new ASTcons(JJTCONS);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);String s; String t; String ret = " ";
    try {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case LPAR:
      case TICK:
        s = list();
                             ret += s;
        break;
      case NIL:
      case INTEGER:
      case FLOAT:
      case LAMBDA:
      case LET:
      case LETREC:
      case ADD_OP:
      case SUB_OP:
      case CAR:
      case CDR:
      case CONS:
      case IDENTIFIER:
        s = atom();
                               ret += s;
        break;
      default:
        jj_la1[9] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case LPAR:
      case TICK:
        t = list();
                             ret += t;
        break;
      case NIL:
      case INTEGER:
      case FLOAT:
      case LAMBDA:
      case LET:
      case LETREC:
      case ADD_OP:
      case SUB_OP:
      case CAR:
      case CDR:
      case CONS:
      case IDENTIFIER:
        t = atom();
                               ret +=" "+ t;
        break;
      default:
        jj_la1[10] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
          jjtree.closeNodeScope(jjtn000, true);
          jjtc000 = false;
          jjtn000.name = ret; jjtn000.type = "cons"; {if (true) return ret;}
    } catch (Throwable jjte000) {
          if (jjtc000) {
            jjtree.clearNodeScope(jjtn000);
            jjtc000 = false;
          } else {
            jjtree.popNode();
          }
          if (jjte000 instanceof RuntimeException) {
            {if (true) throw (RuntimeException)jjte000;}
          }
          if (jjte000 instanceof ParseException) {
            {if (true) throw (ParseException)jjte000;}
          }
          {if (true) throw (Error)jjte000;}
    } finally {
          if (jjtc000) {
            jjtree.closeNodeScope(jjtn000, true);
          }
    }
    throw new Error("Missing return statement in function");
  }

  static final public String addExpr() throws ParseException {
 /*@bgen(jjtree) AddExpr */
  ASTAddExpr jjtn000 = new ASTAddExpr(JJTADDEXPR);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);String s; String t; String ret = "";
    try {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case LPAR:
      case TICK:
        s = list();
                             ret += s;
        break;
      case NIL:
      case INTEGER:
      case FLOAT:
      case LAMBDA:
      case LET:
      case LETREC:
      case ADD_OP:
      case SUB_OP:
      case CAR:
      case CDR:
      case CONS:
      case IDENTIFIER:
        s = atom();
                               ret +=" "+ s;
        break;
      default:
        jj_la1[11] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case LPAR:
      case TICK:
        t = list();
                             ret += t;
        break;
      case NIL:
      case INTEGER:
      case FLOAT:
      case LAMBDA:
      case LET:
      case LETREC:
      case ADD_OP:
      case SUB_OP:
      case CAR:
      case CDR:
      case CONS:
      case IDENTIFIER:
        t = atom();
                               ret +=" "+ t;
        break;
      default:
        jj_la1[12] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
          jjtree.closeNodeScope(jjtn000, true);
          jjtc000 = false;
          jjtn000.name = ret; jjtn000.type = "AddExpr"; {if (true) return ret;}
    } catch (Throwable jjte000) {
          if (jjtc000) {
            jjtree.clearNodeScope(jjtn000);
            jjtc000 = false;
          } else {
            jjtree.popNode();
          }
          if (jjte000 instanceof RuntimeException) {
            {if (true) throw (RuntimeException)jjte000;}
          }
          if (jjte000 instanceof ParseException) {
            {if (true) throw (ParseException)jjte000;}
          }
          {if (true) throw (Error)jjte000;}
    } finally {
          if (jjtc000) {
            jjtree.closeNodeScope(jjtn000, true);
          }
    }
    throw new Error("Missing return statement in function");
  }

  static final public String subExpr() throws ParseException {
 /*@bgen(jjtree) SubExpr */
  ASTSubExpr jjtn000 = new ASTSubExpr(JJTSUBEXPR);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);String s; String t; String ret = "";
    try {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case LPAR:
      case TICK:
        s = list();
                              ret += s;
        break;
      case NIL:
      case INTEGER:
      case FLOAT:
      case LAMBDA:
      case LET:
      case LETREC:
      case ADD_OP:
      case SUB_OP:
      case CAR:
      case CDR:
      case CONS:
      case IDENTIFIER:
        s = atom();
                               ret += " " + s;
        break;
      default:
        jj_la1[13] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case LPAR:
      case TICK:
        t = list();
                             ret += t;
        break;
      case NIL:
      case INTEGER:
      case FLOAT:
      case LAMBDA:
      case LET:
      case LETREC:
      case ADD_OP:
      case SUB_OP:
      case CAR:
      case CDR:
      case CONS:
      case IDENTIFIER:
        t = atom();
                               ret += " " + t;
        break;
      default:
        jj_la1[14] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
          jjtree.closeNodeScope(jjtn000, true);
          jjtc000 = false;
          jjtn000.name = ret; jjtn000.type = "SubExpr"; {if (true) return ret;}
    } catch (Throwable jjte000) {
          if (jjtc000) {
            jjtree.clearNodeScope(jjtn000);
            jjtc000 = false;
          } else {
            jjtree.popNode();
          }
          if (jjte000 instanceof RuntimeException) {
            {if (true) throw (RuntimeException)jjte000;}
          }
          if (jjte000 instanceof ParseException) {
            {if (true) throw (ParseException)jjte000;}
          }
          {if (true) throw (Error)jjte000;}
    } finally {
          if (jjtc000) {
            jjtree.closeNodeScope(jjtn000, true);
          }
    }
    throw new Error("Missing return statement in function");
  }

  static final public String let() throws ParseException {
 /*@bgen(jjtree) LetExpr */
  ASTLetExpr jjtn000 = new ASTLetExpr(JJTLETEXPR);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);String a, b, c, ret = "(";
    try {
      jj_consume_token(LPAR);
      label_3:
      while (true) {
        jj_consume_token(LPAR);
        a = atom();
        if (jj_2_4(2)) {
          b = list();
        } else {
          switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
          case NIL:
          case INTEGER:
          case FLOAT:
          case LAMBDA:
          case LET:
          case LETREC:
          case ADD_OP:
          case SUB_OP:
          case CAR:
          case CDR:
          case CONS:
          case IDENTIFIER:
            b = atom();
            break;
          default:
            jj_la1[15] = jj_gen;
            jj_consume_token(-1);
            throw new ParseException();
          }
        }
        jj_consume_token(RPAR);
          ret += "(" + a + " " + b + ")";
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case LPAR:
          ;
          break;
        default:
          jj_la1[16] = jj_gen;
          break label_3;
        }
      }
      jj_consume_token(RPAR);
      if (jj_2_5(2)) {
        c = list();
      } else {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case NIL:
        case INTEGER:
        case FLOAT:
        case LAMBDA:
        case LET:
        case LETREC:
        case ADD_OP:
        case SUB_OP:
        case CAR:
        case CDR:
        case CONS:
        case IDENTIFIER:
          c = atom();
          break;
        default:
          jj_la1[17] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
      }
          jjtree.closeNodeScope(jjtn000, true);
          jjtc000 = false;
          ret +=  ") " + c; jjtn000.name = ret; jjtn000.type = "car";  {if (true) return ret;}
    } catch (Throwable jjte000) {
          if (jjtc000) {
            jjtree.clearNodeScope(jjtn000);
            jjtc000 = false;
          } else {
            jjtree.popNode();
          }
          if (jjte000 instanceof RuntimeException) {
            {if (true) throw (RuntimeException)jjte000;}
          }
          if (jjte000 instanceof ParseException) {
            {if (true) throw (ParseException)jjte000;}
          }
          {if (true) throw (Error)jjte000;}
    } finally {
          if (jjtc000) {
            jjtree.closeNodeScope(jjtn000, true);
          }
    }
    throw new Error("Missing return statement in function");
  }

  static final public String lambdaExpr() throws ParseException {
 /*@bgen(jjtree) LambdaExpr */
  ASTLambdaExpr jjtn000 = new ASTLambdaExpr(JJTLAMBDAEXPR);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);String s, t; String ret = "";
    try {
      s = list();
      if (jj_2_6(2)) {
        t = list();
      } else {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case NIL:
        case INTEGER:
        case FLOAT:
        case LAMBDA:
        case LET:
        case LETREC:
        case ADD_OP:
        case SUB_OP:
        case CAR:
        case CDR:
        case CONS:
        case IDENTIFIER:
          t = atom();
          break;
        default:
          jj_la1[18] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
      }
          jjtree.closeNodeScope(jjtn000, true);
          jjtc000 = false;
          ret = s + t; jjtn000.name = ret; jjtn000.type = "car"; {if (true) return ret;}
    } catch (Throwable jjte000) {
          if (jjtc000) {
            jjtree.clearNodeScope(jjtn000);
            jjtc000 = false;
          } else {
            jjtree.popNode();
          }
          if (jjte000 instanceof RuntimeException) {
            {if (true) throw (RuntimeException)jjte000;}
          }
          if (jjte000 instanceof ParseException) {
            {if (true) throw (ParseException)jjte000;}
          }
          {if (true) throw (Error)jjte000;}
    } finally {
          if (jjtc000) {
            jjtree.closeNodeScope(jjtn000, true);
          }
    }
    throw new Error("Missing return statement in function");
  }

  static private boolean jj_2_1(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_1(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(0, xla); }
  }

  static private boolean jj_2_2(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_2(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(1, xla); }
  }

  static private boolean jj_2_3(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_3(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(2, xla); }
  }

  static private boolean jj_2_4(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_4(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(3, xla); }
  }

  static private boolean jj_2_5(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_5(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(4, xla); }
  }

  static private boolean jj_2_6(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_6(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(5, xla); }
  }

  static private boolean jj_3R_5() {
    if (jj_scan_token(LPAR)) return true;
    Token xsp;
    while (true) {
      xsp = jj_scanpos;
      if (jj_3R_7()) { jj_scanpos = xsp; break; }
    }
    if (jj_scan_token(RPAR)) return true;
    return false;
  }

  static private boolean jj_3_4() {
    if (jj_3R_4()) return true;
    return false;
  }

  static private boolean jj_3R_21() {
    if (jj_scan_token(LETREC)) return true;
    return false;
  }

  static private boolean jj_3R_4() {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_5()) {
    jj_scanpos = xsp;
    if (jj_3R_6()) return true;
    }
    return false;
  }

  static private boolean jj_3R_20() {
    if (jj_scan_token(LET)) return true;
    return false;
  }

  static private boolean jj_3_1() {
    if (jj_3R_4()) return true;
    return false;
  }

  static private boolean jj_3R_19() {
    if (jj_scan_token(CONS)) return true;
    return false;
  }

  static private boolean jj_3R_18() {
    if (jj_scan_token(CDR)) return true;
    return false;
  }

  static private boolean jj_3R_17() {
    if (jj_scan_token(CAR)) return true;
    return false;
  }

  static private boolean jj_3R_16() {
    if (jj_scan_token(SUB_OP)) return true;
    return false;
  }

  static private boolean jj_3R_15() {
    if (jj_scan_token(ADD_OP)) return true;
    return false;
  }

  static private boolean jj_3R_14() {
    if (jj_scan_token(LAMBDA)) return true;
    return false;
  }

  static private boolean jj_3R_13() {
    if (jj_scan_token(IDENTIFIER)) return true;
    return false;
  }

  static private boolean jj_3R_12() {
    if (jj_scan_token(FLOAT)) return true;
    return false;
  }

  static private boolean jj_3R_11() {
    if (jj_scan_token(INTEGER)) return true;
    return false;
  }

  static private boolean jj_3R_9() {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_10()) {
    jj_scanpos = xsp;
    if (jj_3R_11()) {
    jj_scanpos = xsp;
    if (jj_3R_12()) {
    jj_scanpos = xsp;
    if (jj_3R_13()) {
    jj_scanpos = xsp;
    if (jj_3R_14()) {
    jj_scanpos = xsp;
    if (jj_3R_15()) {
    jj_scanpos = xsp;
    if (jj_3R_16()) {
    jj_scanpos = xsp;
    if (jj_3R_17()) {
    jj_scanpos = xsp;
    if (jj_3R_18()) {
    jj_scanpos = xsp;
    if (jj_3R_19()) {
    jj_scanpos = xsp;
    if (jj_3R_20()) {
    jj_scanpos = xsp;
    if (jj_3R_21()) return true;
    }
    }
    }
    }
    }
    }
    }
    }
    }
    }
    }
    return false;
  }

  static private boolean jj_3R_10() {
    if (jj_scan_token(NIL)) return true;
    return false;
  }

  static private boolean jj_3_6() {
    if (jj_3R_4()) return true;
    return false;
  }

  static private boolean jj_3_3() {
    if (jj_3R_4()) return true;
    return false;
  }

  static private boolean jj_3R_8() {
    if (jj_3R_9()) return true;
    return false;
  }

  static private boolean jj_3_2() {
    if (jj_3R_4()) return true;
    return false;
  }

  static private boolean jj_3R_7() {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3_2()) {
    jj_scanpos = xsp;
    if (jj_3R_8()) return true;
    }
    return false;
  }

  static private boolean jj_3_5() {
    if (jj_3R_4()) return true;
    return false;
  }

  static private boolean jj_3R_6() {
    if (jj_scan_token(TICK)) return true;
    if (jj_scan_token(LPAR)) return true;
    return false;
  }

  static private boolean jj_initialized_once = false;
  /** Generated Token Manager. */
  static public ParserTokenManager token_source;
  static SimpleCharStream jj_input_stream;
  /** Current token. */
  static public Token token;
  /** Next token. */
  static public Token jj_nt;
  static private int jj_ntk;
  static private Token jj_scanpos, jj_lastpos;
  static private int jj_la;
  static private int jj_gen;
  static final private int[] jj_la1 = new int[19];
  static private int[] jj_la1_0;
  static {
      jj_la1_init_0();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x1ffc40,0x1ffec0,0x1ffc40,0x1ffec0,0x1ffc40,0x280,0x1ffc40,0x1ffec0,0x1ffec0,0x1ffec0,0x1ffec0,0x1ffec0,0x1ffec0,0x1ffec0,0x1ffec0,0x1ffc40,0x80,0x1ffc40,0x1ffc40,};
   }
  static final private JJCalls[] jj_2_rtns = new JJCalls[6];
  static private boolean jj_rescan = false;
  static private int jj_gc = 0;

  /** Constructor with InputStream. */
  public Parser(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public Parser(java.io.InputStream stream, String encoding) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser.  ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new ParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 19; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jjtree.reset();
    jj_gen = 0;
    for (int i = 0; i < 19; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Constructor. */
  public Parser(java.io.Reader stream) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new ParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 19; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  static public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jjtree.reset();
    jj_gen = 0;
    for (int i = 0; i < 19; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Constructor with generated Token Manager. */
  public Parser(ParserTokenManager tm) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 19; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  public void ReInit(ParserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jjtree.reset();
    jj_gen = 0;
    for (int i = 0; i < 19; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  static private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      if (++jj_gc > 100) {
        jj_gc = 0;
        for (int i = 0; i < jj_2_rtns.length; i++) {
          JJCalls c = jj_2_rtns[i];
          while (c != null) {
            if (c.gen < jj_gen) c.first = null;
            c = c.next;
          }
        }
      }
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }

  static private final class LookaheadSuccess extends java.lang.Error { }
  static final private LookaheadSuccess jj_ls = new LookaheadSuccess();
  static private boolean jj_scan_token(int kind) {
    if (jj_scanpos == jj_lastpos) {
      jj_la--;
      if (jj_scanpos.next == null) {
        jj_lastpos = jj_scanpos = jj_scanpos.next = token_source.getNextToken();
      } else {
        jj_lastpos = jj_scanpos = jj_scanpos.next;
      }
    } else {
      jj_scanpos = jj_scanpos.next;
    }
    if (jj_rescan) {
      int i = 0; Token tok = token;
      while (tok != null && tok != jj_scanpos) { i++; tok = tok.next; }
      if (tok != null) jj_add_error_token(kind, i);
    }
    if (jj_scanpos.kind != kind) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) throw jj_ls;
    return false;
  }


/** Get the next Token. */
  static final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  static final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  static private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  static private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  static private int[] jj_expentry;
  static private int jj_kind = -1;
  static private int[] jj_lasttokens = new int[100];
  static private int jj_endpos;

  static private void jj_add_error_token(int kind, int pos) {
    if (pos >= 100) return;
    if (pos == jj_endpos + 1) {
      jj_lasttokens[jj_endpos++] = kind;
    } else if (jj_endpos != 0) {
      jj_expentry = new int[jj_endpos];
      for (int i = 0; i < jj_endpos; i++) {
        jj_expentry[i] = jj_lasttokens[i];
      }
      jj_entries_loop: for (java.util.Iterator<?> it = jj_expentries.iterator(); it.hasNext();) {
        int[] oldentry = (int[])(it.next());
        if (oldentry.length == jj_expentry.length) {
          for (int i = 0; i < jj_expentry.length; i++) {
            if (oldentry[i] != jj_expentry[i]) {
              continue jj_entries_loop;
            }
          }
          jj_expentries.add(jj_expentry);
          break jj_entries_loop;
        }
      }
      if (pos != 0) jj_lasttokens[(jj_endpos = pos) - 1] = kind;
    }
  }

  /** Generate ParseException. */
  static public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[24];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 19; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 24; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    jj_endpos = 0;
    jj_rescan_token();
    jj_add_error_token(0, 0);
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  static final public void enable_tracing() {
  }

  /** Disable tracing. */
  static final public void disable_tracing() {
  }

  static private void jj_rescan_token() {
    jj_rescan = true;
    for (int i = 0; i < 6; i++) {
    try {
      JJCalls p = jj_2_rtns[i];
      do {
        if (p.gen > jj_gen) {
          jj_la = p.arg; jj_lastpos = jj_scanpos = p.first;
          switch (i) {
            case 0: jj_3_1(); break;
            case 1: jj_3_2(); break;
            case 2: jj_3_3(); break;
            case 3: jj_3_4(); break;
            case 4: jj_3_5(); break;
            case 5: jj_3_6(); break;
          }
        }
        p = p.next;
      } while (p != null);
      } catch(LookaheadSuccess ls) { }
    }
    jj_rescan = false;
  }

  static private void jj_save(int index, int xla) {
    JJCalls p = jj_2_rtns[index];
    while (p.gen > jj_gen) {
      if (p.next == null) { p = p.next = new JJCalls(); break; }
      p = p.next;
    }
    p.gen = jj_gen + xla - jj_la; p.first = token; p.arg = xla;
  }

  static final class JJCalls {
    int gen;
    Token first;
    int arg;
    JJCalls next;
  }

                     }
