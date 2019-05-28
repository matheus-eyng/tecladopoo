public class Score {
    private int erros;
    private int acertos;

    /*  
    Método que contabliza erros e acertos dado uma String base e uma String a ser comparada.
    Utiliza uma variavel int j para percorrer a String base e que muda apenas quando há um acerto
    enquanto isso a variavel int i percorre a string a ser comparada e contabliza errose acertos. 

    OBS: Quando o backspace é pressionado, ele envia um caractere proprio por isso é preciso fazer
    uma correção no primeiro else
    */
    public void analyze (String base, String compareString) {
        int j = 0;
        for(int i = 0; i < compareString.length(); i++) {
            if ( compareString.charAt(i) == base.charAt(j) ) {
                acertos++;
                j++;
            }
            else { 
                if(compareString.charAt(i) != '') {    // Caractere especial enviado pelo backspace que precisa ser ignorado
                    erros++;
                }
            }
        }
    }

    public int getErros() {
        return erros;
    }

    public int getAcertos() {
        return (acertos - erros);
    }
}