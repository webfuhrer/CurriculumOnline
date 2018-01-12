/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetecv;

import java.util.List;

/**
 *
 * @author luis
 */
public class CreaHTML {
    public static String pintarCV(List<Campo> lista_campos)
    {
        /*<p class="titulo">Titulo1<span id="boton0" onclick=cambiarEstado(this)>+</span><p>
        <p class="texto_oculto" id="p0">Texto explicativo del titulo 1...</p>
        */
        String html_aux="";
        for (int i=0; i<lista_campos.size(); i++)
        {
            String titulo=lista_campos.get(i).getTitulo();
            String texto=lista_campos.get(i).getTexto();
            html_aux+="<p class='titulo' >"+
                 titulo+"<span id='boton"+i+"' onclick=cambiarEstado(this)>+</span></p>";
            html_aux+="<p class='texto_oculto' id='p"+i+"'>"+texto+"</p>";
                    
        }
        return html_aux;
    }
}
