package org.example.tarefas.atividade08.exceptionsCustomizadas;

import org.example.tarefas.atividade08.login.Login;

public class LoginInvalidoException extends Exception {
    private Login login;


    @Override
    public String toString(){
        return "Dados inválidos, tente novamente";
    }
}
