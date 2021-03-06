/* Generated by: JJTree: Do not edit this line. Node.java Version 1.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=BSH,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
/** Copyright 2018 beanshell.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License. */
package bsh;

import java.util.ListIterator;

/* All AST nodes must implement this interface.  It provides basic
 * machinery for constructing the parent and child relationships
 * between nodes. */
public interface Node extends ListIterator<Node> {
    //  ---- start BeanShell specific stuff ----  //
    Node JAVACODE = new SimpleNode( -1 ) {
        private static final long serialVersionUID = 1L;
        public String getSourceFile() {
            return "<Called from Java Code>";
        }
        public int getLineNumber() {
            return -1;
        }
        public String getText()  {
            return "<Compiled Java Code>";
        }
        public String toString() {
            return "JavaCode";
        }
    };

    /** This is the general signature for evaluation of a node.
     * @param callstack evaluation call stack
     * @param interpreter evaluation interpreter
     * @return result from evaluation
     * @throws EvalError if an evaluation error occurred */
    Object eval(CallStack callstack, Interpreter interpreter) throws EvalError;

    /** Set the name of the source file (or more generally source) of the text
     * from which this node was parsed.
     * @param sourceFile source */
    void setSourceFile(String sourceFile);

    /** Get the name of the source file (or more generally source) of the text
     * from which this node was parsed.
     * @return source or parent's source or <unknown file> if no source found */
    String getSourceFile();

    /** Get the line number of the starting token
     * @return line number */
    int getLineNumber();

    /** Get the text of the tokens comprising this node.
     * @return token text */
    String getText();

    /** Dump the children hierarchy.
     * @param prefix a prefix string */
    void dump(String prefix);

    /** Overloaded toString with prefix used by dump.
     * @param prefix a prefix string
     * @return toString with prefix */
    String toString(String prefix);

    /** Return the list of child nodes..
     * @return children array or zero length Node array */
    Node[] jjtGetChildren();
    //  ---- end BeanShell specific stuff ----  //

    /** Called after the node has been made the current node.
     * Indicates that child nodes can now be added to it. */
    void jjtOpen();

    /** Called after all the child nodes have been added. */
    void jjtClose();

    /** Inform the node of its parent.
     * @param n */
    void jjtSetParent(Node n);

    /** Return node parent.
     * @return parent node */
    Node jjtGetParent();

    /** Add argument to the list of children.
     * @param n the child node to add
     * @param i index of child node */
    void jjtAddChild(Node n, int i);

    /** Returns the child node at the given index.
     * The children are numbered from zero, left to right.
     * @param i child index
     * @return the node at index */
    Node jjtGetChild(int i);

    /** Return the number of children the node has. */
    int jjtGetNumChildren();

    /** Return the node type ID. */
    int getId();

}
/* JavaCC - OriginalChecksum=5b1698226c0eeee61d542c86c4e8e60c (do not edit this line) */
