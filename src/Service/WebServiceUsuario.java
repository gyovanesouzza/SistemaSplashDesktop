/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import http.HttpClient;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;
import model.Usuario;
import util.Constantes;

/**
 *
 * @author GYOVANEPEREIRADESOUZ
 */
public class WebServiceUsuario {

    private HttpClient client = new HttpClient();
    private Gson gson = new Gson();
    Type usuarioType = new TypeToken<Usuario>() {
    }.getType();
    Type listUsuarioType = new TypeToken<List<Usuario>>() {
    }.getType();

    private final String LINK_LOGAR = "http://" + Constantes.getIP_WEBSERVICE()
            + ":8080/WS_Splash/webresources/usuario/logar";
    private final String LINK_INFORMACOESCONTA = "http://" + Constantes.getIP_WEBSERVICE()
            + ":8080/WS_Splash/webresources/usuario/informacoesConta";

    public boolean logar(Usuario usuario) throws IOException {
        String json = gson.toJson(usuario);
        return Boolean.parseBoolean(client.sendPOST(LINK_LOGAR, json, Constantes.getPOST()));
    }

    public Usuario informacoesConta(Usuario usuario) throws IOException {
        String json = gson.toJson(usuario);
        return gson.fromJson(client.sendPOST(LINK_INFORMACOESCONTA, json, Constantes.getPOST()),usuarioType);
    }

}
