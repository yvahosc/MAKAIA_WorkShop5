package co.com.MAKAIA.Main;

import java.util.Queue;
import java.util.Stack;

public class HtmlValidator {

    public static Stack<HtmlTag> isValidHtml(Queue<HtmlTag> htmlTagsQueue) {

        Stack<HtmlTag> htmlTagsStack = new Stack<>();

        for (HtmlTag htmlTag: htmlTagsQueue) {
            if (htmlTag.isOpenTag()) {
                htmlTagsStack.push(htmlTag);
            } else {
                if (!htmlTag.isSelfClosing()) {
                    if (htmlTagsStack.empty()) {
                        return null;
                    }

                    HtmlTag topHtmlTag = htmlTagsStack.peek();

                    if (htmlTag.matches(topHtmlTag)) {
                        htmlTagsStack.pop();
                    } else {
                        return htmlTagsStack;
                    }

                }
            }

        }

        return htmlTagsStack;

    }

}