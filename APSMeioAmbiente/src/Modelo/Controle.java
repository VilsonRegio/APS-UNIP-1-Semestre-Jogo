package Modelo;

public class Controle
{
    private String mensagem;
    
    public Controle(String click)
    {
        
        if (click == "Acertou")
        {
            Acertos acertos = new Acertos();
            this.mensagem = acertos.getAcertos();
        }
        else
        {
            Erros erros = new Erros();
            this.mensagem = erros.getErros();
        }
    }

    public String getMensagem()
    {
        return mensagem;
    }
}