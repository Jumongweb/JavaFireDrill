package dietel_c14;

public class StringBuilderAppend {
    public static void main(String[] args) {
        Object objectRef = "hello";
        String string = "goodbye";
        char[] charArray = {'a', 'b', 'c', 'd', 'e', 'f'};
        boolean booleanvalue = true;
        char characterValue = 'Z';
        int intergerValue = 2;
        Long longValue = 10000000000L;
        float floatValue = 2.3f;
        double doubleValue = 34.48;

        StringBuilder lastbuffer = new StringBuilder("Last buffer");
        StringBuilder buffer = new StringBuilder();
        buffer.append(objectRef)
                .append(System.getProperty("line.separator"))
                .append(string)
                .append(System.getProperty("line.separator"))
                .append(charArray)
                .append(System.getProperty("line.separator"))
                .append(charArray, 0, 3)
                .append(System.getProperty("line.separator"))
                .append(booleanvalue)
                .append(System.getProperty("line.separator"))
                .append(characterValue)
                .append(System.getProperty("line.separator"))
                .append(intergerValue)
                .append(System.getProperty("line.separator"))
                .append(floatValue)
                .append(System.getProperty("line.separator"))
                .append(doubleValue)
                .append(System.getProperty("line.separator"))
                .append(longValue)
                .append(System.getProperty("line.separator"))
                .append(lastbuffer);
        System.out.printf("Buffer new value = %s%n", buffer.toString());

    }
}
