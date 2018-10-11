public class DecimalToHex{
    void main{
        for (double i = 1; i >= 0; i -= 0.01) {
            i = Math.round(i * 100) / 100.0d;
            int alpha = (int) Math.round(i * 255);
            String hex = Integer.toHexString(alpha).toUpperCase();
            if (hex.length() == 1)
                hex = "0" + hex;
            int percent = (int) (i * 100);
            System.out.println(String.format("%d%% — %s", percent, hex));
        }
    }
}
