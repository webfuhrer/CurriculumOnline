/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function cambiarEstado(objeto_span)
{
    id_span=objeto_span.id;
    id_parrafo=id_span.replace("boton", "p");
    objeto_parrafo=document.getElementById(id_parrafo);
    clase=objeto_parrafo.className;
    if (clase=="texto_visible")
    {
        objeto_parrafo.className="texto_oculto";
        objeto_span.innerHTML="+";
    }
    else
    {
        objeto_parrafo.className="texto_visible";
        objeto_span.innerHTML="-";
    }
}

