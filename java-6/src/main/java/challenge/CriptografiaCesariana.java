package challenge;

public class CriptografiaCesariana implements Criptografia {

    @Override
    public String criptografar (String texto){
        return cryptoFunction(texto, "encript");
    }

    @Override
    public String descriptografar(String texto) {
        return cryptoFunction(texto, "decript");
    }

    public String cryptoFunction(String texto, String function) {
        int i, stringLength;
        char c;
        StringBuilder cryptoText = new StringBuilder();
        stringLength = texto.length();
        String lowerCryptoText = texto.toLowerCase();
        if (lowerCryptoText.equals("")){
            throw new IllegalArgumentException();
        }

        for (i = 0; i < stringLength; i++) {
            c = lowerCryptoText.charAt(i);
            if(c == ' ' || (c >= '0') && (c <= '9'))
                cryptoText.append(c);

            if ((c >= 'a') && (c <= 'z'))
                if(function.equals("encript")) {
                    cryptoText.append((char) (c + 3));
                } else if (function.equals("decript")) {
                    cryptoText.append((char) (c - 3));
                }
        }


        return cryptoText.toString();
    }
}
