package bootCamp;

public class StringPractice {
    public static void main(String[] args) {
        String str = new String("Batch 20");

        String str2 = "Batch 20";
        str2.concat(" is the best");

        System.out.println(str2);

        StringBuilder sBuilder = new StringBuilder("Batch 20");
        sBuilder.append(" is the best");

        System.out.println(sBuilder);

        StringBuffer sBuffer = new StringBuffer("Batch 20");
        sBuffer.append("is the best");




    }
}
