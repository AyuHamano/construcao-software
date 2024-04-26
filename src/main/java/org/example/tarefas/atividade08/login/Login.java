package org.example.tarefas.atividade08.login;

import org.example.tarefas.atividade08.exceptionsCustomizadas.LoginInvalidoException;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Login {
    private String login;
    private String senha;
    private static final String EMAIL_PADRAO =
            "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                    + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    private static final Pattern padrao_email = Pattern.compile(EMAIL_PADRAO, Pattern.CASE_INSENSITIVE);

    public boolean valida_email(String email){
        Matcher matcher = padrao_email.matcher(email);

        return matcher.matches();
    }

    public void fazer_login(){
        try {
            System.out.println("Digite um email válido:");
            Scanner leitor = new Scanner(System.in);
            String login = leitor.nextLine();

            if (!valida_email(login)) {
                throw new LoginInvalidoException();
            }
            System.out.println("Agora digite uma senha com mais de 6 caracteres:");
            String senha = leitor.next();

            if (senha.length() < 6){
                throw new LoginInvalidoException();
            }
            System.out.println("Login realizado com sucesso!");

        }
        catch (LoginInvalidoException erro){
            System.out.println(erro.toString());
        }
    }
}
