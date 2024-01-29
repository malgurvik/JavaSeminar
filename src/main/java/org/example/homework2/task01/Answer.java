package org.example.homework2.task01;


public class Answer {
    public static void main(String[] args) {
        String QUERY = "select * from students where ";
        String PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} ";

        StringBuilder stringBuilder = getStringBuilder(PARAMS, QUERY);
        System.out.println(stringBuilder);
    }

    private static StringBuilder getStringBuilder(String PARAMS, String QUERY) {
        String newParams = PARAMS.replace('{', ' ').replace('}', ' ');
        String[] params = newParams.split(",");
        StringBuilder stringBuilder = new StringBuilder(QUERY);
        for (int i = 0; i < params.length; i++) {
            String[] elements = params[i].replace('"', ' ').split(":");
            if (!"null".equals(elements[0].trim())) {
                stringBuilder.append(elements[0].trim()).append("=").append("'").append(elements[1].trim()).append("'");
                if (i < params.length - 2) stringBuilder.append("and");
            }
        }
        return stringBuilder;
    }
}
