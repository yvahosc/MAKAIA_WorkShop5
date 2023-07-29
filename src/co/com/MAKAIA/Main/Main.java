package co.com.MAKAIA.Main;

import java.io.IOException;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        String fileLocation = "./src/co/com/MAKAIA/testFiles/";

        // TODO Archivos para pruebas

        // TODO HTML bien formateado
        //String file = "html.html";

        // TODO HTMLs mal formateados
        //String file = "html2.html";
        //String file = "html3.html";
        //String file = "html4.html";
        //String file = "Ejemplo1.html";
        //String file = "Ejemplo2.html";
        //String file = "Ejemplo3.html";
        String file = "Ejemplo4.html";

        Queue<HtmlTag> htmlTagQueue = null;

        try {
            htmlTagQueue = HtmlReader.getTagsFromHtmlFile(fileLocation + file);
        } catch (IOException e) {
            System.out.println(e.getMessage());
            System.exit(-1);
        }

        Stack<HtmlTag> htmlTagStack = HtmlValidator.isValidHtml(htmlTagQueue);

        if (htmlTagStack != null && htmlTagStack.empty()) {
            System.out.println("HTML '" + file + "' está bien formateado.");
        }else {
            System.out.println("HTML '" + file + "' está mal formateado.");
        }

        printStack(htmlTagStack);
    }

    private static void printStack(Stack<HtmlTag> htmlTagStack) {
        if(htmlTagStack == null){
            System.out.println("Stack nulo.");
        } else{
            if(htmlTagStack.isEmpty()){
                System.out.println("Stack vacío.");
            } else{
                System.out.println(htmlTagStack);
            }
        }
    }
}