package com.jdk14;

public class TextBlocks {

    static String s = "The quick Fox jumped the blue line. The quick Fox jumped the blue line. " +
            "The quick Fox jumped the blue line. The quick Fox jumped the blue line. " +
            "The quick Fox jumped the blue line. The quick Fox jumped the blue line. ";

    static String s1 = "The quick Fox jumped the blue line. The quick Fox jumped the blue line. " + "\\" +
            "The quick Fox jumped the blue line. The quick Fox jumped the blue line. " + "\\" +
            "The quick Fox jumped the blue line. The quick Fox jumped the blue line. ";

    static String s2 = "The quick Fox jumped the blue line. The quick Fox jumped the blue line. " + "\s" +
            "The quick Fox jumped the blue line. The quick Fox jumped the blue line. " + "\s" +
            "The quick Fox jumped the blue line. The quick Fox jumped the blue line. ";


    /**
     * Multi-line string values in text blocks include newline characters,
     * which can be suppressed by using \ at the end of a line. Also, the spaces at the end of a line in
     * text blocks are removed by default. To insert them, you can use the escape sequence \s
     * **/

    static String lines = """
            The quick Fox jumped the blue line. The quick Fox jumped the blue line.\s 
            The quick Fox jumped the blue line. The quick Fox jumped the blue line.\s
            The quick Fox jumped the blue line. The quick Fox jumped the blue line.\s
            """;

    public static void main(String[] args) {
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(lines);
        System.out.println(lines.length());
    }
}
