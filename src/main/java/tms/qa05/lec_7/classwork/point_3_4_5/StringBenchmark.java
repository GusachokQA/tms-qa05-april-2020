package tms.qa05.lec_7.classwork.point_3_4_5;

public class StringBenchmark {
    public static void main(String[] args) {
        String string = "";
        String symbol = "A";
        StringBuilder stringBuilder = new StringBuilder();
        StringBuffer stringBuffer = new StringBuffer();

        int iteration = 100_000_000;

//        long stringTestTime = stringTest(string, iteration, symbol);
//        System.out.println("String concatenation took: " + stringTestTime);

        long stringBuilderTestTime = stringBuilderTest(stringBuilder, iteration, symbol);
        System.out.println("StringBuilder concatenation took: " + stringBuilderTestTime);

        long stringBufferTestTime = stringBufferTest(stringBuffer, iteration, symbol);
        System.out.println("StringBuffer concatenation took: " + stringBufferTestTime);
    }

    private static long stringTest(String input, int iteration, String symbol) {
        Long start = System.currentTimeMillis();
        for (int i = 0; i < iteration; i++) {
            input += symbol;
        }
        Long finish = System.currentTimeMillis();

        return finish - start;
    }

    private static long stringBuilderTest(StringBuilder input, int iteration, String symbol) {
        Long start = System.currentTimeMillis();
        for (int i = 0; i < iteration; i++) {
            input.append(symbol);
        }
        Long finish = System.currentTimeMillis();

        return finish - start;
    }

    private static long stringBufferTest(StringBuffer input, int iteration, String symbol) {
        Long start = System.currentTimeMillis();
        for (int i = 0; i < iteration; i++) {
            input.append(symbol);
        }
        Long finish = System.currentTimeMillis();

        return finish - start;
    }
}
