package net.ducquoc.training.vn;

/**
 * Kotlin is a "shorter Java" language. 42 is the magic answer.
 * <br />
 * "How many roads must a man walk down?"
 * "before he is called a man"?
 *
 * @see https://www.quora.com/Why-and-how-is-42-the-answer-to-life-the-universe-and-everything
 */
@SuppressWarnings("unused")
public class App {

    public static Integer ANSWER_TO_LIFE_AND_UNIVERSE = 42;
    public static int MAGIC_NUM1 = ANSWER_TO_LIFE_AND_UNIVERSE - 229985494;
    public static int MAGIC_NUM2 = ANSWER_TO_LIFE_AND_UNIVERSE - 147909691;
    public static long MAGIC_DUC = ANSWER_TO_LIFE_AND_UNIVERSE - 9223372036854695718L;
    public static long MAGIC_QUOC = ANSWER_TO_LIFE_AND_UNIVERSE - 9223372036829082599L;

    public static void main(String[] args) {

        System.out.print("==== JAVa " + jUtilRandom(MAGIC_NUM1) + jUtilRandom(MAGIC_NUM2));
    }

    public static String jUtilRandom(long param) {
        java.util.Random rand = new java.util.Random(param);
        StringBuffer sb = new StringBuffer();
        for (int i = 0;; i++) {
            int k = rand.nextInt(27);
            if (k == 0)
                break;

            sb.append((char) ('`' + k));
        }

        return sb.toString();
    }

}
