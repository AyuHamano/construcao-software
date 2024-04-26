package org.example.tarefas.tarefa08.exceptionsCustomizadas;

import org.example.tarefas.tarefa08.login.Login;

public class LoginInvalidoException extends Exception {
    private Login login;


    @Override
    public String toString(){
        return "Dados inválidos, tente novamente";
    }
}
